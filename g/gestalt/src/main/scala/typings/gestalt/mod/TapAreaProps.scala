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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TapAreaProps extends js.Object {
  
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
  implicit class TapAreaPropsOps[Self <: TapAreaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibilityControls(value: String): Self = this.set("accessibilityControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityControls: Self = this.set("accessibilityControls", js.undefined)
    
    @scala.inline
    def setAccessibilityExpanded(value: Boolean): Self = this.set("accessibilityExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityExpanded: Self = this.set("accessibilityExpanded", js.undefined)
    
    @scala.inline
    def setAccessibilityHaspopup(value: Boolean): Self = this.set("accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHaspopup: Self = this.set("accessibilityHaspopup", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFullHeight(value: Boolean): Self = this.set("fullHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullHeight: Self = this.set("fullHeight", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setMouseCursor(value: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut): Self = this.set("mouseCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseCursor: Self = this.set("mouseCursor", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* arg */ js.Object with (Event[FocusEvent[HTMLDivElement | HTMLAnchorElement]]) => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* arg */ js.Object with (Event[FocusEvent[HTMLDivElement | HTMLAnchorElement]]) => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(
      value: /* arg */ js.Object with (Event[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent]]) => Unit
    ): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(
      value: /* arg */ js.Object with (Event[MouseEvent[HTMLDivElement | HTMLAnchorElement, NativeMouseEvent]]) => Unit
    ): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnTap(
      value: /* arg */ js.Object with (Event[
          (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement])
        ]) => Unit
    ): Self = this.set("onTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
    
    @scala.inline
    def setRel(value: none | nofollow): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    
    @scala.inline
    def setRole(value: button | link): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRounding(value: pill | circule | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = this.set("rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRounding: Self = this.set("rounding", js.undefined)
    
    @scala.inline
    def setTabIndex(value: `-1` | `0`): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTapStyle(value: none | compress): Self = this.set("tapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapStyle: Self = this.set("tapStyle", js.undefined)
    
    @scala.inline
    def setTarget(value: self | blank): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
}
