package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data about a specific cell.
  */
@js.native
trait Schema$CellData extends js.Object {
  /**
    * A data validation rule on the cell, if any.  When writing, the new data
    * validation rule will overwrite any prior rule.
    */
  var dataValidation: js.UndefOr[Schema$DataValidationRule] = js.native
  /**
    * The effective format being used by the cell. This includes the results of
    * applying any conditional formatting and, if the cell contains a formula,
    * the computed number format. If the effective format is the default
    * format, effective format will not be written. This field is read-only.
    */
  var effectiveFormat: js.UndefOr[Schema$CellFormat] = js.native
  /**
    * The effective value of the cell. For cells with formulas, this is the
    * calculated value.  For cells with literals, this is the same as the
    * user_entered_value. This field is read-only.
    */
  var effectiveValue: js.UndefOr[Schema$ExtendedValue] = js.native
  /**
    * The formatted value of the cell. This is the value as it&#39;s shown to
    * the user. This field is read-only.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /**
    * A hyperlink this cell points to, if any. This field is read-only.  (To
    * set it, use a `=HYPERLINK` formula in the userEnteredValue.formulaValue
    * field.)
    */
  var hyperlink: js.UndefOr[String] = js.native
  /**
    * Any note on the cell.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * A pivot table anchored at this cell. The size of pivot table itself is
    * computed dynamically based on its data, grouping, filters, values, etc.
    * Only the top-left cell of the pivot table contains the pivot table
    * definition. The other cells will contain the calculated values of the
    * results of the pivot in their effective_value fields.
    */
  var pivotTable: js.UndefOr[Schema$PivotTable] = js.native
  /**
    * Runs of rich text applied to subsections of the cell.  Runs are only
    * valid on user entered strings, not formulas, bools, or numbers. Runs
    * start at specific indexes in the text and continue until the next run.
    * Properties of a run will continue unless explicitly changed in a
    * subsequent run (and properties of the first run will continue the
    * properties of the cell unless explicitly changed).  When writing, the new
    * runs will overwrite any prior runs.  When writing a new
    * user_entered_value, previous runs are erased.
    */
  var textFormatRuns: js.UndefOr[js.Array[Schema$TextFormatRun]] = js.native
  /**
    * The format the user entered for the cell.  When writing, the new format
    * will be merged with the existing format.
    */
  var userEnteredFormat: js.UndefOr[Schema$CellFormat] = js.native
  /**
    * The value the user entered in the cell. e.g, `1234`, `&#39;Hello&#39;`,
    * or `=NOW()` Note: Dates, Times and DateTimes are represented as doubles
    * in serial number format.
    */
  var userEnteredValue: js.UndefOr[Schema$ExtendedValue] = js.native
}

object Schema$CellData {
  @scala.inline
  def apply(
    dataValidation: Schema$DataValidationRule = null,
    effectiveFormat: Schema$CellFormat = null,
    effectiveValue: Schema$ExtendedValue = null,
    formattedValue: String = null,
    hyperlink: String = null,
    note: String = null,
    pivotTable: Schema$PivotTable = null,
    textFormatRuns: js.Array[Schema$TextFormatRun] = null,
    userEnteredFormat: Schema$CellFormat = null,
    userEnteredValue: Schema$ExtendedValue = null
  ): Schema$CellData = {
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
    __obj.asInstanceOf[Schema$CellData]
  }
}

