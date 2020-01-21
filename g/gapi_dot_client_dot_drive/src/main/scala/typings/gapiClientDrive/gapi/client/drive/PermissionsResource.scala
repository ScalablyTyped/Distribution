package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonAltEmailMessage
import typings.gapiClientDrive.AnonAltFieldsFileIdKeyOauthtoken
import typings.gapiClientDrive.AnonAltFieldsFileIdKeyOauthtokenPageSize
import typings.gapiClientDrive.AnonAltFieldsFileIdKeyOauthtokenPermissionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Creates a permission for a file or Team Drive. */
  def create(request: AnonAltEmailMessage): Request_[Permission]
  /** Deletes a permission. */
  def delete(request: AnonAltFieldsFileIdKeyOauthtoken): Request_[Unit]
  /** Gets a permission by ID. */
  def get(request: AnonAltFieldsFileIdKeyOauthtoken): Request_[Permission]
  /** Lists a file's or Team Drive's permissions. */
  def list(request: AnonAltFieldsFileIdKeyOauthtokenPageSize): Request_[PermissionList]
  /** Updates a permission with patch semantics. */
  def update(request: AnonAltFieldsFileIdKeyOauthtokenPermissionId): Request_[Permission]
}

object PermissionsResource {
  @scala.inline
  def apply(
    create: AnonAltEmailMessage => Request_[Permission],
    delete: AnonAltFieldsFileIdKeyOauthtoken => Request_[Unit],
    get: AnonAltFieldsFileIdKeyOauthtoken => Request_[Permission],
    list: AnonAltFieldsFileIdKeyOauthtokenPageSize => Request_[PermissionList],
    update: AnonAltFieldsFileIdKeyOauthtokenPermissionId => Request_[Permission]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PermissionsResource]
  }
}

