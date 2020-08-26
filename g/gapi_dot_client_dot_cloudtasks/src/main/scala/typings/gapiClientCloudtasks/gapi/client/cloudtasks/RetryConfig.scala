package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryConfig extends js.Object {
  /**
    * The maximum number of attempts for a task.
    *
    * Cloud Tasks will attempt the task `max_attempts` times (that
    * is, if the first attempt fails, then there will be
    * `max_attempts - 1` retries).  Must be > 0.
    */
  var maxAttempts: js.UndefOr[Double] = js.native
  /**
    * The maximum amount of time to wait before retrying a task after
    * it fails. The default is 1 hour.
    *
    * &#42; For [App Engine queues](google.cloud.tasks.v2beta2.AppEngineHttpTarget),
    * this field is 1 hour by default.
    * &#42; For [pull queues](google.cloud.tasks.v2beta2.PullTarget), this field
    * is output only and always 0.
    *
    * `max_backoff` will be truncated to the nearest second.
    *
    * This field has the same meaning as
    * [max_backoff_seconds in queue.yaml](/appengine/docs/standard/python/config/queueref#retry_parameters).
    */
  var maxBackoff: js.UndefOr[String] = js.native
  /**
    * The time between retries increases exponentially `max_doublings` times.
    * `max_doublings` is maximum number of times that the interval between failed
    * task retries will be doubled before the interval increases linearly.
    * After max_doublings intervals, the retry interval will be
    * 2^(max_doublings - 1) &#42; RetryConfig.min_backoff.
    *
    * &#42; For [App Engine queues](google.cloud.tasks.v2beta2.AppEngineHttpTarget),
    * this field is 16 by default.
    * &#42; For [pull queues](google.cloud.tasks.v2beta2.PullTarget), this field
    * is output only and always 0.
    *
    * This field has the same meaning as
    * [max_doublings in queue.yaml](/appengine/docs/standard/python/config/queueref#retry_parameters).
    */
  var maxDoublings: js.UndefOr[Double] = js.native
  /**
    * If positive, `max_retry_duration` specifies the time limit for retrying a
    * failed task, measured from when the task was first attempted. Once
    * `max_retry_duration` time has passed &#42;and&#42; the task has been attempted
    * RetryConfig.max_attempts times, no further attempts will be made and
    * the task will be deleted.
    *
    * If zero, then the task age is unlimited.
    *
    * &#42; For [App Engine queues](google.cloud.tasks.v2beta2.AppEngineHttpTarget),
    * this field is 0 seconds by default.
    * &#42; For [pull queues](google.cloud.tasks.v2beta2.PullTarget), this
    * field is output only and always 0.
    *
    * `max_retry_duration` will be truncated to the nearest second.
    *
    * This field has the same meaning as
    * [task_age_limit in queue.yaml](/appengine/docs/standard/python/config/queueref#retry_parameters).
    */
  var maxRetryDuration: js.UndefOr[String] = js.native
  /**
    * The minimum amount of time to wait before retrying a task after
    * it fails.
    *
    * &#42; For [App Engine queues](google.cloud.tasks.v2beta2.AppEngineHttpTarget),
    * this field is 0.1 seconds by default.
    * &#42; For [pull queues](google.cloud.tasks.v2beta2.PullTarget), this
    * field is output only and always 0.
    *
    * `min_backoff` will be truncated to the nearest second.
    *
    * This field has the same meaning as
    * [min_backoff_seconds in queue.yaml](/appengine/docs/standard/python/config/queueref#retry_parameters).
    */
  var minBackoff: js.UndefOr[String] = js.native
  /** If true, then the number of attempts is unlimited. */
  var unlimitedAttempts: js.UndefOr[Boolean] = js.native
}

object RetryConfig {
  @scala.inline
  def apply(): RetryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryConfig]
  }
  @scala.inline
  implicit class RetryConfigOps[Self <: RetryConfig] (val x: Self) extends AnyVal {
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
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    @scala.inline
    def setMaxBackoff(value: String): Self = this.set("maxBackoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBackoff: Self = this.set("maxBackoff", js.undefined)
    @scala.inline
    def setMaxDoublings(value: Double): Self = this.set("maxDoublings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDoublings: Self = this.set("maxDoublings", js.undefined)
    @scala.inline
    def setMaxRetryDuration(value: String): Self = this.set("maxRetryDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetryDuration: Self = this.set("maxRetryDuration", js.undefined)
    @scala.inline
    def setMinBackoff(value: String): Self = this.set("minBackoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinBackoff: Self = this.set("minBackoff", js.undefined)
    @scala.inline
    def setUnlimitedAttempts(value: Boolean): Self = this.set("unlimitedAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlimitedAttempts: Self = this.set("unlimitedAttempts", js.undefined)
  }
  
}

