package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommentsResource extends js.Object {
  /** Creates a new comment on a file. */
  def create(request: gapiDotClientDotDriveLib.Anon_FileId): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** Deletes a comment. */
  def delete(request: gapiDotClientDotDriveLib.Anon_FileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a comment by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_FileIdPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** Lists a file's comments. */
  def list(request: gapiDotClientDotDriveLib.Anon_FileIdPageSize): gapiDotClientLib.gapiNs.clientNs.Request[CommentList]
  /** Updates a comment with patch semantics. */
  def update(request: gapiDotClientDotDriveLib.Anon_FileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
}

