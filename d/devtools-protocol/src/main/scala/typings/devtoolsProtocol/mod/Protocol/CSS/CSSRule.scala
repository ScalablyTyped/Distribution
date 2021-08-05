package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSRule extends StObject {
  
  /**
    * Media list array (for rules involving media queries). The array enumerates media queries
    * starting with the innermost one, going outwards.
    */
  var media: js.UndefOr[js.Array[CSSMedia]] = js.undefined
  
  /**
    * Parent stylesheet's origin.
    */
  var origin: StyleSheetOrigin
  
  /**
    * Rule selector data.
    */
  var selectorList: SelectorList
  
  /**
    * Associated style declaration.
    */
  var style: CSSStyle
  
  /**
    * The css style sheet identifier (absent for user agent stylesheet and user-specified
    * stylesheet rules) this rule came from.
    */
  var styleSheetId: js.UndefOr[StyleSheetId] = js.undefined
}
object CSSRule {
  
  inline def apply(origin: StyleSheetOrigin, selectorList: SelectorList, style: CSSStyle): CSSRule = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], selectorList = selectorList.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRule]
  }
  
  extension [Self <: CSSRule](x: Self) {
    
    inline def setMedia(value: js.Array[CSSMedia]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMediaVarargs(value: CSSMedia*): Self = StObject.set(x, "media", js.Array(value :_*))
    
    inline def setOrigin(value: StyleSheetOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setSelectorList(value: SelectorList): Self = StObject.set(x, "selectorList", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetIdUndefined: Self = StObject.set(x, "styleSheetId", js.undefined)
  }
}
