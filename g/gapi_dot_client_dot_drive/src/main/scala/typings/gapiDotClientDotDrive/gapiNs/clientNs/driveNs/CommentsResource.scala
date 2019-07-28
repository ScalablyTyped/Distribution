package typings.gapiDotClientDotDrive.gapiNs.clientNs.driveNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDrive.Anon_AltCommentId
import typings.gapiDotClientDotDrive.Anon_AltCommentIdFields
import typings.gapiDotClientDotDrive.Anon_AltFieldsFileId
import typings.gapiDotClientDotDrive.Anon_AltFieldsFileIdIncludeDeleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Creates a new comment on a file. */
  def create(request: Anon_AltFieldsFileId): Request[Comment]
  /** Deletes a comment. */
  def delete(request: Anon_AltCommentId): Request[Unit]
  /** Gets a comment by ID. */
  def get(request: Anon_AltCommentIdFields): Request[Comment]
  /** Lists a file's comments. */
  def list(request: Anon_AltFieldsFileIdIncludeDeleted): Request[CommentList]
  /** Updates a comment with patch semantics. */
  def update(request: Anon_AltCommentId): Request[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    create: Anon_AltFieldsFileId => Request[Comment],
    delete: Anon_AltCommentId => Request[Unit],
    get: Anon_AltCommentIdFields => Request[Comment],
    list: Anon_AltFieldsFileIdIncludeDeleted => Request[CommentList],
    update: Anon_AltCommentId => Request[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

