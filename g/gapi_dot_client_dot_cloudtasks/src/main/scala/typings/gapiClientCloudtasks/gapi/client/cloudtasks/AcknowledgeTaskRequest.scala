package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcknowledgeTaskRequest extends js.Object {
  /**
    * Required.
    *
    * The task's current schedule time, available in the Task.schedule_time
    * returned in PullTasksResponse.tasks or
    * CloudTasks.RenewLease. This restriction is to check that
    * the caller is acknowledging the correct task.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object AcknowledgeTaskRequest {
  @scala.inline
  def apply(): AcknowledgeTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcknowledgeTaskRequest]
  }
  @scala.inline
  implicit class AcknowledgeTaskRequestOps[Self <: AcknowledgeTaskRequest] (val x: Self) extends AnyVal {
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
    def setScheduleTime(value: String): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
  }
  
}

