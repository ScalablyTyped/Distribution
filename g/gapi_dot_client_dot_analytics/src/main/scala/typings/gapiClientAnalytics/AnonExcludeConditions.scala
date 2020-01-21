package typings.gapiClientAnalytics

import typings.gapiClientAnalytics.gapi.client.analytics.IncludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludeConditions extends js.Object {
  /** Defines the conditions to exclude users from the audience. */
  var excludeConditions: js.UndefOr[AnonExclusionDuration] = js.undefined
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[IncludeConditions] = js.undefined
}

object AnonExcludeConditions {
  @scala.inline
  def apply(excludeConditions: AnonExclusionDuration = null, includeConditions: IncludeConditions = null): AnonExcludeConditions = {
    val __obj = js.Dynamic.literal()
    if (excludeConditions != null) __obj.updateDynamic("excludeConditions")(excludeConditions.asInstanceOf[js.Any])
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeConditions]
  }
}

