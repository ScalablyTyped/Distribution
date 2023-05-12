package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.warning
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagProps extends StObject {
  
  var accessibilityRemoveIconLabel: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var onRemove: AbstractEventHandler[MouseEvent[HTMLButtonElement, NativeMouseEvent], js.Object]
  
  var text: String
  
  var `type`: js.UndefOr[default | error | warning] = js.undefined
}
object TagProps {
  
  inline def apply(
    onRemove: /* arg */ js.Object & (Event[MouseEvent[HTMLButtonElement, NativeMouseEvent]]) => Unit,
    text: String
  ): TagProps = {
    val __obj = js.Dynamic.literal(onRemove = js.Any.fromFunction1(onRemove), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityRemoveIconLabel(value: String): Self = StObject.set(x, "accessibilityRemoveIconLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRemoveIconLabelUndefined: Self = StObject.set(x, "accessibilityRemoveIconLabel", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnRemove(value: /* arg */ js.Object & (Event[MouseEvent[HTMLButtonElement, NativeMouseEvent]]) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: default | error | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
