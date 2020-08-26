package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellData extends js.Object {
  /**
    * A data validation rule on the cell, if any.
    *
    * When writing, the new data validation rule will overwrite any prior rule.
    */
  var dataValidation: js.UndefOr[DataValidationRule] = js.native
  /**
    * The effective format being used by the cell.
    * This includes the results of applying any conditional formatting and,
    * if the cell contains a formula, the computed number format.
    * If the effective format is the default format, effective format will
    * not be written.
    * This field is read-only.
    */
  var effectiveFormat: js.UndefOr[CellFormat] = js.native
  /**
    * The effective value of the cell. For cells with formulas, this is
    * the calculated value.  For cells with literals, this is
    * the same as the user_entered_value.
    * This field is read-only.
    */
  var effectiveValue: js.UndefOr[ExtendedValue] = js.native
  /**
    * The formatted value of the cell.
    * This is the value as it's shown to the user.
    * This field is read-only.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /**
    * A hyperlink this cell points to, if any.
    * This field is read-only.  (To set it, use a `=HYPERLINK` formula
    * in the userEnteredValue.formulaValue
    * field.)
    */
  var hyperlink: js.UndefOr[String] = js.native
  /** Any note on the cell. */
  var note: js.UndefOr[String] = js.native
  /**
    * A pivot table anchored at this cell. The size of pivot table itself
    * is computed dynamically based on its data, grouping, filters, values,
    * etc. Only the top-left cell of the pivot table contains the pivot table
    * definition. The other cells will contain the calculated values of the
    * results of the pivot in their effective_value fields.
    */
  var pivotTable: js.UndefOr[PivotTable] = js.native
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
  var textFormatRuns: js.UndefOr[js.Array[TextFormatRun]] = js.native
  /**
    * The format the user entered for the cell.
    *
    * When writing, the new format will be merged with the existing format.
    */
  var userEnteredFormat: js.UndefOr[CellFormat] = js.native
  /**
    * The value the user entered in the cell. e.g, `1234`, `'Hello'`, or `=NOW()`
    * Note: Dates, Times and DateTimes are represented as doubles in
    * serial number format.
    */
  var userEnteredValue: js.UndefOr[ExtendedValue] = js.native
}

object CellData {
  @scala.inline
  def apply(): CellData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellData]
  }
  @scala.inline
  implicit class CellDataOps[Self <: CellData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataValidation(value: DataValidationRule): Self = this.set("dataValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataValidation: Self = this.set("dataValidation", js.undefined)
    @scala.inline
    def setEffectiveFormat(value: CellFormat): Self = this.set("effectiveFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveFormat: Self = this.set("effectiveFormat", js.undefined)
    @scala.inline
    def setEffectiveValue(value: ExtendedValue): Self = this.set("effectiveValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveValue: Self = this.set("effectiveValue", js.undefined)
    @scala.inline
    def setFormattedValue(value: String): Self = this.set("formattedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedValue: Self = this.set("formattedValue", js.undefined)
    @scala.inline
    def setHyperlink(value: String): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setPivotTable(value: PivotTable): Self = this.set("pivotTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotTable: Self = this.set("pivotTable", js.undefined)
    @scala.inline
    def setTextFormatRunsVarargs(value: TextFormatRun*): Self = this.set("textFormatRuns", js.Array(value :_*))
    @scala.inline
    def setTextFormatRuns(value: js.Array[TextFormatRun]): Self = this.set("textFormatRuns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextFormatRuns: Self = this.set("textFormatRuns", js.undefined)
    @scala.inline
    def setUserEnteredFormat(value: CellFormat): Self = this.set("userEnteredFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserEnteredFormat: Self = this.set("userEnteredFormat", js.undefined)
    @scala.inline
    def setUserEnteredValue(value: ExtendedValue): Self = this.set("userEnteredValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserEnteredValue: Self = this.set("userEnteredValue", js.undefined)
  }
  
}

