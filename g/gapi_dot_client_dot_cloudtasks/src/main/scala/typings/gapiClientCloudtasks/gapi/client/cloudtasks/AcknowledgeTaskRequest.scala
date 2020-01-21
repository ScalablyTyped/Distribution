package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcknowledgeTaskRequest extends js.Object {
  /**
    * Required.
    *
    * The task's current schedule time, available in the Task.schedule_time
    * returned in PullTasksResponse.tasks or
    * CloudTasks.RenewLease. This restriction is to check that
    * the caller is acknowledging the correct task.
    */
  var scheduleTime: js.UndefOr[String] = js.undefined
}

object AcknowledgeTaskRequest {
  @scala.inline
  def apply(scheduleTime: String = null): AcknowledgeTaskRequest = {
    val __obj = js.Dynamic.literal()
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeTaskRequest]
  }
}

