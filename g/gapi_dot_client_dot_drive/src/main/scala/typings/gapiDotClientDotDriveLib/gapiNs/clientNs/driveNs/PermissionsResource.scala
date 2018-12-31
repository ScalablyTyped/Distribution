package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Creates a permission for a file or Team Drive. */
  def create(request: gapiDotClientDotDriveLib.Anon_FileIdSendNotificationEmail): gapiDotClientLib.gapiNs.clientNs.Request[Permission]
  /** Deletes a permission. */
  def delete(request: gapiDotClientDotDriveLib.Anon_FileIdPermissionId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a permission by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_FileIdPermissionId): gapiDotClientLib.gapiNs.clientNs.Request[Permission]
  /** Lists a file's or Team Drive's permissions. */
  def list(request: gapiDotClientDotDriveLib.Anon_FileIdPageSizePrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[PermissionList]
  /** Updates a permission with patch semantics. */
  def update(request: gapiDotClientDotDriveLib.Anon_FileIdPermissionIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Permission]
}

