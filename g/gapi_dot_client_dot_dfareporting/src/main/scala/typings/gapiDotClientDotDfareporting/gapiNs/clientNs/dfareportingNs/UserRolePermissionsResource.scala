package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsIdsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionsResource extends js.Object {
  /** Gets one user role permission by ID. */
  def get(request: Anon_AltFields): Request[UserRolePermission]
  /** Gets a list of user role permissions, possibly filtered. */
  def list(request: Anon_AltFieldsIdsKey): Request[UserRolePermissionsListResponse]
}

object UserRolePermissionsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[UserRolePermission],
    list: Anon_AltFieldsIdsKey => Request[UserRolePermissionsListResponse]
  ): UserRolePermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UserRolePermissionsResource]
  }
}

