package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/CellMerge.html
  *
  * This plugin provides functions to merge(un-merge) adjacent cells within one row.
  * Acceptable plugin parameters:
  *
  * mergedCells: Array: An array of objects with structure:
  * {
  *     row: function(Integer)|Integer
  *         If it's a function, it's a predicate to decide which rows are to be merged.
  *         It takes an integer (the row index), and should return true or false;
  *     start: Integer
  *         The column index of the left most cell that shall be merged.
  *     end: Integer
  *         The column index of the right most cell that shall be merged.
  *     major: Integer
  *         The column index of the cell whose content should be used as the content of the merged cell.
  *         It must be larger than or equal to the startColumnIndex, and less than or equal to the endColumnIndex.
  *         If it is omitted, the content of the leading edge (left-most for ltr, right most for rtl) cell will be used.
  * }
  *
  * @param grid
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.CellMerge")
@js.native
class CellMerge protected () extends Plugin {
  def this(grid: js.Any, args: js.Any) = this()
  /**
    * Get all records of currently merged cells.
    *
    */
  def getMergedCells(): js.Any = js.native
  /**
    * Get the records of currently merged cells at the given row.
    *
    * @param rowIndex
    */
  def getMergedCellsByRow(rowIndex: js.Any): js.Any = js.native
  /**
    * Merge cells from startColumnIndex to endColumnIndex at rows that make rowTester return true,
    * using the content of the cell at majorColumnIndex
    *
    * @param rowTester If it's a function, it's a predicate to decide which rows are to be merged.It takes an integer (the row index), and should return true or false;
    * @param startColumnIndex The column index of the left most cell that shall be merged.
    * @param endColumnIndex The column index of the right most cell that shall be merged.
    * @param majorColumnIndex               OptionalThe column index of the cell whose content should be used as the content of the merged cell.It must be larger than or equal to the startColumnIndex, and less than or equal to the endColumnIndex.If it is omitted, the content of the leading edge (left-most for ltr, right most for rtl) cell will be used.
    */
  def mergeCells(rowTester: js.Any, startColumnIndex: Double, endColumnIndex: Double, majorColumnIndex: Double): js.Any = js.native
  /**
    * Unmerge the cells that are merged by the mergeHandler, which represents a call to the function mergeCells.
    *
    * @param mergeHandler A handler for the merged cells created by a call of function mergeCells.
    */
  def unmergeCells(mergeHandler: js.Object): Unit = js.native
}

