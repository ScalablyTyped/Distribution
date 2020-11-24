package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellData extends js.Object {
  
  var dataValidation: js.UndefOr[DataValidationRule] = js.native
  
  var effectiveFormat: js.UndefOr[CellFormat] = js.native
  
  var effectiveValue: js.UndefOr[ExtendedValue] = js.native
  
  var formattedValue: js.UndefOr[String] = js.native
  
  var hyperlink: js.UndefOr[String] = js.native
  
  var note: js.UndefOr[String] = js.native
  
  var pivotTable: js.UndefOr[PivotTable] = js.native
  
  var textFormatRuns: js.UndefOr[js.Array[TextFormatRun]] = js.native
  
  var userEnteredFormat: js.UndefOr[CellFormat] = js.native
  
  var userEnteredValue: js.UndefOr[ExtendedValue] = js.native
}
object CellData {
  
  @scala.inline
  def apply(): CellData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellData]
  }
  
  @scala.inline
  implicit class CellDataOps[Self <: CellData] (val x: Self) extends AnyVal {
    
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
    def setDataValidation(value: DataValidationRule): Self = this.set("dataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataValidation: Self = this.set("dataValidation", js.undefined)
    
    @scala.inline
    def setEffectiveFormat(value: CellFormat): Self = this.set("effectiveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveFormat: Self = this.set("effectiveFormat", js.undefined)
    
    @scala.inline
    def setEffectiveValue(value: ExtendedValue): Self = this.set("effectiveValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveValue: Self = this.set("effectiveValue", js.undefined)
    
    @scala.inline
    def setFormattedValue(value: String): Self = this.set("formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedValue: Self = this.set("formattedValue", js.undefined)
    
    @scala.inline
    def setHyperlink(value: String): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setPivotTable(value: PivotTable): Self = this.set("pivotTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotTable: Self = this.set("pivotTable", js.undefined)
    
    @scala.inline
    def setTextFormatRunsVarargs(value: TextFormatRun*): Self = this.set("textFormatRuns", js.Array(value :_*))
    
    @scala.inline
    def setTextFormatRuns(value: js.Array[TextFormatRun]): Self = this.set("textFormatRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextFormatRuns: Self = this.set("textFormatRuns", js.undefined)
    
    @scala.inline
    def setUserEnteredFormat(value: CellFormat): Self = this.set("userEnteredFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEnteredFormat: Self = this.set("userEnteredFormat", js.undefined)
    
    @scala.inline
    def setUserEnteredValue(value: ExtendedValue): Self = this.set("userEnteredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEnteredValue: Self = this.set("userEnteredValue", js.undefined)
  }
}
