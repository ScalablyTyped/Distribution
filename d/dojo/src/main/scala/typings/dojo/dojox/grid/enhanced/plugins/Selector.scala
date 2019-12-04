package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced._Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/Selector.html
  *
  * Provides standard extended selection for grid.
  * Supports mouse/keyboard selection, multi-selection, and de-selection.
  *
  * Acceptable plugin parameters:
  * The whole plugin parameter object is a config object passed to the setupConfig function.
  *
  * Acceptable cell parameters defined in layout:
  *
  * notselectable: Boolean: Whether this column is (and all the cells in it are) selectable.
  *
  * @param grid
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.Selector")
@js.native
class Selector protected () extends _Plugin {
  def this(grid: js.Any, args: js.Any) = this()
  /**
    * Clear all selections.
    *
    * @param type               Optional"row" or "col" or "cell". If omitted, clear all.
    */
  def clear(`type`: String): Unit = js.native
  /**
    *
    * @param type
    * @param rowIndex
    * @param colIndex
    */
  def deselect(`type`: js.Any, rowIndex: js.Any, colIndex: js.Any): Unit = js.native
  /**
    * Get last selected range of the given type.
    *
    * @param type
    */
  def getLastSelectedRange(`type`: js.Any): js.Any = js.native
  /**
    * Get an array of selected locations.
    *
    * @param type "row" or "col" or "cell"
    * @param includeExceptions Only meaningful for rows/columns. If true, all selected rows/cols, even they are partly selected, are all returned.
    */
  def getSelected(`type`: String, includeExceptions: Boolean): js.Any = js.native
  /**
    * Get the number of selected items.
    *
    * @param type "row" or "col" or "cell"
    * @param includeExceptions Only meaningful for rows/columns. If true, all selected rows/cols, even they are partly selected, are all returned.
    */
  def getSelectedCount(`type`: String, includeExceptions: Boolean): js.Any = js.native
  /**
    * Get the type of selected items.
    *
    */
  def getSelectedType(): js.Any = js.native
  /**
    * Check whether a location (a cell, a column or a row) is selected.
    *
    * @param type "row" or "col" or "cell"
    * @param rowIndex If type is "row" or "cell", this is the row index.If type if "col", this is the column index.
    * @param colIndex               OptionalOnly valid when type is "cell"
    */
  def isSelected(`type`: String, rowIndex: Double, colIndex: Double): js.Any = js.native
  /**
    * Check whether the user is currently selecting something.
    *
    * @param type "row" or "col" or "cell"
    */
  def isSelecting(`type`: String): js.Any = js.native
  /**
    *
    */
  def onSetStore(): Unit = js.native
  /**
    * Select a location (a cell, a column or a row).
    *
    * @param type "row" or "col" or "cell"
    * @param rowIndex If type is "row" or "cell", this is the row index.If type if "col", this is the column index.
    * @param colIndex               OptionalOnly valid when type is "cell"
    */
  def select(`type`: String, rowIndex: Double, colIndex: Double): Unit = js.native
  /**
    * Turn on/off this selection functionality if toEnable is provided.
    * Check whether this selection functionality is enabled if nothing is passed in.
    *
    * @param toEnable               OptionalTo enable or not.
    */
  def selectEnabled(toEnable: Boolean): js.Any = js.native
  /**
    * Select a continuous range (a block of cells, a set of continuous columns or rows)
    *
    * @param type "row" or "col" or "cell"
    * @param start If type is "row" or "col", this is the index of the starting row or column.If type if "cell", this is the left-top cell of the range.
    * @param end If type is "row" or "col", this is the index of the ending row or column.If type if "cell", this is the right-bottom cell of the range.
    * @param toSelect
    */
  def selectRange(`type`: String, start: js.Object, end: js.Object, toSelect: js.Any): Unit = js.native
  /**
    * Select a continuous range (a block of cells, a set of continuous columns or rows)
    *
    * @param type "row" or "col" or "cell"
    * @param start If type is "row" or "col", this is the index of the starting row or column.If type if "cell", this is the left-top cell of the range.
    * @param end If type is "row" or "col", this is the index of the ending row or column.If type if "cell", this is the right-bottom cell of the range.
    * @param toSelect
    */
  def selectRange(`type`: String, start: js.Object, end: Double, toSelect: js.Any): Unit = js.native
  /**
    * Select a continuous range (a block of cells, a set of continuous columns or rows)
    *
    * @param type "row" or "col" or "cell"
    * @param start If type is "row" or "col", this is the index of the starting row or column.If type if "cell", this is the left-top cell of the range.
    * @param end If type is "row" or "col", this is the index of the ending row or column.If type if "cell", this is the right-bottom cell of the range.
    * @param toSelect
    */
  def selectRange(`type`: String, start: Double, end: js.Object, toSelect: js.Any): Unit = js.native
  /**
    * Select a continuous range (a block of cells, a set of continuous columns or rows)
    *
    * @param type "row" or "col" or "cell"
    * @param start If type is "row" or "col", this is the index of the starting row or column.If type if "cell", this is the left-top cell of the range.
    * @param end If type is "row" or "col", this is the index of the ending row or column.If type if "cell", this is the right-bottom cell of the range.
    * @param toSelect
    */
  def selectRange(`type`: String, start: Double, end: Double, toSelect: js.Any): Unit = js.native
  /**
    * Set selection mode for row/col/cell.
    *
    * @param config An object with the following structure (all properties are optional):{    //Default is "multi", all other values are same as "multi".    row: false|"disabled"|"single",    col: false|"disabled"|"single",    cell: false|"disabled"|"single"}
    */
  def setupConfig(config: js.Object): Unit = js.native
  /**
    *
    * @param type
    * @param rowIndex
    * @param colIndex
    */
  def toggleSelect(`type`: js.Any, rowIndex: js.Any, colIndex: js.Any): Unit = js.native
}

