package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

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
    if (autoRecalc != null) __obj.updateDynamic("autoRecalc")(autoRecalc)
    if (defaultFormat != null) __obj.updateDynamic("defaultFormat")(defaultFormat)
    if (iterativeCalculationSettings != null) __obj.updateDynamic("iterativeCalculationSettings")(iterativeCalculationSettings)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SpreadsheetProperties]
  }
}

