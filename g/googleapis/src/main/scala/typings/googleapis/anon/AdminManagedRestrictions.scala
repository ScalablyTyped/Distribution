package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminManagedRestrictions extends js.Object {
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.native
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  var domainUsersOnly: js.UndefOr[Boolean] = js.native
  var teamMembersOnly: js.UndefOr[Boolean] = js.native
}

object AdminManagedRestrictions {
  @scala.inline
  def apply(
    adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined,
    copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined,
    domainUsersOnly: js.UndefOr[Boolean] = js.undefined,
    teamMembersOnly: js.UndefOr[Boolean] = js.undefined
  ): AdminManagedRestrictions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adminManagedRestrictions)) __obj.updateDynamic("adminManagedRestrictions")(adminManagedRestrictions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(copyRequiresWriterPermission)) __obj.updateDynamic("copyRequiresWriterPermission")(copyRequiresWriterPermission.get.asInstanceOf[js.Any])
    if (!js.isUndefined(domainUsersOnly)) __obj.updateDynamic("domainUsersOnly")(domainUsersOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(teamMembersOnly)) __obj.updateDynamic("teamMembersOnly")(teamMembersOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminManagedRestrictions]
  }
}

