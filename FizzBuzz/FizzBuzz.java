package FizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		for(int i = 1; i <=34; i++) {
			if(i%3==0 && i%5 ==0) {
				System.out.print("FizzBizz ");
			
			}else if(i%3==0) {
				System.out.print("Fizz ");
			}else if(i%5==0) {
				System.out.print("Bizz ");
			}else {
				System.out.print(i + " ");
			}
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
