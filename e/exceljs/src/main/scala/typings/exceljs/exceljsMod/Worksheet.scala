package typings.exceljs.exceljsMod

import typings.exceljs.Anon_IncludeEmpty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worksheet extends js.Object {
  /**
  	 * A count of the number of columns that have values.
  	 */
  val actualColumnCount: Double = js.native
  /**
  	 * A count of the number of rows that have values. If a mid-document row is empty, it will not be included in the count.
  	 */
  val actualRowCount: Double = js.native
  /**
  	 * Apply an auto filter to your worksheet.
  	 */
  var autoFilter: js.UndefOr[AutoFilter] = js.native
  /**
  	 * The total column size of the document. Equal to the maximum cell count from all of the rows
  	 */
  val columnCount: Double = js.native
  /**
  	 * Add column headers and define column keys and widths.
  	 *
  	 * Note: these column structures are a workbook-building convenience only,
  	 * apart from the column width, they will not be fully persisted.
  	 */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  /**
  	 * Get the last editable row in a worksheet (or undefined if there are none)
  	 */
  val lastRow: js.UndefOr[Row] = js.native
  /**
  	 * Contains information related to how a worksheet is printed
  	 */
  var pageSetup: PageSetup = js.native
  /**
  	 * Worksheet Properties
  	 */
  var properties: WorksheetProperties = js.native
  /**
  	 * The total row size of the document. Equal to the row number of the last row that has values.
  	 */
  val rowCount: Double = js.native
  /**
  	 * Open panes representing the sheet
  	 */
  var views: js.Array[WorksheetView] = js.native
  /**
  	 * Using the image id from `Workbook.addImage`, set the background to the worksheet
  	 */
  def addBackgroundImage(imageId: String): Unit = js.native
  /**
  	 * Using the image id from `Workbook.addImage`,
  	 * embed an image within the worksheet to cover a range
  	 */
  def addImage(imageId: String, range: String): Unit = js.native
  def addImage(imageId: String, range: ImageRange): Unit = js.native
  def addRow(data: js.Any): Row = js.native
  /**
  	 * Add a couple of Rows by key-value, after the last current row, using the column keys,
  	 * or add a row by contiguous Array (assign to columns A, B & C)
  	 */
  def addRow(data: js.Array[_]): Row = js.native
  /**
  	 * Add multiple rows by providing an array of arrays or key-value pairs
  	 */
  def addRows(rows: js.Array[_]): Unit = js.native
  /**
  	 * Commit a completed worksheet to stream
  	 */
  def commit(): Unit = js.native
  /**
  	 * Iterate over all rows that have values in a worksheet
  	 */
  def eachRow(callback: js.Function2[/* row */ Row, /* rowNumber */ Double, Unit]): Unit = js.native
  /**
  	 * Iterate over all rows (including empty rows) in a worksheet
  	 */
  def eachRow(opt: Anon_IncludeEmpty, callback: js.Function2[/* row */ Row, /* rowNumber */ Double, Unit]): Unit = js.native
  /**
  	 * Get or create cell
  	 */
  def getCell(ref: String): Cell = js.native
  def getColumn(indexOrKey: String): Column with ColumnExtension = js.native
  /**
  	 * Access an individual columns by key, letter and 1-based column number
  	 */
  def getColumn(indexOrKey: Double): Column with ColumnExtension = js.native
  /**
  	 * Get or create row by 0-based index
  	 */
  def getRow(index: Double): Row = js.native
  def mergeCells(a: String): Unit = js.native
  def mergeCells(a: String, b: String): Unit = js.native
  def mergeCells(a: String, b: String, c: Double): Unit = js.native
  def mergeCells(a: String, b: String, c: Double, d: Double): Unit = js.native
  def mergeCells(a: String, b: Double): Unit = js.native
  def mergeCells(a: String, b: Double, c: Double): Unit = js.native
  def mergeCells(a: String, b: Double, c: Double, d: Double): Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: Double): Unit = js.native
  def mergeCells(a: Double, b: String): Unit = js.native
  def mergeCells(a: Double, b: String, c: Double): Unit = js.native
  def mergeCells(a: Double, b: String, c: Double, d: Double): Unit = js.native
  def mergeCells(a: Double, b: Double): Unit = js.native
  def mergeCells(a: Double, b: Double, c: Double): Unit = js.native
  def mergeCells(a: Double, b: Double, c: Double, d: Double): Unit = js.native
  /**
  	 * Cut one or more columns (columns to the right are shifted left)
  	 * and optionally insert more
  	 *
  	 * If column properties have been definde, they will be cut or moved accordingly
  	 *
  	 * Known Issue: If a splice causes any merged cells to move, the results may be unpredictable
  	 *
  	 * Also: If the worksheet has more rows than values in the colulmn inserts,
  	 * the rows will still be shifted as if the values existed
  	 */
  def spliceColumns(start: Double, count: Double, insert: js.Array[_]*): Unit = js.native
  /**
  	 * Cut one or more rows (rows below are shifted up)
  	 * and optionally insert more
  	 *
  	 * Known Issue: If a splice causes any merged cells to move, the results may be unpredictable
  	 */
  def spliceRows(start: Double, count: Double, insert: js.Array[_]*): Unit = js.native
  /**
  	 * unmerging the cells breaks the style links
  	 */
  def unMergeCells(cell: String): Unit = js.native
}

