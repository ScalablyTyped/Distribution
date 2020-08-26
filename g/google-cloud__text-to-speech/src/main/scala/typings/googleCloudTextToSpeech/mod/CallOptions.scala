package typings.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallOptions extends js.Object {
  var autoPaginate: js.UndefOr[Boolean] = js.native
  var isBundling: Boolean = js.native
  var longrunning: js.UndefOr[js.Any] = js.native
  var pageToken: js.UndefOr[js.Any] = js.native
  var promise: js.UndefOr[js.Any] = js.native
  var retry: js.UndefOr[js.Any] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object CallOptions {
  @scala.inline
  def apply(isBundling: Boolean): CallOptions = {
    val __obj = js.Dynamic.literal(isBundling = isBundling.asInstanceOf[js.Any])
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
    def setIsBundling(value: Boolean): Self = this.set("isBundling", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoPaginate(value: Boolean): Self = this.set("autoPaginate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPaginate: Self = this.set("autoPaginate", js.undefined)
    @scala.inline
    def setLongrunning(value: js.Any): Self = this.set("longrunning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongrunning: Self = this.set("longrunning", js.undefined)
    @scala.inline
    def setPageToken(value: js.Any): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPromise(value: js.Any): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    @scala.inline
    def setRetry(value: js.Any): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

