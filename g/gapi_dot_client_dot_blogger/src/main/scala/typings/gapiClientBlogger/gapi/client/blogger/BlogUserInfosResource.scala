package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBlogger.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogUserInfosResource extends js.Object {
  /** Gets one blog and user info pair by blogId and userId. */
  def get(request: Alt): Request[BlogUserInfo] = js.native
}

object BlogUserInfosResource {
  @scala.inline
  def apply(get: Alt => Request[BlogUserInfo]): BlogUserInfosResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[BlogUserInfosResource]
  }
  @scala.inline
  implicit class BlogUserInfosResourceOps[Self <: BlogUserInfosResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Alt => Request[BlogUserInfo]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

