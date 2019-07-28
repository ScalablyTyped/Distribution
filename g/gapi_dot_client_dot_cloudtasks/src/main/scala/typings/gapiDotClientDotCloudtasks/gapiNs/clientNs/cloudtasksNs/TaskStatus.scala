package typings.gapiDotClientDotCloudtasks.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskStatus extends js.Object {
  /**
    * Output only.
    *
    * The number of attempts dispatched. This count includes tasks which have
    * been dispatched but haven't received a response.
    */
  var attemptDispatchCount: js.UndefOr[String] = js.undefined
  /**
    * Output only.
    *
    * The number of attempts which have received a response.
    *
    * This field is not calculated for
    * [pull tasks](google.cloud.tasks.v2beta2.PullTaskTarget).
    */
  var attemptResponseCount: js.UndefOr[String] = js.undefined
  /**
    * Output only.
    *
    * The status of the task's first attempt.
    *
    * Only AttemptStatus.dispatch_time will be set.
    * The other AttemptStatus information is not retained by Cloud Tasks.
    *
    * This field is not calculated for
    * [pull tasks](google.cloud.tasks.v2beta2.PullTaskTarget).
    */
  var firstAttemptStatus: js.UndefOr[AttemptStatus] = js.undefined
  /**
    * Output only.
    *
    * The status of the task's last attempt.
    *
    * This field is not calculated for
    * [pull tasks](google.cloud.tasks.v2beta2.PullTaskTarget).
    */
  var lastAttemptStatus: js.UndefOr[AttemptStatus] = js.undefined
}

object TaskStatus {
  @scala.inline
  def apply(
    attemptDispatchCount: String = null,
    attemptResponseCount: String = null,
    firstAttemptStatus: AttemptStatus = null,
    lastAttemptStatus: AttemptStatus = null
  ): TaskStatus = {
    val __obj = js.Dynamic.literal()
    if (attemptDispatchCount != null) __obj.updateDynamic("attemptDispatchCount")(attemptDispatchCount)
    if (attemptResponseCount != null) __obj.updateDynamic("attemptResponseCount")(attemptResponseCount)
    if (firstAttemptStatus != null) __obj.updateDynamic("firstAttemptStatus")(firstAttemptStatus)
    if (lastAttemptStatus != null) __obj.updateDynamic("lastAttemptStatus")(lastAttemptStatus)
    __obj.asInstanceOf[TaskStatus]
  }
}

