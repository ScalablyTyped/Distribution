package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateSpreadsheetResponse extends js.Object {
  
  var replies: js.UndefOr[js.Array[Response]] = js.native
  
  var spreadsheetId: js.UndefOr[String] = js.native
  
  var updatedSpreadsheet: js.UndefOr[Spreadsheet] = js.native
}
object BatchUpdateSpreadsheetResponse {
  
  @scala.inline
  def apply(): BatchUpdateSpreadsheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateSpreadsheetResponse]
  }
  
  @scala.inline
  implicit class BatchUpdateSpreadsheetResponseOps[Self <: BatchUpdateSpreadsheetResponse] (val x: Self) extends AnyVal {
    
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
    def setRepliesVarargs(value: Response*): Self = this.set("replies", js.Array(value :_*))
    
    @scala.inline
    def setReplies(value: js.Array[Response]): Self = this.set("replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
    
    @scala.inline
    def setUpdatedSpreadsheet(value: Spreadsheet): Self = this.set("updatedSpreadsheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedSpreadsheet: Self = this.set("updatedSpreadsheet", js.undefined)
  }
}
