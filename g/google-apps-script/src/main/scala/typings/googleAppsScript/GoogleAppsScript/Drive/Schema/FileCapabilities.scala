package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileCapabilities extends js.Object {
  
  var canAddChildren: js.UndefOr[Boolean] = js.native
  
  var canChangeCopyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  
  var canChangeRestrictedDownload: js.UndefOr[Boolean] = js.native
  
  var canComment: js.UndefOr[Boolean] = js.native
  
  var canCopy: js.UndefOr[Boolean] = js.native
  
  var canDelete: js.UndefOr[Boolean] = js.native
  
  var canDeleteChildren: js.UndefOr[Boolean] = js.native
  
  var canDownload: js.UndefOr[Boolean] = js.native
  
  var canEdit: js.UndefOr[Boolean] = js.native
  
  var canListChildren: js.UndefOr[Boolean] = js.native
  
  var canMoveChildrenOutOfDrive: js.UndefOr[Boolean] = js.native
  
  var canMoveChildrenOutOfTeamDrive: js.UndefOr[Boolean] = js.native
  
  var canMoveChildrenWithinDrive: js.UndefOr[Boolean] = js.native
  
  var canMoveChildrenWithinTeamDrive: js.UndefOr[Boolean] = js.native
  
  var canMoveItemIntoTeamDrive: js.UndefOr[Boolean] = js.native
  
  var canMoveItemOutOfDrive: js.UndefOr[Boolean] = js.native
  
  var canMoveItemOutOfTeamDrive: js.UndefOr[Boolean] = js.native
  
  var canMoveItemWithinDrive: js.UndefOr[Boolean] = js.native
  
  var canMoveItemWithinTeamDrive: js.UndefOr[Boolean] = js.native
  
  var canMoveTeamDriveItem: js.UndefOr[Boolean] = js.native
  
  var canReadDrive: js.UndefOr[Boolean] = js.native
  
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  
  var canReadTeamDrive: js.UndefOr[Boolean] = js.native
  
  var canRemoveChildren: js.UndefOr[Boolean] = js.native
  
  var canRename: js.UndefOr[Boolean] = js.native
  
  var canShare: js.UndefOr[Boolean] = js.native
  
  var canTrash: js.UndefOr[Boolean] = js.native
  
  var canTrashChildren: js.UndefOr[Boolean] = js.native
  
  var canUntrash: js.UndefOr[Boolean] = js.native
}
object FileCapabilities {
  
  @scala.inline
  def apply(): FileCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileCapabilities]
  }
  
  @scala.inline
  implicit class FileCapabilitiesOps[Self <: FileCapabilities] (val x: Self) extends AnyVal {
    
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
    def setCanChangeCopyRequiresWriterPermission(value: Boolean): Self = this.set("canChangeCopyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanChangeCopyRequiresWriterPermission: Self = this.set("canChangeCopyRequiresWriterPermission", js.undefined)
    
    @scala.inline
    def setCanChangeRestrictedDownload(value: Boolean): Self = this.set("canChangeRestrictedDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanChangeRestrictedDownload: Self = this.set("canChangeRestrictedDownload", js.undefined)
    
    @scala.inline
    def setCanComment(value: Boolean): Self = this.set("canComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanComment: Self = this.set("canComment", js.undefined)
    
    @scala.inline
    def setCanCopy(value: Boolean): Self = this.set("canCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanCopy: Self = this.set("canCopy", js.undefined)
    
    @scala.inline
    def setCanDelete(value: Boolean): Self = this.set("canDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDelete: Self = this.set("canDelete", js.undefined)
    
    @scala.inline
    def setCanDeleteChildren(value: Boolean): Self = this.set("canDeleteChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDeleteChildren: Self = this.set("canDeleteChildren", js.undefined)
    
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
    def setCanMoveChildrenOutOfDrive(value: Boolean): Self = this.set("canMoveChildrenOutOfDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveChildrenOutOfDrive: Self = this.set("canMoveChildrenOutOfDrive", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenOutOfTeamDrive(value: Boolean): Self = this.set("canMoveChildrenOutOfTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveChildrenOutOfTeamDrive: Self = this.set("canMoveChildrenOutOfTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenWithinDrive(value: Boolean): Self = this.set("canMoveChildrenWithinDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveChildrenWithinDrive: Self = this.set("canMoveChildrenWithinDrive", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenWithinTeamDrive(value: Boolean): Self = this.set("canMoveChildrenWithinTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveChildrenWithinTeamDrive: Self = this.set("canMoveChildrenWithinTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemIntoTeamDrive(value: Boolean): Self = this.set("canMoveItemIntoTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveItemIntoTeamDrive: Self = this.set("canMoveItemIntoTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemOutOfDrive(value: Boolean): Self = this.set("canMoveItemOutOfDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveItemOutOfDrive: Self = this.set("canMoveItemOutOfDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemOutOfTeamDrive(value: Boolean): Self = this.set("canMoveItemOutOfTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveItemOutOfTeamDrive: Self = this.set("canMoveItemOutOfTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemWithinDrive(value: Boolean): Self = this.set("canMoveItemWithinDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveItemWithinDrive: Self = this.set("canMoveItemWithinDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemWithinTeamDrive(value: Boolean): Self = this.set("canMoveItemWithinTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveItemWithinTeamDrive: Self = this.set("canMoveItemWithinTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveTeamDriveItem(value: Boolean): Self = this.set("canMoveTeamDriveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveTeamDriveItem: Self = this.set("canMoveTeamDriveItem", js.undefined)
    
    @scala.inline
    def setCanReadDrive(value: Boolean): Self = this.set("canReadDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanReadDrive: Self = this.set("canReadDrive", js.undefined)
    
    @scala.inline
    def setCanReadRevisions(value: Boolean): Self = this.set("canReadRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanReadRevisions: Self = this.set("canReadRevisions", js.undefined)
    
    @scala.inline
    def setCanReadTeamDrive(value: Boolean): Self = this.set("canReadTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanReadTeamDrive: Self = this.set("canReadTeamDrive", js.undefined)
    
    @scala.inline
    def setCanRemoveChildren(value: Boolean): Self = this.set("canRemoveChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRemoveChildren: Self = this.set("canRemoveChildren", js.undefined)
    
    @scala.inline
    def setCanRename(value: Boolean): Self = this.set("canRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRename: Self = this.set("canRename", js.undefined)
    
    @scala.inline
    def setCanShare(value: Boolean): Self = this.set("canShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanShare: Self = this.set("canShare", js.undefined)
    
    @scala.inline
    def setCanTrash(value: Boolean): Self = this.set("canTrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanTrash: Self = this.set("canTrash", js.undefined)
    
    @scala.inline
    def setCanTrashChildren(value: Boolean): Self = this.set("canTrashChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanTrashChildren: Self = this.set("canTrashChildren", js.undefined)
    
    @scala.inline
    def setCanUntrash(value: Boolean): Self = this.set("canUntrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUntrash: Self = this.set("canUntrash", js.undefined)
  }
}
