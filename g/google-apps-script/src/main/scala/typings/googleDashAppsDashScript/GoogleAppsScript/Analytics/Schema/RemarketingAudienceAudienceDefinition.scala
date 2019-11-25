package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

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
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemarketingAudienceAudienceDefinition]
  }
}

