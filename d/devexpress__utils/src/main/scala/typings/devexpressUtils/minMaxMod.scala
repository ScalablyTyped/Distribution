package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minMaxMod {
  
  @JSImport("@devexpress/utils/lib/class/min-max", "ExtendedMax")
  @js.native
  class ExtendedMax[T] protected () extends StObject {
    def this(maxElement: T, maxValue: Double) = this()
    
    var maxElement: T = js.native
    
    var maxValue: Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/class/min-max", "ExtendedMin")
  @js.native
  class ExtendedMin[T] protected () extends StObject {
    def this(minElement: T, minValue: Double) = this()
    
    var minElement: T = js.native
    
    var minValue: Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/class/min-max", "ExtendedMinMax")
  @js.native
  class ExtendedMinMax[T] protected () extends MinMax[T] {
    def this(minElement: T, minValue: Double, maxElement: T, maxValue: Double) = this()
    
    var maxValue: Double = js.native
    
    var minValue: Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/class/min-max", "MinMax")
  @js.native
  class MinMax[T] protected () extends StObject {
    def this(minElement: T, maxElement: T) = this()
    
    var maxElement: T = js.native
    
    var minElement: T = js.native
  }
  
  @JSImport("@devexpress/utils/lib/class/min-max", "MinMaxNumber")
  @js.native
  class MinMaxNumber protected () extends MinMax[Double] {
    def this(minElement: Double, maxElement: Double) = this()
    
    val length: Double = js.native
  }
}
