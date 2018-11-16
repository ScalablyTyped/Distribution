package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Task extends js.Object {
  /**
               * App Engine HTTP request that is sent to the task's target. Can be set
               * only if Queue.app_engine_http_target is set.
               *
               * An App Engine task is a task that has AppEngineHttpRequest set.
               */
  var appEngineHttpRequest: js.UndefOr[AppEngineHttpRequest] = js.undefined
  /** Deprecated. Use Task.app_engine_http_request. */
  var appEngineTaskTarget: js.UndefOr[AppEngineTaskTarget] = js.undefined
  /**
               * Output only.
               *
               * The time that the task was created.
               *
               * `create_time` will be truncated to the nearest second.
               */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Pull message contains data that should be used by the caller of
               * CloudTasks.PullTasks to process the task. Can be set only if
               * Queue.pull_target is set.
               *
               * A pull task is a task that has PullMessage set.
               */
  var pullMessage: js.UndefOr[PullMessage] = js.undefined
  /** Deprecated. Use Task.pull_message. */
  var pullTaskTarget: js.UndefOr[PullTaskTarget] = js.undefined
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
  var scheduleTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Output only.
               *
               * Task status.
               */
  var taskStatus: js.UndefOr[TaskStatus] = js.undefined
  /**
               * Output only.
               *
               * The view specifies which subset of the Task has been
               * returned.
               */
  var view: js.UndefOr[java.lang.String] = js.undefined
}

