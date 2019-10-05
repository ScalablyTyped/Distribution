package typings.gapiDotClientDotCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttemptStatus extends js.Object {
  /**
    * Output only.
    *
    * The time that this attempt was dispatched.
    *
    * `dispatch_time` will be truncated to the nearest microsecond.
    */
  var dispatchTime: js.UndefOr[String] = js.undefined
  /**
    * Output only.
    *
    * The response from the target for this attempt.
    *
    * If the task has not been attempted or the task is currently running
    * then the response status is google.rpc.Code.UNKNOWN.
    */
  var responseStatus: js.UndefOr[Status] = js.undefined
  /**
    * Output only.
    *
    * The time that this attempt response was received.
    *
    * `response_time` will be truncated to the nearest microsecond.
    */
  var responseTime: js.UndefOr[String] = js.undefined
  /**
    * Output only.
    *
    * The time that this attempt was scheduled.
    *
    * `schedule_time` will be truncated to the nearest microsecond.
    */
  var scheduleTime: js.UndefOr[String] = js.undefined
}

object AttemptStatus {
  @scala.inline
  def apply(
    dispatchTime: String = null,
    responseStatus: Status = null,
    responseTime: String = null,
    scheduleTime: String = null
  ): AttemptStatus = {
    val __obj = js.Dynamic.literal()
    if (dispatchTime != null) __obj.updateDynamic("dispatchTime")(dispatchTime)
    if (responseStatus != null) __obj.updateDynamic("responseStatus")(responseStatus)
    if (responseTime != null) __obj.updateDynamic("responseTime")(responseTime)
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime)
    __obj.asInstanceOf[AttemptStatus]
  }
}

