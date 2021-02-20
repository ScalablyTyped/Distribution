package typings.gestalt.mod

import typings.gestalt.anon.Event
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
import typings.gestalt.gestaltStrings.circle
import typings.gestalt.gestaltStrings.compress
import typings.gestalt.gestaltStrings.nofollow
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.pill
import typings.gestalt.gestaltStrings.self
import typings.gestalt.gestaltStrings.tab
import typings.gestalt.gestaltStrings.underline
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var accessibilitySelected: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var hoverStyle: js.UndefOr[none | underline] = js.native
  
  var href: String = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var onBlur: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLAnchorElement], js.Object]] = js.native
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement], 
      js.Object
    ]
  ] = js.native
  
  var onFocus: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLAnchorElement], js.Object]] = js.native
  
  var rel: js.UndefOr[none | nofollow] = js.native
  
  var role: js.UndefOr[tab] = js.native
  
  var rounding: js.UndefOr[pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  
  var tapStyle: js.UndefOr[none | compress] = js.native
  
  var target: js.UndefOr[Null | self | blank] = js.native
}
object LinkProps {
  
  @scala.inline
  def apply(href: String): LinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  
  @scala.inline
  implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilitySelected(value: Boolean): Self = StObject.set(x, "accessibilitySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilitySelectedUndefined: Self = StObject.set(x, "accessibilitySelected", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: none | underline): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* arg */ js.Object with Event[FocusEvent[HTMLAnchorElement]] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: /* arg */ js.Object with (Event[
          (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement]
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* arg */ js.Object with Event[FocusEvent[HTMLAnchorElement]] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setRel(value: none | nofollow): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setRole(value: tab): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
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
