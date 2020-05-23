package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.AllThreadsRelatedToChannelId
import typings.gapiClientYoutube.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadsResource extends js.Object {
  /** Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead. */
  def insert(request: Alt): Request[CommentThread]
  /** Returns a list of comment threads that match the API request parameters. */
  def list(request: AllThreadsRelatedToChannelId): Request[CommentThreadListResponse]
  /** Modifies the top-level comment in a comment thread. */
  def update(request: Alt): Request[CommentThread]
}

object CommentThreadsResource {
  @scala.inline
  def apply(
    insert: Alt => Request[CommentThread],
    list: AllThreadsRelatedToChannelId => Request[CommentThreadListResponse],
    update: Alt => Request[CommentThread]
  ): CommentThreadsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CommentThreadsResource]
  }
}

