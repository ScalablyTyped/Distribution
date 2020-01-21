package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullTasksRequest extends js.Object {
  /**
    * `filter` can be used to specify a subset of tasks to lease.
    *
    * When `filter` is set to `tag=<my-tag>` then the
    * PullTasksResponse will contain only tasks whose
    * PullMessage.tag is equal to `<my-tag>`. `<my-tag>` must be less than
    * 500 bytes.
    *
    * When `filter` is set to `tag_function=oldest_tag()`, only tasks which have
    * the same tag as the task with the oldest schedule_time will be returned.
    *
    * Grammar Syntax:
    *
    * &#42; `filter = "tag=" tag | "tag_function=" function`
    *
    * &#42; `tag = string | bytes`
    *
    * &#42; `function = "oldest_tag()"`
    *
    * The `oldest_tag()` function returns tasks which have the same tag as the
    * oldest task (ordered by schedule time).
    */
  var filter: js.UndefOr[String] = js.undefined
  /**
    * The duration of the lease.
    *
    * Each task returned in the PullTasksResponse will have its
    * Task.schedule_time set to the current time plus the
    * `lease_duration`. A task that has been returned in a
    * PullTasksResponse is leased -- that task will not be
    * returned in a different PullTasksResponse before the
    * Task.schedule_time.
    *
    * After the lease holder has successfully finished the work
    * associated with the task, the lease holder must call
    * CloudTasks.AcknowledgeTask. If the task is not acknowledged
    * via CloudTasks.AcknowledgeTask before the
    * Task.schedule_time then it will be returned in a later
    * PullTasksResponse so that another lease holder can process
    * it.
    *
    * The maximum lease duration is 1 week.
    * `lease_duration` will be truncated to the nearest second.
    */
  var leaseDuration: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of tasks to lease. The maximum that can be
    * requested is 1000.
    */
  var maxTasks: js.UndefOr[Double] = js.undefined
  /**
    * The response_view specifies which subset of the Task will be
    * returned.
    *
    * By default response_view is Task.View.BASIC; not all
    * information is retrieved by default because some data, such as
    * payloads, might be desirable to return only when needed because
    * of its large size or because of the sensitivity of data that it
    * contains.
    *
    * Authorization for Task.View.FULL requires `cloudtasks.tasks.fullView`
    * [Google IAM](/iam/) permission on the
    * Task.name resource.
    */
  var responseView: js.UndefOr[String] = js.undefined
}

object PullTasksRequest {
  @scala.inline
  def apply(
    filter: String = null,
    leaseDuration: String = null,
    maxTasks: Int | Double = null,
    responseView: String = null
  ): PullTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (leaseDuration != null) __obj.updateDynamic("leaseDuration")(leaseDuration.asInstanceOf[js.Any])
    if (maxTasks != null) __obj.updateDynamic("maxTasks")(maxTasks.asInstanceOf[js.Any])
    if (responseView != null) __obj.updateDynamic("responseView")(responseView.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullTasksRequest]
  }
}

