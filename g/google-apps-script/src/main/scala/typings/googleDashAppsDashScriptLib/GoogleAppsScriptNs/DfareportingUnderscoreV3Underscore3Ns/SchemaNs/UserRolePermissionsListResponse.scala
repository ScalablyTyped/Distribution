package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionsListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var userRolePermissions: js.UndefOr[js.Array[UserRolePermission]] = js.undefined
}

object UserRolePermissionsListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, userRolePermissions: js.Array[UserRolePermission] = null): UserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (userRolePermissions != null) __obj.updateDynamic("userRolePermissions")(userRolePermissions)
    __obj.asInstanceOf[UserRolePermissionsListResponse]
  }
}

