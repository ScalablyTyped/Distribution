package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReportsResponse extends js.Object {
  var queryCost: js.UndefOr[Double] = js.undefined
  var reports: js.UndefOr[js.Array[Report]] = js.undefined
  var resourceQuotasRemaining: js.UndefOr[ResourceQuotasRemaining] = js.undefined
}

object GetReportsResponse {
  @scala.inline
  def apply(
    queryCost: Int | Double = null,
    reports: js.Array[Report] = null,
    resourceQuotasRemaining: ResourceQuotasRemaining = null
  ): GetReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (queryCost != null) __obj.updateDynamic("queryCost")(queryCost.asInstanceOf[js.Any])
    if (reports != null) __obj.updateDynamic("reports")(reports.asInstanceOf[js.Any])
    if (resourceQuotasRemaining != null) __obj.updateDynamic("resourceQuotasRemaining")(resourceQuotasRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReportsResponse]
  }
}

