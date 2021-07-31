package typings.gapiPagespeedonline

import typings.gapiPagespeedonline.anon.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiPageSpeedOnlineRuleResource extends StObject {
  
  /**
    * Localized name of the rule, intended for presentation to a user.
    */
  var localizedRuleName: String
  
  /**
    * The impact (unbounded floating point value) that implementing the suggestions for this rule would have on making the page faster.
    */
  var ruleImpact: Double
  
  /**
    * The score (0-100) for this rule. The rule score indicates how well a page implements the recommendations for the given rule.
    */
  var ruleScore: Double
  
  /**
    * List of blocks of URLs. Each block may contain a heading and a list of URLs. Each URL may optionally include additional details.
    */
  var urlBlocks: js.Array[Header]
}
object GoogleApiPageSpeedOnlineRuleResource {
  
  @scala.inline
  def apply(localizedRuleName: String, ruleImpact: Double, ruleScore: Double, urlBlocks: js.Array[Header]): GoogleApiPageSpeedOnlineRuleResource = {
    val __obj = js.Dynamic.literal(localizedRuleName = localizedRuleName.asInstanceOf[js.Any], ruleImpact = ruleImpact.asInstanceOf[js.Any], ruleScore = ruleScore.asInstanceOf[js.Any], urlBlocks = urlBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiPageSpeedOnlineRuleResource]
  }
  
  @scala.inline
  implicit class GoogleApiPageSpeedOnlineRuleResourceMutableBuilder[Self <: GoogleApiPageSpeedOnlineRuleResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalizedRuleName(value: String): Self = StObject.set(x, "localizedRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleImpact(value: Double): Self = StObject.set(x, "ruleImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleScore(value: Double): Self = StObject.set(x, "ruleScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlBlocks(value: js.Array[Header]): Self = StObject.set(x, "urlBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlBlocksVarargs(value: Header*): Self = StObject.set(x, "urlBlocks", js.Array(value :_*))
  }
}
