package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionTeamDrivePermissionDetails extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
  var inherited: js.UndefOr[Boolean] = js.undefined
  var inheritedFrom: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var teamDrivePermissionType: js.UndefOr[String] = js.undefined
}

object PermissionTeamDrivePermissionDetails {
  @scala.inline
  def apply(
    additionalRoles: js.Array[String] = null,
    inherited: js.UndefOr[Boolean] = js.undefined,
    inheritedFrom: String = null,
    role: String = null,
    teamDrivePermissionType: String = null
  ): PermissionTeamDrivePermissionDetails = {
    val __obj = js.Dynamic.literal()
    if (additionalRoles != null) __obj.updateDynamic("additionalRoles")(additionalRoles.asInstanceOf[js.Any])
    if (!js.isUndefined(inherited)) __obj.updateDynamic("inherited")(inherited.get.asInstanceOf[js.Any])
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (teamDrivePermissionType != null) __obj.updateDynamic("teamDrivePermissionType")(teamDrivePermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionTeamDrivePermissionDetails]
  }
}

