package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsCollection extends js.Object {
  // Gets one account permission by ID.
  def get(profileId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AccountPermission
  // Retrieves the list of account permissions.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AccountPermissionsListResponse
}

object AccountPermissionsCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AccountPermission,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AccountPermissionsListResponse
  ): AccountPermissionsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountPermissionsCollection]
  }
}

