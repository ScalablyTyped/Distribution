package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.generateGuid")
    @js.native
    def generateGuid(): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.getRandomInt")
    @js.native
    def getRandomInt(min: Double, max: Double): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.numberCloseTo")
    @js.native
    def numberCloseTo(num: Double, to: Double): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.numberCloseTo")
    @js.native
    def numberCloseTo(num: Double, to: Double, accuracy: Double): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.powFactor")
    @js.native
    def powFactor: js.Any = js.native
    @scala.inline
    def powFactor_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("powFactor")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.restrictValue")
    @js.native
    def restrictValue(`val`: Double, minVal: Double, maxVal: Double): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.round")
    @js.native
    def round(value: Double): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.round")
    @js.native
    def round(value: Double, digits: Double): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/math", "MathUtils.somePrimes")
    @js.native
    def somePrimes: js.Array[Double] = js.native
    @scala.inline
    def somePrimes_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("somePrimes")(x.asInstanceOf[js.Any])
  }
}
