package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.share
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareDialogParams extends DialogParams {
  var hashtag: js.UndefOr[String] = js.native
  var href: String = js.native
  var method: share = js.native
  var mobile_iframe: js.UndefOr[Boolean] = js.native
  var quote: js.UndefOr[String] = js.native
}

object ShareDialogParams {
  @scala.inline
  def apply(href: String, method: share): ShareDialogParams = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDialogParams]
  }
  @scala.inline
  implicit class ShareDialogParamsOps[Self <: ShareDialogParams] (val x: Self) extends AnyVal {
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: share): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashtag(value: String): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    @scala.inline
    def setMobile_iframe(value: Boolean): Self = this.set("mobile_iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobile_iframe: Self = this.set("mobile_iframe", js.undefined)
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
  }
  
}

