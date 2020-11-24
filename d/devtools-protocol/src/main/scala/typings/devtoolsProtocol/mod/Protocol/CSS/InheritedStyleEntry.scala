package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InheritedStyleEntry extends js.Object {
  
  /**
    * The ancestor node's inline style, if any, in the style inheritance chain.
    */
  var inlineStyle: js.UndefOr[CSSStyle] = js.native
  
  /**
    * Matches of CSS rules matching the ancestor node in the style inheritance chain.
    */
  var matchedCSSRules: js.Array[RuleMatch] = js.native
}
object InheritedStyleEntry {
  
  @scala.inline
  def apply(matchedCSSRules: js.Array[RuleMatch]): InheritedStyleEntry = {
    val __obj = js.Dynamic.literal(matchedCSSRules = matchedCSSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritedStyleEntry]
  }
  
  @scala.inline
  implicit class InheritedStyleEntryOps[Self <: InheritedStyleEntry] (val x: Self) extends AnyVal {
    
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
    def setMatchedCSSRulesVarargs(value: RuleMatch*): Self = this.set("matchedCSSRules", js.Array(value :_*))
    
    @scala.inline
    def setMatchedCSSRules(value: js.Array[RuleMatch]): Self = this.set("matchedCSSRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineStyle(value: CSSStyle): Self = this.set("inlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineStyle: Self = this.set("inlineStyle", js.undefined)
  }
}
