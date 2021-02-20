package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSKeyframeRule extends StObject {
  
  /**
    * Associated key text.
    */
  var keyText: Value = js.native
  
  /**
    * Parent stylesheet's origin.
    */
  var origin: StyleSheetOrigin = js.native
  
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
object CSSKeyframeRule {
  
  @scala.inline
  def apply(keyText: Value, origin: StyleSheetOrigin, style: CSSStyle): CSSKeyframeRule = {
    val __obj = js.Dynamic.literal(keyText = keyText.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeyframeRule]
  }
  
  @scala.inline
  implicit class CSSKeyframeRuleMutableBuilder[Self <: CSSKeyframeRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyText(value: Value): Self = StObject.set(x, "keyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: StyleSheetOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetIdUndefined: Self = StObject.set(x, "styleSheetId", js.undefined)
  }
}
