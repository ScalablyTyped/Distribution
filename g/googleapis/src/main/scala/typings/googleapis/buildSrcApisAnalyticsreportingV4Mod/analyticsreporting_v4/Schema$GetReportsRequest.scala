package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The batch request containing multiple report request.
  */
@js.native
trait Schema$GetReportsRequest extends js.Object {
  /**
    * Requests, each request will have a separate response. There can be a
    * maximum of 5 requests. All requests should have the same `dateRanges`,
    * `viewId`, `segments`, `samplingLevel`, and `cohortGroup`.
    */
  var reportRequests: js.UndefOr[js.Array[Schema$ReportRequest]] = js.native
  /**
    * Enables [resource based
    * quotas](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4),
    * (defaults to `False`). If this field is set to `True` the per view
    * (profile) quotas are governed by the computational cost of the request.
    * Note that using cost based quotas will higher enable sampling rates. (10
    * Million for `SMALL`, 100M for `LARGE`. See the [limits and quotas
    * documentation](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4)
    * for details.
    */
  var useResourceQuotas: js.UndefOr[Boolean] = js.native
}

object Schema$GetReportsRequest {
  @scala.inline
  def apply(
    reportRequests: js.Array[Schema$ReportRequest] = null,
    useResourceQuotas: js.UndefOr[Boolean] = js.undefined
  ): Schema$GetReportsRequest = {
    val __obj = js.Dynamic.literal()
    if (reportRequests != null) __obj.updateDynamic("reportRequests")(reportRequests.asInstanceOf[js.Any])
    if (!js.isUndefined(useResourceQuotas)) __obj.updateDynamic("useResourceQuotas")(useResourceQuotas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetReportsRequest]
  }
}

