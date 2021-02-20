package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetBasicProperties extends StObject {
  
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
  implicit class SpreadsheetBasicPropertiesMutableBuilder[Self <: SpreadsheetBasicProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRecalc(value: RecalculationInterval): Self = StObject.set(x, "autoRecalc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRecalcUndefined: Self = StObject.set(x, "autoRecalc", js.undefined)
    
    @scala.inline
    def setDefaultFormat(value: CellFormat): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFormatUndefined: Self = StObject.set(x, "defaultFormat", js.undefined)
    
    @scala.inline
    def setIterativeCalculationSettings(value: IterativeCalculationSetting): Self = StObject.set(x, "iterativeCalculationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterativeCalculationSettingsUndefined: Self = StObject.set(x, "iterativeCalculationSettings", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setSpreadsheetTheme(value: SpreadsheetTheme): Self = StObject.set(x, "spreadsheetTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetThemeUndefined: Self = StObject.set(x, "spreadsheetTheme", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
