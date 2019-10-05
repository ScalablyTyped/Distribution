package typings.gapiDotClientDotCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryConfig extends js.Object {
  /**
    * The maximum number of attempts for a task.
    *
    * Cloud Tasks will attempt the task `max_attempts` times (that
    * is, if the first attempt fails, then there will be
    * `max_attempts - 1` retries).  Must be > 0.
    */
  var maxAttempts: js.UndefOr[Double] = js.undefined
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
  var maxBackoff: js.UndefOr[String] = js.undefined
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
  var maxDoublings: js.UndefOr[Double] = js.undefined
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
  var maxRetryDuration: js.UndefOr[String] = js.undefined
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
  var minBackoff: js.UndefOr[String] = js.undefined
  /** If true, then the number of attempts is unlimited. */
  var unlimitedAttempts: js.UndefOr[Boolean] = js.undefined
}

object RetryConfig {
  @scala.inline
  def apply(
    maxAttempts: Int | Double = null,
    maxBackoff: String = null,
    maxDoublings: Int | Double = null,
    maxRetryDuration: String = null,
    minBackoff: String = null,
    unlimitedAttempts: js.UndefOr[Boolean] = js.undefined
  ): RetryConfig = {
    val __obj = js.Dynamic.literal()
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (maxBackoff != null) __obj.updateDynamic("maxBackoff")(maxBackoff)
    if (maxDoublings != null) __obj.updateDynamic("maxDoublings")(maxDoublings.asInstanceOf[js.Any])
    if (maxRetryDuration != null) __obj.updateDynamic("maxRetryDuration")(maxRetryDuration)
    if (minBackoff != null) __obj.updateDynamic("minBackoff")(minBackoff)
    if (!js.isUndefined(unlimitedAttempts)) __obj.updateDynamic("unlimitedAttempts")(unlimitedAttempts)
    __obj.asInstanceOf[RetryConfig]
  }
}

