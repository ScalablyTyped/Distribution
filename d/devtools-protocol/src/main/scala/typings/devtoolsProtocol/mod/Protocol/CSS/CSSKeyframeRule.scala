package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSKeyframeRule extends js.Object {
  
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
  implicit class CSSKeyframeRuleOps[Self <: CSSKeyframeRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyText(value: Value): Self = this.set("keyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: StyleSheetOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = this.set("styleSheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleSheetId: Self = this.set("styleSheetId", js.undefined)
  }
}
