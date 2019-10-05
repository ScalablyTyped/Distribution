package typings.gapiDotClientDotDrive.gapi.client.drive

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDrive.Anon_AltCommentId
import typings.gapiDotClientDotDrive.Anon_AltCommentIdFieldsFileId
import typings.gapiDotClientDotDrive.Anon_AltCommentIdFieldsFileIdIncludeDeleted
import typings.gapiDotClientDotDrive.Anon_AltCommentIdFieldsFileIdIncludeDeletedKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepliesResource extends js.Object {
  /** Creates a new reply to a comment. */
  def create(request: Anon_AltCommentId): Request[Reply]
  /** Deletes a reply. */
  def delete(request: Anon_AltCommentIdFieldsFileId): Request[Unit]
  /** Gets a reply by ID. */
  def get(request: Anon_AltCommentIdFieldsFileIdIncludeDeleted): Request[Reply]
  /** Lists a comment's replies. */
  def list(request: Anon_AltCommentIdFieldsFileIdIncludeDeletedKey): Request[ReplyList]
  /** Updates a reply with patch semantics. */
  def update(request: Anon_AltCommentIdFieldsFileId): Request[Reply]
}

object RepliesResource {
  @scala.inline
  def apply(
    create: Anon_AltCommentId => Request[Reply],
    delete: Anon_AltCommentIdFieldsFileId => Request[Unit],
    get: Anon_AltCommentIdFieldsFileIdIncludeDeleted => Request[Reply],
    list: Anon_AltCommentIdFieldsFileIdIncludeDeletedKey => Request[ReplyList],
    update: Anon_AltCommentIdFieldsFileId => Request[Reply]
  ): RepliesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RepliesResource]
  }
}

