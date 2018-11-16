package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worksheet extends js.Object {
  /**
  	 * A count of the number of columns that have values.
  	 */
  val actualColumnCount: scala.Double = js.native
  /**
  	 * A count of the number of rows that have values. If a mid-document row is empty, it will not be included in the count.
  	 */
  val actualRowCount: scala.Double = js.native
  /**
  	 * Apply an auto filter to your worksheet.
  	 */
  var autoFilter: js.UndefOr[AutoFilter] = js.native
  /**
  	 * The total column size of the document. Equal to the maximum cell count from all of the rows
  	 */
  val columnCount: scala.Double = js.native
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
  val rowCount: scala.Double = js.native
  /**
  	 * Open panes representing the sheet
  	 */
  var views: js.Array[WorksheetView] = js.native
  /**
  	 * Using the image id from `Workbook.addImage`, set the background to the worksheet
  	 */
  def addBackgroundImage(imageId: java.lang.String): scala.Unit = js.native
  /**
  	 * Using the image id from `Workbook.addImage`,
  	 * embed an image within the worksheet to cover a range
  	 */
  def addImage(imageId: java.lang.String, range: ImageRange): scala.Unit = js.native
  /**
  	 * Using the image id from `Workbook.addImage`,
  	 * embed an image within the worksheet to cover a range
  	 */
  def addImage(imageId: java.lang.String, range: java.lang.String): scala.Unit = js.native
  /**
  	 * Add a couple of Rows by key-value, after the last current row, using the column keys,
  	 * or add a row by contiguous Array (assign to columns A, B & C)
  	 */
  def addRow(data: js.Any): Row = js.native
  /**
  	 * Add a couple of Rows by key-value, after the last current row, using the column keys,
  	 * or add a row by contiguous Array (assign to columns A, B & C)
  	 */
  def addRow(data: js.Array[_]): Row = js.native
  /**
  	 * Add multiple rows by providing an array of arrays or key-value pairs
  	 */
  def addRows(rows: js.Array[_]): scala.Unit = js.native
  /**
  	 * Commit a completed worksheet to stream
  	 */
  def commit(): scala.Unit = js.native
  /**
  	 * Iterate over all rows that have values in a worksheet
  	 */
  def eachRow(callback: js.Function2[/* row */ Row, /* rowNumber */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
  	 * Iterate over all rows (including empty rows) in a worksheet
  	 */
  def eachRow(
    opt: exceljsLib.Anon_IncludeEmpty,
    callback: js.Function2[/* row */ Row, /* rowNumber */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
  	 * Get or create cell
  	 */
  def getCell(ref: java.lang.String): Cell = js.native
  /**
  	 * Access an individual columns by key, letter and 1-based column number
  	 */
  def getColumn(indexOrKey: java.lang.String): Column with ColumnExtension = js.native
  /**
  	 * Access an individual columns by key, letter and 1-based column number
  	 */
  def getColumn(indexOrKey: scala.Double): Column with ColumnExtension = js.native
  /**
  	 * Get or create row by 0-based index
  	 */
  def getRow(index: scala.Double): Row = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: java.lang.String): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: java.lang.String, b: java.lang.String): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: java.lang.String, b: java.lang.String, c: scala.Double): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: java.lang.String, b: java.lang.String, c: scala.Double, d: scala.Double): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: java.lang.String, b: scala.Double): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: java.lang.String, b: scala.Double, c: scala.Double): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: java.lang.String, b: scala.Double, c: scala.Double, d: scala.Double): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: scala.Double): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: scala.Double, b: java.lang.String): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: scala.Double, b: java.lang.String, c: scala.Double): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: scala.Double, b: java.lang.String, c: scala.Double, d: scala.Double): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: scala.Double, b: scala.Double): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: scala.Double, b: scala.Double, c: scala.Double): scala.Unit = js.native
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(a: scala.Double, b: scala.Double, c: scala.Double, d: scala.Double): scala.Unit = js.native
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
  def spliceColumns(start: scala.Double, count: scala.Double, insert: js.Array[_]*): scala.Unit = js.native
  /**
  	 * Cut one or more rows (rows below are shifted up)
  	 * and optionally insert more
  	 *
  	 * Known Issue: If a splice causes any merged cells to move, the results may be unpredictable
  	 */
  def spliceRows(start: scala.Double, count: scala.Double, insert: js.Array[_]*): scala.Unit = js.native
  /**
  	 * unmerging the cells breaks the style links
  	 */
  def unMergeCells(cell: java.lang.String): scala.Unit = js.native
}

