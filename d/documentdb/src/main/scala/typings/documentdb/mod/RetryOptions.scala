package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOptions extends js.Object {
  /** Fixed retry interval in milliseconds to wait between each retry ignoring the retryAfter returned as part of the response. */
  var FixedRetryIntervalInMilliseconds: js.UndefOr[Double] = js.native
  /** Max number of retries to be performed for a request. Default value 9. */
  var MaxRetryAttemptCount: js.UndefOr[Double] = js.native
  /** Max wait time in seconds to wait for a request while the retries are happening. Default value 30 seconds. */
  var MaxWaitTimeInSeconds: js.UndefOr[Double] = js.native
}

object RetryOptions {
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions] (val x: Self) extends AnyVal {
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
    def setFixedRetryIntervalInMilliseconds(value: Double): Self = this.set("FixedRetryIntervalInMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedRetryIntervalInMilliseconds: Self = this.set("FixedRetryIntervalInMilliseconds", js.undefined)
    @scala.inline
    def setMaxRetryAttemptCount(value: Double): Self = this.set("MaxRetryAttemptCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetryAttemptCount: Self = this.set("MaxRetryAttemptCount", js.undefined)
    @scala.inline
    def setMaxWaitTimeInSeconds(value: Double): Self = this.set("MaxWaitTimeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWaitTimeInSeconds: Self = this.set("MaxWaitTimeInSeconds", js.undefined)
  }
  
}

