package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AllThreadsRelatedToChannelId
import typings.gapiDotClientDotYoutube.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadsResource extends js.Object {
  /** Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead. */
  def insert(request: Anon_Alt): Request[CommentThread]
  /** Returns a list of comment threads that match the API request parameters. */
  def list(request: Anon_AllThreadsRelatedToChannelId): Request[CommentThreadListResponse]
  /** Modifies the top-level comment in a comment thread. */
  def update(request: Anon_Alt): Request[CommentThread]
}

object CommentThreadsResource {
  @scala.inline
  def apply(
    insert: Anon_Alt => Request[CommentThread],
    list: Anon_AllThreadsRelatedToChannelId => Request[CommentThreadListResponse],
    update: Anon_Alt => Request[CommentThread]
  ): CommentThreadsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CommentThreadsResource]
  }
}

