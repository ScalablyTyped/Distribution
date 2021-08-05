package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.gestaltNumbers.`-1`
import typings.gestalt.gestaltNumbers.`0`
import typings.gestalt.gestaltNumbers.`1`
import typings.gestalt.gestaltNumbers.`2`
import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltNumbers.`6`
import typings.gestalt.gestaltNumbers.`7`
import typings.gestalt.gestaltNumbers.`8`
import typings.gestalt.gestaltStrings.blank
import typings.gestalt.gestaltStrings.button
import typings.gestalt.gestaltStrings.circule
import typings.gestalt.gestaltStrings.compress
import typings.gestalt.gestaltStrings.copy
import typings.gestalt.gestaltStrings.grab
import typings.gestalt.gestaltStrings.grabbing
import typings.gestalt.gestaltStrings.link
import typings.gestalt.gestaltStrings.move
import typings.gestalt.gestaltStrings.noDrop
import typings.gestalt.gestaltStrings.nofollow
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.pill
import typings.gestalt.gestaltStrings.pointer
import typings.gestalt.gestaltStrings.self
import typings.gestalt.gestaltStrings.zoomIn
import typings.gestalt.gestaltStrings.zoomOut
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapAreaProps extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.undefined
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fullHeight: js.UndefOr[Boolean] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var mouseCursor: js.UndefOr[copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut] = js.undefined
  
  var onBlur: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLDivElement | HTMLAnchorElement], js.Object]] = js.undefined
  
  var onFocus: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLDivElement | HTMLAnchorElement], js.Object]] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    AbstractEventHandler[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent], js.Object]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    AbstractEventHandler[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent], js.Object]
  ] = js.undefined
  
  var onTap: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement]), 
      js.Object
    ]
  ] = js.undefined
  
  var rel: js.UndefOr[none | nofollow] = js.undefined
  
  var role: js.UndefOr[button | link] = js.undefined
  
  var rounding: js.UndefOr[pill | circule | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  
  var tabIndex: js.UndefOr[`-1` | `0`] = js.undefined
  
  var tapStyle: js.UndefOr[none | compress] = js.undefined
  
  var target: js.UndefOr[Null | self | blank] = js.undefined
}
object TapAreaProps {
  
  inline def apply(): TapAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapAreaProps]
  }
  
  extension [Self <: TapAreaProps](x: Self) {
    
    inline def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    inline def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    inline def setAccessibilityHaspopup(value: Boolean): Self = StObject.set(x, "accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHaspopupUndefined: Self = StObject.set(x, "accessibilityHaspopup", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFullHeight(value: Boolean): Self = StObject.set(x, "fullHeight", value.asInstanceOf[js.Any])
    
    inline def setFullHeightUndefined: Self = StObject.set(x, "fullHeight", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setMouseCursor(value: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut): Self = StObject.set(x, "mouseCursor", value.asInstanceOf[js.Any])
    
    inline def setMouseCursorUndefined: Self = StObject.set(x, "mouseCursor", js.undefined)
    
    inline def setOnBlur(value: /* arg */ js.Object & (Event[FocusEvent[HTMLDivElement | HTMLAnchorElement]]) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnFocus(value: /* arg */ js.Object & (Event[FocusEvent[HTMLDivElement | HTMLAnchorElement]]) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnMouseEnter(
      value: /* arg */ js.Object & (Event[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: /* arg */ js.Object & (Event[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnTap(
      value: /* arg */ js.Object & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement])
        ]) => Unit
    ): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
    
    inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
    
    inline def setRel(value: none | nofollow): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRole(value: button | link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRounding(value: pill | circule | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    inline def setTabIndex(value: `-1` | `0`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTapStyle(value: none | compress): Self = StObject.set(x, "tapStyle", value.asInstanceOf[js.Any])
    
    inline def setTapStyleUndefined: Self = StObject.set(x, "tapStyle", js.undefined)
    
    inline def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
