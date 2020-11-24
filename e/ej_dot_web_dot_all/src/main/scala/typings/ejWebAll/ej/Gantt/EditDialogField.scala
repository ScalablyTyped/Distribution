package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditDialogField extends js.Object {
  
  /** Specifies the custom column field was displayed in General tab of edit dialog or not.
    * @Default {false}
    */
  var displayInGeneralTab: js.UndefOr[Boolean] = js.native
  
  /** Specifies editType of fields to be included in the edit dialog in Gantt
    */
  var editType: js.UndefOr[String] = js.native
  
  /** Specifies mapping name to include required fields in Gantt
    */
  var field: js.UndefOr[String] = js.native
}
object EditDialogField {
  
  @scala.inline
  def apply(): EditDialogField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditDialogField]
  }
  
  @scala.inline
  implicit class EditDialogFieldOps[Self <: EditDialogField] (val x: Self) extends AnyVal {
    
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
    def setDisplayInGeneralTab(value: Boolean): Self = this.set("displayInGeneralTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayInGeneralTab: Self = this.set("displayInGeneralTab", js.undefined)
    
    @scala.inline
    def setEditType(value: String): Self = this.set("editType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditType: Self = this.set("editType", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
}
