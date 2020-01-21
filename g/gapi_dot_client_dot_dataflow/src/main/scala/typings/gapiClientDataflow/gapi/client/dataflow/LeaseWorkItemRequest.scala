package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseWorkItemRequest extends js.Object {
  /** The current timestamp at the worker. */
  var currentWorkerTime: js.UndefOr[String] = js.undefined
  /** The location which contains the WorkItem's job. */
  var location: js.UndefOr[String] = js.undefined
  /** The initial lease period. */
  var requestedLeaseDuration: js.UndefOr[String] = js.undefined
  /** Filter for WorkItem type. */
  var workItemTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Worker capabilities. WorkItems might be limited to workers with specific
    * capabilities.
    */
  var workerCapabilities: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Identifies the worker leasing work -- typically the ID of the
    * virtual machine running the worker.
    */
  var workerId: js.UndefOr[String] = js.undefined
}

object LeaseWorkItemRequest {
  @scala.inline
  def apply(
    currentWorkerTime: String = null,
    location: String = null,
    requestedLeaseDuration: String = null,
    workItemTypes: js.Array[String] = null,
    workerCapabilities: js.Array[String] = null,
    workerId: String = null
  ): LeaseWorkItemRequest = {
    val __obj = js.Dynamic.literal()
    if (currentWorkerTime != null) __obj.updateDynamic("currentWorkerTime")(currentWorkerTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (requestedLeaseDuration != null) __obj.updateDynamic("requestedLeaseDuration")(requestedLeaseDuration.asInstanceOf[js.Any])
    if (workItemTypes != null) __obj.updateDynamic("workItemTypes")(workItemTypes.asInstanceOf[js.Any])
    if (workerCapabilities != null) __obj.updateDynamic("workerCapabilities")(workerCapabilities.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseWorkItemRequest]
  }
}

