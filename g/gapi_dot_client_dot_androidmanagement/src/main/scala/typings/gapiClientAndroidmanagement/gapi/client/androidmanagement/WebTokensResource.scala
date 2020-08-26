package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidmanagement.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebTokensResource extends js.Object {
  /** Creates a web token to access an embeddable managed Google Play web UI for a given enterprise. */
  def create(request: Key): Request[WebToken] = js.native
}

object WebTokensResource {
  @scala.inline
  def apply(create: Key => Request[WebToken]): WebTokensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[WebTokensResource]
  }
  @scala.inline
  implicit class WebTokensResourceOps[Self <: WebTokensResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Key => Request[WebToken]): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

