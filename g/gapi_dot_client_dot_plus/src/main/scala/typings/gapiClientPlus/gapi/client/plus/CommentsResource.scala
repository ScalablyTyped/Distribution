package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlus.anon.CommentId
import typings.gapiClientPlus.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: CommentId): Request[Comment]
  /** List all of the comments for an activity. */
  def list(request: Key): Request[CommentFeed]
}

object CommentsResource {
  @scala.inline
  def apply(get: CommentId => Request[Comment], list: Key => Request[CommentFeed]): CommentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CommentsResource]
  }
}

