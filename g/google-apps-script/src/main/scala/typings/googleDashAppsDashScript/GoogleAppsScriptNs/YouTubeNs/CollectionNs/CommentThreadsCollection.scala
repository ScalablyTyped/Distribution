package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CommentThread
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CommentThreadListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThreadsCollection extends js.Object {
  // Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead.
  def insert(resource: CommentThread, part: String): CommentThread = js.native
  // Returns a list of comment threads that match the API request parameters.
  def list(part: String): CommentThreadListResponse = js.native
  // Returns a list of comment threads that match the API request parameters.
  def list(part: String, optionalArgs: js.Object): CommentThreadListResponse = js.native
  // Modifies the top-level comment in a comment thread.
  def update(resource: CommentThread, part: String): CommentThread = js.native
}

