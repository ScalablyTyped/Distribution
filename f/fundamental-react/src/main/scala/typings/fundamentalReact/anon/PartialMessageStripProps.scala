package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/MessageStrip/MessageStrip.MessageStripProps> */
trait PartialMessageStripProps extends StObject {
  
  var buttonProps: js.UndefOr[js.Any] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  
  var dismissible: js.UndefOr[Boolean] = js.undefined
  
  var link: js.UndefOr[String] = js.undefined
  
  var linkProps: js.UndefOr[js.Any] = js.undefined
  
  var linkText: js.UndefOr[String] = js.undefined
  
  var localizedText: js.UndefOr[js.Any] = js.undefined
  
  var noGlyph: js.UndefOr[Boolean] = js.undefined
  
  var onCloseClicked: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var `type`: js.UndefOr[js.Any] = js.undefined
}
object PartialMessageStripProps {
  
  inline def apply(): PartialMessageStripProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageStripProps]
  }
  
  extension [Self <: PartialMessageStripProps](x: Self) {
    
    inline def setButtonProps(value: js.Any): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
    
    inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    
    inline def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
    
    inline def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkProps(value: js.Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
    
    inline def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
    
    inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
    
    inline def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLocalizedText(value: js.Any): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
    
    inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
    
    inline def setNoGlyph(value: Boolean): Self = StObject.set(x, "noGlyph", value.asInstanceOf[js.Any])
    
    inline def setNoGlyphUndefined: Self = StObject.set(x, "noGlyph", js.undefined)
    
    inline def setOnCloseClicked(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onCloseClicked", js.Any.fromFunction1(value))
    
    inline def setOnCloseClickedUndefined: Self = StObject.set(x, "onCloseClicked", js.undefined)
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
