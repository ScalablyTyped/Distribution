package typings.duoWebSdk.mod

import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends js.Object {
  var host: String = js.native
  var iframe: js.UndefOr[String | HTMLIFrameElement] = js.native
  var iframeAttributes: js.UndefOr[js.Object] = js.native
  var iframeContainer: js.UndefOr[String | HTMLElement] = js.native
  var post_action: js.UndefOr[String] = js.native
  var post_argument: js.UndefOr[String] = js.native
  var sig_request: String = js.native
  var submit_callback: js.UndefOr[js.Function1[/* duo_form */ HTMLFormElement, Unit]] = js.native
}

object InitOptions {
  @scala.inline
  def apply(host: String, sig_request: String): InitOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sig_request = sig_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setSig_request(value: String): Self = this.set("sig_request", value.asInstanceOf[js.Any])
    @scala.inline
    def setIframe(value: String | HTMLIFrameElement): Self = this.set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
    @scala.inline
    def setIframeAttributes(value: js.Object): Self = this.set("iframeAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeAttributes: Self = this.set("iframeAttributes", js.undefined)
    @scala.inline
    def setIframeContainer(value: String | HTMLElement): Self = this.set("iframeContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeContainer: Self = this.set("iframeContainer", js.undefined)
    @scala.inline
    def setPost_action(value: String): Self = this.set("post_action", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePost_action: Self = this.set("post_action", js.undefined)
    @scala.inline
    def setPost_argument(value: String): Self = this.set("post_argument", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePost_argument: Self = this.set("post_argument", js.undefined)
    @scala.inline
    def setSubmit_callback(value: /* duo_form */ HTMLFormElement => Unit): Self = this.set("submit_callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSubmit_callback: Self = this.set("submit_callback", js.undefined)
  }
  
}

