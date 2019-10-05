package typings.gapiDotClientDotDrive.gapi.client.drive

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDrive.Anon_AltEmailMessage
import typings.gapiDotClientDotDrive.Anon_AltFieldsFileIdKeyOauthtoken
import typings.gapiDotClientDotDrive.Anon_AltFieldsFileIdKeyOauthtokenPageSize
import typings.gapiDotClientDotDrive.Anon_AltFieldsFileIdKeyOauthtokenPermissionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Creates a permission for a file or Team Drive. */
  def create(request: Anon_AltEmailMessage): Request[Permission]
  /** Deletes a permission. */
  def delete(request: Anon_AltFieldsFileIdKeyOauthtoken): Request[Unit]
  /** Gets a permission by ID. */
  def get(request: Anon_AltFieldsFileIdKeyOauthtoken): Request[Permission]
  /** Lists a file's or Team Drive's permissions. */
  def list(request: Anon_AltFieldsFileIdKeyOauthtokenPageSize): Request[PermissionList]
  /** Updates a permission with patch semantics. */
  def update(request: Anon_AltFieldsFileIdKeyOauthtokenPermissionId): Request[Permission]
}

object PermissionsResource {
  @scala.inline
  def apply(
    create: Anon_AltEmailMessage => Request[Permission],
    delete: Anon_AltFieldsFileIdKeyOauthtoken => Request[Unit],
    get: Anon_AltFieldsFileIdKeyOauthtoken => Request[Permission],
    list: Anon_AltFieldsFileIdKeyOauthtokenPageSize => Request[PermissionList],
    update: Anon_AltFieldsFileIdKeyOauthtokenPermissionId => Request[Permission]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PermissionsResource]
  }
}

