package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanAddMyDriveParent extends js.Object {
  /** Whether the current user can add children to this folder. This is always false when the item is not a folder. */
  var canAddChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can add a parent for the item without removing an existing parent in the same request. Not populated for shared drive files. */
  var canAddMyDriveParent: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can change the copyRequiresWriterPermission restriction of this file. */
  var canChangeCopyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  /** Deprecated */
  var canChangeViewersCanCopyContent: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can comment on this file. */
  var canComment: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can copy this file. For an item in a shared drive, whether the current user can copy non-folder descendants of this item, or
    * this item itself if it is not a folder.
    */
  var canCopy: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can delete this file. */
  var canDelete: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can delete children of this folder. This is false when the item is not a folder. Only populated for items in shared drives. */
  var canDeleteChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can download this file. */
  var canDownload: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can edit this file. Other factors may limit the type of changes a user can make to a file. For example, see
    * canChangeCopyRequiresWriterPermission or canModifyContent.
    */
  var canEdit: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can list the children of this folder. This is always false when the item is not a folder. */
  var canListChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can modify the content of this file. */
  var canModifyContent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can move children of this folder outside of the shared drive. This is false when the item is not a folder. Only populated for
    * items in shared drives.
    */
  var canMoveChildrenOutOfDrive: js.UndefOr[Boolean] = js.undefined
  /** Deprecated - use canMoveChildrenOutOfDrive instead. */
  var canMoveChildrenOutOfTeamDrive: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can move children of this folder within the shared drive. This is false when the item is not a folder. Only populated for
    * items in shared drives.
    */
  var canMoveChildrenWithinDrive: js.UndefOr[Boolean] = js.undefined
  /** Deprecated - use canMoveChildrenWithinDrive instead. */
  var canMoveChildrenWithinTeamDrive: js.UndefOr[Boolean] = js.undefined
  /** Deprecated - use canMoveItemOutOfDrive instead. */
  var canMoveItemIntoTeamDrive: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can move this item outside of this drive by changing its parent. Note that a request to change the parent of the item may
    * still fail depending on the new parent that is being added.
    */
  var canMoveItemOutOfDrive: js.UndefOr[Boolean] = js.undefined
  /** Deprecated - use canMoveItemOutOfDrive instead. */
  var canMoveItemOutOfTeamDrive: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can move this item within this shared drive. Note that a request to change the parent of the item may still fail depending on
    * the new parent that is being added. Only populated for items in shared drives.
    */
  var canMoveItemWithinDrive: js.UndefOr[Boolean] = js.undefined
  /** Deprecated - use canMoveItemWithinDrive instead. */
  var canMoveItemWithinTeamDrive: js.UndefOr[Boolean] = js.undefined
  /** Deprecated - use canMoveItemWithinDrive or canMoveItemOutOfDrive instead. */
  var canMoveTeamDriveItem: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can read the shared drive to which this file belongs. Only populated for items in shared drives. */
  var canReadDrive: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can read the revisions resource of this file. For a shared drive item, whether revisions of non-folder descendants of this
    * item, or this item itself if it is not a folder, can be read.
    */
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  /** Deprecated - use canReadDrive instead. */
  var canReadTeamDrive: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the current user can remove children from this folder. This is always false when the item is not a folder. For a folder in a shared drive, use
    * canDeleteChildren or canTrashChildren instead.
    */
  var canRemoveChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can remove a parent from the item without adding another parent in the same request. Not populated for shared drive files. */
  var canRemoveMyDriveParent: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can rename this file. */
  var canRename: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can modify the sharing settings for this file. */
  var canShare: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can move this file to trash. */
  var canTrash: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can trash children of this folder. This is false when the item is not a folder. Only populated for items in shared drives. */
  var canTrashChildren: js.UndefOr[Boolean] = js.undefined
  /** Whether the current user can restore this file from trash. */
  var canUntrash: js.UndefOr[Boolean] = js.undefined
}

object CanAddMyDriveParent {
  @scala.inline
  def apply(
    canAddChildren: js.UndefOr[Boolean] = js.undefined,
    canAddMyDriveParent: js.UndefOr[Boolean] = js.undefined,
    canChangeCopyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined,
    canChangeViewersCanCopyContent: js.UndefOr[Boolean] = js.undefined,
    canComment: js.UndefOr[Boolean] = js.undefined,
    canCopy: js.UndefOr[Boolean] = js.undefined,
    canDelete: js.UndefOr[Boolean] = js.undefined,
    canDeleteChildren: js.UndefOr[Boolean] = js.undefined,
    canDownload: js.UndefOr[Boolean] = js.undefined,
    canEdit: js.UndefOr[Boolean] = js.undefined,
    canListChildren: js.UndefOr[Boolean] = js.undefined,
    canModifyContent: js.UndefOr[Boolean] = js.undefined,
    canMoveChildrenOutOfDrive: js.UndefOr[Boolean] = js.undefined,
    canMoveChildrenOutOfTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canMoveChildrenWithinDrive: js.UndefOr[Boolean] = js.undefined,
    canMoveChildrenWithinTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canMoveItemIntoTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canMoveItemOutOfDrive: js.UndefOr[Boolean] = js.undefined,
    canMoveItemOutOfTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canMoveItemWithinDrive: js.UndefOr[Boolean] = js.undefined,
    canMoveItemWithinTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canMoveTeamDriveItem: js.UndefOr[Boolean] = js.undefined,
    canReadDrive: js.UndefOr[Boolean] = js.undefined,
    canReadRevisions: js.UndefOr[Boolean] = js.undefined,
    canReadTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canRemoveChildren: js.UndefOr[Boolean] = js.undefined,
    canRemoveMyDriveParent: js.UndefOr[Boolean] = js.undefined,
    canRename: js.UndefOr[Boolean] = js.undefined,
    canShare: js.UndefOr[Boolean] = js.undefined,
    canTrash: js.UndefOr[Boolean] = js.undefined,
    canTrashChildren: js.UndefOr[Boolean] = js.undefined,
    canUntrash: js.UndefOr[Boolean] = js.undefined
  ): CanAddMyDriveParent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canAddChildren)) __obj.updateDynamic("canAddChildren")(canAddChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canAddMyDriveParent)) __obj.updateDynamic("canAddMyDriveParent")(canAddMyDriveParent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeCopyRequiresWriterPermission)) __obj.updateDynamic("canChangeCopyRequiresWriterPermission")(canChangeCopyRequiresWriterPermission.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeViewersCanCopyContent)) __obj.updateDynamic("canChangeViewersCanCopyContent")(canChangeViewersCanCopyContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canCopy)) __obj.updateDynamic("canCopy")(canCopy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canDelete)) __obj.updateDynamic("canDelete")(canDelete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canDeleteChildren)) __obj.updateDynamic("canDeleteChildren")(canDeleteChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canDownload)) __obj.updateDynamic("canDownload")(canDownload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canEdit)) __obj.updateDynamic("canEdit")(canEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canListChildren)) __obj.updateDynamic("canListChildren")(canListChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canModifyContent)) __obj.updateDynamic("canModifyContent")(canModifyContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveChildrenOutOfDrive)) __obj.updateDynamic("canMoveChildrenOutOfDrive")(canMoveChildrenOutOfDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveChildrenOutOfTeamDrive)) __obj.updateDynamic("canMoveChildrenOutOfTeamDrive")(canMoveChildrenOutOfTeamDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveChildrenWithinDrive)) __obj.updateDynamic("canMoveChildrenWithinDrive")(canMoveChildrenWithinDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveChildrenWithinTeamDrive)) __obj.updateDynamic("canMoveChildrenWithinTeamDrive")(canMoveChildrenWithinTeamDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveItemIntoTeamDrive)) __obj.updateDynamic("canMoveItemIntoTeamDrive")(canMoveItemIntoTeamDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveItemOutOfDrive)) __obj.updateDynamic("canMoveItemOutOfDrive")(canMoveItemOutOfDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveItemOutOfTeamDrive)) __obj.updateDynamic("canMoveItemOutOfTeamDrive")(canMoveItemOutOfTeamDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveItemWithinDrive)) __obj.updateDynamic("canMoveItemWithinDrive")(canMoveItemWithinDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveItemWithinTeamDrive)) __obj.updateDynamic("canMoveItemWithinTeamDrive")(canMoveItemWithinTeamDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMoveTeamDriveItem)) __obj.updateDynamic("canMoveTeamDriveItem")(canMoveTeamDriveItem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canReadDrive)) __obj.updateDynamic("canReadDrive")(canReadDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canReadRevisions)) __obj.updateDynamic("canReadRevisions")(canReadRevisions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canReadTeamDrive)) __obj.updateDynamic("canReadTeamDrive")(canReadTeamDrive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canRemoveChildren)) __obj.updateDynamic("canRemoveChildren")(canRemoveChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canRemoveMyDriveParent)) __obj.updateDynamic("canRemoveMyDriveParent")(canRemoveMyDriveParent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canRename)) __obj.updateDynamic("canRename")(canRename.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canShare)) __obj.updateDynamic("canShare")(canShare.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canTrash)) __obj.updateDynamic("canTrash")(canTrash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canTrashChildren)) __obj.updateDynamic("canTrashChildren")(canTrashChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canUntrash)) __obj.updateDynamic("canUntrash")(canUntrash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAddMyDriveParent]
  }
}

