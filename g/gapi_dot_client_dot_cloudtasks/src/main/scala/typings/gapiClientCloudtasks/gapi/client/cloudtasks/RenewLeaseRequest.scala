package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var newLeaseDuration: js.UndefOr[String] = js.native
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
  var responseView: js.UndefOr[String] = js.native
  /**
    * Required.
    *
    * The task's current schedule time, available in the Task.schedule_time
    * returned in PullTasksResponse.tasks or
    * CloudTasks.RenewLease. This restriction is to check that
    * the caller is renewing the correct task.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object RenewLeaseRequest {
  @scala.inline
  def apply(): RenewLeaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewLeaseRequest]
  }
  @scala.inline
  implicit class RenewLeaseRequestOps[Self <: RenewLeaseRequest] (val x: Self) extends AnyVal {
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
    def setNewLeaseDuration(value: String): Self = this.set("newLeaseDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewLeaseDuration: Self = this.set("newLeaseDuration", js.undefined)
    @scala.inline
    def setResponseView(value: String): Self = this.set("responseView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseView: Self = this.set("responseView", js.undefined)
    @scala.inline
    def setScheduleTime(value: String): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
  }
  
}

