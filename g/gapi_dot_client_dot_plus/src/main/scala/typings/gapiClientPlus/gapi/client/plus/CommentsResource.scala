package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlus.AnonCommentId
import typings.gapiClientPlus.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: AnonCommentId): Request_[Comment]
  /** List all of the comments for an activity. */
  def list(request: AnonKey): Request_[CommentFeed]
}

object CommentsResource {
  @scala.inline
  def apply(get: AnonCommentId => Request_[Comment], list: AnonKey => Request_[CommentFeed]): CommentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CommentsResource]
  }
}

