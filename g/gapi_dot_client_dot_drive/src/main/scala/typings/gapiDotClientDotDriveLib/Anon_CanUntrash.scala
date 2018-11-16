package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_CanUntrash extends js.Object {
  /** Whether the current user can add children to this folder. This is always false when the item is not a folder. */
  var canAddChildren: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can change whether viewers can copy the contents of this file. */
  var canChangeViewersCanCopyContent: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can comment on this file. */
  var canComment: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Whether the current user can copy this file. For a Team Drive item, whether the current user can copy non-folder descendants of this item, or this item
                   * itself if it is not a folder.
                   */
  var canCopy: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can delete this file. */
  var canDelete: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can download this file. */
  var canDownload: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can edit this file. */
  var canEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can list the children of this folder. This is always false when the item is not a folder. */
  var canListChildren: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can move this item into a Team Drive. If the item is in a Team Drive, this field is equivalent to canMoveTeamDriveItem. */
  var canMoveItemIntoTeamDrive: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Whether the current user can move this Team Drive item by changing its parent. Note that a request to change the parent for this item may still fail
                   * depending on the new parent that is being added. Only populated for Team Drive files.
                   */
  var canMoveTeamDriveItem: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Whether the current user can read the revisions resource of this file. For a Team Drive item, whether revisions of non-folder descendants of this item,
                   * or this item itself if it is not a folder, can be read.
                   */
  var canReadRevisions: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can read the Team Drive to which this file belongs. Only populated for Team Drive files. */
  var canReadTeamDrive: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can remove children from this folder. This is always false when the item is not a folder. */
  var canRemoveChildren: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can rename this file. */
  var canRename: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can modify the sharing settings for this file. */
  var canShare: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can move this file to trash. */
  var canTrash: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the current user can restore this file from trash. */
  var canUntrash: js.UndefOr[scala.Boolean] = js.undefined
}

