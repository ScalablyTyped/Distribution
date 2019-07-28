package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Comment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsCollection extends js.Object {
  // Gets a comment by ID.
  def get(fileId: String, commentId: String): Comment = js.native
  // Gets a comment by ID.
  def get(fileId: String, commentId: String, optionalArgs: js.Object): Comment = js.native
  // Creates a new comment on the given file.
  def insert(resource: Comment, fileId: String): Comment = js.native
  // Lists a file's comments.
  def list(fileId: String): CommentList = js.native
  // Lists a file's comments.
  def list(fileId: String, optionalArgs: js.Object): CommentList = js.native
  // Updates an existing comment. This method supports patch semantics.
  def patch(resource: Comment, fileId: String, commentId: String): Comment = js.native
  // Deletes a comment.
  def remove(fileId: String, commentId: String): Unit = js.native
  // Updates an existing comment.
  def update(resource: Comment, fileId: String, commentId: String): Comment = js.native
}

