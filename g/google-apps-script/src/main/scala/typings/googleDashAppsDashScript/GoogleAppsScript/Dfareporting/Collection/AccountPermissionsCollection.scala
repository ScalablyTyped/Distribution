package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.AccountPermission
import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.AccountPermissionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsCollection extends js.Object {
  // Gets one account permission by ID.
  def get(profileId: String, id: String): AccountPermission
  // Retrieves the list of account permissions.
  def list(profileId: String): AccountPermissionsListResponse
}

object AccountPermissionsCollection {
  @scala.inline
  def apply(get: (String, String) => AccountPermission, list: String => AccountPermissionsListResponse): AccountPermissionsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountPermissionsCollection]
  }
}

