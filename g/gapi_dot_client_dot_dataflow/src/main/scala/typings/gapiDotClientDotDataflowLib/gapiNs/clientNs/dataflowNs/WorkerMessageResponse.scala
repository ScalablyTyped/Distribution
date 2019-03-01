package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerMessageResponse extends js.Object {
  /** The service's response to a worker's health report. */
  var workerHealthReportResponse: js.UndefOr[WorkerHealthReportResponse] = js.undefined
  /** Service's response to reporting worker metrics (currently empty). */
  var workerMetricsResponse: js.UndefOr[js.Any] = js.undefined
  /** Service's response to shutdown notice (currently empty). */
  var workerShutdownNoticeResponse: js.UndefOr[js.Any] = js.undefined
}

object WorkerMessageResponse {
  @scala.inline
  def apply(
    workerHealthReportResponse: WorkerHealthReportResponse = null,
    workerMetricsResponse: js.Any = null,
    workerShutdownNoticeResponse: js.Any = null
  ): WorkerMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (workerHealthReportResponse != null) __obj.updateDynamic("workerHealthReportResponse")(workerHealthReportResponse)
    if (workerMetricsResponse != null) __obj.updateDynamic("workerMetricsResponse")(workerMetricsResponse)
    if (workerShutdownNoticeResponse != null) __obj.updateDynamic("workerShutdownNoticeResponse")(workerShutdownNoticeResponse)
    __obj.asInstanceOf[WorkerMessageResponse]
  }
}

