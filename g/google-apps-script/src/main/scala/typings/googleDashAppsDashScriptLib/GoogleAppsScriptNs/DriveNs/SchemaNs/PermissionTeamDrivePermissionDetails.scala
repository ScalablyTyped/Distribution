package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionTeamDrivePermissionDetails extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var inherited: js.UndefOr[scala.Boolean] = js.undefined
  var inheritedFrom: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var teamDrivePermissionType: js.UndefOr[java.lang.String] = js.undefined
}

object PermissionTeamDrivePermissionDetails {
  @scala.inline
  def apply(
    additionalRoles: js.Array[java.lang.String] = null,
    inherited: js.UndefOr[scala.Boolean] = js.undefined,
    inheritedFrom: java.lang.String = null,
    role: java.lang.String = null,
    teamDrivePermissionType: java.lang.String = null
  ): PermissionTeamDrivePermissionDetails = {
    val __obj = js.Dynamic.literal()
    if (additionalRoles != null) __obj.updateDynamic("additionalRoles")(additionalRoles)
    if (!js.isUndefined(inherited)) __obj.updateDynamic("inherited")(inherited)
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom)
    if (role != null) __obj.updateDynamic("role")(role)
    if (teamDrivePermissionType != null) __obj.updateDynamic("teamDrivePermissionType")(teamDrivePermissionType)
    __obj.asInstanceOf[PermissionTeamDrivePermissionDetails]
  }
}

