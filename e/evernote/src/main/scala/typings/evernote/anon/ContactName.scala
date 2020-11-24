package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactName extends js.Object {
  
  var contactName: js.UndefOr[String] = js.native
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  
  var hasSharedNotebook: js.UndefOr[Boolean] = js.native
  
  var joinedUserCount: js.UndefOr[Double] = js.native
  
  var notebookDisplayName: js.UndefOr[String] = js.native
}
object ContactName {
  
  @scala.inline
  def apply(): ContactName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactName]
  }
  
  @scala.inline
  implicit class ContactNameOps[Self <: ContactName] (val x: Self) extends AnyVal {
    
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
    def setContactName(value: String): Self = this.set("contactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactName: Self = this.set("contactName", js.undefined)
    
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    
    @scala.inline
    def setHasSharedNotebook(value: Boolean): Self = this.set("hasSharedNotebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSharedNotebook: Self = this.set("hasSharedNotebook", js.undefined)
    
    @scala.inline
    def setJoinedUserCount(value: Double): Self = this.set("joinedUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinedUserCount: Self = this.set("joinedUserCount", js.undefined)
    
    @scala.inline
    def setNotebookDisplayName(value: String): Self = this.set("notebookDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookDisplayName: Self = this.set("notebookDisplayName", js.undefined)
  }
}
