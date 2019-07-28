package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportWorkItemStatusResponse extends js.Object {
  /**
    * A set of messages indicating the service-side state for each
    * WorkItem whose status was reported, in the same order as the
    * WorkItemStatus messages in the ReportWorkItemStatusRequest which
    * resulting in this response.
    */
  var workItemServiceStates: js.UndefOr[js.Array[WorkItemServiceState]] = js.undefined
}

object ReportWorkItemStatusResponse {
  @scala.inline
  def apply(workItemServiceStates: js.Array[WorkItemServiceState] = null): ReportWorkItemStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (workItemServiceStates != null) __obj.updateDynamic("workItemServiceStates")(workItemServiceStates)
    __obj.asInstanceOf[ReportWorkItemStatusResponse]
  }
}

