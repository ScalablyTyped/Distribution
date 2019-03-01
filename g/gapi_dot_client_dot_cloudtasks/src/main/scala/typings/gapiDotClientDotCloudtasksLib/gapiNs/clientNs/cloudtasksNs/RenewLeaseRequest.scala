package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenewLeaseRequest extends js.Object {
  /**
    * Required.
    *
    * The desired new lease duration, starting from now.
    *
    *
    * The maximum lease duration is 1 week.
    * `new_lease_duration` will be truncated to the nearest second.
    */
  var newLeaseDuration: js.UndefOr[java.lang.String] = js.undefined
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
    * the caller is renewing the correct task.
    */
  var scheduleTime: js.UndefOr[java.lang.String] = js.undefined
}

object RenewLeaseRequest {
  @scala.inline
  def apply(
    newLeaseDuration: java.lang.String = null,
    responseView: java.lang.String = null,
    scheduleTime: java.lang.String = null
  ): RenewLeaseRequest = {
    val __obj = js.Dynamic.literal()
    if (newLeaseDuration != null) __obj.updateDynamic("newLeaseDuration")(newLeaseDuration)
    if (responseView != null) __obj.updateDynamic("responseView")(responseView)
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime)
    __obj.asInstanceOf[RenewLeaseRequest]
  }
}

