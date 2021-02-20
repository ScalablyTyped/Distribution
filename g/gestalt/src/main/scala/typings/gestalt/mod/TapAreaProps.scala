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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TapAreaProps extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.native
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.native
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.native
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var fullHeight: js.UndefOr[Boolean] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var mouseCursor: js.UndefOr[copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut] = js.native
  
  var onBlur: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLDivElement | HTMLAnchorElement], js.Object]] = js.native
  
  var onFocus: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLDivElement | HTMLAnchorElement], js.Object]] = js.native
  
  var onMouseEnter: js.UndefOr[
    AbstractEventHandler[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent], js.Object]
  ] = js.native
  
  var onMouseLeave: js.UndefOr[
    AbstractEventHandler[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent], js.Object]
  ] = js.native
  
  var onTap: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement]), 
      js.Object
    ]
  ] = js.native
  
  var rel: js.UndefOr[none | nofollow] = js.native
  
  var role: js.UndefOr[button | link] = js.native
  
  var rounding: js.UndefOr[pill | circule | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  
  var tabIndex: js.UndefOr[`-1` | `0`] = js.native
  
  var tapStyle: js.UndefOr[none | compress] = js.native
  
  var target: js.UndefOr[Null | self | blank] = js.native
}
object TapAreaProps {
  
  @scala.inline
  def apply(): TapAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapAreaProps]
  }
  
  @scala.inline
  implicit class TapAreaPropsMutableBuilder[Self <: TapAreaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    @scala.inline
    def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    @scala.inline
    def setAccessibilityHaspopup(value: Boolean): Self = StObject.set(x, "accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHaspopupUndefined: Self = StObject.set(x, "accessibilityHaspopup", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFullHeight(value: Boolean): Self = StObject.set(x, "fullHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullHeightUndefined: Self = StObject.set(x, "fullHeight", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setMouseCursor(value: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut): Self = StObject.set(x, "mouseCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseCursorUndefined: Self = StObject.set(x, "mouseCursor", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* arg */ js.Object with (Event[FocusEvent[HTMLDivElement | HTMLAnchorElement]]) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* arg */ js.Object with (Event[FocusEvent[HTMLDivElement | HTMLAnchorElement]]) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(
      value: /* arg */ js.Object with (Event[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(
      value: /* arg */ js.Object with (Event[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnTap(
      value: /* arg */ js.Object with (Event[
          (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement])
        ]) => Unit
    ): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
    
    @scala.inline
    def setRel(value: none | nofollow): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setRole(value: button | link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRounding(value: pill | circule | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    @scala.inline
    def setTabIndex(value: `-1` | `0`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTapStyle(value: none | compress): Self = StObject.set(x, "tapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapStyleUndefined: Self = StObject.set(x, "tapStyle", js.undefined)
    
    @scala.inline
    def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
