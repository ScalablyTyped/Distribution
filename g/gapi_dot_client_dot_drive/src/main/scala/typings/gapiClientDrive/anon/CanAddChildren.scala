package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanAddChildren extends js.Object {
  /** Whether the current user can add children to folders in this shared drive. */
  var canAddChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can change the copyRequiresWriterPermission restriction of this shared drive. */
  var canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can change the domainUsersOnly restriction of this shared drive. */
  var canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can change the background of this shared drive. */
  var canChangeDriveBackground: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can change the driveMembersOnly restriction of this shared drive. */
  var canChangeDriveMembersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can comment on files in this shared drive. */
  var canComment: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can copy files in this shared drive. */
  var canCopy: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can delete children from folders in this shared drive. */
  var canDeleteChildren: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can delete this shared drive. Attempting to delete the shared drive may still fail if there are untrashed items inside the
    * shared drive.
    */
  var canDeleteDrive: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can download files in this shared drive. */
  var canDownload: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can edit files in this shared drive */
  var canEdit: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can list the children of folders in this shared drive. */
  var canListChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can add members to this shared drive or remove them or change their role. */
  var canManageMembers: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can read the revisions resource of files in this shared drive. */
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can rename files or folders in this shared drive. */
  var canRename: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can rename this shared drive. */
  var canRenameDrive: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can share files or folders in this shared drive. */
  var canShare: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can trash children from folders in this shared drive. */
  var canTrashChildren: js.UndefOr[Boolean] = js.undefined
}

object CanAddChildren {
  @scala.inline
  def apply(
    canAddChildren: js.UndefOr[Boolean] = js.undefined,
    canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.undefined,
    canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.undefined,
    canChangeDriveBackground: js.UndefOr[Boolean] = js.undefined,
    canChangeDriveMembersOnlyRestriction: js.UndefOr[Boolean] = js.undefined,
    canComment: js.UndefOr[Boolean] = js.undefined,
    canCopy: js.UndefOr[Boolean] = js.undefined,
    canDeleteChildren: js.UndefOr[Boolean] = js.undefined,
    canDeleteDrive: js.UndefOr[Boolean] = js.undefined,
    canDownload: js.UndefOr[Boolean] = js.undefined,
    canEdit: js.UndefOr[Boolean] = js.undefined,
    canListChildren: js.UndefOr[Boolean] = js.undefined,
    canManageMembers: js.UndefOr[Boolean] = js.undefined,
    canReadRevisions: js.UndefOr[Boolean] = js.undefined,
    canRename: js.UndefOr[Boolean] = js.undefined,
    canRenameDrive: js.UndefOr[Boolean] = js.undefined,
    canShare: js.UndefOr[Boolean] = js.undefined,
    canTrashChildren: js.UndefOr[Boolean] = js.undefined
  ): CanAddChildren = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canAddChildren)) __obj.updateDynamic("canAddChildren")(canAddChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeCopyRequiresWriterPermissionRestriction)) __obj.updateDynamic("canChangeCopyRequiresWriterPermissionRestriction")(canChangeCopyRequiresWriterPermissionRestriction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeDomainUsersOnlyRestriction)) __obj.updateDynamic("canChangeDomainUsersOnlyRestriction")(canChangeDomainUsersOnlyRestriction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeDriveBackground)) __obj.updateDynamic("canChangeDriveBackground")(canChangeDriveBackground.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeDriveMembersOnlyRestriction)) __obj.updateDynamic("canChangeDriveMembersOnlyRestriction")(canChangeDriveMembersOnlyRestriction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canCopy)) __obj.updateDynamic("canCopy")(canCopy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canDeleteChildren)) __obj.updateDynamic("canDeleteChildren")(canDeleteChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canDeleteDrive)) __obj.updateDynamic("canDeleteDrive")(canDeleteDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canDownload)) __obj.updateDynamic("canDownload")(canDownload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canEdit)) __obj.updateDynamic("canEdit")(canEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canListChildren)) __obj.updateDynamic("canListChildren")(canListChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canManageMembers)) __obj.updateDynamic("canManageMembers")(canManageMembers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canReadRevisions)) __obj.updateDynamic("canReadRevisions")(canReadRevisions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canRename)) __obj.updateDynamic("canRename")(canRename.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canRenameDrive)) __obj.updateDynamic("canRenameDrive")(canRenameDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canShare)) __obj.updateDynamic("canShare")(canShare.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canTrashChildren)) __obj.updateDynamic("canTrashChildren")(canTrashChildren.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAddChildren]
  }
}

