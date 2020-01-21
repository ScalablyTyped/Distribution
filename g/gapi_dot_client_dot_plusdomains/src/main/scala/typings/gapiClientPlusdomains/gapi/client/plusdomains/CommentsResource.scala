package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlusdomains.AnonActivityId
import typings.gapiClientPlusdomains.AnonActivityIdAlt
import typings.gapiClientPlusdomains.AnonAltCommentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: AnonAltCommentId): Request_[Comment]
  /** Create a new comment in reply to an activity. */
  def insert(request: AnonActivityId): Request_[Comment]
  /** List all of the comments for an activity. */
  def list(request: AnonActivityIdAlt): Request_[CommentFeed]
}

object CommentsResource {
  @scala.inline
  def apply(
    get: AnonAltCommentId => Request_[Comment],
    insert: AnonActivityId => Request_[Comment],
    list: AnonActivityIdAlt => Request_[CommentFeed]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

