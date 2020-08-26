package typings.dropboxjs.Dropbox.AuthDriver

import typings.dropboxjs.Dropbox.Client
import typings.dropboxjs.Dropbox.QueryParamsCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redirect extends js.Object {
  def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit = js.native
  def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  def url(): String = js.native
}

object Redirect {
  @scala.inline
  def apply(
    doAuthorize: (String, String, Client) => Unit,
    resumeAuthorize: (String, Client, QueryParamsCallback) => Unit,
    url: () => String
  ): Redirect = {
    val __obj = js.Dynamic.literal(doAuthorize = js.Any.fromFunction3(doAuthorize), resumeAuthorize = js.Any.fromFunction3(resumeAuthorize), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[Redirect]
  }
  @scala.inline
  implicit class RedirectOps[Self <: Redirect] (val x: Self) extends AnyVal {
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
    def setDoAuthorize(value: (String, String, Client) => Unit): Self = this.set("doAuthorize", js.Any.fromFunction3(value))
    @scala.inline
    def setResumeAuthorize(value: (String, Client, QueryParamsCallback) => Unit): Self = this.set("resumeAuthorize", js.Any.fromFunction3(value))
    @scala.inline
    def setUrl(value: () => String): Self = this.set("url", js.Any.fromFunction0(value))
  }
  
}

