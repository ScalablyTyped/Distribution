package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAlt
import typings.gapiClientYoutube.AnonAltBanAuthor
import typings.gapiClientYoutube.AnonAltFieldsIdKeyMaxResults
import typings.gapiClientYoutube.AnonAltFieldsIdKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Deletes a comment. */
  def delete(request: AnonAltFieldsIdKeyOauthtokenPrettyPrint): Request_[Unit]
  /** Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method. */
  def insert(request: AnonAlt): Request_[Comment]
  /** Returns a list of comments that match the API request parameters. */
  def list(request: AnonAltFieldsIdKeyMaxResults): Request_[CommentListResponse]
  /** Expresses the caller's opinion that one or more comments should be flagged as spam. */
  def markAsSpam(request: AnonAltFieldsIdKeyOauthtokenPrettyPrint): Request_[Unit]
  /**
    * Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the
    * comments.
    */
  def setModerationStatus(request: AnonAltBanAuthor): Request_[Unit]
  /** Modifies a comment. */
  def update(request: AnonAlt): Request_[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsIdKeyOauthtokenPrettyPrint => Request_[Unit],
    insert: AnonAlt => Request_[Comment],
    list: AnonAltFieldsIdKeyMaxResults => Request_[CommentListResponse],
    markAsSpam: AnonAltFieldsIdKeyOauthtokenPrettyPrint => Request_[Unit],
    setModerationStatus: AnonAltBanAuthor => Request_[Unit],
    update: AnonAlt => Request_[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), markAsSpam = js.Any.fromFunction1(markAsSpam), setModerationStatus = js.Any.fromFunction1(setModerationStatus), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

