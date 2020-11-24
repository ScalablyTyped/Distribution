package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/class/min-max", JSImport.Namespace)
@js.native
object minMaxMod extends js.Object {
  
  @js.native
  class ExtendedMax[T] protected () extends js.Object {
    def this(maxElement: T, maxValue: Double) = this()
    
    var maxElement: T = js.native
    
    var maxValue: Double = js.native
  }
  
  @js.native
  class ExtendedMin[T] protected () extends js.Object {
    def this(minElement: T, minValue: Double) = this()
    
    var minElement: T = js.native
    
    var minValue: Double = js.native
  }
  
  @js.native
  class ExtendedMinMax[T] protected () extends MinMax[T] {
    def this(minElement: T, minValue: Double, maxElement: T, maxValue: Double) = this()
    
    var maxValue: Double = js.native
    
    var minValue: Double = js.native
  }
  
  @js.native
  class MinMax[T] protected () extends js.Object {
    def this(minElement: T, maxElement: T) = this()
    
    var maxElement: T = js.native
    
    var minElement: T = js.native
  }
  
  @js.native
  class MinMaxNumber () extends MinMax[Double] {
    
    val length: Double = js.native
  }
}
