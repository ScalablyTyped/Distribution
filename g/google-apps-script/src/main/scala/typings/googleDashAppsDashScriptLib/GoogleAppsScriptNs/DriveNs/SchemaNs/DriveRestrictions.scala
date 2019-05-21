package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveRestrictions extends js.Object {
  var adminManagedRestrictions: js.UndefOr[scala.Boolean] = js.undefined
  var copyRequiresWriterPermission: js.UndefOr[scala.Boolean] = js.undefined
  var domainUsersOnly: js.UndefOr[scala.Boolean] = js.undefined
  var driveMembersOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object DriveRestrictions {
  @scala.inline
  def apply(
    adminManagedRestrictions: js.UndefOr[scala.Boolean] = js.undefined,
    copyRequiresWriterPermission: js.UndefOr[scala.Boolean] = js.undefined,
    domainUsersOnly: js.UndefOr[scala.Boolean] = js.undefined,
    driveMembersOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): DriveRestrictions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adminManagedRestrictions)) __obj.updateDynamic("adminManagedRestrictions")(adminManagedRestrictions)
    if (!js.isUndefined(copyRequiresWriterPermission)) __obj.updateDynamic("copyRequiresWriterPermission")(copyRequiresWriterPermission)
    if (!js.isUndefined(domainUsersOnly)) __obj.updateDynamic("domainUsersOnly")(domainUsersOnly)
    if (!js.isUndefined(driveMembersOnly)) __obj.updateDynamic("driveMembersOnly")(driveMembersOnly)
    __obj.asInstanceOf[DriveRestrictions]
  }
}

