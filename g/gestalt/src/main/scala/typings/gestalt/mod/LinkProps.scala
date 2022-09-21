package typings.gestalt.mod

import typings.gestalt.anon.DangerouslyDisableOnNavigation
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
import typings.gestalt.gestaltStrings.underline
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * When supplied, a "visit" icon is shown at the end of Link. See the [externalLinkIcon and rel variant](https://gestalt.pinterest.systems/link#externalLinkIcon-and-rel) to learn more.
    */
  var externalLinkIcon: js.UndefOr[ExternalLinkIcon] = js.undefined
  
  var hoverStyle: js.UndefOr[none | underline] = js.undefined
  
  var href: String
  
  var id: js.UndefOr[String] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var onBlur: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLAnchorElement, Element], js.Object]] = js.undefined
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement], 
      DangerouslyDisableOnNavigation
    ]
  ] = js.undefined
  
  var onFocus: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLAnchorElement, Element], js.Object]] = js.undefined
  
  var rel: js.UndefOr[none | nofollow] = js.undefined
  
  var rounding: js.UndefOr[pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  
  var tapStyle: js.UndefOr[none | compress] = js.undefined
  
  var target: js.UndefOr[Null | self | blank] = js.undefined
}
object LinkProps {
  
  inline def apply(href: String): LinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  
  extension [Self <: LinkProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setExternalLinkIcon(value: ExternalLinkIcon): Self = StObject.set(x, "externalLinkIcon", value.asInstanceOf[js.Any])
    
    inline def setExternalLinkIconUndefined: Self = StObject.set(x, "externalLinkIcon", js.undefined)
    
    inline def setHoverStyle(value: none | underline): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setOnBlur(value: /* arg */ js.Object & (Event[FocusEvent[HTMLAnchorElement, Element]]) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(
      value: /* arg */ DangerouslyDisableOnNavigation & (Event[
          (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement]
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocus(value: /* arg */ js.Object & (Event[FocusEvent[HTMLAnchorElement, Element]]) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setRel(value: none | nofollow): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    inline def setTapStyle(value: none | compress): Self = StObject.set(x, "tapStyle", value.asInstanceOf[js.Any])
    
    inline def setTapStyleUndefined: Self = StObject.set(x, "tapStyle", js.undefined)
    
    inline def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
