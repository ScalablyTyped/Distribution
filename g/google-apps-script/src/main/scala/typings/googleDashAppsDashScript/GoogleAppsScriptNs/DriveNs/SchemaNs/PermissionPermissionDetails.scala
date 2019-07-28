package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionPermissionDetails extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
  var inherited: js.UndefOr[Boolean] = js.undefined
  var inheritedFrom: js.UndefOr[String] = js.undefined
  var permissionType: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object PermissionPermissionDetails {
  @scala.inline
  def apply(
    additionalRoles: js.Array[String] = null,
    inherited: js.UndefOr[Boolean] = js.undefined,
    inheritedFrom: String = null,
    permissionType: String = null,
    role: String = null
  ): PermissionPermissionDetails = {
    val __obj = js.Dynamic.literal()
    if (additionalRoles != null) __obj.updateDynamic("additionalRoles")(additionalRoles)
    if (!js.isUndefined(inherited)) __obj.updateDynamic("inherited")(inherited)
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom)
    if (permissionType != null) __obj.updateDynamic("permissionType")(permissionType)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[PermissionPermissionDetails]
  }
}

