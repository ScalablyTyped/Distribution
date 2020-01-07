package typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for acknowledging a task using AcknowledgeTask.
  */
@js.native
trait Schema$AcknowledgeTaskRequest extends js.Object {
  /**
    * Required.  The task&#39;s current schedule time, available in the
    * schedule_time returned by LeaseTasks response or RenewLease response.
    * This restriction is to ensure that your worker currently holds the lease.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object Schema$AcknowledgeTaskRequest {
  @scala.inline
  def apply(scheduleTime: String = null): Schema$AcknowledgeTaskRequest = {
    val __obj = js.Dynamic.literal()
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AcknowledgeTaskRequest]
  }
}

