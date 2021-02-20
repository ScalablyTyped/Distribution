package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxValue extends StObject {
  
  var maxValue: js.UndefOr[Double] = js.native
  
  var minValue: js.UndefOr[Double] = js.native
}
object MaxValue {
  
  @scala.inline
  def apply(): MaxValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxValue]
  }
  
  @scala.inline
  implicit class MaxValueMutableBuilder[Self <: MaxValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
