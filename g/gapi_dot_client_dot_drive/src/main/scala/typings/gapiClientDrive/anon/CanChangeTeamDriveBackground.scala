package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanChangeTeamDriveBackground extends js.Object {
  /** Whether the current user can add children to folders in this Team Drive. */
  var canAddChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can change the background of this Team Drive. */
  var canChangeTeamDriveBackground: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can comment on files in this Team Drive. */
  var canComment: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can copy files in this Team Drive. */
  var canCopy: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can delete this Team Drive. Attempting to delete the Team Drive may still fail if there are untrashed items inside the Team
    * Drive.
    */
  var canDeleteTeamDrive: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can download files in this Team Drive. */
  var canDownload: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can edit files in this Team Drive */
  var canEdit: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can list the children of folders in this Team Drive. */
  var canListChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can add members to this Team Drive or remove them or change their role. */
  var canManageMembers: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can read the revisions resource of files in this Team Drive. */
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can remove children from folders in this Team Drive. */
  var canRemoveChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can rename files or folders in this Team Drive. */
  var canRename: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can rename this Team Drive. */
  var canRenameTeamDrive: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can share files or folders in this Team Drive. */
  var canShare: js.UndefOr[Boolean] = js.undefined
}

object CanChangeTeamDriveBackground {
  @scala.inline
  def apply(
    canAddChildren: js.UndefOr[Boolean] = js.undefined,
    canChangeTeamDriveBackground: js.UndefOr[Boolean] = js.undefined,
    canComment: js.UndefOr[Boolean] = js.undefined,
    canCopy: js.UndefOr[Boolean] = js.undefined,
    canDeleteTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canDownload: js.UndefOr[Boolean] = js.undefined,
    canEdit: js.UndefOr[Boolean] = js.undefined,
    canListChildren: js.UndefOr[Boolean] = js.undefined,
    canManageMembers: js.UndefOr[Boolean] = js.undefined,
    canReadRevisions: js.UndefOr[Boolean] = js.undefined,
    canRemoveChildren: js.UndefOr[Boolean] = js.undefined,
    canRename: js.UndefOr[Boolean] = js.undefined,
    canRenameTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canShare: js.UndefOr[Boolean] = js.undefined
  ): CanChangeTeamDriveBackground = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canAddChildren)) __obj.updateDynamic("canAddChildren")(canAddChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeTeamDriveBackground)) __obj.updateDynamic("canChangeTeamDriveBackground")(canChangeTeamDriveBackground.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canCopy)) __obj.updateDynamic("canCopy")(canCopy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canDeleteTeamDrive)) __obj.updateDynamic("canDeleteTeamDrive")(canDeleteTeamDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canDownload)) __obj.updateDynamic("canDownload")(canDownload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canEdit)) __obj.updateDynamic("canEdit")(canEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canListChildren)) __obj.updateDynamic("canListChildren")(canListChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canManageMembers)) __obj.updateDynamic("canManageMembers")(canManageMembers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canReadRevisions)) __obj.updateDynamic("canReadRevisions")(canReadRevisions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canRemoveChildren)) __obj.updateDynamic("canRemoveChildren")(canRemoveChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canRename)) __obj.updateDynamic("canRename")(canRename.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canRenameTeamDrive)) __obj.updateDynamic("canRenameTeamDrive")(canRenameTeamDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canShare)) __obj.updateDynamic("canShare")(canShare.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanChangeTeamDriveBackground]
  }
}

