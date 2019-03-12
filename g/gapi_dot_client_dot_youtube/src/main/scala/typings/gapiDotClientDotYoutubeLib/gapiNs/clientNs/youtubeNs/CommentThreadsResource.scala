package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadsResource extends js.Object {
  /** Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[CommentThread]
  /** Returns a list of comment threads that match the API request parameters. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AllThreadsRelatedToChannelId): gapiDotClientLib.gapiNs.clientNs.Request[CommentThreadListResponse]
  /** Modifies the top-level comment in a comment thread. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[CommentThread]
}

object CommentThreadsResource {
  @scala.inline
  def apply(
    insert: gapiDotClientDotYoutubeLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[CommentThread],
    list: gapiDotClientDotYoutubeLib.Anon_AllThreadsRelatedToChannelId => gapiDotClientLib.gapiNs.clientNs.Request[CommentThreadListResponse],
    update: gapiDotClientDotYoutubeLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[CommentThread]
  ): CommentThreadsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CommentThreadsResource]
  }
}

