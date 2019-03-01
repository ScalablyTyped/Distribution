package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseWorkItemRequest extends js.Object {
  /** The current timestamp at the worker. */
  var currentWorkerTime: js.UndefOr[java.lang.String] = js.undefined
  /** The location which contains the WorkItem's job. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The initial lease period. */
  var requestedLeaseDuration: js.UndefOr[java.lang.String] = js.undefined
  /** Filter for WorkItem type. */
  var workItemTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Worker capabilities. WorkItems might be limited to workers with specific
    * capabilities.
    */
  var workerCapabilities: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Identifies the worker leasing work -- typically the ID of the
    * virtual machine running the worker.
    */
  var workerId: js.UndefOr[java.lang.String] = js.undefined
}

object LeaseWorkItemRequest {
  @scala.inline
  def apply(
    currentWorkerTime: java.lang.String = null,
    location: java.lang.String = null,
    requestedLeaseDuration: java.lang.String = null,
    workItemTypes: js.Array[java.lang.String] = null,
    workerCapabilities: js.Array[java.lang.String] = null,
    workerId: java.lang.String = null
  ): LeaseWorkItemRequest = {
    val __obj = js.Dynamic.literal()
    if (currentWorkerTime != null) __obj.updateDynamic("currentWorkerTime")(currentWorkerTime)
    if (location != null) __obj.updateDynamic("location")(location)
    if (requestedLeaseDuration != null) __obj.updateDynamic("requestedLeaseDuration")(requestedLeaseDuration)
    if (workItemTypes != null) __obj.updateDynamic("workItemTypes")(workItemTypes)
    if (workerCapabilities != null) __obj.updateDynamic("workerCapabilities")(workerCapabilities)
    if (workerId != null) __obj.updateDynamic("workerId")(workerId)
    __obj.asInstanceOf[LeaseWorkItemRequest]
  }
}

