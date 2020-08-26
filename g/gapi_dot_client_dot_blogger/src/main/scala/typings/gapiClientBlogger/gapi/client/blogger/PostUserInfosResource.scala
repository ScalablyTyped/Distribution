package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBlogger.anon.Labels
import typings.gapiClientBlogger.anon.MaxComments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostUserInfosResource extends js.Object {
  /**
    * Gets one post and user info pair, by post ID and user ID. The post user info contains per-user information about the post, such as access rights,
    * specific to the user.
    */
  def get(request: MaxComments): Request[PostUserInfo] = js.native
  /**
    * Retrieves a list of post and post user info pairs, possibly filtered. The post user info contains per-user information about the post, such as access
    * rights, specific to the user.
    */
  def list(request: Labels): Request[PostUserInfosList] = js.native
}

object PostUserInfosResource {
  @scala.inline
  def apply(get: MaxComments => Request[PostUserInfo], list: Labels => Request[PostUserInfosList]): PostUserInfosResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PostUserInfosResource]
  }
  @scala.inline
  implicit class PostUserInfosResourceOps[Self <: PostUserInfosResource] (val x: Self) extends AnyVal {
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
    def setGet(value: MaxComments => Request[PostUserInfo]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Labels => Request[PostUserInfosList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

