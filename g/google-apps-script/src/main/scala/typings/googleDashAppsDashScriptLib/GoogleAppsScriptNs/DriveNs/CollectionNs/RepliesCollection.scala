package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepliesCollection extends js.Object {
  // Gets a reply.
  def get(fileId: java.lang.String, commentId: java.lang.String, replyId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReply = js.native
  // Gets a reply.
  def get(
    fileId: java.lang.String,
    commentId: java.lang.String,
    replyId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReply = js.native
  // Creates a new reply to the given comment.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReply,
    fileId: java.lang.String,
    commentId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReply = js.native
  // Lists all of the replies to a comment.
  def list(fileId: java.lang.String, commentId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReplyList = js.native
  // Lists all of the replies to a comment.
  def list(fileId: java.lang.String, commentId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReplyList = js.native
  // Updates an existing reply. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReply,
    fileId: java.lang.String,
    commentId: java.lang.String,
    replyId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReply = js.native
  // Deletes a reply.
  def remove(fileId: java.lang.String, commentId: java.lang.String, replyId: java.lang.String): scala.Unit = js.native
  // Updates an existing reply.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReply,
    fileId: java.lang.String,
    commentId: java.lang.String,
    replyId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReply = js.native
}

