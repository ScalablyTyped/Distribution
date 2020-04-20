package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermissionGroup
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermissionGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroupsCollection extends js.Object {
  // Gets one account permission group by ID.
  def get(profileId: String, id: String): AccountPermissionGroup
  // Retrieves the list of account permission groups.
  def list(profileId: String): AccountPermissionGroupsListResponse
}

object AccountPermissionGroupsCollection {
  @scala.inline
  def apply(
    get: (String, String) => AccountPermissionGroup,
    list: String => AccountPermissionGroupsListResponse
  ): AccountPermissionGroupsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountPermissionGroupsCollection]
  }
}

