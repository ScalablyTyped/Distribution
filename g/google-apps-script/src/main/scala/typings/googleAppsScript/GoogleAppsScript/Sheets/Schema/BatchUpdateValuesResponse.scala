package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateValuesResponse extends js.Object {
  
  var responses: js.UndefOr[js.Array[UpdateValuesResponse]] = js.native
  
  var spreadsheetId: js.UndefOr[String] = js.native
  
  var totalUpdatedCells: js.UndefOr[Double] = js.native
  
  var totalUpdatedColumns: js.UndefOr[Double] = js.native
  
  var totalUpdatedRows: js.UndefOr[Double] = js.native
  
  var totalUpdatedSheets: js.UndefOr[Double] = js.native
}
object BatchUpdateValuesResponse {
  
  @scala.inline
  def apply(): BatchUpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateValuesResponse]
  }
  
  @scala.inline
  implicit class BatchUpdateValuesResponseOps[Self <: BatchUpdateValuesResponse] (val x: Self) extends AnyVal {
    
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
    def setResponsesVarargs(value: UpdateValuesResponse*): Self = this.set("responses", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: js.Array[UpdateValuesResponse]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
    
    @scala.inline
    def setTotalUpdatedCells(value: Double): Self = this.set("totalUpdatedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalUpdatedCells: Self = this.set("totalUpdatedCells", js.undefined)
    
    @scala.inline
    def setTotalUpdatedColumns(value: Double): Self = this.set("totalUpdatedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalUpdatedColumns: Self = this.set("totalUpdatedColumns", js.undefined)
    
    @scala.inline
    def setTotalUpdatedRows(value: Double): Self = this.set("totalUpdatedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalUpdatedRows: Self = this.set("totalUpdatedRows", js.undefined)
    
    @scala.inline
    def setTotalUpdatedSheets(value: Double): Self = this.set("totalUpdatedSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalUpdatedSheets: Self = this.set("totalUpdatedSheets", js.undefined)
  }
}
