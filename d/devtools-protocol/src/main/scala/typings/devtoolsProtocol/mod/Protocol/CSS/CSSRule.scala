package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSRule extends StObject {
  
  /**
    * Container query list array (for rules involving container queries).
    * The array enumerates container queries starting with the innermost one, going outwards.
    */
  var containerQueries: js.UndefOr[js.Array[CSSContainerQuery]] = js.undefined
  
  /**
    * Cascade layer array. Contains the layer hierarchy that this rule belongs to starting
    * with the innermost layer and going outwards.
    */
  var layers: js.UndefOr[js.Array[CSSLayer]] = js.undefined
  
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
    * @scope CSS at-rule array.
    * The array enumerates @scope at-rules starting with the innermost one, going outwards.
    */
  var scopes: js.UndefOr[js.Array[CSSScope]] = js.undefined
  
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
  
  /**
    * @supports CSS at-rule array.
    * The array enumerates @supports at-rules starting with the innermost one, going outwards.
    */
  var supports: js.UndefOr[js.Array[CSSSupports]] = js.undefined
}
object CSSRule {
  
  inline def apply(origin: StyleSheetOrigin, selectorList: SelectorList, style: CSSStyle): CSSRule = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], selectorList = selectorList.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSRule] (val x: Self) extends AnyVal {
    
    inline def setContainerQueries(value: js.Array[CSSContainerQuery]): Self = StObject.set(x, "containerQueries", value.asInstanceOf[js.Any])
    
    inline def setContainerQueriesUndefined: Self = StObject.set(x, "containerQueries", js.undefined)
    
    inline def setContainerQueriesVarargs(value: CSSContainerQuery*): Self = StObject.set(x, "containerQueries", js.Array(value*))
    
    inline def setLayers(value: js.Array[CSSLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: CSSLayer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setMedia(value: js.Array[CSSMedia]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMediaVarargs(value: CSSMedia*): Self = StObject.set(x, "media", js.Array(value*))
    
    inline def setOrigin(value: StyleSheetOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[CSSScope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: CSSScope*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setSelectorList(value: SelectorList): Self = StObject.set(x, "selectorList", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetIdUndefined: Self = StObject.set(x, "styleSheetId", js.undefined)
    
    inline def setSupports(value: js.Array[CSSSupports]): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
    
    inline def setSupportsVarargs(value: CSSSupports*): Self = StObject.set(x, "supports", js.Array(value*))
  }
}
