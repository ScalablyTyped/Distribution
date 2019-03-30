package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellData extends js.Object {
  var dataValidation: js.UndefOr[DataValidationRule] = js.undefined
  var effectiveFormat: js.UndefOr[CellFormat] = js.undefined
  var effectiveValue: js.UndefOr[ExtendedValue] = js.undefined
  var formattedValue: js.UndefOr[java.lang.String] = js.undefined
  var hyperlink: js.UndefOr[java.lang.String] = js.undefined
  var note: js.UndefOr[java.lang.String] = js.undefined
  var pivotTable: js.UndefOr[PivotTable] = js.undefined
  var textFormatRuns: js.UndefOr[js.Array[TextFormatRun]] = js.undefined
  var userEnteredFormat: js.UndefOr[CellFormat] = js.undefined
  var userEnteredValue: js.UndefOr[ExtendedValue] = js.undefined
}

object CellData {
  @scala.inline
  def apply(
    dataValidation: DataValidationRule = null,
    effectiveFormat: CellFormat = null,
    effectiveValue: ExtendedValue = null,
    formattedValue: java.lang.String = null,
    hyperlink: java.lang.String = null,
    note: java.lang.String = null,
    pivotTable: PivotTable = null,
    textFormatRuns: js.Array[TextFormatRun] = null,
    userEnteredFormat: CellFormat = null,
    userEnteredValue: ExtendedValue = null
  ): CellData = {
    val __obj = js.Dynamic.literal()
    if (dataValidation != null) __obj.updateDynamic("dataValidation")(dataValidation)
    if (effectiveFormat != null) __obj.updateDynamic("effectiveFormat")(effectiveFormat)
    if (effectiveValue != null) __obj.updateDynamic("effectiveValue")(effectiveValue)
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (note != null) __obj.updateDynamic("note")(note)
    if (pivotTable != null) __obj.updateDynamic("pivotTable")(pivotTable)
    if (textFormatRuns != null) __obj.updateDynamic("textFormatRuns")(textFormatRuns)
    if (userEnteredFormat != null) __obj.updateDynamic("userEnteredFormat")(userEnteredFormat)
    if (userEnteredValue != null) __obj.updateDynamic("userEnteredValue")(userEnteredValue)
    __obj.asInstanceOf[CellData]
  }
}

