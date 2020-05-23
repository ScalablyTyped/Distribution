package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.CommentId
import typings.gapiClientDrive.anon.FileId
import typings.gapiClientDrive.anon.IncludeDeleted
import typings.gapiClientDrive.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Creates a new comment on a file. */
  def create(request: FileId): Request[Comment]
  /** Deletes a comment. */
  def delete(request: CommentId): Request[Unit]
  /** Gets a comment by ID. */
  def get(request: IncludeDeleted): Request[Comment]
  /** Lists a file's comments. */
  def list(request: Key): Request[CommentList]
  /** Updates a comment with patch semantics. */
  def update(request: CommentId): Request[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    create: FileId => Request[Comment],
    delete: CommentId => Request[Unit],
    get: IncludeDeleted => Request[Comment],
    list: Key => Request[CommentList],
    update: CommentId => Request[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CommentsResource]
  }
}

