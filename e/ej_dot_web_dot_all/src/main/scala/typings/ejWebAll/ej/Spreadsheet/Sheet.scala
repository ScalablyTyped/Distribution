package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet extends js.Object {
  /** Specifies the border for the cell in the Spreadsheet.
    * @Default {[]}
    */
  var border: js.UndefOr[js.Array[SheetsBorder]] = js.undefined
  /** Specifies the conditional formatting for the range of cell in Spreadsheet.
    * @Default {[]}
    */
  var cFormatRule: js.UndefOr[js.Array[SheetsCFormatRule]] = js.undefined
  /** Specifies the cell types for a cell or range in Spreadsheet.
    * @Default {[]}
    */
  var cellTypes: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates to define column count in the Spreadsheet.
    * @Default {21}
    */
  var colCount: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that indicates to define column width in the Spreadsheet.
    * @Default {64}
    */
  var columnWidth: js.UndefOr[Double] = js.undefined
  /** Gets or sets the data to render the Spreadsheet.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable field as column header in the Spreadsheet.
    * @Default {false}
    */
  var fieldAsColumnHeader: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value to freeze columns in the Spreadsheet.
    * @Default {0}
    */
  var frozenColumns: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value to freeze rows in the Spreadsheet.
    * @Default {0}
    */
  var frozenRows: js.UndefOr[Double] = js.undefined
  /** Specifies the header styles for the headers in datasource range.
    * @Default {null}
    */
  var headerStyles: js.UndefOr[js.Any] = js.undefined
  /** To hide the specified columns in Spreadsheet.
    * @Default {[]}
    */
  var hideColumns: js.UndefOr[js.Array[_]] = js.undefined
  /** To hide the specified rows in Spreadsheet.
    * @Default {[]}
    */
  var hideRows: js.UndefOr[js.Array[_]] = js.undefined
  /** To merge specified ranges in Spreadsheet.
    * @Default {[]}
    */
  var mergeCells: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the primary key for the datasource in Spreadsheet.
    */
  var primaryKey: js.UndefOr[String] = js.undefined
  /** Specifies the query for the dataSource in Spreadsheet.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Specifies single range or multiple range settings for a sheet in Spreadsheet.
    * @Default {[]}
    */
  var rangeSettings: js.UndefOr[js.Array[SheetsRangeSetting]] = js.undefined
  /** Gets or sets a value that indicates to define row count in the Spreadsheet.
    * @Default {20}
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  /** Specifies the rows for a sheet in Spreadsheet.
    * @Default {[]}
    */
  var rows: js.UndefOr[js.Array[SheetsRow]] = js.undefined
  /** Specifies the name for sheet in the Spreadsheet.
    * @Default {string}
    */
  var sheetName: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates whether to show or hide grid lines in the Spreadsheet.
    * @Default {true}
    */
  var showGridlines: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show or hide headings in the Spreadsheet.
    * @Default {true}
    */
  var showHeadings: js.UndefOr[Boolean] = js.undefined
  /** Specifies the start cell for the datasource range in Spreadsheet.
    * @Default {A1}
    */
  var startCell: js.UndefOr[String] = js.undefined
}

object Sheet {
  @scala.inline
  def apply(
    border: js.Array[SheetsBorder] = null,
    cFormatRule: js.Array[SheetsCFormatRule] = null,
    cellTypes: js.Array[_] = null,
    colCount: Int | Double = null,
    columnWidth: Int | Double = null,
    dataSource: js.Any = null,
    fieldAsColumnHeader: js.UndefOr[Boolean] = js.undefined,
    frozenColumns: Int | Double = null,
    frozenRows: Int | Double = null,
    headerStyles: js.Any = null,
    hideColumns: js.Array[_] = null,
    hideRows: js.Array[_] = null,
    mergeCells: js.Array[_] = null,
    primaryKey: String = null,
    query: js.Any = null,
    rangeSettings: js.Array[SheetsRangeSetting] = null,
    rowCount: Int | Double = null,
    rows: js.Array[SheetsRow] = null,
    sheetName: String = null,
    showGridlines: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    showHeadings: js.UndefOr[Boolean] = js.undefined,
    startCell: String = null
  ): Sheet = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (cFormatRule != null) __obj.updateDynamic("cFormatRule")(cFormatRule.asInstanceOf[js.Any])
    if (cellTypes != null) __obj.updateDynamic("cellTypes")(cellTypes.asInstanceOf[js.Any])
    if (colCount != null) __obj.updateDynamic("colCount")(colCount.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldAsColumnHeader)) __obj.updateDynamic("fieldAsColumnHeader")(fieldAsColumnHeader.asInstanceOf[js.Any])
    if (frozenColumns != null) __obj.updateDynamic("frozenColumns")(frozenColumns.asInstanceOf[js.Any])
    if (frozenRows != null) __obj.updateDynamic("frozenRows")(frozenRows.asInstanceOf[js.Any])
    if (headerStyles != null) __obj.updateDynamic("headerStyles")(headerStyles.asInstanceOf[js.Any])
    if (hideColumns != null) __obj.updateDynamic("hideColumns")(hideColumns.asInstanceOf[js.Any])
    if (hideRows != null) __obj.updateDynamic("hideRows")(hideRows.asInstanceOf[js.Any])
    if (mergeCells != null) __obj.updateDynamic("mergeCells")(mergeCells.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (rangeSettings != null) __obj.updateDynamic("rangeSettings")(rangeSettings.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridlines)) __obj.updateDynamic("showGridlines")(showGridlines.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeadings)) __obj.updateDynamic("showHeadings")(showHeadings.asInstanceOf[js.Any])
    if (startCell != null) __obj.updateDynamic("startCell")(startCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sheet]
  }
}

