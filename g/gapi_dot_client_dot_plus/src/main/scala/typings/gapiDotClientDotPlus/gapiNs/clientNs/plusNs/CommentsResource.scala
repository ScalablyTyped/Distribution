package typings.gapiDotClientDotPlus.gapiNs.clientNs.plusNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPlus.Anon_ActivityIdAlt
import typings.gapiDotClientDotPlus.Anon_AltCommentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: Anon_AltCommentId): Request[Comment]
  /** List all of the comments for an activity. */
  def list(request: Anon_ActivityIdAlt): Request[CommentFeed]
}

object CommentsResource {
  @scala.inline
  def apply(get: Anon_AltCommentId => Request[Comment], list: Anon_ActivityIdAlt => Request[CommentFeed]): CommentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

