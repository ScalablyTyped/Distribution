package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportWorkItemStatusRequest extends js.Object {
  /** The current timestamp at the worker. */
  var currentWorkerTime: js.UndefOr[String] = js.native
  /** The location which contains the WorkItem's job. */
  var location: js.UndefOr[String] = js.native
  /**
    * The order is unimportant, except that the order of the
    * WorkItemServiceState messages in the ReportWorkItemStatusResponse
    * corresponds to the order of WorkItemStatus messages here.
    */
  var workItemStatuses: js.UndefOr[js.Array[WorkItemStatus]] = js.native
  /**
    * The ID of the worker reporting the WorkItem status.  If this
    * does not match the ID of the worker which the Dataflow service
    * believes currently has the lease on the WorkItem, the report
    * will be dropped (with an error response).
    */
  var workerId: js.UndefOr[String] = js.native
}

object ReportWorkItemStatusRequest {
  @scala.inline
  def apply(): ReportWorkItemStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportWorkItemStatusRequest]
  }
  @scala.inline
  implicit class ReportWorkItemStatusRequestOps[Self <: ReportWorkItemStatusRequest] (val x: Self) extends AnyVal {
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
    def setCurrentWorkerTime(value: String): Self = this.set("currentWorkerTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentWorkerTime: Self = this.set("currentWorkerTime", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setWorkItemStatusesVarargs(value: WorkItemStatus*): Self = this.set("workItemStatuses", js.Array(value :_*))
    @scala.inline
    def setWorkItemStatuses(value: js.Array[WorkItemStatus]): Self = this.set("workItemStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkItemStatuses: Self = this.set("workItemStatuses", js.undefined)
    @scala.inline
    def setWorkerId(value: String): Self = this.set("workerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("workerId", js.undefined)
  }
  
}

