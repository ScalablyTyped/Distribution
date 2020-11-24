package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/math", JSImport.Namespace)
@js.native
object mathMod extends js.Object {
  
  @js.native
  class MathUtils () extends js.Object
  /* static members */
  @js.native
  object MathUtils extends js.Object {
    
    def generateGuid(): String = js.native
    
    def getRandomInt(min: Double, max: Double): Double = js.native
    
    def numberCloseTo(num: Double, to: Double): Boolean = js.native
    def numberCloseTo(num: Double, to: Double, accuracy: Double): Boolean = js.native
    
    var powFactor: js.Any = js.native
    
    def restrictValue(`val`: Double, minVal: Double, maxVal: Double): Double = js.native
    
    def round(value: Double): Double = js.native
    def round(value: Double, digits: Double): Double = js.native
    
    var somePrimes: js.Array[Double] = js.native
  }
}
