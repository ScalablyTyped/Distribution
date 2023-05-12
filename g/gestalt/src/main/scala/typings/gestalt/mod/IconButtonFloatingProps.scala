package typings.gestalt.mod

import typings.gestalt.anon.DangerouslyDisableOnNavigation
import typings.gestalt.anon.Event
import typings.gestalt.anon.Inline
import typings.gestalt.anon.Path
import typings.gestalt.gestaltStrings.dialog
import typings.gestalt.gestaltStrings.menu
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconButtonFloatingProps extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.undefined
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: String
  
  var accessibilityPopupRole: menu | dialog
  
  var dangerouslySetSvgPath: js.UndefOr[Path] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icon: Icons
  
  var onClick: ButtonEventHandlerType
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var tooltip: Inline
}
object IconButtonFloatingProps {
  
  inline def apply(
    accessibilityLabel: String,
    accessibilityPopupRole: menu | dialog,
    icon: Icons,
    onClick: /* arg */ DangerouslyDisableOnNavigation & (Event[
      (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
    ]) => Unit,
    tooltip: Inline
  ): IconButtonFloatingProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], accessibilityPopupRole = accessibilityPopupRole.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonFloatingProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconButtonFloatingProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    inline def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityPopupRole(value: menu | dialog): Self = StObject.set(x, "accessibilityPopupRole", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetSvgPath(value: Path): Self = StObject.set(x, "dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetSvgPathUndefined: Self = StObject.set(x, "dangerouslySetSvgPath", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: /* arg */ DangerouslyDisableOnNavigation & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setTooltip(value: Inline): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
