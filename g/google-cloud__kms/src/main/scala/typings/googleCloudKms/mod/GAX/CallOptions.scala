package typings.googleCloudKms.mod.GAX

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://googleapis.github.io/gax-nodejs/global.html#CallOptions */
@js.native
trait CallOptions extends js.Object {
  var autoPaginate: js.UndefOr[Boolean] = js.native
  var isBundling: js.UndefOr[Boolean] = js.native
  var longrunning: js.UndefOr[BackoffSettings] = js.native
  var pageToken: js.UndefOr[js.Object] = js.native
  var promise: js.UndefOr[PromiseConstructor] = js.native
  var retry: js.UndefOr[RetryOptions] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object CallOptions {
  @scala.inline
  def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  @scala.inline
  implicit class CallOptionsOps[Self <: CallOptions] (val x: Self) extends AnyVal {
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
    def setAutoPaginate(value: Boolean): Self = this.set("autoPaginate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPaginate: Self = this.set("autoPaginate", js.undefined)
    @scala.inline
    def setIsBundling(value: Boolean): Self = this.set("isBundling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBundling: Self = this.set("isBundling", js.undefined)
    @scala.inline
    def setLongrunning(value: BackoffSettings): Self = this.set("longrunning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongrunning: Self = this.set("longrunning", js.undefined)
    @scala.inline
    def setPageToken(value: js.Object): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPromise(value: PromiseConstructor): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    @scala.inline
    def setRetry(value: RetryOptions): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

