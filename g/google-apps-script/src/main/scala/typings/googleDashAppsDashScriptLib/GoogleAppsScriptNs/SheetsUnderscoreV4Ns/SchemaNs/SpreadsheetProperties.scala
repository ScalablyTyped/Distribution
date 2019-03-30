package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetProperties extends js.Object {
  var autoRecalc: js.UndefOr[java.lang.String] = js.undefined
  var defaultFormat: js.UndefOr[CellFormat] = js.undefined
  var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSettings] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SpreadsheetProperties {
  @scala.inline
  def apply(
    autoRecalc: java.lang.String = null,
    defaultFormat: CellFormat = null,
    iterativeCalculationSettings: IterativeCalculationSettings = null,
    locale: java.lang.String = null,
    timeZone: java.lang.String = null,
    title: java.lang.String = null
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

