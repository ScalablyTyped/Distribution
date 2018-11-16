package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

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
  var colCount: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates to define column width in the Spreadsheet.
               * @Default {64}
               */
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets the data to render the Spreadsheet.
               * @Default {null}
               */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable field as column header in the Spreadsheet.
               * @Default {false}
               */
  var fieldAsColumnHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value to freeze columns in the Spreadsheet.
               * @Default {0}
               */
  var frozenColumns: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value to freeze rows in the Spreadsheet.
               * @Default {0}
               */
  var frozenRows: js.UndefOr[scala.Double] = js.undefined
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
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
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
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the rows for a sheet in Spreadsheet.
               * @Default {[]}
               */
  var rows: js.UndefOr[js.Array[SheetsRow]] = js.undefined
  /** Specifies the name for sheet in the Spreadsheet.
               * @Default {string}
               */
  var sheetName: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to show or hide grid lines in the Spreadsheet.
               * @Default {true}
               */
  var showGridlines: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
               * @Default {true}
               */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show or hide headings in the Spreadsheet.
               * @Default {true}
               */
  var showHeadings: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the start cell for the datasource range in Spreadsheet.
               * @Default {A1}
               */
  var startCell: js.UndefOr[java.lang.String] = js.undefined
}

