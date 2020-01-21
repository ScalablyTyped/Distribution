package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAllThreadsRelatedToChannelId
import typings.gapiClientYoutube.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadsResource extends js.Object {
  /** Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead. */
  def insert(request: AnonAlt): Request_[CommentThread]
  /** Returns a list of comment threads that match the API request parameters. */
  def list(request: AnonAllThreadsRelatedToChannelId): Request_[CommentThreadListResponse]
  /** Modifies the top-level comment in a comment thread. */
  def update(request: AnonAlt): Request_[CommentThread]
}

object CommentThreadsResource {
  @scala.inline
  def apply(
    insert: AnonAlt => Request_[CommentThread],
    list: AnonAllThreadsRelatedToChannelId => Request_[CommentThreadListResponse],
    update: AnonAlt => Request_[CommentThread]
  ): CommentThreadsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CommentThreadsResource]
  }
}

