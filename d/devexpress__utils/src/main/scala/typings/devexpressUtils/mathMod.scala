package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("@devexpress/utils/lib/utils/math", "MathUtils")
  @js.native
  class MathUtils () extends StObject
  /* static members */
  object MathUtils {
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def generateGuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGuid")().asInstanceOf[String]
    
    @scala.inline
    def getRandomInt(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRandomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def numberCloseTo(num: Double, to: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("numberCloseTo")(num.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def numberCloseTo(num: Double, to: Double, accuracy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("numberCloseTo")(num.asInstanceOf[js.Any], to.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.powFactor")
    @js.native
    def powFactor: js.Any = js.native
    @scala.inline
    def powFactor_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("powFactor")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def restrictValue(`val`: Double, minVal: Double, maxVal: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("restrictValue")(`val`.asInstanceOf[js.Any], minVal.asInstanceOf[js.Any], maxVal.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def round(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def round(value: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.somePrimes")
    @js.native
    def somePrimes: js.Array[Double] = js.native
    @scala.inline
    def somePrimes_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("somePrimes")(x.asInstanceOf[js.Any])
  }
}
