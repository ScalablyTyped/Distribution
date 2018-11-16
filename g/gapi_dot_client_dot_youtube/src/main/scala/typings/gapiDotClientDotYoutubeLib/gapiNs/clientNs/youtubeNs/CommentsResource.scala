package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommentsResource extends js.Object {
  /** Deletes a comment. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtokenId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** Returns a list of comments that match the API request parameters. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[CommentListResponse]
  /** Expresses the caller's opinion that one or more comments should be flagged as spam. */
  def markAsSpam(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtokenId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
               * Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the
               * comments.
               */
  def setModerationStatus(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintModerationStatus): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Modifies a comment. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
}

