package typings.gapiDotClientDotPlusdomains.gapi.client.plusdomains

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPlusdomains.Anon_ActivityId
import typings.gapiDotClientDotPlusdomains.Anon_ActivityIdAlt
import typings.gapiDotClientDotPlusdomains.Anon_AltCommentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: Anon_AltCommentId): Request[Comment]
  /** Create a new comment in reply to an activity. */
  def insert(request: Anon_ActivityId): Request[Comment]
  /** List all of the comments for an activity. */
  def list(request: Anon_ActivityIdAlt): Request[CommentFeed]
}

object CommentsResource {
  @scala.inline
  def apply(
    get: Anon_AltCommentId => Request[Comment],
    insert: Anon_ActivityId => Request[Comment],
    list: Anon_ActivityIdAlt => Request[CommentFeed]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

