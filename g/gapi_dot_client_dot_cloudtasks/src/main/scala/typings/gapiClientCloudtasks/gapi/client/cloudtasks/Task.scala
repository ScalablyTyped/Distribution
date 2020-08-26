package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * App Engine HTTP request that is sent to the task's target. Can be set
    * only if Queue.app_engine_http_target is set.
    *
    * An App Engine task is a task that has AppEngineHttpRequest set.
    */
  var appEngineHttpRequest: js.UndefOr[AppEngineHttpRequest] = js.native
  /** Deprecated. Use Task.app_engine_http_request. */
  var appEngineTaskTarget: js.UndefOr[AppEngineTaskTarget] = js.native
  /**
    * Output only.
    *
    * The time that the task was created.
    *
    * `create_time` will be truncated to the nearest second.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The task name.
    *
    * The task name must have the following format:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *
    * &#42; `PROJECT_ID` can contain uppercase and lowercase letters,
    * numbers, hyphens, colons, and periods; that is, it must match
    * the regular expression: `[a-zA-Z\\d-:\\.]+`.
    * &#42; `QUEUE_ID` can contain uppercase and lowercase letters,
    * numbers, and hyphens; that is, it must match the regular
    * expression: `[a-zA-Z\\d-]+`. The maximum length is 100
    * characters.
    * &#42; `TASK_ID` contain uppercase and lowercase letters, numbers,
    * underscores, and hyphens; that is, it must match the regular
    * expression: `[a-zA-Z\\d_-]+`. The maximum length is 500
    * characters.
    *
    * Optionally caller-specified in CreateTaskRequest.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Pull message contains data that should be used by the caller of
    * CloudTasks.PullTasks to process the task. Can be set only if
    * Queue.pull_target is set.
    *
    * A pull task is a task that has PullMessage set.
    */
  var pullMessage: js.UndefOr[PullMessage] = js.native
  /** Deprecated. Use Task.pull_message. */
  var pullTaskTarget: js.UndefOr[PullTaskTarget] = js.native
  /**
    * The time when the task is scheduled to be attempted.
    *
    * For pull queues, this is the time when the task is available to
    * be leased; if a task is currently leased, this is the time when
    * the current lease expires, that is, the time that the task was
    * leased plus the PullTasksRequest.lease_duration.
    *
    * For App Engine queues, this is when the task will be attempted or retried.
    *
    * `schedule_time` will be truncated to the nearest microsecond.
    */
  var scheduleTime: js.UndefOr[String] = js.native
  /**
    * Output only.
    *
    * Task status.
    */
  var taskStatus: js.UndefOr[TaskStatus] = js.native
  /**
    * Output only.
    *
    * The view specifies which subset of the Task has been
    * returned.
    */
  var view: js.UndefOr[String] = js.native
}

object Task {
  @scala.inline
  def apply(): Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
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
    def setAppEngineHttpRequest(value: AppEngineHttpRequest): Self = this.set("appEngineHttpRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppEngineHttpRequest: Self = this.set("appEngineHttpRequest", js.undefined)
    @scala.inline
    def setAppEngineTaskTarget(value: AppEngineTaskTarget): Self = this.set("appEngineTaskTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppEngineTaskTarget: Self = this.set("appEngineTaskTarget", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPullMessage(value: PullMessage): Self = this.set("pullMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullMessage: Self = this.set("pullMessage", js.undefined)
    @scala.inline
    def setPullTaskTarget(value: PullTaskTarget): Self = this.set("pullTaskTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullTaskTarget: Self = this.set("pullTaskTarget", js.undefined)
    @scala.inline
    def setScheduleTime(value: String): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
    @scala.inline
    def setTaskStatus(value: TaskStatus): Self = this.set("taskStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskStatus: Self = this.set("taskStatus", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

