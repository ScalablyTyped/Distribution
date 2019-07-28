package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_Alt
import typings.gapiDotClientDotYoutube.Anon_AltBanAuthor
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyMaxResults
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Deletes a comment. */
  def delete(request: Anon_AltFieldsIdKeyOauthtokenPrettyPrint): Request[Unit]
  /** Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method. */
  def insert(request: Anon_Alt): Request[Comment]
  /** Returns a list of comments that match the API request parameters. */
  def list(request: Anon_AltFieldsIdKeyMaxResults): Request[CommentListResponse]
  /** Expresses the caller's opinion that one or more comments should be flagged as spam. */
  def markAsSpam(request: Anon_AltFieldsIdKeyOauthtokenPrettyPrint): Request[Unit]
  /**
    * Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the
    * comments.
    */
  def setModerationStatus(request: Anon_AltBanAuthor): Request[Unit]
  /** Modifies a comment. */
  def update(request: Anon_Alt): Request[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKeyOauthtokenPrettyPrint => Request[Unit],
    insert: Anon_Alt => Request[Comment],
    list: Anon_AltFieldsIdKeyMaxResults => Request[CommentListResponse],
    markAsSpam: Anon_AltFieldsIdKeyOauthtokenPrettyPrint => Request[Unit],
    setModerationStatus: Anon_AltBanAuthor => Request[Unit],
    update: Anon_Alt => Request[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), markAsSpam = js.Any.fromFunction1(markAsSpam), setModerationStatus = js.Any.fromFunction1(setModerationStatus), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

