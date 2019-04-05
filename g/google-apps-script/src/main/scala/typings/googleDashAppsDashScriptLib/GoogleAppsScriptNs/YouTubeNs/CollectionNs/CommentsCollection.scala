package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsCollection extends js.Object {
  // Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Comment,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Comment = js.native
  // Returns a list of comments that match the API request parameters.
  def list(part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CommentListResponse = js.native
  // Returns a list of comments that match the API request parameters.
  def list(part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CommentListResponse = js.native
  // Expresses the caller's opinion that one or more comments should be flagged as spam.
  def markAsSpam(id: java.lang.String): scala.Unit = js.native
  // Deletes a comment.
  def remove(id: java.lang.String): scala.Unit = js.native
  // Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the comments.
  def setModerationStatus(id: java.lang.String, moderationStatus: java.lang.String): scala.Unit = js.native
  // Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the comments.
  def setModerationStatus(id: java.lang.String, moderationStatus: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Modifies a comment.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Comment,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Comment = js.native
}

