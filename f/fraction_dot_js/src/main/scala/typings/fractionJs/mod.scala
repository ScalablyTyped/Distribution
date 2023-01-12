package typings.fractionJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fraction.js", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Fraction {
    def this(fraction: Fraction) = this()
    def this(fraction: NumeratorDenominator) = this()
    def this(numbers: js.Tuple2[Double | String, Double | String]) = this()
    def this(num: String) = this()
    def this(num: Double) = this()
    def this(firstValue: String, secondValue: Double) = this()
    def this(firstValue: js.Tuple2[Double | String, Double | String], secondValue: Double) = this()
    def this(firstValue: Fraction, secondValue: Double) = this()
    def this(firstValue: NumeratorDenominator, secondValue: Double) = this()
    def this(numerator: Double, denominator: Double) = this()
  }
  
  @js.native
  trait Fraction extends StObject {
    
    def abs(): Fraction = js.native
    
    def add(firstValue: String, secondValue: Double): Fraction = js.native
    def add(firstValue: js.Tuple2[Double | String, Double | String], secondValue: Double): Fraction = js.native
    def add(firstValue: Fraction, secondValue: Double): Fraction = js.native
    def add(firstValue: NumeratorDenominator, secondValue: Double): Fraction = js.native
    def add(fraction: Fraction): Fraction = js.native
    def add(fraction: NumeratorDenominator): Fraction = js.native
    def add(numbers: js.Tuple2[Double | String, Double | String]): Fraction = js.native
    def add(numerator: Double, denominator: Double): Fraction = js.native
    def add(num: String): Fraction = js.native
    def add(num: Double): Fraction = js.native
    @JSName("add")
    var add_Original: FractionConstructor = js.native
    
    def ceil(): Fraction = js.native
    def ceil(places: Double): Fraction = js.native
    
    def compare(n: String): Double = js.native
    def compare(n: Double): Double = js.native
    def compare(n: Fraction): Double = js.native
    
    var d: Double = js.native
    
    def div(firstValue: String, secondValue: Double): Fraction = js.native
    def div(firstValue: js.Tuple2[Double | String, Double | String], secondValue: Double): Fraction = js.native
    def div(firstValue: Fraction, secondValue: Double): Fraction = js.native
    def div(firstValue: NumeratorDenominator, secondValue: Double): Fraction = js.native
    def div(fraction: Fraction): Fraction = js.native
    def div(fraction: NumeratorDenominator): Fraction = js.native
    def div(numbers: js.Tuple2[Double | String, Double | String]): Fraction = js.native
    def div(numerator: Double, denominator: Double): Fraction = js.native
    def div(num: String): Fraction = js.native
    def div(num: Double): Fraction = js.native
    @JSName("div")
    var div_Original: FractionConstructor = js.native
    
    def divisible(n: String): Boolean = js.native
    def divisible(n: Double): Boolean = js.native
    def divisible(n: Fraction): Boolean = js.native
    
    def equals(n: String): Boolean = js.native
    def equals(n: Double): Boolean = js.native
    def equals(n: Fraction): Boolean = js.native
    
    def floor(): Fraction = js.native
    def floor(places: Double): Fraction = js.native
    
    def gcd(firstValue: String, secondValue: Double): Fraction = js.native
    def gcd(firstValue: js.Tuple2[Double | String, Double | String], secondValue: Double): Fraction = js.native
    def gcd(firstValue: Fraction, secondValue: Double): Fraction = js.native
    def gcd(firstValue: NumeratorDenominator, secondValue: Double): Fraction = js.native
    def gcd(fraction: Fraction): Fraction = js.native
    def gcd(fraction: NumeratorDenominator): Fraction = js.native
    def gcd(numbers: js.Tuple2[Double | String, Double | String]): Fraction = js.native
    def gcd(numerator: Double, denominator: Double): Fraction = js.native
    def gcd(num: String): Fraction = js.native
    def gcd(num: Double): Fraction = js.native
    @JSName("gcd")
    var gcd_Original: FractionConstructor = js.native
    
    def inverse(): Fraction = js.native
    
    def lcm(firstValue: String, secondValue: Double): Fraction = js.native
    def lcm(firstValue: js.Tuple2[Double | String, Double | String], secondValue: Double): Fraction = js.native
    def lcm(firstValue: Fraction, secondValue: Double): Fraction = js.native
    def lcm(firstValue: NumeratorDenominator, secondValue: Double): Fraction = js.native
    def lcm(fraction: Fraction): Fraction = js.native
    def lcm(fraction: NumeratorDenominator): Fraction = js.native
    def lcm(numbers: js.Tuple2[Double | String, Double | String]): Fraction = js.native
    def lcm(numerator: Double, denominator: Double): Fraction = js.native
    def lcm(num: String): Fraction = js.native
    def lcm(num: Double): Fraction = js.native
    @JSName("lcm")
    var lcm_Original: FractionConstructor = js.native
    
    def mod(): Fraction = js.native
    def mod(n: String): Fraction = js.native
    def mod(n: Double): Fraction = js.native
    def mod(n: Fraction): Fraction = js.native
    
    def mul(firstValue: String, secondValue: Double): Fraction = js.native
    def mul(firstValue: js.Tuple2[Double | String, Double | String], secondValue: Double): Fraction = js.native
    def mul(firstValue: Fraction, secondValue: Double): Fraction = js.native
    def mul(firstValue: NumeratorDenominator, secondValue: Double): Fraction = js.native
    def mul(fraction: Fraction): Fraction = js.native
    def mul(fraction: NumeratorDenominator): Fraction = js.native
    def mul(numbers: js.Tuple2[Double | String, Double | String]): Fraction = js.native
    def mul(numerator: Double, denominator: Double): Fraction = js.native
    def mul(num: String): Fraction = js.native
    def mul(num: Double): Fraction = js.native
    @JSName("mul")
    var mul_Original: FractionConstructor = js.native
    
    var n: Double = js.native
    
    def neg(): Fraction = js.native
    
    def pow(firstValue: String, secondValue: Double): Fraction = js.native
    def pow(firstValue: js.Tuple2[Double | String, Double | String], secondValue: Double): Fraction = js.native
    def pow(firstValue: Fraction, secondValue: Double): Fraction = js.native
    def pow(firstValue: NumeratorDenominator, secondValue: Double): Fraction = js.native
    def pow(fraction: Fraction): Fraction = js.native
    def pow(fraction: NumeratorDenominator): Fraction = js.native
    def pow(numbers: js.Tuple2[Double | String, Double | String]): Fraction = js.native
    def pow(numerator: Double, denominator: Double): Fraction = js.native
    def pow(num: String): Fraction = js.native
    def pow(num: Double): Fraction = js.native
    @JSName("pow")
    var pow_Original: FractionConstructor = js.native
    
    def round(): Fraction = js.native
    def round(places: Double): Fraction = js.native
    
    var s: Double = js.native
    
    def simplify(): Fraction = js.native
    def simplify(eps: Double): Fraction = js.native
    
    def sub(firstValue: String, secondValue: Double): Fraction = js.native
    def sub(firstValue: js.Tuple2[Double | String, Double | String], secondValue: Double): Fraction = js.native
    def sub(firstValue: Fraction, secondValue: Double): Fraction = js.native
    def sub(firstValue: NumeratorDenominator, secondValue: Double): Fraction = js.native
    def sub(fraction: Fraction): Fraction = js.native
    def sub(fraction: NumeratorDenominator): Fraction = js.native
    def sub(numbers: js.Tuple2[Double | String, Double | String]): Fraction = js.native
    def sub(numerator: Double, denominator: Double): Fraction = js.native
    def sub(num: String): Fraction = js.native
    def sub(num: Double): Fraction = js.native
    @JSName("sub")
    var sub_Original: FractionConstructor = js.native
    
    def toContinued(): js.Array[Double] = js.native
    
    def toFraction(): String = js.native
    def toFraction(excludeWhole: Boolean): String = js.native
    
    def toLatex(): String = js.native
    def toLatex(excludeWhole: Boolean): String = js.native
    
    def toString(decimalPlaces: Double): String = js.native
  }
  
  @js.native
  trait FractionConstructor extends StObject {
    
    def apply(firstValue: String, secondValue: Double): Fraction = js.native
    def apply(firstValue: js.Tuple2[Double | String, Double | String], secondValue: Double): Fraction = js.native
    def apply(firstValue: Fraction, secondValue: Double): Fraction = js.native
    def apply(firstValue: NumeratorDenominator, secondValue: Double): Fraction = js.native
    def apply(fraction: Fraction): Fraction = js.native
    def apply(fraction: NumeratorDenominator): Fraction = js.native
    def apply(numbers: js.Tuple2[Double | String, Double | String]): Fraction = js.native
    def apply(numerator: Double, denominator: Double): Fraction = js.native
    def apply(num: String): Fraction = js.native
    def apply(num: Double): Fraction = js.native
  }
  
  trait NumeratorDenominator extends StObject {
    
    var d: Double
    
    var n: Double
  }
  object NumeratorDenominator {
    
    inline def apply(d: Double, n: Double): NumeratorDenominator = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumeratorDenominator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumeratorDenominator] (val x: Self) extends AnyVal {
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
}
