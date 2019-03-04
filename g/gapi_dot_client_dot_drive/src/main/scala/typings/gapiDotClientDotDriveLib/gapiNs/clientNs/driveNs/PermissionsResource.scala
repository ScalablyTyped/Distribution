package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Creates a permission for a file or Team Drive. */
  def create(request: gapiDotClientDotDriveLib.Anon_AltEmailMessage): gapiDotClientLib.gapiNs.clientNs.Request[Permission]
  /** Deletes a permission. */
  def delete(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a permission by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Permission]
  /** Lists a file's or Team Drive's permissions. */
  def list(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPageSize): gapiDotClientLib.gapiNs.clientNs.Request[PermissionList]
  /** Updates a permission with patch semantics. */
  def update(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPermissionId): gapiDotClientLib.gapiNs.clientNs.Request[Permission]
}

object PermissionsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltEmailMessage, 
      gapiDotClientLib.gapiNs.clientNs.Request[Permission]
    ],
    delete: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Permission]
    ],
    list: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPageSize, 
      gapiDotClientLib.gapiNs.clientNs.Request[PermissionList]
    ],
    update: js.Function1[
      gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPermissionId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Permission]
    ]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list, update = update)
  
    __obj.asInstanceOf[PermissionsResource]
  }
}

