package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetBasicProperties extends js.Object {
  /**
    * @description
    * when volatile functions should be recalculated
    */
  var autoRecalc: js.UndefOr[RecalculationInterval] = js.undefined
  /**
    * @description
    * default format for all cells in all worksheets of the document
    */
  var defaultFormat: js.UndefOr[CellFormat] = js.undefined
  /**
    * @description
    * how circular dependencies are resolved with iterative calculations
    */
  var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSetting] = js.undefined
  /**
    * @description
    * document locale/language
    * - ISO code format
    * - ex: "en", "en_US"
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * @description
    * theme applied to all worksheets of the document
    */
  var spreadsheetTheme: js.UndefOr[SpreadsheetTheme] = js.undefined
  /**
    * @description
    * document timezone
    * - CLDR format
    * - ex: "America/New_York", "GMT-07:00"
    */
  var timeZone: js.UndefOr[String] = js.undefined
  // #region BASIC PROPERTIES
  /* separates basic (editable) properties as they are used as inputs to various methods
    * non-basic properties should be added to the extending interface below
    */
  /**
    * @description
    * document title
    */
  var title: js.UndefOr[String] = js.undefined
}

object SpreadsheetBasicProperties {
  @scala.inline
  def apply(
    autoRecalc: RecalculationInterval = null,
    defaultFormat: CellFormat = null,
    iterativeCalculationSettings: IterativeCalculationSetting = null,
    locale: String = null,
    spreadsheetTheme: SpreadsheetTheme = null,
    timeZone: String = null,
    title: String = null
  ): SpreadsheetBasicProperties = {
    val __obj = js.Dynamic.literal()
    if (autoRecalc != null) __obj.updateDynamic("autoRecalc")(autoRecalc.asInstanceOf[js.Any])
    if (defaultFormat != null) __obj.updateDynamic("defaultFormat")(defaultFormat.asInstanceOf[js.Any])
    if (iterativeCalculationSettings != null) __obj.updateDynamic("iterativeCalculationSettings")(iterativeCalculationSettings.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (spreadsheetTheme != null) __obj.updateDynamic("spreadsheetTheme")(spreadsheetTheme.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetBasicProperties]
  }
}

