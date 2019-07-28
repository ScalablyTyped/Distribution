package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  /** Fixed retry interval in milliseconds to wait between each retry ignoring the retryAfter returned as part of the response. */
  var FixedRetryIntervalInMilliseconds: js.UndefOr[Double] = js.undefined
  /** Max number of retries to be performed for a request. Default value 9. */
  var MaxRetryAttemptCount: js.UndefOr[Double] = js.undefined
  /** Max wait time in seconds to wait for a request while the retries are happening. Default value 30 seconds. */
  var MaxWaitTimeInSeconds: js.UndefOr[Double] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    FixedRetryIntervalInMilliseconds: Int | Double = null,
    MaxRetryAttemptCount: Int | Double = null,
    MaxWaitTimeInSeconds: Int | Double = null
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (FixedRetryIntervalInMilliseconds != null) __obj.updateDynamic("FixedRetryIntervalInMilliseconds")(FixedRetryIntervalInMilliseconds.asInstanceOf[js.Any])
    if (MaxRetryAttemptCount != null) __obj.updateDynamic("MaxRetryAttemptCount")(MaxRetryAttemptCount.asInstanceOf[js.Any])
    if (MaxWaitTimeInSeconds != null) __obj.updateDynamic("MaxWaitTimeInSeconds")(MaxWaitTimeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

