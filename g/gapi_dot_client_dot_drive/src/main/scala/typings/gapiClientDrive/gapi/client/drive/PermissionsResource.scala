package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonEmailMessage
import typings.gapiClientDrive.AnonPageSize
import typings.gapiClientDrive.AnonPermissionId
import typings.gapiClientDrive.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Creates a permission for a file or Team Drive. */
  def create(request: AnonEmailMessage): Request_[Permission]
  /** Deletes a permission. */
  def delete(request: AnonPermissionId): Request_[Unit]
  /** Gets a permission by ID. */
  def get(request: AnonPermissionId): Request_[Permission]
  /** Lists a file's or Team Drive's permissions. */
  def list(request: AnonPageSize): Request_[PermissionList]
  /** Updates a permission with patch semantics. */
  def update(request: AnonQuotaUser): Request_[Permission]
}

object PermissionsResource {
  @scala.inline
  def apply(
    create: AnonEmailMessage => Request_[Permission],
    delete: AnonPermissionId => Request_[Unit],
    get: AnonPermissionId => Request_[Permission],
    list: AnonPageSize => Request_[PermissionList],
    update: AnonQuotaUser => Request_[Permission]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PermissionsResource]
  }
}

