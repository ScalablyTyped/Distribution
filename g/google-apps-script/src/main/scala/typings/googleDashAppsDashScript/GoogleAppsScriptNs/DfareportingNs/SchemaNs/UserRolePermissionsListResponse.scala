package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var userRolePermissions: js.UndefOr[js.Array[UserRolePermission]] = js.undefined
}

object UserRolePermissionsListResponse {
  @scala.inline
  def apply(kind: String = null, userRolePermissions: js.Array[UserRolePermission] = null): UserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (userRolePermissions != null) __obj.updateDynamic("userRolePermissions")(userRolePermissions)
    __obj.asInstanceOf[UserRolePermissionsListResponse]
  }
}

