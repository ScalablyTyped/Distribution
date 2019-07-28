package typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdEndDateFetchBodiesFields
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFieldsKeyMaxComments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostUserInfosResource extends js.Object {
  /**
    * Gets one post and user info pair, by post ID and user ID. The post user info contains per-user information about the post, such as access rights,
    * specific to the user.
    */
  def get(request: Anon_AltBlogIdFieldsKeyMaxComments): Request[PostUserInfo]
  /**
    * Retrieves a list of post and post user info pairs, possibly filtered. The post user info contains per-user information about the post, such as access
    * rights, specific to the user.
    */
  def list(request: Anon_AltBlogIdEndDateFetchBodiesFields): Request[PostUserInfosList]
}

object PostUserInfosResource {
  @scala.inline
  def apply(
    get: Anon_AltBlogIdFieldsKeyMaxComments => Request[PostUserInfo],
    list: Anon_AltBlogIdEndDateFetchBodiesFields => Request[PostUserInfosList]
  ): PostUserInfosResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PostUserInfosResource]
  }
}

