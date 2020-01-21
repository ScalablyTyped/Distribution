package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetProperties extends js.Object {
  var autoRecalc: js.UndefOr[String] = js.undefined
  var defaultFormat: js.UndefOr[CellFormat] = js.undefined
  var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSettings] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SpreadsheetProperties {
  @scala.inline
  def apply(
    autoRecalc: String = null,
    defaultFormat: CellFormat = null,
    iterativeCalculationSettings: IterativeCalculationSettings = null,
    locale: String = null,
    timeZone: String = null,
    title: String = null
  ): SpreadsheetProperties = {
    val __obj = js.Dynamic.literal()
    if (autoRecalc != null) __obj.updateDynamic("autoRecalc")(autoRecalc.asInstanceOf[js.Any])
    if (defaultFormat != null) __obj.updateDynamic("defaultFormat")(defaultFormat.asInstanceOf[js.Any])
    if (iterativeCalculationSettings != null) __obj.updateDynamic("iterativeCalculationSettings")(iterativeCalculationSettings.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetProperties]
  }
}

