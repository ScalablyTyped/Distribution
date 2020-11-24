package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionDetail extends js.Object {
  
  var comment: js.UndefOr[Comment] = js.native
  
  var create: js.UndefOr[Create] = js.native
  
  var delete: js.UndefOr[Delete] = js.native
  
  var dlpChange: js.UndefOr[DataLeakPreventionChange] = js.native
  
  var edit: js.UndefOr[js.Any] = js.native
  
  var move: js.UndefOr[Move] = js.native
  
  var permissionChange: js.UndefOr[PermissionChange] = js.native
  
  var reference: js.UndefOr[ApplicationReference] = js.native
  
  var rename: js.UndefOr[Rename] = js.native
  
  var restore: js.UndefOr[Restore] = js.native
  
  var settingsChange: js.UndefOr[SettingsChange] = js.native
}
object ActionDetail {
  
  @scala.inline
  def apply(): ActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionDetail]
  }
  
  @scala.inline
  implicit class ActionDetailOps[Self <: ActionDetail] (val x: Self) extends AnyVal {
    
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
    def setComment(value: Comment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCreate(value: Create): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDelete(value: Delete): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setDlpChange(value: DataLeakPreventionChange): Self = this.set("dlpChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDlpChange: Self = this.set("dlpChange", js.undefined)
    
    @scala.inline
    def setEdit(value: js.Any): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    
    @scala.inline
    def setMove(value: Move): Self = this.set("move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    
    @scala.inline
    def setPermissionChange(value: PermissionChange): Self = this.set("permissionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionChange: Self = this.set("permissionChange", js.undefined)
    
    @scala.inline
    def setReference(value: ApplicationReference): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    
    @scala.inline
    def setRename(value: Rename): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    
    @scala.inline
    def setRestore(value: Restore): Self = this.set("restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    
    @scala.inline
    def setSettingsChange(value: SettingsChange): Self = this.set("settingsChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsChange: Self = this.set("settingsChange", js.undefined)
  }
}
