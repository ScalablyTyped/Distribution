package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagProps extends StObject {
  
  /**
    * Set a disabled state so the tag looks inactive and cannot be interacted with.
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set an error state on the tag. The message is used as an accessibility label for the error icon.
    * Keep it short so it doesn't overwhelm the user.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Callback fired when the tag is removed. Should handle state updates to stop rendering the component.
    * Required unless the tag is in a disabled state.
    */
  var onRemove: js.UndefOr[AbstractEventHandler[MouseEvent[HTMLButtonElement, NativeMouseEvent], js.Object]] = js.undefined
  
  /**
    * Accessibility label for the icon button to remove the tag, ideally something like "Remove [Tag Name] Tag".
    * Required unless the tag is in a disabled state.
    */
  var removeIconAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Short text to render inside the tag.
    */
  var text: String
}
object TagProps {
  
  inline def apply(text: String): TagProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagProps] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setOnRemove(value: /* arg */ js.Object & (Event[MouseEvent[HTMLButtonElement, NativeMouseEvent]]) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setRemoveIconAccessibilityLabel(value: String): Self = StObject.set(x, "removeIconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setRemoveIconAccessibilityLabelUndefined: Self = StObject.set(x, "removeIconAccessibilityLabel", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
