package typings.gapiDotClientDotDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanAddChildren extends js.Object {
  /** Whether the current user can add children to this folder. This is always false when the item is not a folder. */
  var canAddChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can change whether viewers can copy the contents of this file. */
  var canChangeViewersCanCopyContent: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can comment on this file. */
  var canComment: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can copy this file. For a Team Drive item, whether the current user can copy non-folder descendants of this item, or this item
    * itself if it is not a folder.
    */
  var canCopy: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can delete this file. */
  var canDelete: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can download this file. */
  var canDownload: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can edit this file. */
  var canEdit: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can list the children of this folder. This is always false when the item is not a folder. */
  var canListChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can move this item into a Team Drive. If the item is in a Team Drive, this field is equivalent to canMoveTeamDriveItem. */
  var canMoveItemIntoTeamDrive: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can move this Team Drive item by changing its parent. Note that a request to change the parent for this item may still fail
    * depending on the new parent that is being added. Only populated for Team Drive files.
    */
  var canMoveTeamDriveItem: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can read the revisions resource of this file. For a Team Drive item, whether revisions of non-folder descendants of this item,
    * or this item itself if it is not a folder, can be read.
    */
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can read the Team Drive to which this file belongs. Only populated for Team Drive files. */
  var canReadTeamDrive: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can remove children from this folder. This is always false when the item is not a folder. */
  var canRemoveChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can rename this file. */
  var canRename: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can modify the sharing settings for this file. */
  var canShare: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can move this file to trash. */
  var canTrash: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can restore this file from trash. */
  var canUntrash: js.UndefOr[Boolean] = js.undefined
}

object Anon_CanAddChildren {
  @scala.inline
  def apply(
    canAddChildren: js.UndefOr[Boolean] = js.undefined,
    canChangeViewersCanCopyContent: js.UndefOr[Boolean] = js.undefined,
    canComment: js.UndefOr[Boolean] = js.undefined,
    canCopy: js.UndefOr[Boolean] = js.undefined,
    canDelete: js.UndefOr[Boolean] = js.undefined,
    canDownload: js.UndefOr[Boolean] = js.undefined,
    canEdit: js.UndefOr[Boolean] = js.undefined,
    canListChildren: js.UndefOr[Boolean] = js.undefined,
    canMoveItemIntoTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canMoveTeamDriveItem: js.UndefOr[Boolean] = js.undefined,
    canReadRevisions: js.UndefOr[Boolean] = js.undefined,
    canReadTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canRemoveChildren: js.UndefOr[Boolean] = js.undefined,
    canRename: js.UndefOr[Boolean] = js.undefined,
    canShare: js.UndefOr[Boolean] = js.undefined,
    canTrash: js.UndefOr[Boolean] = js.undefined,
    canUntrash: js.UndefOr[Boolean] = js.undefined
  ): Anon_CanAddChildren = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canAddChildren)) __obj.updateDynamic("canAddChildren")(canAddChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeViewersCanCopyContent)) __obj.updateDynamic("canChangeViewersCanCopyContent")(canChangeViewersCanCopyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment.asInstanceOf[js.Any])
    if (!js.isUndefined(canCopy)) __obj.updateDynamic("canCopy")(canCopy.asInstanceOf[js.Any])
    if (!js.isUndefined(canDelete)) __obj.updateDynamic("canDelete")(canDelete.asInstanceOf[js.Any])
    if (!js.isUndefined(canDownload)) __obj.updateDynamic("canDownload")(canDownload.asInstanceOf[js.Any])
    if (!js.isUndefined(canEdit)) __obj.updateDynamic("canEdit")(canEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(canListChildren)) __obj.updateDynamic("canListChildren")(canListChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveItemIntoTeamDrive)) __obj.updateDynamic("canMoveItemIntoTeamDrive")(canMoveItemIntoTeamDrive.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveTeamDriveItem)) __obj.updateDynamic("canMoveTeamDriveItem")(canMoveTeamDriveItem.asInstanceOf[js.Any])
    if (!js.isUndefined(canReadRevisions)) __obj.updateDynamic("canReadRevisions")(canReadRevisions.asInstanceOf[js.Any])
    if (!js.isUndefined(canReadTeamDrive)) __obj.updateDynamic("canReadTeamDrive")(canReadTeamDrive.asInstanceOf[js.Any])
    if (!js.isUndefined(canRemoveChildren)) __obj.updateDynamic("canRemoveChildren")(canRemoveChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(canRename)) __obj.updateDynamic("canRename")(canRename.asInstanceOf[js.Any])
    if (!js.isUndefined(canShare)) __obj.updateDynamic("canShare")(canShare.asInstanceOf[js.Any])
    if (!js.isUndefined(canTrash)) __obj.updateDynamic("canTrash")(canTrash.asInstanceOf[js.Any])
    if (!js.isUndefined(canUntrash)) __obj.updateDynamic("canUntrash")(canUntrash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CanAddChildren]
  }
}

