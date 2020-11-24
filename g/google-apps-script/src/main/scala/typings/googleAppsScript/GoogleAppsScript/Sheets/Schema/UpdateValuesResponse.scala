package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateValuesResponse extends js.Object {
  
  var spreadsheetId: js.UndefOr[String] = js.native
  
  var updatedCells: js.UndefOr[Double] = js.native
  
  var updatedColumns: js.UndefOr[Double] = js.native
  
  var updatedData: js.UndefOr[ValueRange] = js.native
  
  var updatedRange: js.UndefOr[String] = js.native
  
  var updatedRows: js.UndefOr[Double] = js.native
}
object UpdateValuesResponse {
  
  @scala.inline
  def apply(): UpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateValuesResponse]
  }
  
  @scala.inline
  implicit class UpdateValuesResponseOps[Self <: UpdateValuesResponse] (val x: Self) extends AnyVal {
    
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
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
    
    @scala.inline
    def setUpdatedCells(value: Double): Self = this.set("updatedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedCells: Self = this.set("updatedCells", js.undefined)
    
    @scala.inline
    def setUpdatedColumns(value: Double): Self = this.set("updatedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedColumns: Self = this.set("updatedColumns", js.undefined)
    
    @scala.inline
    def setUpdatedData(value: ValueRange): Self = this.set("updatedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedData: Self = this.set("updatedData", js.undefined)
    
    @scala.inline
    def setUpdatedRange(value: String): Self = this.set("updatedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedRange: Self = this.set("updatedRange", js.undefined)
    
    @scala.inline
    def setUpdatedRows(value: Double): Self = this.set("updatedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedRows: Self = this.set("updatedRows", js.undefined)
  }
}
