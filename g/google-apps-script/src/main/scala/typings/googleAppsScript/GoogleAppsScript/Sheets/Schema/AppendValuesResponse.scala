package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppendValuesResponse extends js.Object {
  
  var spreadsheetId: js.UndefOr[String] = js.native
  
  var tableRange: js.UndefOr[String] = js.native
  
  var updates: js.UndefOr[UpdateValuesResponse] = js.native
}
object AppendValuesResponse {
  
  @scala.inline
  def apply(): AppendValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendValuesResponse]
  }
  
  @scala.inline
  implicit class AppendValuesResponseOps[Self <: AppendValuesResponse] (val x: Self) extends AnyVal {
    
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
    def setTableRange(value: String): Self = this.set("tableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRange: Self = this.set("tableRange", js.undefined)
    
    @scala.inline
    def setUpdates(value: UpdateValuesResponse): Self = this.set("updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdates: Self = this.set("updates", js.undefined)
  }
}
