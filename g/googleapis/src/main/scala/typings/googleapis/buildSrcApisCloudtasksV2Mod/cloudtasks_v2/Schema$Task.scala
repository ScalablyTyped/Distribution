package typings.googleapis.buildSrcApisCloudtasksV2Mod.cloudtasks_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A unit of scheduled work.
  */
@js.native
trait Schema$Task extends js.Object {
  /**
    * HTTP request that is sent to the App Engine app handler.  An App Engine
    * task is a task that has AppEngineHttpRequest set.
    */
  var appEngineHttpRequest: js.UndefOr[Schema$AppEngineHttpRequest] = js.native
  /**
    * Output only. The time that the task was created.  `create_time` will be
    * truncated to the nearest second.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The number of attempts dispatched.  This count includes
    * attempts which have been dispatched but haven&#39;t received a response.
    */
  var dispatchCount: js.UndefOr[Double] = js.native
  /**
    * The deadline for requests sent to the worker. If the worker does not
    * respond by this deadline then the request is cancelled and the attempt is
    * marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task
    * according to the RetryConfig.  Note that when the request is cancelled,
    * Cloud Tasks will stop listing for the response, but whether the worker
    * stops processing depends on the worker. For example, if the worker is
    * stuck, it may not react to cancelled requests.  The default and maximum
    * values depend on the type of request:   * For App Engine tasks, 0
    * indicates that the   request has the default deadline. The default
    * deadline depends on the   [scaling
    * type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling)
    * of the service: 10 minutes for standard apps with automatic scaling, 24
    * hours for standard apps with manual and basic scaling, and 60 minutes for
    * flex apps. If the request deadline is set, it must be in the interval [15
    * seconds, 24 hours 15 seconds]. Regardless of the task&#39;s
    * `dispatch_deadline`, the app handler will not run for longer than than
    * the service&#39;s timeout. We recommend setting the `dispatch_deadline`
    * to   at most a few seconds more than the app handler&#39;s timeout. For
    * more   information see
    * [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts).
    * `dispatch_deadline` will be truncated to the nearest millisecond. The
    * deadline is an approximate deadline.
    */
  var dispatchDeadline: js.UndefOr[String] = js.native
  /**
    * Output only. The status of the task&#39;s first attempt.  Only
    * dispatch_time will be set. The other Attempt information is not retained
    * by Cloud Tasks.
    */
  var firstAttempt: js.UndefOr[Schema$Attempt] = js.native
  /**
    * Output only. The status of the task&#39;s last attempt.
    */
  var lastAttempt: js.UndefOr[Schema$Attempt] = js.native
  /**
    * Optionally caller-specified in CreateTask.  The task name.  The task name
    * must have the following format:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens
    * (-), colons (:), or periods (.).    For more information, see
    * [Identifying
    * projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
    * * `LOCATION_ID` is the canonical ID for the task&#39;s location.    The
    * list of available locations can be obtained by calling    ListLocations.
    * For more information, see https://cloud.google.com/about/locations/. *
    * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or   hyphens
    * (-). The maximum length is 100 characters. * `TASK_ID` can contain only
    * letters ([A-Za-z]), numbers ([0-9]),   hyphens (-), or underscores (_).
    * The maximum length is 500 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The number of attempts which have received a response.
    */
  var responseCount: js.UndefOr[Double] = js.native
  /**
    * The time when the task is scheduled to be attempted.  For App Engine
    * queues, this is when the task will be attempted or retried.
    * `schedule_time` will be truncated to the nearest microsecond.
    */
  var scheduleTime: js.UndefOr[String] = js.native
  /**
    * Output only. The view specifies which subset of the Task has been
    * returned.
    */
  var view: js.UndefOr[String] = js.native
}

object Schema$Task {
  @scala.inline
  def apply(
    appEngineHttpRequest: Schema$AppEngineHttpRequest = null,
    createTime: String = null,
    dispatchCount: Int | Double = null,
    dispatchDeadline: String = null,
    firstAttempt: Schema$Attempt = null,
    lastAttempt: Schema$Attempt = null,
    name: String = null,
    responseCount: Int | Double = null,
    scheduleTime: String = null,
    view: String = null
  ): Schema$Task = {
    val __obj = js.Dynamic.literal()
    if (appEngineHttpRequest != null) __obj.updateDynamic("appEngineHttpRequest")(appEngineHttpRequest.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (dispatchCount != null) __obj.updateDynamic("dispatchCount")(dispatchCount.asInstanceOf[js.Any])
    if (dispatchDeadline != null) __obj.updateDynamic("dispatchDeadline")(dispatchDeadline.asInstanceOf[js.Any])
    if (firstAttempt != null) __obj.updateDynamic("firstAttempt")(firstAttempt.asInstanceOf[js.Any])
    if (lastAttempt != null) __obj.updateDynamic("lastAttempt")(lastAttempt.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (responseCount != null) __obj.updateDynamic("responseCount")(responseCount.asInstanceOf[js.Any])
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Task]
  }
}

