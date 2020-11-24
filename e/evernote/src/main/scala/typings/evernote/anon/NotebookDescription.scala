package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebookPrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookDescription extends js.Object {
  
  var notebookDescription: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  
  var recommended: js.UndefOr[Boolean] = js.native
}
object NotebookDescription {
  
  @scala.inline
  def apply(): NotebookDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookDescription]
  }
  
  @scala.inline
  implicit class NotebookDescriptionOps[Self <: NotebookDescription] (val x: Self) extends AnyVal {
    
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
    def setNotebookDescription(value: String): Self = this.set("notebookDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookDescription: Self = this.set("notebookDescription", js.undefined)
    
    @scala.inline
    def setPrivilege(value: SharedNotebookPrivilegeLevel): Self = this.set("privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivilege: Self = this.set("privilege", js.undefined)
    
    @scala.inline
    def setRecommended(value: Boolean): Self = this.set("recommended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommended: Self = this.set("recommended", js.undefined)
  }
}
