package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanAddChildrenCanChangeTeamDriveBackground extends js.Object {
  /** Whether the current user can add children to folders in this Team Drive. */
  var canAddChildren: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can change the background of this Team Drive. */
  var canChangeTeamDriveBackground: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can comment on files in this Team Drive. */
  var canComment: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can copy files in this Team Drive. */
  var canCopy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the current user can delete this Team Drive. Attempting to delete the Team Drive may still fail if there are untrashed items inside the Team
    * Drive.
    */
  var canDeleteTeamDrive: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can download files in this Team Drive. */
  var canDownload: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can edit files in this Team Drive */
  var canEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can list the children of folders in this Team Drive. */
  var canListChildren: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can add members to this Team Drive or remove them or change their role. */
  var canManageMembers: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can read the revisions resource of files in this Team Drive. */
  var canReadRevisions: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can remove children from folders in this Team Drive. */
  var canRemoveChildren: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can rename files or folders in this Team Drive. */
  var canRename: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can rename this Team Drive. */
  var canRenameTeamDrive: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can share files or folders in this Team Drive. */
  var canShare: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CanAddChildrenCanChangeTeamDriveBackground {
  @scala.inline
  def apply(
    canAddChildren: js.UndefOr[scala.Boolean] = js.undefined,
    canChangeTeamDriveBackground: js.UndefOr[scala.Boolean] = js.undefined,
    canComment: js.UndefOr[scala.Boolean] = js.undefined,
    canCopy: js.UndefOr[scala.Boolean] = js.undefined,
    canDeleteTeamDrive: js.UndefOr[scala.Boolean] = js.undefined,
    canDownload: js.UndefOr[scala.Boolean] = js.undefined,
    canEdit: js.UndefOr[scala.Boolean] = js.undefined,
    canListChildren: js.UndefOr[scala.Boolean] = js.undefined,
    canManageMembers: js.UndefOr[scala.Boolean] = js.undefined,
    canReadRevisions: js.UndefOr[scala.Boolean] = js.undefined,
    canRemoveChildren: js.UndefOr[scala.Boolean] = js.undefined,
    canRename: js.UndefOr[scala.Boolean] = js.undefined,
    canRenameTeamDrive: js.UndefOr[scala.Boolean] = js.undefined,
    canShare: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CanAddChildrenCanChangeTeamDriveBackground = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canAddChildren)) __obj.updateDynamic("canAddChildren")(canAddChildren)
    if (!js.isUndefined(canChangeTeamDriveBackground)) __obj.updateDynamic("canChangeTeamDriveBackground")(canChangeTeamDriveBackground)
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment)
    if (!js.isUndefined(canCopy)) __obj.updateDynamic("canCopy")(canCopy)
    if (!js.isUndefined(canDeleteTeamDrive)) __obj.updateDynamic("canDeleteTeamDrive")(canDeleteTeamDrive)
    if (!js.isUndefined(canDownload)) __obj.updateDynamic("canDownload")(canDownload)
    if (!js.isUndefined(canEdit)) __obj.updateDynamic("canEdit")(canEdit)
    if (!js.isUndefined(canListChildren)) __obj.updateDynamic("canListChildren")(canListChildren)
    if (!js.isUndefined(canManageMembers)) __obj.updateDynamic("canManageMembers")(canManageMembers)
    if (!js.isUndefined(canReadRevisions)) __obj.updateDynamic("canReadRevisions")(canReadRevisions)
    if (!js.isUndefined(canRemoveChildren)) __obj.updateDynamic("canRemoveChildren")(canRemoveChildren)
    if (!js.isUndefined(canRename)) __obj.updateDynamic("canRename")(canRename)
    if (!js.isUndefined(canRenameTeamDrive)) __obj.updateDynamic("canRenameTeamDrive")(canRenameTeamDrive)
    if (!js.isUndefined(canShare)) __obj.updateDynamic("canShare")(canShare)
    __obj.asInstanceOf[Anon_CanAddChildrenCanChangeTeamDriveBackground]
  }
}

