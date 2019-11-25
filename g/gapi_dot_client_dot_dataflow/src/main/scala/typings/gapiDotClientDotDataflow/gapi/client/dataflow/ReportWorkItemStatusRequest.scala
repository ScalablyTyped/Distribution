package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportWorkItemStatusRequest extends js.Object {
  /** The current timestamp at the worker. */
  var currentWorkerTime: js.UndefOr[String] = js.undefined
  /** The location which contains the WorkItem's job. */
  var location: js.UndefOr[String] = js.undefined
  /**
    * The order is unimportant, except that the order of the
    * WorkItemServiceState messages in the ReportWorkItemStatusResponse
    * corresponds to the order of WorkItemStatus messages here.
    */
  var workItemStatuses: js.UndefOr[js.Array[WorkItemStatus]] = js.undefined
  /**
    * The ID of the worker reporting the WorkItem status.  If this
    * does not match the ID of the worker which the Dataflow service
    * believes currently has the lease on the WorkItem, the report
    * will be dropped (with an error response).
    */
  var workerId: js.UndefOr[String] = js.undefined
}

object ReportWorkItemStatusRequest {
  @scala.inline
  def apply(
    currentWorkerTime: String = null,
    location: String = null,
    workItemStatuses: js.Array[WorkItemStatus] = null,
    workerId: String = null
  ): ReportWorkItemStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (currentWorkerTime != null) __obj.updateDynamic("currentWorkerTime")(currentWorkerTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (workItemStatuses != null) __obj.updateDynamic("workItemStatuses")(workItemStatuses.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportWorkItemStatusRequest]
  }
}

