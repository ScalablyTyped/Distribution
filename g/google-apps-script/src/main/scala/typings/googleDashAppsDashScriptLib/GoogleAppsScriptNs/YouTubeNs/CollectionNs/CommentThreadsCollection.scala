package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThreadsCollection extends js.Object {
  // Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CommentThread,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CommentThread = js.native
  // Returns a list of comment threads that match the API request parameters.
  def list(part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CommentThreadListResponse = js.native
  // Returns a list of comment threads that match the API request parameters.
  def list(part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CommentThreadListResponse = js.native
  // Modifies the top-level comment in a comment thread.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CommentThread,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CommentThread = js.native
}

