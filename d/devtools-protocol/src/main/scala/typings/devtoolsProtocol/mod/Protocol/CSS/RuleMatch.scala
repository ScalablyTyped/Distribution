package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleMatch extends js.Object {
  
  /**
    * Matching selector indices in the rule's selectorList selectors (0-based).
    */
  var matchingSelectors: js.Array[integer] = js.native
  
  /**
    * CSS rule in the match.
    */
  var rule: CSSRule = js.native
}
object RuleMatch {
  
  @scala.inline
  def apply(matchingSelectors: js.Array[integer], rule: CSSRule): RuleMatch = {
    val __obj = js.Dynamic.literal(matchingSelectors = matchingSelectors.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleMatch]
  }
  
  @scala.inline
  implicit class RuleMatchOps[Self <: RuleMatch] (val x: Self) extends AnyVal {
    
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
    def setMatchingSelectorsVarargs(value: integer*): Self = this.set("matchingSelectors", js.Array(value :_*))
    
    @scala.inline
    def setMatchingSelectors(value: js.Array[integer]): Self = this.set("matchingSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: CSSRule): Self = this.set("rule", value.asInstanceOf[js.Any])
  }
}
