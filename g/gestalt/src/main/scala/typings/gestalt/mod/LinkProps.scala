package typings.gestalt.mod

import typings.gestalt.anon.DangerouslyDisableOnNavigation
import typings.gestalt.anon.Event
import typings.gestalt.anon.Size
import typings.gestalt.gestaltStrings.`inline`
import typings.gestalt.gestaltStrings.always
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.block
import typings.gestalt.gestaltStrings.compress
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.hover
import typings.gestalt.gestaltStrings.inlineBlock
import typings.gestalt.gestaltStrings.none
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var display: js.UndefOr[`inline` | inlineBlock | block] = js.undefined
  
  var externalLinkIcon: js.UndefOr[none | default | Size] = js.undefined
  
  var href: String
  
  var id: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLAnchorElement, Element], js.Object]] = js.undefined
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement], 
      DangerouslyDisableOnNavigation
    ]
  ] = js.undefined
  
  var onFocus: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLAnchorElement, Element], js.Object]] = js.undefined
  
  var rel: js.UndefOr[RelType] = js.undefined
  
  var rounding: js.UndefOr[RoundingType] = js.undefined
  
  var tapStyle: js.UndefOr[none | compress] = js.undefined
  
  var target: js.UndefOr[TargetType] = js.undefined
  
  var underline: js.UndefOr[auto | none | always | hover] = js.undefined
}
object LinkProps {
  
  inline def apply(href: String): LinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisplay(value: `inline` | inlineBlock | block): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setExternalLinkIcon(value: none | default | Size): Self = StObject.set(x, "externalLinkIcon", value.asInstanceOf[js.Any])
    
    inline def setExternalLinkIconUndefined: Self = StObject.set(x, "externalLinkIcon", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
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
    
    inline def setRel(value: RelType): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRounding(value: RoundingType): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    inline def setTapStyle(value: none | compress): Self = StObject.set(x, "tapStyle", value.asInstanceOf[js.Any])
    
    inline def setTapStyleUndefined: Self = StObject.set(x, "tapStyle", js.undefined)
    
    inline def setTarget(value: TargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUnderline(value: auto | none | always | hover): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
