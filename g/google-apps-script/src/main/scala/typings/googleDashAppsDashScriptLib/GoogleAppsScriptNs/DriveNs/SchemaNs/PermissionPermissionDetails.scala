package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionPermissionDetails extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var inherited: js.UndefOr[scala.Boolean] = js.undefined
  var inheritedFrom: js.UndefOr[java.lang.String] = js.undefined
  var permissionType: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
}

object PermissionPermissionDetails {
  @scala.inline
  def apply(
    additionalRoles: js.Array[java.lang.String] = null,
    inherited: js.UndefOr[scala.Boolean] = js.undefined,
    inheritedFrom: java.lang.String = null,
    permissionType: java.lang.String = null,
    role: java.lang.String = null
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

