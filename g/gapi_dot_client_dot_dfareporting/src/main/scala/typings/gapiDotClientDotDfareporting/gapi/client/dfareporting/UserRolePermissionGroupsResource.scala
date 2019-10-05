package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionGroupsResource extends js.Object {
  /** Gets one user role permission group by ID. */
  def get(request: Anon_AltFields): Request[UserRolePermissionGroup]
  /** Gets a list of all supported user role permission groups. */
  def list(request: Anon_AltFieldsKey): Request[UserRolePermissionGroupsListResponse]
}

object UserRolePermissionGroupsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[UserRolePermissionGroup],
    list: Anon_AltFieldsKey => Request[UserRolePermissionGroupsListResponse]
  ): UserRolePermissionGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UserRolePermissionGroupsResource]
  }
}

