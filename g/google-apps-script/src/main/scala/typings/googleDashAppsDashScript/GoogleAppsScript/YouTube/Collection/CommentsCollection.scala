package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema.Comment
import typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema.CommentListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsCollection extends js.Object {
  // Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method.
  def insert(resource: Comment, part: String): Comment = js.native
  // Returns a list of comments that match the API request parameters.
  def list(part: String): CommentListResponse = js.native
  // Returns a list of comments that match the API request parameters.
  def list(part: String, optionalArgs: js.Object): CommentListResponse = js.native
  // Expresses the caller's opinion that one or more comments should be flagged as spam.
  def markAsSpam(id: String): Unit = js.native
  // Deletes a comment.
  def remove(id: String): Unit = js.native
  // Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the comments.
  def setModerationStatus(id: String, moderationStatus: String): Unit = js.native
  // Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the comments.
  def setModerationStatus(id: String, moderationStatus: String, optionalArgs: js.Object): Unit = js.native
  // Modifies a comment.
  def update(resource: Comment, part: String): Comment = js.native
}

