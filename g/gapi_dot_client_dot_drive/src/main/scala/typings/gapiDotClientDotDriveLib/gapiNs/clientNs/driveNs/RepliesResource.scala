package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepliesResource extends js.Object {
  /** Creates a new reply to a comment. */
  def create(request: gapiDotClientDotDriveLib.Anon_AltCommentId): gapiDotClientLib.gapiNs.clientNs.Request[Reply]
  /** Deletes a reply. */
  def delete(request: gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a reply by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileIdIncludeDeleted): gapiDotClientLib.gapiNs.clientNs.Request[Reply]
  /** Lists a comment's replies. */
  def list(request: gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileIdIncludeDeletedKey): gapiDotClientLib.gapiNs.clientNs.Request[ReplyList]
  /** Updates a reply with patch semantics. */
  def update(request: gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileId): gapiDotClientLib.gapiNs.clientNs.Request[Reply]
}

object RepliesResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotDriveLib.Anon_AltCommentId => gapiDotClientLib.gapiNs.clientNs.Request[Reply],
    delete: gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileIdIncludeDeleted => gapiDotClientLib.gapiNs.clientNs.Request[Reply],
    list: gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileIdIncludeDeletedKey => gapiDotClientLib.gapiNs.clientNs.Request[ReplyList],
    update: gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileId => gapiDotClientLib.gapiNs.clientNs.Request[Reply]
  ): RepliesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RepliesResource]
  }
}

