package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBlogger.anon.Labels
import typings.gapiClientBlogger.anon.MaxComments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostUserInfosResource extends js.Object {
  /**
    * Gets one post and user info pair, by post ID and user ID. The post user info contains per-user information about the post, such as access rights,
    * specific to the user.
    */
  def get(request: MaxComments): Request[PostUserInfo]
  /**
    * Retrieves a list of post and post user info pairs, possibly filtered. The post user info contains per-user information about the post, such as access
    * rights, specific to the user.
    */
  def list(request: Labels): Request[PostUserInfosList]
}

object PostUserInfosResource {
  @scala.inline
  def apply(get: MaxComments => Request[PostUserInfo], list: Labels => Request[PostUserInfosList]): PostUserInfosResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PostUserInfosResource]
  }
}

