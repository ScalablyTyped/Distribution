package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A worker_message response allows the server to pass information to the
  * sender.
  */
@js.native
trait Schema$WorkerMessageResponse extends js.Object {
  /**
    * The service&#39;s response to a worker&#39;s health report.
    */
  var workerHealthReportResponse: js.UndefOr[Schema$WorkerHealthReportResponse] = js.native
  /**
    * Service&#39;s response to reporting worker metrics (currently empty).
    */
  var workerMetricsResponse: js.UndefOr[Schema$ResourceUtilizationReportResponse] = js.native
  /**
    * Service&#39;s response to shutdown notice (currently empty).
    */
  var workerShutdownNoticeResponse: js.UndefOr[Schema$WorkerShutdownNoticeResponse] = js.native
}

object Schema$WorkerMessageResponse {
  @scala.inline
  def apply(
    workerHealthReportResponse: Schema$WorkerHealthReportResponse = null,
    workerMetricsResponse: Schema$ResourceUtilizationReportResponse = null,
    workerShutdownNoticeResponse: Schema$WorkerShutdownNoticeResponse = null
  ): Schema$WorkerMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (workerHealthReportResponse != null) __obj.updateDynamic("workerHealthReportResponse")(workerHealthReportResponse.asInstanceOf[js.Any])
    if (workerMetricsResponse != null) __obj.updateDynamic("workerMetricsResponse")(workerMetricsResponse.asInstanceOf[js.Any])
    if (workerShutdownNoticeResponse != null) __obj.updateDynamic("workerShutdownNoticeResponse")(workerShutdownNoticeResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkerMessageResponse]
  }
}

