package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellData extends js.Object {
  var dataValidation: js.UndefOr[DataValidationRule] = js.undefined
  var effectiveFormat: js.UndefOr[CellFormat] = js.undefined
  var effectiveValue: js.UndefOr[ExtendedValue] = js.undefined
  var formattedValue: js.UndefOr[String] = js.undefined
  var hyperlink: js.UndefOr[String] = js.undefined
  var note: js.UndefOr[String] = js.undefined
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
    formattedValue: String = null,
    hyperlink: String = null,
    note: String = null,
    pivotTable: PivotTable = null,
    textFormatRuns: js.Array[TextFormatRun] = null,
    userEnteredFormat: CellFormat = null,
    userEnteredValue: ExtendedValue = null
  ): CellData = {
    val __obj = js.Dynamic.literal()
    if (dataValidation != null) __obj.updateDynamic("dataValidation")(dataValidation.asInstanceOf[js.Any])
    if (effectiveFormat != null) __obj.updateDynamic("effectiveFormat")(effectiveFormat.asInstanceOf[js.Any])
    if (effectiveValue != null) __obj.updateDynamic("effectiveValue")(effectiveValue.asInstanceOf[js.Any])
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (pivotTable != null) __obj.updateDynamic("pivotTable")(pivotTable.asInstanceOf[js.Any])
    if (textFormatRuns != null) __obj.updateDynamic("textFormatRuns")(textFormatRuns.asInstanceOf[js.Any])
    if (userEnteredFormat != null) __obj.updateDynamic("userEnteredFormat")(userEnteredFormat.asInstanceOf[js.Any])
    if (userEnteredValue != null) __obj.updateDynamic("userEnteredValue")(userEnteredValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellData]
  }
}

