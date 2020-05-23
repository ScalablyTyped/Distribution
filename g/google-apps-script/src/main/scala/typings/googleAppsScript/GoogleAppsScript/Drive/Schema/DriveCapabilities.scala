package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveCapabilities extends js.Object {
  var canAddChildren: js.UndefOr[Boolean] = js.undefined
  var canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.undefined
  var canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
  var canChangeDriveBackground: js.UndefOr[Boolean] = js.undefined
  var canChangeDriveMembersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
  var canComment: js.UndefOr[Boolean] = js.undefined
  var canCopy: js.UndefOr[Boolean] = js.undefined
  var canDeleteChildren: js.UndefOr[Boolean] = js.undefined
  var canDeleteDrive: js.UndefOr[Boolean] = js.undefined
  var canDownload: js.UndefOr[Boolean] = js.undefined
  var canEdit: js.UndefOr[Boolean] = js.undefined
  var canListChildren: js.UndefOr[Boolean] = js.undefined
  var canManageMembers: js.UndefOr[Boolean] = js.undefined
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  var canRename: js.UndefOr[Boolean] = js.undefined
  var canRenameDrive: js.UndefOr[Boolean] = js.undefined
  var canShare: js.UndefOr[Boolean] = js.undefined
  var canTrashChildren: js.UndefOr[Boolean] = js.undefined
}

object DriveCapabilities {
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
  ): DriveCapabilities = {
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
    __obj.asInstanceOf[DriveCapabilities]
  }
}

