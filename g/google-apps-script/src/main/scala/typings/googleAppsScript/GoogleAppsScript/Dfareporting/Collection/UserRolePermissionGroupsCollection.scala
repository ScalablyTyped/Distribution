package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserRolePermissionGroup
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserRolePermissionGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionGroupsCollection extends js.Object {
  // Gets one user role permission group by ID.
  def get(profileId: String, id: String): UserRolePermissionGroup
  // Gets a list of all supported user role permission groups.
  def list(profileId: String): UserRolePermissionGroupsListResponse
}

object UserRolePermissionGroupsCollection {
  @scala.inline
  def apply(
    get: (String, String) => UserRolePermissionGroup,
    list: String => UserRolePermissionGroupsListResponse
  ): UserRolePermissionGroupsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserRolePermissionGroupsCollection]
  }
}

