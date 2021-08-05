package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.anon.Path
import typings.gestalt.gestaltNumbers.`-1`
import typings.gestalt.gestaltNumbers.`0`
import typings.gestalt.gestaltNumbers.`1`
import typings.gestalt.gestaltNumbers.`2`
import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltStrings.blank
import typings.gestalt.gestaltStrings.button
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.lightGray
import typings.gestalt.gestaltStrings.link
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.nofollow
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.self
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.transparent
import typings.gestalt.gestaltStrings.transparentDarkGray
import typings.gestalt.gestaltStrings.white
import typings.gestalt.gestaltStrings.xl
import typings.gestalt.gestaltStrings.xs
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconButtonProps extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.undefined
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: String
  
  var bgColor: js.UndefOr[transparent | darkGray | transparentDarkGray | gray | lightGray | white | red] = js.undefined
  
  var dangerouslySetSvgPath: js.UndefOr[Path] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[Icons] = js.undefined
  
  var iconColor: js.UndefOr[gray | darkGray | red | white] = js.undefined
  
  var onClick: js.UndefOr[AbstractEventHandler[MouseEvent[HTMLButtonElement, NativeMouseEvent], js.Object]] = js.undefined
  
  var padding: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.undefined
  
  var rel: js.UndefOr[none | nofollow] = js.undefined
  
  var role: js.UndefOr[button | link] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  
  var tabIndex: js.UndefOr[`-1` | `0`] = js.undefined
  
  var target: js.UndefOr[Null | self | blank] = js.undefined
}
object IconButtonProps {
  
  inline def apply(accessibilityLabel: String): IconButtonProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
  
  extension [Self <: IconButtonProps](x: Self) {
    
    inline def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    inline def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    inline def setAccessibilityHaspopup(value: Boolean): Self = StObject.set(x, "accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHaspopupUndefined: Self = StObject.set(x, "accessibilityHaspopup", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setBgColor(value: transparent | darkGray | transparentDarkGray | gray | lightGray | white | red): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setDangerouslySetSvgPath(value: Path): Self = StObject.set(x, "dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetSvgPathUndefined: Self = StObject.set(x, "dangerouslySetSvgPath", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconColor(value: gray | darkGray | red | white): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnClick(value: /* arg */ js.Object & (Event[MouseEvent[HTMLButtonElement, NativeMouseEvent]]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setPadding(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRel(value: none | nofollow): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRole(value: button | link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSize(value: xs | sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTabIndex(value: `-1` | `0`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
