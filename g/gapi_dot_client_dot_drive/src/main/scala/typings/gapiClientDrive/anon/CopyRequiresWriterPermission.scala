package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyRequiresWriterPermission extends js.Object {
  /** Whether administrative privileges on this Team Drive are required to modify restrictions. */
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.native
  /**
    * Whether the options to copy, print, or download files inside this Team Drive, should be disabled for readers and commenters. When this restriction is
    * set to true, it will override the similarly named field to true for any file inside this Team Drive.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  /**
    * Whether access to this Team Drive and items inside this Team Drive is restricted to users of the domain to which this Team Drive belongs. This
    * restriction may be overridden by other sharing policies controlled outside of this Team Drive.
    */
  var domainUsersOnly: js.UndefOr[Boolean] = js.native
  /** Whether access to items inside this Team Drive is restricted to members of this Team Drive. */
  var teamMembersOnly: js.UndefOr[Boolean] = js.native
}

object CopyRequiresWriterPermission {
  @scala.inline
  def apply(): CopyRequiresWriterPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyRequiresWriterPermission]
  }
  @scala.inline
  implicit class CopyRequiresWriterPermissionOps[Self <: CopyRequiresWriterPermission] (val x: Self) extends AnyVal {
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

