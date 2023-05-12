package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioGroupSubComponents extends StObject {
  
  var RadioButton: FunctionComponent[RadioGroupRadioButtonProps]
}
object RadioGroupSubComponents {
  
  inline def apply(RadioButton: FunctionComponent[RadioGroupRadioButtonProps]): RadioGroupSubComponents = {
    val __obj = js.Dynamic.literal(RadioButton = RadioButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupSubComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadioGroupSubComponents] (val x: Self) extends AnyVal {
    
    inline def setRadioButton(value: FunctionComponent[RadioGroupRadioButtonProps]): Self = StObject.set(x, "RadioButton", value.asInstanceOf[js.Any])
  }
}
