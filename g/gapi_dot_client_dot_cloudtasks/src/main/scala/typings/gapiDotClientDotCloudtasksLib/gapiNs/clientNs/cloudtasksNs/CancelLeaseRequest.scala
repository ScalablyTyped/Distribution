package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelLeaseRequest extends js.Object {
  /**
    * The response_view specifies which subset of the Task will be
    * returned.
    *
    * By default response_view is Task.View.BASIC; not all
    * information is retrieved by default because some data, such as
    * payloads, might be desirable to return only when needed because
    * of its large size or because of the sensitivity of data that it
    * contains.
    *
    * Authorization for Task.View.FULL requires `cloudtasks.tasks.fullView`
    * [Google IAM](/iam/) permission on the
    * Task.name resource.
    */
  var responseView: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required.
    *
    * The task's current schedule time, available in the Task.schedule_time
    * returned in PullTasksResponse.tasks or
    * CloudTasks.RenewLease. This restriction is to check that
    * the caller is canceling the correct task.
    */
  var scheduleTime: js.UndefOr[java.lang.String] = js.undefined
}

object CancelLeaseRequest {
  @scala.inline
  def apply(responseView: java.lang.String = null, scheduleTime: java.lang.String = null): CancelLeaseRequest = {
    val __obj = js.Dynamic.literal()
    if (responseView != null) __obj.updateDynamic("responseView")(responseView)
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime)
    __obj.asInstanceOf[CancelLeaseRequest]
  }
}

