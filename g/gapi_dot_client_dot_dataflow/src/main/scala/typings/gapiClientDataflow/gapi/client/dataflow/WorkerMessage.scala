package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerMessage extends js.Object {
  /**
    * Labels are used to group WorkerMessages.
    * For example, a worker_message about a particular container
    * might have the labels:
    * { "JOB_ID": "2015-04-22",
    * "WORKER_ID": "wordcount-vm-2015…"
    * "CONTAINER_TYPE": "worker",
    * "CONTAINER_ID": "ac1234def"}
    * Label tags typically correspond to Label enum values. However, for ease
    * of development other strings can be used as tags. LABEL_UNSPECIFIED should
    * not be used here.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** The timestamp of the worker_message. */
  var time: js.UndefOr[String] = js.native
  /** The health of a worker. */
  var workerHealthReport: js.UndefOr[WorkerHealthReport] = js.native
  /** A worker message code. */
  var workerMessageCode: js.UndefOr[WorkerMessageCode] = js.native
  /** Resource metrics reported by workers. */
  var workerMetrics: js.UndefOr[ResourceUtilizationReport] = js.native
  /** Shutdown notice by workers. */
  var workerShutdownNotice: js.UndefOr[WorkerShutdownNotice] = js.native
}

object WorkerMessage {
  @scala.inline
  def apply(): WorkerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerMessage]
  }
  @scala.inline
  implicit class WorkerMessageOps[Self <: WorkerMessage] (val x: Self) extends AnyVal {
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
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setWorkerHealthReport(value: WorkerHealthReport): Self = this.set("workerHealthReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerHealthReport: Self = this.set("workerHealthReport", js.undefined)
    @scala.inline
    def setWorkerMessageCode(value: WorkerMessageCode): Self = this.set("workerMessageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerMessageCode: Self = this.set("workerMessageCode", js.undefined)
    @scala.inline
    def setWorkerMetrics(value: ResourceUtilizationReport): Self = this.set("workerMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerMetrics: Self = this.set("workerMetrics", js.undefined)
    @scala.inline
    def setWorkerShutdownNotice(value: WorkerShutdownNotice): Self = this.set("workerShutdownNotice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerShutdownNotice: Self = this.set("workerShutdownNotice", js.undefined)
  }
  
}

