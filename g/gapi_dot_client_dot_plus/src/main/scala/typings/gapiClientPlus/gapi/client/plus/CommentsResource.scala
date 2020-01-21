package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlus.AnonActivityIdAlt
import typings.gapiClientPlus.AnonAltCommentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: AnonAltCommentId): Request_[Comment]
  /** List all of the comments for an activity. */
  def list(request: AnonActivityIdAlt): Request_[CommentFeed]
}

object CommentsResource {
  @scala.inline
  def apply(get: AnonAltCommentId => Request_[Comment], list: AnonActivityIdAlt => Request_[CommentFeed]): CommentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

