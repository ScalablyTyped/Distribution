package typings.easyApiRequest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookies extends js.Object {
  var cookies: js.UndefOr[js.Array[String]] = js.native
  var headers: js.UndefOr[js.Array[String]] = js.native
  var internal: js.UndefOr[Boolean] = js.native
  var jSend: js.UndefOr[Boolean] = js.native
  var opts: js.UndefOr[js.Object] = js.native
  var replyCookies: js.UndefOr[js.Array[String]] = js.native
  var url: String = js.native
}

object Cookies {
  @scala.inline
  def apply(url: String): Cookies = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookies]
  }
  @scala.inline
  implicit class CookiesOps[Self <: Cookies] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookiesVarargs(value: String*): Self = this.set("cookies", js.Array(value :_*))
    @scala.inline
    def setCookies(value: js.Array[String]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    @scala.inline
    def setJSend(value: Boolean): Self = this.set("jSend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSend: Self = this.set("jSend", js.undefined)
    @scala.inline
    def setOpts(value: js.Object): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpts: Self = this.set("opts", js.undefined)
    @scala.inline
    def setReplyCookiesVarargs(value: String*): Self = this.set("replyCookies", js.Array(value :_*))
    @scala.inline
    def setReplyCookies(value: js.Array[String]): Self = this.set("replyCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyCookies: Self = this.set("replyCookies", js.undefined)
  }
  
}

