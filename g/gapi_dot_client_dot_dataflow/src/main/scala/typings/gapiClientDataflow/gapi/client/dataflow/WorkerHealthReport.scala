package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerHealthReport extends js.Object {
  /**
    * The pods running on the worker. See:
    * http://kubernetes.io/v1.1/docs/api-reference/v1/definitions.html#_v1_pod
    *
    * This field is used by the worker to send the status of the indvidual
    * containers running on each worker.
    */
  var pods: js.UndefOr[js.Array[Record[String, _]]] = js.native
  /**
    * The interval at which the worker is sending health reports.
    * The default value of 0 should be interpreted as the field is not being
    * explicitly set by the worker.
    */
  var reportInterval: js.UndefOr[String] = js.native
  /** Whether the VM is healthy. */
  var vmIsHealthy: js.UndefOr[Boolean] = js.native
  /** The time the VM was booted. */
  var vmStartupTime: js.UndefOr[String] = js.native
}

object WorkerHealthReport {
  @scala.inline
  def apply(): WorkerHealthReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerHealthReport]
  }
  @scala.inline
  implicit class WorkerHealthReportOps[Self <: WorkerHealthReport] (val x: Self) extends AnyVal {
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
    def setPodsVarargs(value: (Record[String, js.Any])*): Self = this.set("pods", js.Array(value :_*))
    @scala.inline
    def setPods(value: js.Array[Record[String, _]]): Self = this.set("pods", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePods: Self = this.set("pods", js.undefined)
    @scala.inline
    def setReportInterval(value: String): Self = this.set("reportInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportInterval: Self = this.set("reportInterval", js.undefined)
    @scala.inline
    def setVmIsHealthy(value: Boolean): Self = this.set("vmIsHealthy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmIsHealthy: Self = this.set("vmIsHealthy", js.undefined)
    @scala.inline
    def setVmStartupTime(value: String): Self = this.set("vmStartupTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmStartupTime: Self = this.set("vmStartupTime", js.undefined)
  }
  
}

