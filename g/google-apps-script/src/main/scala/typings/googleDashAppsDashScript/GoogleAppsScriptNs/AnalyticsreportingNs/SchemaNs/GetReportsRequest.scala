package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReportsRequest extends js.Object {
  var reportRequests: js.UndefOr[js.Array[ReportRequest]] = js.undefined
  var useResourceQuotas: js.UndefOr[Boolean] = js.undefined
}

object GetReportsRequest {
  @scala.inline
  def apply(
    reportRequests: js.Array[ReportRequest] = null,
    useResourceQuotas: js.UndefOr[Boolean] = js.undefined
  ): GetReportsRequest = {
    val __obj = js.Dynamic.literal()
    if (reportRequests != null) __obj.updateDynamic("reportRequests")(reportRequests)
    if (!js.isUndefined(useResourceQuotas)) __obj.updateDynamic("useResourceQuotas")(useResourceQuotas)
    __obj.asInstanceOf[GetReportsRequest]
  }
}

