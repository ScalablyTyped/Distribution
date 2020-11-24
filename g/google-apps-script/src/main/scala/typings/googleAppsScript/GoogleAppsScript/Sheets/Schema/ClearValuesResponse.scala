package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearValuesResponse extends js.Object {
  
  var clearedRange: js.UndefOr[String] = js.native
  
  var spreadsheetId: js.UndefOr[String] = js.native
}
object ClearValuesResponse {
  
  @scala.inline
  def apply(): ClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearValuesResponse]
  }
  
  @scala.inline
  implicit class ClearValuesResponseOps[Self <: ClearValuesResponse] (val x: Self) extends AnyVal {
    
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
    def setClearedRange(value: String): Self = this.set("clearedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearedRange: Self = this.set("clearedRange", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
  }
}
