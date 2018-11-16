package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

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
               * The effective value of the cell. For cells with formulas, this will be
               * the calculated value.  For cells with literals, this will be
               * the same as the user_entered_value.
               * This field is read-only.
               */
  var effectiveValue: js.UndefOr[ExtendedValue] = js.undefined
  /**
               * The formatted value of the cell.
               * This is the value as it's shown to the user.
               * This field is read-only.
               */
  var formattedValue: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A hyperlink this cell points to, if any.
               * This field is read-only.  (To set it, use a `=HYPERLINK` formula
               * in the userEnteredValue.formulaValue
               * field.)
               */
  var hyperlink: js.UndefOr[java.lang.String] = js.undefined
  /** Any note on the cell. */
  var note: js.UndefOr[java.lang.String] = js.undefined
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
               * new user_entered_value, previous runs will be erased.
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

