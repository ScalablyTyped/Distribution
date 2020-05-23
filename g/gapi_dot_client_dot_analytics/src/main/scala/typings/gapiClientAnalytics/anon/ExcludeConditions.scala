package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludeConditions extends js.Object {
  /** Defines the conditions to exclude users from the audience. */
  var excludeConditions: js.UndefOr[ExclusionDuration] = js.undefined
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[typings.gapiClientAnalytics.gapi.client.analytics.IncludeConditions] = js.undefined
}

object ExcludeConditions {
  @scala.inline
  def apply(
    excludeConditions: ExclusionDuration = null,
    includeConditions: typings.gapiClientAnalytics.gapi.client.analytics.IncludeConditions = null
  ): ExcludeConditions = {
    val __obj = js.Dynamic.literal()
    if (excludeConditions != null) __obj.updateDynamic("excludeConditions")(excludeConditions.asInstanceOf[js.Any])
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeConditions]
  }
}

