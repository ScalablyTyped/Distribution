package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings that determine the retry behavior.  By default, if a job does not
  * complete successfully (meaning that an acknowledgement is not received from
  * the handler, then it will be retried with exponential backoff according to
  * the settings in RetryConfig.
  */
@js.native
trait SchemaRetryConfig extends js.Object {
  /**
    * The maximum amount of time to wait before retrying a job after it fails.
    * The default value of this field is 1 hour.
    */
  var maxBackoffDuration: js.UndefOr[String] = js.native
  /**
    * The time between retries will double `max_doublings` times.  A job&#39;s
    * retry interval starts at min_backoff_duration, then doubles
    * `max_doublings` times, then increases linearly, and finally retries
    * retries at intervals of max_backoff_duration up to retry_count times. For
    * example, if min_backoff_duration is 10s, max_backoff_duration is 300s,
    * and `max_doublings` is 3, then the a job will first be retried in 10s.
    * The retry interval will double three times, and then increase linearly by
    * 2^3 * 10s.  Finally, the job will retry at intervals of
    * max_backoff_duration until the job has been attempted retry_count times.
    * Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s,
    * 300s, ....  The default value of this field is 5.
    */
  var maxDoublings: js.UndefOr[Double] = js.native
  /**
    * The time limit for retrying a failed job, measured from time when an
    * execution was first attempted. If specified with retry_count, the job
    * will be retried until both limits are reached.  The default value for
    * max_retry_duration is zero, which means retry duration is unlimited.
    */
  var maxRetryDuration: js.UndefOr[String] = js.native
  /**
    * The minimum amount of time to wait before retrying a job after it fails.
    * The default value of this field is 5 seconds.
    */
  var minBackoffDuration: js.UndefOr[String] = js.native
  /**
    * The number of attempts that the system will make to run a job using the
    * exponential backoff procedure described by max_doublings.  The default
    * value of retry_count is zero.  If retry_count is zero, a job attempt will
    * *not* be retried if it fails. Instead the Cloud Scheduler system will
    * wait for the next scheduled execution time.  If retry_count is set to a
    * non-zero number then Cloud Scheduler will retry failed attempts, using
    * exponential backoff, retry_count times, or until the next scheduled
    * execution time, whichever comes first.  Values greater than 5 and
    * negative values are not allowed.
    */
  var retryCount: js.UndefOr[Double] = js.native
}

object SchemaRetryConfig {
  @scala.inline
  def apply(): SchemaRetryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRetryConfig]
  }
  @scala.inline
  implicit class SchemaRetryConfigOps[Self <: SchemaRetryConfig] (val x: Self) extends AnyVal {
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
    def setMaxBackoffDuration(value: String): Self = this.set("maxBackoffDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBackoffDuration: Self = this.set("maxBackoffDuration", js.undefined)
    @scala.inline
    def setMaxDoublings(value: Double): Self = this.set("maxDoublings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDoublings: Self = this.set("maxDoublings", js.undefined)
    @scala.inline
    def setMaxRetryDuration(value: String): Self = this.set("maxRetryDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetryDuration: Self = this.set("maxRetryDuration", js.undefined)
    @scala.inline
    def setMinBackoffDuration(value: String): Self = this.set("minBackoffDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinBackoffDuration: Self = this.set("minBackoffDuration", js.undefined)
    @scala.inline
    def setRetryCount(value: Double): Self = this.set("retryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryCount: Self = this.set("retryCount", js.undefined)
  }
  
}

