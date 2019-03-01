package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Creates a new comment on a file. */
  def create(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileId): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** Deletes a comment. */
  def delete(request: gapiDotClientDotDriveLib.Anon_AltCommentId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a comment by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_AltCommentIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** Lists a file's comments. */
  def list(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdIncludeDeleted): gapiDotClientLib.gapiNs.clientNs.Request[CommentList]
  /** Updates a comment with patch semantics. */
  def update(request: gapiDotClientDotDriveLib.Anon_AltCommentId): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsFileId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Comment]
    ],
    delete: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltCommentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltCommentIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Comment]
    ],
    list: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsFileIdIncludeDeleted, 
      gapiDotClientLib.gapiNs.clientNs.Request[CommentList]
    ],
    update: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltCommentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Comment]
    ]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[CommentsResource]
  }
}

