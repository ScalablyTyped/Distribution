package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetProperties extends js.Object {
  
  var autoRecalc: js.UndefOr[String] = js.native
  
  var defaultFormat: js.UndefOr[CellFormat] = js.native
  
  var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSettings] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SpreadsheetProperties {
  
  @scala.inline
  def apply(): SpreadsheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetProperties]
  }
  
  @scala.inline
  implicit class SpreadsheetPropertiesOps[Self <: SpreadsheetProperties] (val x: Self) extends AnyVal {
    
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
    def setAutoRecalc(value: String): Self = this.set("autoRecalc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRecalc: Self = this.set("autoRecalc", js.undefined)
    
    @scala.inline
    def setDefaultFormat(value: CellFormat): Self = this.set("defaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFormat: Self = this.set("defaultFormat", js.undefined)
    
    @scala.inline
    def setIterativeCalculationSettings(value: IterativeCalculationSettings): Self = this.set("iterativeCalculationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterativeCalculationSettings: Self = this.set("iterativeCalculationSettings", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
