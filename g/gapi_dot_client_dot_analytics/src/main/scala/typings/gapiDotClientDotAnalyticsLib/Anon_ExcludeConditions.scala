package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeConditions extends js.Object {
  /** Defines the conditions to exclude users from the audience. */
  var excludeConditions: js.UndefOr[Anon_ExclusionDuration] = js.undefined
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.IncludeConditions] = js.undefined
}

object Anon_ExcludeConditions {
  @scala.inline
  def apply(
    excludeConditions: Anon_ExclusionDuration = null,
    includeConditions: gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.IncludeConditions = null
  ): Anon_ExcludeConditions = {
    val __obj = js.Dynamic.literal()
    if (excludeConditions != null) __obj.updateDynamic("excludeConditions")(excludeConditions)
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions)
    __obj.asInstanceOf[Anon_ExcludeConditions]
  }
}

