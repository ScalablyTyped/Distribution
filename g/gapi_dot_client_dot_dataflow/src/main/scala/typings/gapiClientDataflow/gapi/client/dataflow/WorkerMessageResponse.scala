package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerMessageResponse extends js.Object {
  /** The service's response to a worker's health report. */
  var workerHealthReportResponse: js.UndefOr[WorkerHealthReportResponse] = js.native
  /** Service's response to reporting worker metrics (currently empty). */
  var workerMetricsResponse: js.UndefOr[js.Any] = js.native
  /** Service's response to shutdown notice (currently empty). */
  var workerShutdownNoticeResponse: js.UndefOr[js.Any] = js.native
}

object WorkerMessageResponse {
  @scala.inline
  def apply(): WorkerMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerMessageResponse]
  }
  @scala.inline
  implicit class WorkerMessageResponseOps[Self <: WorkerMessageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWorkerHealthReportResponse(value: WorkerHealthReportResponse): Self = this.set("workerHealthReportResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerHealthReportResponse: Self = this.set("workerHealthReportResponse", js.undefined)
    @scala.inline
    def setWorkerMetricsResponse(value: js.Any): Self = this.set("workerMetricsResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerMetricsResponse: Self = this.set("workerMetricsResponse", js.undefined)
    @scala.inline
    def setWorkerShutdownNoticeResponse(value: js.Any): Self = this.set("workerShutdownNoticeResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerShutdownNoticeResponse: Self = this.set("workerShutdownNoticeResponse", js.undefined)
  }
  
}

