package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetBasicProperties extends js.Object {
  
  /**
    * @description
    * when volatile functions should be recalculated
    */
  var autoRecalc: js.UndefOr[RecalculationInterval] = js.native
  
  /**
    * @description
    * default format for all cells in all worksheets of the document
    */
  var defaultFormat: js.UndefOr[CellFormat] = js.native
  
  /**
    * @description
    * how circular dependencies are resolved with iterative calculations
    */
  var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSetting] = js.native
  
  /**
    * @description
    * document locale/language
    * - ISO code format
    * - ex: "en", "en_US"
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * @description
    * theme applied to all worksheets of the document
    */
  var spreadsheetTheme: js.UndefOr[SpreadsheetTheme] = js.native
  
  /**
    * @description
    * document timezone
    * - CLDR format
    * - ex: "America/New_York", "GMT-07:00"
    */
  var timeZone: js.UndefOr[String] = js.native
  
  // #region BASIC PROPERTIES
  /* separates basic (editable) properties as they are used as inputs to various methods
    * non-basic properties should be added to the extending interface below
    */
  /**
    * @description
    * document title
    */
  var title: js.UndefOr[String] = js.native
}
object SpreadsheetBasicProperties {
  
  @scala.inline
  def apply(): SpreadsheetBasicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetBasicProperties]
  }
  
  @scala.inline
  implicit class SpreadsheetBasicPropertiesOps[Self <: SpreadsheetBasicProperties] (val x: Self) extends AnyVal {
    
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
    def setAutoRecalc(value: RecalculationInterval): Self = this.set("autoRecalc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRecalc: Self = this.set("autoRecalc", js.undefined)
    
    @scala.inline
    def setDefaultFormat(value: CellFormat): Self = this.set("defaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFormat: Self = this.set("defaultFormat", js.undefined)
    
    @scala.inline
    def setIterativeCalculationSettings(value: IterativeCalculationSetting): Self = this.set("iterativeCalculationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterativeCalculationSettings: Self = this.set("iterativeCalculationSettings", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setSpreadsheetTheme(value: SpreadsheetTheme): Self = this.set("spreadsheetTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadsheetTheme: Self = this.set("spreadsheetTheme", js.undefined)
    
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
