package typings.googleCloudCommon.utilMod

import typings.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeRequestConfig extends js.Object {
  /**
    * Automatically retry requests if the response is related to rate limits or
    * certain intermittent server errors. We will exponentially backoff
    * subsequent requests by default. (default: true)
    */
  var autoRetry: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of automatic retries attempted before returning the error.
    * (default: 3)
    */
  var maxRetries: js.UndefOr[Double] = js.native
  var retries: js.UndefOr[Double] = js.native
  var shouldRetryFn: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response[_]], Boolean]] = js.native
  var stream: js.UndefOr[Duplexify] = js.native
}

object MakeRequestConfig {
  @scala.inline
  def apply(): MakeRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeRequestConfig]
  }
  @scala.inline
  implicit class MakeRequestConfigOps[Self <: MakeRequestConfig] (val x: Self) extends AnyVal {
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
    def setAutoRetry(value: Boolean): Self = this.set("autoRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRetry: Self = this.set("autoRetry", js.undefined)
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setShouldRetryFn(value: /* response */ js.UndefOr[Response[_]] => Boolean): Self = this.set("shouldRetryFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldRetryFn: Self = this.set("shouldRetryFn", js.undefined)
    @scala.inline
    def setStream(value: Duplexify): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
  
}

