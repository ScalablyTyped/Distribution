package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasteEventArgs extends js.Object {
  
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the name of moved/copied file or folder.
    */
  var name: js.UndefOr[js.Array[String]] = js.native
  
  /** returns the selected item details.
    */
  var selectedItems: js.UndefOr[js.Any] = js.native
  
  /** returns the target folder item details.
    */
  var targetFolder: js.UndefOr[js.Any] = js.native
  
  /** returns the target path.
    */
  var targetPath: js.UndefOr[String] = js.native
  
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object PasteEventArgs {
  
  @scala.inline
  def apply(): PasteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteEventArgs]
  }
  
  @scala.inline
  implicit class PasteEventArgsOps[Self <: PasteEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: String*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSelectedItems(value: js.Any): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setTargetFolder(value: js.Any): Self = this.set("targetFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetFolder: Self = this.set("targetFolder", js.undefined)
    
    @scala.inline
    def setTargetPath(value: String): Self = this.set("targetPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPath: Self = this.set("targetPath", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
