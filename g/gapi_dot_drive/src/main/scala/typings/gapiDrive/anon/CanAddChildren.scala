package typings.gapiDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanAddChildren extends js.Object {
  
  var canAddChildren: Boolean = js.native
  
  var canChangeRestrictedDownload: Boolean = js.native
  
  var canComment: Boolean = js.native
  
  var canCopy: Boolean = js.native
  
  var canDelete: Boolean = js.native
  
  var canDownload: Boolean = js.native
  
  var canEdit: Boolean = js.native
  
  var canListChildren: Boolean = js.native
  
  var canMoveItemIntoTeamDrive: Boolean = js.native
  
  var canMoveTeamDriveItem: Boolean = js.native
  
  var canReadRevisions: Boolean = js.native
  
  var canReadTeamDrive: Boolean = js.native
  
  var canRemoveChildren: Boolean = js.native
  
  var canRename: Boolean = js.native
  
  var canShare: Boolean = js.native
  
  var canTrash: Boolean = js.native
  
  var canUntrash: Boolean = js.native
}
object CanAddChildren {
  
  @scala.inline
  def apply(
    canAddChildren: Boolean,
    canChangeRestrictedDownload: Boolean,
    canComment: Boolean,
    canCopy: Boolean,
    canDelete: Boolean,
    canDownload: Boolean,
    canEdit: Boolean,
    canListChildren: Boolean,
    canMoveItemIntoTeamDrive: Boolean,
    canMoveTeamDriveItem: Boolean,
    canReadRevisions: Boolean,
    canReadTeamDrive: Boolean,
    canRemoveChildren: Boolean,
    canRename: Boolean,
    canShare: Boolean,
    canTrash: Boolean,
    canUntrash: Boolean
  ): CanAddChildren = {
    val __obj = js.Dynamic.literal(canAddChildren = canAddChildren.asInstanceOf[js.Any], canChangeRestrictedDownload = canChangeRestrictedDownload.asInstanceOf[js.Any], canComment = canComment.asInstanceOf[js.Any], canCopy = canCopy.asInstanceOf[js.Any], canDelete = canDelete.asInstanceOf[js.Any], canDownload = canDownload.asInstanceOf[js.Any], canEdit = canEdit.asInstanceOf[js.Any], canListChildren = canListChildren.asInstanceOf[js.Any], canMoveItemIntoTeamDrive = canMoveItemIntoTeamDrive.asInstanceOf[js.Any], canMoveTeamDriveItem = canMoveTeamDriveItem.asInstanceOf[js.Any], canReadRevisions = canReadRevisions.asInstanceOf[js.Any], canReadTeamDrive = canReadTeamDrive.asInstanceOf[js.Any], canRemoveChildren = canRemoveChildren.asInstanceOf[js.Any], canRename = canRename.asInstanceOf[js.Any], canShare = canShare.asInstanceOf[js.Any], canTrash = canTrash.asInstanceOf[js.Any], canUntrash = canUntrash.asInstanceOf[js.Any])
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
    def setCanChangeRestrictedDownload(value: Boolean): Self = this.set("canChangeRestrictedDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanComment(value: Boolean): Self = this.set("canComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCopy(value: Boolean): Self = this.set("canCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDelete(value: Boolean): Self = this.set("canDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDownload(value: Boolean): Self = this.set("canDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEdit(value: Boolean): Self = this.set("canEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanListChildren(value: Boolean): Self = this.set("canListChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveItemIntoTeamDrive(value: Boolean): Self = this.set("canMoveItemIntoTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveTeamDriveItem(value: Boolean): Self = this.set("canMoveTeamDriveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanReadRevisions(value: Boolean): Self = this.set("canReadRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanReadTeamDrive(value: Boolean): Self = this.set("canReadTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRemoveChildren(value: Boolean): Self = this.set("canRemoveChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRename(value: Boolean): Self = this.set("canRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanShare(value: Boolean): Self = this.set("canShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanTrash(value: Boolean): Self = this.set("canTrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUntrash(value: Boolean): Self = this.set("canUntrash", value.asInstanceOf[js.Any])
  }
}
