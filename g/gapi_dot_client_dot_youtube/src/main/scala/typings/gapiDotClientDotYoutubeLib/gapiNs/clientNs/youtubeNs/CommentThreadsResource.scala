package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadsResource extends js.Object {
  /** Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[CommentThread]
  /** Returns a list of comment threads that match the API request parameters. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_SearchTerms): gapiDotClientLib.gapiNs.clientNs.Request[CommentThreadListResponse]
  /** Modifies the top-level comment in a comment thread. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[CommentThread]
}

