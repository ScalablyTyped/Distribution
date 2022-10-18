package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMathMod {
  
  @JSImport("@devexpress/utils/lib/utils/math", "MathUtils")
  @js.native
  open class MathUtils () extends StObject
  /* static members */
  object MathUtils {
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def generateGuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGuid")().asInstanceOf[String]
    
    inline def getRandomInt(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRandomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def numberCloseTo(num: Double, to: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("numberCloseTo")(num.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def numberCloseTo(num: Double, to: Double, accuracy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("numberCloseTo")(num.asInstanceOf[js.Any], to.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.powFactor")
    @js.native
    def powFactor: Any = js.native
    inline def powFactor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("powFactor")(x.asInstanceOf[js.Any])
    
    inline def restrictValue(`val`: Double, minVal: Double, maxVal: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("restrictValue")(`val`.asInstanceOf[js.Any], minVal.asInstanceOf[js.Any], maxVal.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def round(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def round(value: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.somePrimes")
    @js.native
    def somePrimes: js.Array[Double] = js.native
    inline def somePrimes_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("somePrimes")(x.asInstanceOf[js.Any])
  }
}
