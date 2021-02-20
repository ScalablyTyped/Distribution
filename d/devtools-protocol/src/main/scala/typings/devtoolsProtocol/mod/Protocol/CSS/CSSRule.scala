package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSRule extends StObject {
  
  /**
    * Media list array (for rules involving media queries). The array enumerates media queries
    * starting with the innermost one, going outwards.
    */
  var media: js.UndefOr[js.Array[CSSMedia]] = js.native
  
  /**
    * Parent stylesheet's origin.
    */
  var origin: StyleSheetOrigin = js.native
  
  /**
    * Rule selector data.
    */
  var selectorList: SelectorList = js.native
  
  /**
    * Associated style declaration.
    */
  var style: CSSStyle = js.native
  
  /**
    * The css style sheet identifier (absent for user agent stylesheet and user-specified
    * stylesheet rules) this rule came from.
    */
  var styleSheetId: js.UndefOr[StyleSheetId] = js.native
}
object CSSRule {
  
  @scala.inline
  def apply(origin: StyleSheetOrigin, selectorList: SelectorList, style: CSSStyle): CSSRule = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], selectorList = selectorList.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRule]
  }
  
  @scala.inline
  implicit class CSSRuleMutableBuilder[Self <: CSSRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: js.Array[CSSMedia]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setMediaVarargs(value: CSSMedia*): Self = StObject.set(x, "media", js.Array(value :_*))
    
    @scala.inline
    def setOrigin(value: StyleSheetOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorList(value: SelectorList): Self = StObject.set(x, "selectorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetIdUndefined: Self = StObject.set(x, "styleSheetId", js.undefined)
  }
}
