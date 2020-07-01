package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.CommentId
import typings.gapiClientDrive.anon.FileId
import typings.gapiClientDrive.anon.IncludeDeleted
import typings.gapiClientDrive.anon.Oauthtoken
import typings.gapiClientDrive.anon.PageSize
import typings.gapiClientDrive.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Creates a new comment on a file. */
  def create(request: FileId): Request[Comment] = js.native
  def create(request: Oauthtoken, body: Comment): Request[Comment] = js.native
  /** Deletes a comment. */
  def delete(): Request[Unit] = js.native
  def delete(request: CommentId): Request[Unit] = js.native
  /** Gets a comment by ID. */
  def get(): Request[Comment] = js.native
  def get(request: IncludeDeleted): Request[Comment] = js.native
  /** Lists a file's comments. */
  def list(): Request[CommentList] = js.native
  def list(request: PageSize): Request[CommentList] = js.native
  def update(request: CommentId, body: Comment): Request[Comment] = js.native
  /** Updates a comment with patch semantics. */
  def update(request: PrettyPrint): Request[Comment] = js.native
}

