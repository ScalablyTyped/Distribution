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
    create: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltCommentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Reply]
    ],
    delete: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileIdIncludeDeleted, 
      gapiDotClientLib.gapiNs.clientNs.Request[Reply]
    ],
    list: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileIdIncludeDeletedKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ReplyList]
    ],
    update: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltCommentIdFieldsFileId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Reply]
    ]
  ): RepliesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[RepliesResource]
  }
}

