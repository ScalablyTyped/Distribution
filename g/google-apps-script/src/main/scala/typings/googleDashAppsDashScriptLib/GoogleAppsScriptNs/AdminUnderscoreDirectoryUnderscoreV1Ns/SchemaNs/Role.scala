package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var isSuperAdminRole: js.UndefOr[scala.Boolean] = js.undefined
  var isSystemRole: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var roleDescription: js.UndefOr[java.lang.String] = js.undefined
  var roleId: js.UndefOr[java.lang.String] = js.undefined
  var roleName: js.UndefOr[java.lang.String] = js.undefined
  var rolePrivileges: js.UndefOr[js.Array[RoleRolePrivileges]] = js.undefined
}

object Role {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    isSuperAdminRole: js.UndefOr[scala.Boolean] = js.undefined,
    isSystemRole: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    roleDescription: java.lang.String = null,
    roleId: java.lang.String = null,
    roleName: java.lang.String = null,
    rolePrivileges: js.Array[RoleRolePrivileges] = null
  ): Role = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (!js.isUndefined(isSuperAdminRole)) __obj.updateDynamic("isSuperAdminRole")(isSuperAdminRole)
    if (!js.isUndefined(isSystemRole)) __obj.updateDynamic("isSystemRole")(isSystemRole)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (roleDescription != null) __obj.updateDynamic("roleDescription")(roleDescription)
    if (roleId != null) __obj.updateDynamic("roleId")(roleId)
    if (roleName != null) __obj.updateDynamic("roleName")(roleName)
    if (rolePrivileges != null) __obj.updateDynamic("rolePrivileges")(rolePrivileges)
    __obj.asInstanceOf[Role]
  }
}

