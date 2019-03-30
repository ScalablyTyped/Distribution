package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CohortGroup extends js.Object {
  var cohorts: js.UndefOr[js.Array[Cohort]] = js.undefined
  var lifetimeValue: js.UndefOr[scala.Boolean] = js.undefined
}

object CohortGroup {
  @scala.inline
  def apply(cohorts: js.Array[Cohort] = null, lifetimeValue: js.UndefOr[scala.Boolean] = js.undefined): CohortGroup = {
    val __obj = js.Dynamic.literal()
    if (cohorts != null) __obj.updateDynamic("cohorts")(cohorts)
    if (!js.isUndefined(lifetimeValue)) __obj.updateDynamic("lifetimeValue")(lifetimeValue)
    __obj.asInstanceOf[CohortGroup]
  }
}

