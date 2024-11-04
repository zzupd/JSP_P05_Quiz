package pkg;

public class DataPrn {
	// Setter, Getter(세터, 게터)를
	// 만든 클래스를 Bean에서 DTO라고 한다.
	// (Data Transfer Object, 데이터 전송 객체)
	
	private String data1;

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}
	
	public void mtdPrn() {
		String res="수신 데이터 : " + data1;
		System.out.println(res);
	}
	

}
