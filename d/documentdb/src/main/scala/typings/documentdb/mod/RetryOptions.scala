package typings.documentdb.mod

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
    FixedRetryIntervalInMilliseconds: js.UndefOr[Double] = js.undefined,
    MaxRetryAttemptCount: js.UndefOr[Double] = js.undefined,
    MaxWaitTimeInSeconds: js.UndefOr[Double] = js.undefined
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FixedRetryIntervalInMilliseconds)) __obj.updateDynamic("FixedRetryIntervalInMilliseconds")(FixedRetryIntervalInMilliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRetryAttemptCount)) __obj.updateDynamic("MaxRetryAttemptCount")(MaxRetryAttemptCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxWaitTimeInSeconds)) __obj.updateDynamic("MaxWaitTimeInSeconds")(MaxWaitTimeInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

