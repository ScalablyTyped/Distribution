package typings.gestalt.anon

import typings.gestalt.gestaltStrings.a
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.none
import typings.gestalt.mod.AbstractEventHandler
import typings.gestalt.mod.TargetType
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalLinkIcon extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var externalLinkIcon: js.UndefOr[none | default | Color] = js.undefined
  
  var href: String
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement], 
      `0`
    ]
  ] = js.undefined
  
  var ref: js.UndefOr[Ref[a]] = js.undefined
  
  var target: js.UndefOr[TargetType] = js.undefined
}
object ExternalLinkIcon {
  
  inline def apply(href: String): ExternalLinkIcon = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalLinkIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalLinkIcon] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setExternalLinkIcon(value: none | default | Color): Self = StObject.set(x, "externalLinkIcon", value.asInstanceOf[js.Any])
    
    inline def setExternalLinkIconUndefined: Self = StObject.set(x, "externalLinkIcon", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: /* arg */ `0` & (Event[
          (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement]
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setRef(value: Ref[a]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ a | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setTarget(value: TargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
