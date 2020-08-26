package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStatus extends js.Object {
  /**
    * Output only.
    *
    * The number of attempts dispatched. This count includes tasks which have
    * been dispatched but haven't received a response.
    */
  var attemptDispatchCount: js.UndefOr[String] = js.native
  /**
    * Output only.
    *
    * The number of attempts which have received a response.
    *
    * This field is not calculated for
    * [pull tasks](google.cloud.tasks.v2beta2.PullTaskTarget).
    */
  var attemptResponseCount: js.UndefOr[String] = js.native
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
  var firstAttemptStatus: js.UndefOr[AttemptStatus] = js.native
  /**
    * Output only.
    *
    * The status of the task's last attempt.
    *
    * This field is not calculated for
    * [pull tasks](google.cloud.tasks.v2beta2.PullTaskTarget).
    */
  var lastAttemptStatus: js.UndefOr[AttemptStatus] = js.native
}

object TaskStatus {
  @scala.inline
  def apply(): TaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskStatus]
  }
  @scala.inline
  implicit class TaskStatusOps[Self <: TaskStatus] (val x: Self) extends AnyVal {
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
    def setAttemptDispatchCount(value: String): Self = this.set("attemptDispatchCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttemptDispatchCount: Self = this.set("attemptDispatchCount", js.undefined)
    @scala.inline
    def setAttemptResponseCount(value: String): Self = this.set("attemptResponseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttemptResponseCount: Self = this.set("attemptResponseCount", js.undefined)
    @scala.inline
    def setFirstAttemptStatus(value: AttemptStatus): Self = this.set("firstAttemptStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstAttemptStatus: Self = this.set("firstAttemptStatus", js.undefined)
    @scala.inline
    def setLastAttemptStatus(value: AttemptStatus): Self = this.set("lastAttemptStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAttemptStatus: Self = this.set("lastAttemptStatus", js.undefined)
  }
  
}

