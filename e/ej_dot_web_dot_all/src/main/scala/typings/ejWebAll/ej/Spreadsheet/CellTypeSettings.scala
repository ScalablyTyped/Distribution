package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellTypeSettings extends js.Object {
  
  /** Specifies the button background color of Custom Cell type.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specifies the dropdown list data source range of Custom Cell type.
    */
  var dataSourceRange: js.UndefOr[String] = js.native
  
  /** Specifies the dropdown list data source sheet index of Custom Cell type.
    */
  var dataSourceSheetIndex: js.UndefOr[Double] = js.native
  
  /** Specifies the text and value of field in dropdown list.
    */
  var field: js.UndefOr[js.Any] = js.native
  
  /** Specifies the checkbox is set true or false of Custom Cell type.
    */
  var isChecked: js.UndefOr[Boolean] = js.native
  
  /** Specifies the button text of Custom Cell type.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies the button type of Custom Cell type.
    */
  var `type`: js.UndefOr[CustomCellType] = js.native
  
  /** Specifies the datepicker of Custom Cell type.
    */
  var value: js.UndefOr[String] = js.native
}
object CellTypeSettings {
  
  @scala.inline
  def apply(): CellTypeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellTypeSettings]
  }
  
  @scala.inline
  implicit class CellTypeSettingsOps[Self <: CellTypeSettings] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setDataSourceRange(value: String): Self = this.set("dataSourceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceRange: Self = this.set("dataSourceRange", js.undefined)
    
    @scala.inline
    def setDataSourceSheetIndex(value: Double): Self = this.set("dataSourceSheetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceSheetIndex: Self = this.set("dataSourceSheetIndex", js.undefined)
    
    @scala.inline
    def setField(value: js.Any): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: CustomCellType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
