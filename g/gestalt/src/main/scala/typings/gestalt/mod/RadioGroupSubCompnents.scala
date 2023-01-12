package typings.gestalt.mod

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioGroupSubCompnents extends StObject {
  
  var RadioButton: ReactForwardRef[HTMLInputElement, RadioButtonProps]
}
object RadioGroupSubCompnents {
  
  inline def apply(RadioButton: ReactForwardRef[HTMLInputElement, RadioButtonProps]): RadioGroupSubCompnents = {
    val __obj = js.Dynamic.literal(RadioButton = RadioButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupSubCompnents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadioGroupSubCompnents] (val x: Self) extends AnyVal {
    
    inline def setRadioButton(value: ReactForwardRef[HTMLInputElement, RadioButtonProps]): Self = StObject.set(x, "RadioButton", value.asInstanceOf[js.Any])
  }
}
