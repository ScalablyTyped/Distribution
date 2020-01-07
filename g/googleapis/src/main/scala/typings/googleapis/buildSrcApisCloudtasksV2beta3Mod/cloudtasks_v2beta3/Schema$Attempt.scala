package typings.googleapis.buildSrcApisCloudtasksV2beta3Mod.cloudtasks_v2beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a task attempt.
  */
@js.native
trait Schema$Attempt extends js.Object {
  /**
    * Output only. The time that this attempt was dispatched.  `dispatch_time`
    * will be truncated to the nearest microsecond.
    */
  var dispatchTime: js.UndefOr[String] = js.native
  /**
    * Output only. The response from the worker for this attempt.  If
    * `response_time` is unset, then the task has not been attempted or is
    * currently running and the `response_status` field is meaningless.
    */
  var responseStatus: js.UndefOr[Schema$Status] = js.native
  /**
    * Output only. The time that this attempt response was received.
    * `response_time` will be truncated to the nearest microsecond.
    */
  var responseTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time that this attempt was scheduled.  `schedule_time`
    * will be truncated to the nearest microsecond.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object Schema$Attempt {
  @scala.inline
  def apply(
    dispatchTime: String = null,
    responseStatus: Schema$Status = null,
    responseTime: String = null,
    scheduleTime: String = null
  ): Schema$Attempt = {
    val __obj = js.Dynamic.literal()
    if (dispatchTime != null) __obj.updateDynamic("dispatchTime")(dispatchTime.asInstanceOf[js.Any])
    if (responseStatus != null) __obj.updateDynamic("responseStatus")(responseStatus.asInstanceOf[js.Any])
    if (responseTime != null) __obj.updateDynamic("responseTime")(responseTime.asInstanceOf[js.Any])
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Attempt]
  }
}

