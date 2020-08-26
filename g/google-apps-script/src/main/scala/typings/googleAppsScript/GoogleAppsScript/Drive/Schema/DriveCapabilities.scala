package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveCapabilities extends js.Object {
  var canAddChildren: js.UndefOr[Boolean] = js.native
  var canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.native
  var canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.native
  var canChangeDriveBackground: js.UndefOr[Boolean] = js.native
  var canChangeDriveMembersOnlyRestriction: js.UndefOr[Boolean] = js.native
  var canComment: js.UndefOr[Boolean] = js.native
  var canCopy: js.UndefOr[Boolean] = js.native
  var canDeleteChildren: js.UndefOr[Boolean] = js.native
  var canDeleteDrive: js.UndefOr[Boolean] = js.native
  var canDownload: js.UndefOr[Boolean] = js.native
  var canEdit: js.UndefOr[Boolean] = js.native
  var canListChildren: js.UndefOr[Boolean] = js.native
  var canManageMembers: js.UndefOr[Boolean] = js.native
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  var canRename: js.UndefOr[Boolean] = js.native
  var canRenameDrive: js.UndefOr[Boolean] = js.native
  var canShare: js.UndefOr[Boolean] = js.native
  var canTrashChildren: js.UndefOr[Boolean] = js.native
}

object DriveCapabilities {
  @scala.inline
  def apply(): DriveCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveCapabilities]
  }
  @scala.inline
  implicit class DriveCapabilitiesOps[Self <: DriveCapabilities] (val x: Self) extends AnyVal {
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
    def setCanAddChildren(value: Boolean): Self = this.set("canAddChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanAddChildren: Self = this.set("canAddChildren", js.undefined)
    @scala.inline
    def setCanChangeCopyRequiresWriterPermissionRestriction(value: Boolean): Self = this.set("canChangeCopyRequiresWriterPermissionRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanChangeCopyRequiresWriterPermissionRestriction: Self = this.set("canChangeCopyRequiresWriterPermissionRestriction", js.undefined)
    @scala.inline
    def setCanChangeDomainUsersOnlyRestriction(value: Boolean): Self = this.set("canChangeDomainUsersOnlyRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanChangeDomainUsersOnlyRestriction: Self = this.set("canChangeDomainUsersOnlyRestriction", js.undefined)
    @scala.inline
    def setCanChangeDriveBackground(value: Boolean): Self = this.set("canChangeDriveBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanChangeDriveBackground: Self = this.set("canChangeDriveBackground", js.undefined)
    @scala.inline
    def setCanChangeDriveMembersOnlyRestriction(value: Boolean): Self = this.set("canChangeDriveMembersOnlyRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanChangeDriveMembersOnlyRestriction: Self = this.set("canChangeDriveMembersOnlyRestriction", js.undefined)
    @scala.inline
    def setCanComment(value: Boolean): Self = this.set("canComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanComment: Self = this.set("canComment", js.undefined)
    @scala.inline
    def setCanCopy(value: Boolean): Self = this.set("canCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanCopy: Self = this.set("canCopy", js.undefined)
    @scala.inline
    def setCanDeleteChildren(value: Boolean): Self = this.set("canDeleteChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanDeleteChildren: Self = this.set("canDeleteChildren", js.undefined)
    @scala.inline
    def setCanDeleteDrive(value: Boolean): Self = this.set("canDeleteDrive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanDeleteDrive: Self = this.set("canDeleteDrive", js.undefined)
    @scala.inline
    def setCanDownload(value: Boolean): Self = this.set("canDownload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanDownload: Self = this.set("canDownload", js.undefined)
    @scala.inline
    def setCanEdit(value: Boolean): Self = this.set("canEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanEdit: Self = this.set("canEdit", js.undefined)
    @scala.inline
    def setCanListChildren(value: Boolean): Self = this.set("canListChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanListChildren: Self = this.set("canListChildren", js.undefined)
    @scala.inline
    def setCanManageMembers(value: Boolean): Self = this.set("canManageMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanManageMembers: Self = this.set("canManageMembers", js.undefined)
    @scala.inline
    def setCanReadRevisions(value: Boolean): Self = this.set("canReadRevisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanReadRevisions: Self = this.set("canReadRevisions", js.undefined)
    @scala.inline
    def setCanRename(value: Boolean): Self = this.set("canRename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanRename: Self = this.set("canRename", js.undefined)
    @scala.inline
    def setCanRenameDrive(value: Boolean): Self = this.set("canRenameDrive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanRenameDrive: Self = this.set("canRenameDrive", js.undefined)
    @scala.inline
    def setCanShare(value: Boolean): Self = this.set("canShare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanShare: Self = this.set("canShare", js.undefined)
    @scala.inline
    def setCanTrashChildren(value: Boolean): Self = this.set("canTrashChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanTrashChildren: Self = this.set("canTrashChildren", js.undefined)
  }
  
}

