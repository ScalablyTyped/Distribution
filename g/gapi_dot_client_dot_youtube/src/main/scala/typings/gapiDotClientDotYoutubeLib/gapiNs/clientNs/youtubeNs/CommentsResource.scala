package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Deletes a comment. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** Returns a list of comments that match the API request parameters. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[CommentListResponse]
  /** Expresses the caller's opinion that one or more comments should be flagged as spam. */
  def markAsSpam(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the
    * comments.
    */
  def setModerationStatus(request: gapiDotClientDotYoutubeLib.Anon_AltBanAuthor): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Modifies a comment. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Comment]
    ],
    list: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyMaxResults, 
      gapiDotClientLib.gapiNs.clientNs.Request[CommentListResponse]
    ],
    markAsSpam: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    setModerationStatus: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltBanAuthor, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    update: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Comment]
    ]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(delete = delete, insert = insert, list = list, markAsSpam = markAsSpam, setModerationStatus = setModerationStatus, update = update)
  
    __obj.asInstanceOf[CommentsResource]
  }
}

