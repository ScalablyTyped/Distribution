package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Alt
import typings.gapiClientYoutube.anon.BanAuthor
import typings.gapiClientYoutube.anon.MaxResults
import typings.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Deletes a comment. */
  def delete(request: QuotaUser): Request[Unit]
  /** Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method. */
  def insert(request: Alt): Request[Comment]
  /** Returns a list of comments that match the API request parameters. */
  def list(request: MaxResults): Request[CommentListResponse]
  /** Expresses the caller's opinion that one or more comments should be flagged as spam. */
  def markAsSpam(request: QuotaUser): Request[Unit]
  /**
    * Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the
    * comments.
    */
  def setModerationStatus(request: BanAuthor): Request[Unit]
  /** Modifies a comment. */
  def update(request: Alt): Request[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    delete: QuotaUser => Request[Unit],
    insert: Alt => Request[Comment],
    list: MaxResults => Request[CommentListResponse],
    markAsSpam: QuotaUser => Request[Unit],
    setModerationStatus: BanAuthor => Request[Unit],
    update: Alt => Request[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), markAsSpam = js.Any.fromFunction1(markAsSpam), setModerationStatus = js.Any.fromFunction1(setModerationStatus), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CommentsResource]
  }
}

