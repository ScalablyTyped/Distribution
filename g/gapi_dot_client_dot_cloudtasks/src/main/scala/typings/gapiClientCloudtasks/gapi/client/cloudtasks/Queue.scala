package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends js.Object {
  /**
    * App Engine HTTP target.
    *
    * An App Engine queue is a queue that has an AppEngineHttpTarget.
    */
  var appEngineHttpTarget: js.UndefOr[AppEngineHttpTarget] = js.native
  /** Deprecated. Use Queue.app_engine_http_target. */
  var appEngineQueueConfig: js.UndefOr[AppEngineQueueConfig] = js.native
  /**
    * The queue name.
    *
    * The queue name must have the following format:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    *
    * &#42; `PROJECT_ID` can contain uppercase and lowercase letters,
    * numbers, hyphens, colons, and periods; that is, it must match
    * the regular expression: `[a-zA-Z\\d-:\\.]+`.
    * &#42; `QUEUE_ID` can contain uppercase and lowercase letters,
    * numbers, and hyphens; that is, it must match the regular
    * expression: `[a-zA-Z\\d-]+`. The maximum length is 100
    * characters.
    *
    * Caller-specified and required in CreateQueueRequest, after which
    * it becomes output only.
    */
  var name: js.UndefOr[String] = js.native
  /** Deprecated. Use Queue.pull_target. */
  var pullQueueConfig: js.UndefOr[js.Any] = js.native
  /**
    * Pull target.
    *
    * A pull queue is a queue that has a PullTarget.
    */
  var pullTarget: js.UndefOr[js.Any] = js.native
  /**
    * Output only.
    *
    * The last time this queue was purged. All tasks that were
    * created before this time were purged.
    *
    * A queue can be purged using CloudTasks.PurgeQueue, the
    * [App Engine Task Queue SDK, or the Cloud
    * Console](/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
    *
    * Purge time will be truncated to the nearest microsecond. Purge
    * time will be zero if the queue has never been purged.
    */
  var purgeTime: js.UndefOr[String] = js.native
  /**
    * Output only.
    *
    * The state of the queue.
    *
    * `queue_state` can only be changed by called
    * CloudTasks.PauseQueue, CloudTasks.ResumeQueue, or uploading
    * [queue.yaml](/appengine/docs/python/config/queueref).
    * CloudTasks.UpdateQueue cannot be used to change `queue_state`.
    */
  var queueState: js.UndefOr[String] = js.native
  /**
    * Rate limits for task dispatches.
    *
    * Queue.rate_limits and Queue.retry_config are related because they
    * both control task attempts however they control how tasks are attempted in
    * different ways:
    *
    * &#42; Queue.rate_limits controls the total rate of dispatches from a queue
    * (i.e. all traffic dispatched from the queue, regardless of whether the
    * dispatch is from a first attempt or a retry).
    * &#42; Queue.retry_config controls what happens to particular a task after
    * its first attempt fails. That is, Queue.retry_config controls task
    * retries (the second attempt, third attempt, etc).
    */
  var rateLimits: js.UndefOr[RateLimits] = js.native
  /**
    * Settings that determine the retry behavior.
    *
    * &#42; For tasks created using Cloud Tasks: the queue-level retry settings
    * apply to all tasks in the queue that were created using Cloud Tasks.
    * Retry settings cannot be set on individual tasks.
    * &#42; For tasks created using the App Engine SDK: the queue-level retry
    * settings apply to all tasks in the queue which do not have retry settings
    * explicitly set on the task and were created by the App Engine SDK. See
    * [App Engine documentation](/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
    */
  var retryConfig: js.UndefOr[RetryConfig] = js.native
}

object Queue {
  @scala.inline
  def apply(): Queue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Queue]
  }
  @scala.inline
  implicit class QueueOps[Self <: Queue] (val x: Self) extends AnyVal {
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
    def setAppEngineHttpTarget(value: AppEngineHttpTarget): Self = this.set("appEngineHttpTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppEngineHttpTarget: Self = this.set("appEngineHttpTarget", js.undefined)
    @scala.inline
    def setAppEngineQueueConfig(value: AppEngineQueueConfig): Self = this.set("appEngineQueueConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppEngineQueueConfig: Self = this.set("appEngineQueueConfig", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPullQueueConfig(value: js.Any): Self = this.set("pullQueueConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullQueueConfig: Self = this.set("pullQueueConfig", js.undefined)
    @scala.inline
    def setPullTarget(value: js.Any): Self = this.set("pullTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullTarget: Self = this.set("pullTarget", js.undefined)
    @scala.inline
    def setPurgeTime(value: String): Self = this.set("purgeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurgeTime: Self = this.set("purgeTime", js.undefined)
    @scala.inline
    def setQueueState(value: String): Self = this.set("queueState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueState: Self = this.set("queueState", js.undefined)
    @scala.inline
    def setRateLimits(value: RateLimits): Self = this.set("rateLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateLimits: Self = this.set("rateLimits", js.undefined)
    @scala.inline
    def setRetryConfig(value: RetryConfig): Self = this.set("retryConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryConfig: Self = this.set("retryConfig", js.undefined)
  }
  
}

