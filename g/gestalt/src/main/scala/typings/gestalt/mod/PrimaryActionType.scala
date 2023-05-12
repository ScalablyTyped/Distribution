package typings.gestalt.mod

import typings.gestalt.anon.AccessibilityLabel
import typings.gestalt.anon.DangerouslyDisableOnNavigation
import typings.gestalt.anon.Event
import typings.gestalt.gestaltStrings.`trash-can`
import typings.gestalt.gestaltStrings.edit
import typings.gestalt.gestaltStrings.ellipsis
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimaryActionType extends StObject {
  
  var dropdownItems: js.UndefOr[js.Array[ReactElement]] = js.undefined
  
  var icon: js.UndefOr[ellipsis | edit | `trash-can`] = js.undefined
  
  var onClick: js.UndefOr[ButtonEventHandlerType] = js.undefined
  
  var tooltip: AccessibilityLabel
}
object PrimaryActionType {
  
  inline def apply(tooltip: AccessibilityLabel): PrimaryActionType = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryActionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrimaryActionType] (val x: Self) extends AnyVal {
    
    inline def setDropdownItems(value: js.Array[ReactElement]): Self = StObject.set(x, "dropdownItems", value.asInstanceOf[js.Any])
    
    inline def setDropdownItemsUndefined: Self = StObject.set(x, "dropdownItems", js.undefined)
    
    inline def setDropdownItemsVarargs(value: ReactElement*): Self = StObject.set(x, "dropdownItems", js.Array(value*))
    
    inline def setIcon(value: ellipsis | edit | `trash-can`): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnClick(
      value: /* arg */ DangerouslyDisableOnNavigation & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTooltip(value: AccessibilityLabel): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
