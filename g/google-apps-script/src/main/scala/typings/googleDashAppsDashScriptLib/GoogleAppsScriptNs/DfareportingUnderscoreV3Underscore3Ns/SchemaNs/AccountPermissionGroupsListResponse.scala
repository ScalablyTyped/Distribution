package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroupsListResponse extends js.Object {
  var accountPermissionGroups: js.UndefOr[js.Array[AccountPermissionGroup]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AccountPermissionGroupsListResponse {
  @scala.inline
  def apply(accountPermissionGroups: js.Array[AccountPermissionGroup] = null, kind: java.lang.String = null): AccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountPermissionGroups != null) __obj.updateDynamic("accountPermissionGroups")(accountPermissionGroups)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountPermissionGroupsListResponse]
  }
}

