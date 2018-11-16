package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RepliesResource extends js.Object {
  /** Creates a new reply to a comment. */
  def create(request: gapiDotClientDotDriveLib.Anon_FileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Reply]
  /** Deletes a reply. */
  def delete(request: gapiDotClientDotDriveLib.Anon_FileIdPrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a reply by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_FileIdPrettyPrintQuotaUserKeyUserIpOauthtokenIncludeDeleted): gapiDotClientLib.gapiNs.clientNs.Request[Reply]
  /** Lists a comment's replies. */
  def list(request: gapiDotClientDotDriveLib.Anon_FileIdPageSizePrettyPrintPageTokenQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[ReplyList]
  /** Updates a reply with patch semantics. */
  def update(request: gapiDotClientDotDriveLib.Anon_FileIdPrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Reply]
}

