package typings.googleAppsScript.GoogleAppsScript.Drive.Collection

import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.CommentReply
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.CommentReplyList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepliesCollection extends js.Object {
  
  // Gets a reply.
  def get(fileId: String, commentId: String, replyId: String): CommentReply = js.native
  // Gets a reply.
  def get(fileId: String, commentId: String, replyId: String, optionalArgs: js.Object): CommentReply = js.native
  
  // Creates a new reply to the given comment.
  def insert(resource: CommentReply, fileId: String, commentId: String): CommentReply = js.native
  
  // Lists all of the replies to a comment.
  def list(fileId: String, commentId: String): CommentReplyList = js.native
  // Lists all of the replies to a comment.
  def list(fileId: String, commentId: String, optionalArgs: js.Object): CommentReplyList = js.native
  
  // Updates an existing reply. This method supports patch semantics.
  def patch(resource: CommentReply, fileId: String, commentId: String, replyId: String): CommentReply = js.native
  
  // Deletes a reply.
  def remove(fileId: String, commentId: String, replyId: String): Unit = js.native
  
  // Updates an existing reply.
  def update(resource: CommentReply, fileId: String, commentId: String, replyId: String): CommentReply = js.native
}
