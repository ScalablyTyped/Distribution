package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDriveRestrictions extends js.Object {
  var adminManagedRestrictions: js.UndefOr[scala.Boolean] = js.undefined
  var copyRequiresWriterPermission: js.UndefOr[scala.Boolean] = js.undefined
  var domainUsersOnly: js.UndefOr[scala.Boolean] = js.undefined
  var teamMembersOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object TeamDriveRestrictions {
  @scala.inline
  def apply(
    adminManagedRestrictions: js.UndefOr[scala.Boolean] = js.undefined,
    copyRequiresWriterPermission: js.UndefOr[scala.Boolean] = js.undefined,
    domainUsersOnly: js.UndefOr[scala.Boolean] = js.undefined,
    teamMembersOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): TeamDriveRestrictions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adminManagedRestrictions)) __obj.updateDynamic("adminManagedRestrictions")(adminManagedRestrictions)
    if (!js.isUndefined(copyRequiresWriterPermission)) __obj.updateDynamic("copyRequiresWriterPermission")(copyRequiresWriterPermission)
    if (!js.isUndefined(domainUsersOnly)) __obj.updateDynamic("domainUsersOnly")(domainUsersOnly)
    if (!js.isUndefined(teamMembersOnly)) __obj.updateDynamic("teamMembersOnly")(teamMembersOnly)
    __obj.asInstanceOf[TeamDriveRestrictions]
  }
}

