package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to report the status of WorkItems.
  */
@js.native
trait Schema$ReportWorkItemStatusRequest extends js.Object {
  /**
    * The current timestamp at the worker.
    */
  var currentWorkerTime: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the WorkItem&#39;s job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Untranslated bag-of-bytes WorkProgressUpdateRequest from UnifiedWorker.
    */
  var unifiedWorkerRequest: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The order is unimportant, except that the order of the
    * WorkItemServiceState messages in the ReportWorkItemStatusResponse
    * corresponds to the order of WorkItemStatus messages here.
    */
  var workItemStatuses: js.UndefOr[js.Array[Schema$WorkItemStatus]] = js.native
  /**
    * The ID of the worker reporting the WorkItem status.  If this does not
    * match the ID of the worker which the Dataflow service believes currently
    * has the lease on the WorkItem, the report will be dropped (with an error
    * response).
    */
  var workerId: js.UndefOr[String] = js.native
}

object Schema$ReportWorkItemStatusRequest {
  @scala.inline
  def apply(
    currentWorkerTime: String = null,
    location: String = null,
    unifiedWorkerRequest: StringDictionary[js.Any] = null,
    workItemStatuses: js.Array[Schema$WorkItemStatus] = null,
    workerId: String = null
  ): Schema$ReportWorkItemStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (currentWorkerTime != null) __obj.updateDynamic("currentWorkerTime")(currentWorkerTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (unifiedWorkerRequest != null) __obj.updateDynamic("unifiedWorkerRequest")(unifiedWorkerRequest.asInstanceOf[js.Any])
    if (workItemStatuses != null) __obj.updateDynamic("workItemStatuses")(workItemStatuses.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReportWorkItemStatusRequest]
  }
}

