package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSTryRule extends StObject {
  
  /**
    * Parent stylesheet's origin.
    */
  var origin: StyleSheetOrigin
  
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
object CSSTryRule {
  
  inline def apply(origin: StyleSheetOrigin, style: CSSStyle): CSSTryRule = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTryRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSTryRule] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: StyleSheetOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetIdUndefined: Self = StObject.set(x, "styleSheetId", js.undefined)
  }
}
