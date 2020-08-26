package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamDriveRestrictions extends js.Object {
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.native
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  var domainUsersOnly: js.UndefOr[Boolean] = js.native
  var teamMembersOnly: js.UndefOr[Boolean] = js.native
}

object TeamDriveRestrictions {
  @scala.inline
  def apply(): TeamDriveRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamDriveRestrictions]
  }
  @scala.inline
  implicit class TeamDriveRestrictionsOps[Self <: TeamDriveRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdminManagedRestrictions(value: Boolean): Self = this.set("adminManagedRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminManagedRestrictions: Self = this.set("adminManagedRestrictions", js.undefined)
    @scala.inline
    def setCopyRequiresWriterPermission(value: Boolean): Self = this.set("copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyRequiresWriterPermission: Self = this.set("copyRequiresWriterPermission", js.undefined)
    @scala.inline
    def setDomainUsersOnly(value: Boolean): Self = this.set("domainUsersOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainUsersOnly: Self = this.set("domainUsersOnly", js.undefined)
    @scala.inline
    def setTeamMembersOnly(value: Boolean): Self = this.set("teamMembersOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamMembersOnly: Self = this.set("teamMembersOnly", js.undefined)
  }
  
}

