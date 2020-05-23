package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.EmailMessage
import typings.gapiClientDrive.anon.PageSize
import typings.gapiClientDrive.anon.PermissionId
import typings.gapiClientDrive.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Creates a permission for a file or Team Drive. */
  def create(request: EmailMessage): Request[Permission]
  /** Deletes a permission. */
  def delete(request: PermissionId): Request[Unit]
  /** Gets a permission by ID. */
  def get(request: PermissionId): Request[Permission]
  /** Lists a file's or Team Drive's permissions. */
  def list(request: PageSize): Request[PermissionList]
  /** Updates a permission with patch semantics. */
  def update(request: QuotaUser): Request[Permission]
}

object PermissionsResource {
  @scala.inline
  def apply(
    create: EmailMessage => Request[Permission],
    delete: PermissionId => Request[Unit],
    get: PermissionId => Request[Permission],
    list: PageSize => Request[PermissionList],
    update: QuotaUser => Request[Permission]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PermissionsResource]
  }
}

