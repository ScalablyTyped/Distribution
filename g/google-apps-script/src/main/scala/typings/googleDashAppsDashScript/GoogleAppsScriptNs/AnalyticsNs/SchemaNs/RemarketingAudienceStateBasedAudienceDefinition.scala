package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudienceStateBasedAudienceDefinition extends js.Object {
  var excludeConditions: js.UndefOr[RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions] = js.undefined
  var includeConditions: js.UndefOr[IncludeConditions] = js.undefined
}

object RemarketingAudienceStateBasedAudienceDefinition {
  @scala.inline
  def apply(
    excludeConditions: RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions = null,
    includeConditions: IncludeConditions = null
  ): RemarketingAudienceStateBasedAudienceDefinition = {
    val __obj = js.Dynamic.literal()
    if (excludeConditions != null) __obj.updateDynamic("excludeConditions")(excludeConditions)
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions)
    __obj.asInstanceOf[RemarketingAudienceStateBasedAudienceDefinition]
  }
}

