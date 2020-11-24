package typings.gapiPagespeedonline

import typings.gapiPagespeedonline.anon.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiPageSpeedOnlineRuleResource extends js.Object {
  
  /**
    * Localized name of the rule, intended for presentation to a user.
    */
  var localizedRuleName: String = js.native
  
  /**
    * The impact (unbounded floating point value) that implementing the suggestions for this rule would have on making the page faster.
    */
  var ruleImpact: Double = js.native
  
  /**
    * The score (0-100) for this rule. The rule score indicates how well a page implements the recommendations for the given rule.
    */
  var ruleScore: Double = js.native
  
  /**
    * List of blocks of URLs. Each block may contain a heading and a list of URLs. Each URL may optionally include additional details.
    */
  var urlBlocks: js.Array[Header] = js.native
}
object GoogleApiPageSpeedOnlineRuleResource {
  
  @scala.inline
  def apply(localizedRuleName: String, ruleImpact: Double, ruleScore: Double, urlBlocks: js.Array[Header]): GoogleApiPageSpeedOnlineRuleResource = {
    val __obj = js.Dynamic.literal(localizedRuleName = localizedRuleName.asInstanceOf[js.Any], ruleImpact = ruleImpact.asInstanceOf[js.Any], ruleScore = ruleScore.asInstanceOf[js.Any], urlBlocks = urlBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiPageSpeedOnlineRuleResource]
  }
  
  @scala.inline
  implicit class GoogleApiPageSpeedOnlineRuleResourceOps[Self <: GoogleApiPageSpeedOnlineRuleResource] (val x: Self) extends AnyVal {
    
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
    def setLocalizedRuleName(value: String): Self = this.set("localizedRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleImpact(value: Double): Self = this.set("ruleImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleScore(value: Double): Self = this.set("ruleScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlBlocksVarargs(value: Header*): Self = this.set("urlBlocks", js.Array(value :_*))
    
    @scala.inline
    def setUrlBlocks(value: js.Array[Header]): Self = this.set("urlBlocks", value.asInstanceOf[js.Any])
  }
}
