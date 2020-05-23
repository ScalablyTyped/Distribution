package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var isSuperAdminRole: js.UndefOr[Boolean] = js.undefined
  var isSystemRole: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var roleDescription: js.UndefOr[String] = js.undefined
  var roleId: js.UndefOr[String] = js.undefined
  var roleName: js.UndefOr[String] = js.undefined
  var rolePrivileges: js.UndefOr[js.Array[RoleRolePrivileges]] = js.undefined
}

object Role {
  @scala.inline
  def apply(
    etag: String = null,
    isSuperAdminRole: js.UndefOr[Boolean] = js.undefined,
    isSystemRole: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    roleDescription: String = null,
    roleId: String = null,
    roleName: String = null,
    rolePrivileges: js.Array[RoleRolePrivileges] = null
  ): Role = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(isSuperAdminRole)) __obj.updateDynamic("isSuperAdminRole")(isSuperAdminRole.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSystemRole)) __obj.updateDynamic("isSystemRole")(isSystemRole.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (roleDescription != null) __obj.updateDynamic("roleDescription")(roleDescription.asInstanceOf[js.Any])
    if (roleId != null) __obj.updateDynamic("roleId")(roleId.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    if (rolePrivileges != null) __obj.updateDynamic("rolePrivileges")(rolePrivileges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
}

