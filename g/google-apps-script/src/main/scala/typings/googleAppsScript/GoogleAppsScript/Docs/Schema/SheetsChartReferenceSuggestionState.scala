package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsChartReferenceSuggestionState extends js.Object {
  
  var chartIdSuggested: js.UndefOr[Boolean] = js.native
  
  var spreadsheetIdSuggested: js.UndefOr[Boolean] = js.native
}
object SheetsChartReferenceSuggestionState {
  
  @scala.inline
  def apply(): SheetsChartReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsChartReferenceSuggestionState]
  }
  
  @scala.inline
  implicit class SheetsChartReferenceSuggestionStateOps[Self <: SheetsChartReferenceSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setChartIdSuggested(value: Boolean): Self = this.set("chartIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartIdSuggested: Self = this.set("chartIdSuggested", js.undefined)
    
    @scala.inline
    def setSpreadsheetIdSuggested(value: Boolean): Self = this.set("spreadsheetIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadsheetIdSuggested: Self = this.set("spreadsheetIdSuggested", js.undefined)
  }
}
