package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudienceAudienceDefinition extends js.Object {
  var includeConditions: js.UndefOr[IncludeConditions] = js.undefined
}

object RemarketingAudienceAudienceDefinition {
  @scala.inline
  def apply(includeConditions: IncludeConditions = null): RemarketingAudienceAudienceDefinition = {
    val __obj = js.Dynamic.literal()
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions)
    __obj.asInstanceOf[RemarketingAudienceAudienceDefinition]
  }
}

