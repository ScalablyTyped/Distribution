package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionGroupsResource extends js.Object {
  /** Gets one user role permission group by ID. */
  def get(request: AnonFields): Request_[UserRolePermissionGroup]
  /** Gets a list of all supported user role permission groups. */
  def list(request: AnonKey): Request_[UserRolePermissionGroupsListResponse]
}

object UserRolePermissionGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[UserRolePermissionGroup],
    list: AnonKey => Request_[UserRolePermissionGroupsListResponse]
  ): UserRolePermissionGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserRolePermissionGroupsResource]
  }
}

