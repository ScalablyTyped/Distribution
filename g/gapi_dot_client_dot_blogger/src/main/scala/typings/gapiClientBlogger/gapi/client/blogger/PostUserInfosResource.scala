package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBlogger.AnonLabels
import typings.gapiClientBlogger.AnonMaxComments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostUserInfosResource extends js.Object {
  /**
    * Gets one post and user info pair, by post ID and user ID. The post user info contains per-user information about the post, such as access rights,
    * specific to the user.
    */
  def get(request: AnonMaxComments): Request_[PostUserInfo]
  /**
    * Retrieves a list of post and post user info pairs, possibly filtered. The post user info contains per-user information about the post, such as access
    * rights, specific to the user.
    */
  def list(request: AnonLabels): Request_[PostUserInfosList]
}

object PostUserInfosResource {
  @scala.inline
  def apply(get: AnonMaxComments => Request_[PostUserInfo], list: AnonLabels => Request_[PostUserInfosList]): PostUserInfosResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PostUserInfosResource]
  }
}

