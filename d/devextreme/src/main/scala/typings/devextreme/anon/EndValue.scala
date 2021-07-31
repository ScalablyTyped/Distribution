package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndValue extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var endValue: js.UndefOr[Double] = js.undefined
  
  var startValue: js.UndefOr[Double] = js.undefined
}
object EndValue {
  
  @scala.inline
  def apply(): EndValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndValue]
  }
  
  @scala.inline
  implicit class EndValueMutableBuilder[Self <: EndValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    @scala.inline
    def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
  }
}
