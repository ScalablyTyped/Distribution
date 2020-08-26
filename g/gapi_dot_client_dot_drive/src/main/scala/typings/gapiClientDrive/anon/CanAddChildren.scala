package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanAddChildren extends js.Object {
  /** Whether the current user can add children to folders in this shared drive. */
  var canAddChildren: js.UndefOr[Boolean] = js.native
  /** Whether the current user can change the copyRequiresWriterPermission restriction of this shared drive. */
  var canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.native
  /** Whether the current user can change the domainUsersOnly restriction of this shared drive. */
  var canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.native
  /** Whether the current user can change the background of this shared drive. */
  var canChangeDriveBackground: js.UndefOr[Boolean] = js.native
  /** Whether the current user can change the driveMembersOnly restriction of this shared drive. */
  var canChangeDriveMembersOnlyRestriction: js.UndefOr[Boolean] = js.native
  /** Whether the current user can comment on files in this shared drive. */
  var canComment: js.UndefOr[Boolean] = js.native
  /** Whether the current user can copy files in this shared drive. */
  var canCopy: js.UndefOr[Boolean] = js.native
  /** Whether the current user can delete children from folders in this shared drive. */
  var canDeleteChildren: js.UndefOr[Boolean] = js.native
  /**
    * Whether the current user can delete this shared drive. Attempting to delete the shared drive may still fail if there are untrashed items inside the
    * shared drive.
    */
  var canDeleteDrive: js.UndefOr[Boolean] = js.native
  /** Whether the current user can download files in this shared drive. */
  var canDownload: js.UndefOr[Boolean] = js.native
  /** Whether the current user can edit files in this shared drive */
  var canEdit: js.UndefOr[Boolean] = js.native
  /** Whether the current user can list the children of folders in this shared drive. */
  var canListChildren: js.UndefOr[Boolean] = js.native
  /** Whether the current user can add members to this shared drive or remove them or change their role. */
  var canManageMembers: js.UndefOr[Boolean] = js.native
  /** Whether the current user can read the revisions resource of files in this shared drive. */
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  /** Whether the current user can rename files or folders in this shared drive. */
  var canRename: js.UndefOr[Boolean] = js.native
  /** Whether the current user can rename this shared drive. */
  var canRenameDrive: js.UndefOr[Boolean] = js.native
  /** Whether the current user can share files or folders in this shared drive. */
  var canShare: js.UndefOr[Boolean] = js.native
  /** Whether the current user can trash children from folders in this shared drive. */
  var canTrashChildren: js.UndefOr[Boolean] = js.native
}

object CanAddChildren {
  @scala.inline
  def apply(): CanAddChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanAddChildren]
  }
  @scala.inline
  implicit class CanAddChildrenOps[Self <: CanAddChildren] (val x: Self) extends AnyVal {
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

