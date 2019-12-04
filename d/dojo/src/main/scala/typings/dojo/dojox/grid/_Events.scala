package typings.dojo.dojox.grid

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_Events.html
  *
  * _Grid mixin that provides default implementations for grid events.
  * Default synthetic events dispatched for _Grid. dojo.connect to events to
  * retain default implementation or override them for custom handling.
  *
  */
@JSGlobal("dojox.grid._Events")
@js.native
class _Events () extends js.Object {
  /**
    * css class to apply to grid cells over which the cursor is placed.
    *
    */
  var cellOverClass: String = js.native
  /**
    * Event fired when editing is applied for a given grid cell
    *
    * @param inValue Value from cell editor
    * @param inRowIndex Index of the grid row
    * @param inFieldIndex Index in the grid's data store
    */
  def onApplyCellEdit(inValue: String, inRowIndex: Double, inFieldIndex: Double): Unit = js.native
  /**
    * Event fired when editing is applied for a given grid row
    *
    * @param inRowIndex Index of the grid row
    */
  def onApplyEdit(inRowIndex: Double): Unit = js.native
  /**
    * Event to determine if a grid row may be deselected
    *
    * @param inRowIndex Index of the grid row
    */
  def onCanDeselect(inRowIndex: Double): js.Any = js.native
  /**
    * Event to determine if a grid row may be selected
    *
    * @param inRowIndex Index of the grid row
    */
  def onCanSelect(inRowIndex: Double): js.Any = js.native
  /**
    * Event fired when editing is cancelled for a given grid cell
    *
    * @param inRowIndex Index of the grid row
    */
  def onCancelEdit(inRowIndex: Double): Unit = js.native
  /**
    * Event fired when a cell is clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onCellClick(e: Event): Unit = js.native
  /**
    * Event fired when a cell context menu is accessed via mouse right click.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onCellContextMenu(e: Event): Unit = js.native
  /**
    * Event fired when a cell is double-clicked.
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onCellDblClick(e: Event): Unit = js.native
  /**
    * Event fired when a cell receives focus.
    *
    * @param inCell Cell object containing properties of the grid column.
    * @param inRowIndex Index of the grid row
    */
  def onCellFocus(inCell: js.Object, inRowIndex: Double): Unit = js.native
  /**
    * Event fired when mouse is down in a header cell.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onCellMouseDown(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves out of a cell.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onCellMouseOut(e: Event): Unit = js.native
  /**
    * Event fired when mouse is over a cell.
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onCellMouseOver(e: Event): Unit = js.native
  /**
    * Top level handler for Content events
    *
    * @param e
    */
  def onContentEvent(e: js.Any): Unit = js.native
  /**
    * Event fired when a grid row is deselected
    *
    * @param inRowIndex Index of the grid row
    */
  def onDeselected(inRowIndex: Double): Unit = js.native
  /**
    * Event fired when a header cell is clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellClick(e: Event): Unit = js.native
  /**
    * Event fired when a header cell context menu is accessed via mouse right click.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellContextMenu(e: Event): Unit = js.native
  /**
    * Event fired when a header cell is double clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellDblClick(e: Event): Unit = js.native
  /**
    * Event fired when mouse is down in a header cell.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellMouseDown(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves out of a header cell.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellMouseOut(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves over a header cell.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellMouseOver(e: Event): Unit = js.native
  /**
    * Event fired when the grid header is clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderClick(e: Event): Unit = js.native
  /**
    * Event fired when the grid header context menu is accessed via mouse right click.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderContextMenu(e: Event): Unit = js.native
  /**
    * Event fired when the grid header is double clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderDblClick(e: Event): Unit = js.native
  /**
    * Top level handler for header events
    *
    * @param e
    */
  def onHeaderEvent(e: js.Any): Unit = js.native
  /**
    * Event fired when mouse moves out of the grid header.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderMouseOut(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves over the grid header.
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onHeaderMouseOver(e: Event): Unit = js.native
  /**
    * Grid key event handler. By default enter begins editing and applies edits, escape cancels an edit,
    * tab, shift-tab, and arrow keys move grid cell focus.
    *
    * @param e
    */
  def onKeyDown(e: js.Any): Unit = js.native
  /**
    * top level handler for Key Events
    *
    * @param e
    */
  def onKeyEvent(e: js.Any): Unit = js.native
  /**
    * Event fired when mouse is down inside grid.
    *
    * @param e Decorated event object that contains reference to grid, cell, and rowIndex
    */
  def onMouseDown(e: Event): Unit = js.native
  /**
    * Event fired when mouse is down inside grid row
    *
    * @param e Decorated event object that contains reference to grid, cell, and rowIndex
    */
  def onMouseDownRow(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves out of the grid.
    *
    * @param e Decorated event object that contains reference to grid, cell, and rowIndex
    */
  def onMouseOut(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves out of any row (data or header).
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onMouseOutRow(e: Event): Unit = js.native
  /**
    * Event fired when mouse is over the grid.
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onMouseOver(e: Event): Unit = js.native
  /**
    * Event fired when mouse is over any row (data or header).
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onMouseOverRow(e: Event): Unit = js.native
  /**
    * Event fired when a row is clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onRowClick(e: Event): Unit = js.native
  /**
    * Event fired when a row context menu is accessed via mouse right click.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onRowContextMenu(e: Event): Unit = js.native
  /**
    * Event fired when a row is double clicked.
    *
    * @param e decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onRowDblClick(e: Event): Unit = js.native
  /**
    * Event fired when mouse is down in a row.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onRowMouseDown(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves out of a data row.
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onRowMouseOut(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves over a data row.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onRowMouseOver(e: Event): Unit = js.native
  /**
    * Event fired when a grid row is selected
    *
    * @param inRowIndex Index of the grid row
    */
  def onSelected(inRowIndex: Double): Unit = js.native
  /**
    *
    */
  def onSelectionChanged(): Unit = js.native
  /**
    * Event fired when editing is started for a given grid cell
    *
    * @param inCell Cell object containing properties of the grid column.
    * @param inRowIndex Index of the grid row
    */
  def onStartEdit(inCell: js.Object, inRowIndex: Double): Unit = js.native
  /**
    * Perform row styling on a given row. Called whenever row styling is updated.
    *
    * @param inRow Object containing row state information: selected, true if the row is selcted; over:true of the mouse is over the row; odd: true if the row is odd. Use customClasses andcustomStyles to control row css classes and styles; both properties are strings.
    */
  def onStyleRow(inRow: js.Object): Unit = js.native
}

