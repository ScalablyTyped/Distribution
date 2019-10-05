package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellData extends js.Object {
  /**
    * A data validation rule on the cell, if any.
    *
    * When writing, the new data validation rule will overwrite any prior rule.
    */
  var dataValidation: js.UndefOr[DataValidationRule] = js.undefined
  /**
    * The effective format being used by the cell.
    * This includes the results of applying any conditional formatting and,
    * if the cell contains a formula, the computed number format.
    * If the effective format is the default format, effective format will
    * not be written.
    * This field is read-only.
    */
  var effectiveFormat: js.UndefOr[CellFormat] = js.undefined
  /**
    * The effective value of the cell. For cells with formulas, this is
    * the calculated value.  For cells with literals, this is
    * the same as the user_entered_value.
    * This field is read-only.
    */
  var effectiveValue: js.UndefOr[ExtendedValue] = js.undefined
  /**
    * The formatted value of the cell.
    * This is the value as it's shown to the user.
    * This field is read-only.
    */
  var formattedValue: js.UndefOr[String] = js.undefined
  /**
    * A hyperlink this cell points to, if any.
    * This field is read-only.  (To set it, use a `=HYPERLINK` formula
    * in the userEnteredValue.formulaValue
    * field.)
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  /** Any note on the cell. */
  var note: js.UndefOr[String] = js.undefined
  /**
    * A pivot table anchored at this cell. The size of pivot table itself
    * is computed dynamically based on its data, grouping, filters, values,
    * etc. Only the top-left cell of the pivot table contains the pivot table
    * definition. The other cells will contain the calculated values of the
    * results of the pivot in their effective_value fields.
    */
  var pivotTable: js.UndefOr[PivotTable] = js.undefined
  /**
    * Runs of rich text applied to subsections of the cell.  Runs are only valid
    * on user entered strings, not formulas, bools, or numbers.
    * Runs start at specific indexes in the text and continue until the next
    * run. Properties of a run will continue unless explicitly changed
    * in a subsequent run (and properties of the first run will continue
    * the properties of the cell unless explicitly changed).
    *
    * When writing, the new runs will overwrite any prior runs.  When writing a
    * new user_entered_value, previous runs are erased.
    */
  var textFormatRuns: js.UndefOr[js.Array[TextFormatRun]] = js.undefined
  /**
    * The format the user entered for the cell.
    *
    * When writing, the new format will be merged with the existing format.
    */
  var userEnteredFormat: js.UndefOr[CellFormat] = js.undefined
  /**
    * The value the user entered in the cell. e.g, `1234`, `'Hello'`, or `=NOW()`
    * Note: Dates, Times and DateTimes are represented as doubles in
    * serial number format.
    */
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

