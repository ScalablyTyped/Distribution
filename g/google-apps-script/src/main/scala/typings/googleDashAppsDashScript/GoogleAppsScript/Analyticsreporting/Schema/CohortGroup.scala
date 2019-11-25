package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CohortGroup extends js.Object {
  var cohorts: js.UndefOr[js.Array[Cohort]] = js.undefined
  var lifetimeValue: js.UndefOr[Boolean] = js.undefined
}

object CohortGroup {
  @scala.inline
  def apply(cohorts: js.Array[Cohort] = null, lifetimeValue: js.UndefOr[Boolean] = js.undefined): CohortGroup = {
    val __obj = js.Dynamic.literal()
    if (cohorts != null) __obj.updateDynamic("cohorts")(cohorts.asInstanceOf[js.Any])
    if (!js.isUndefined(lifetimeValue)) __obj.updateDynamic("lifetimeValue")(lifetimeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CohortGroup]
  }
}

