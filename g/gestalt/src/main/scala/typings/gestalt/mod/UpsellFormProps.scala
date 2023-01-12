package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsellFormProps extends StObject {
  
  var onSubmit: AbstractEventHandler[
    (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement]), 
    js.Object
  ]
  
  var submitButtonAccessibilityLabel: String
  
  var submitButtonDisabled: js.UndefOr[Boolean] = js.undefined
  
  var submitButtonText: String
}
object UpsellFormProps {
  
  inline def apply(
    onSubmit: /* arg */ js.Object & (Event[
      (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
    ]) => Unit,
    submitButtonAccessibilityLabel: String,
    submitButtonText: String
  ): UpsellFormProps = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit), submitButtonAccessibilityLabel = submitButtonAccessibilityLabel.asInstanceOf[js.Any], submitButtonText = submitButtonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsellFormProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpsellFormProps] (val x: Self) extends AnyVal {
    
    inline def setOnSubmit(
      value: /* arg */ js.Object & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setSubmitButtonAccessibilityLabel(value: String): Self = StObject.set(x, "submitButtonAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setSubmitButtonDisabled(value: Boolean): Self = StObject.set(x, "submitButtonDisabled", value.asInstanceOf[js.Any])
    
    inline def setSubmitButtonDisabledUndefined: Self = StObject.set(x, "submitButtonDisabled", js.undefined)
    
    inline def setSubmitButtonText(value: String): Self = StObject.set(x, "submitButtonText", value.asInstanceOf[js.Any])
  }
}
