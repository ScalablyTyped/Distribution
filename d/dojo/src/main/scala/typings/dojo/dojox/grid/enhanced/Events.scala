package typings.dojo.dojox.grid.enhanced

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/_Events.html
  *
  * Overwrite some default events of DataGrid
  * Methods are copied or replaced for overwriting, this might be refined once
  * an overall plugin architecture is set up for DataGrid.
  *
  * @param inGrid
  */
@JSGlobal("dojox.grid.enhanced._Events")
@js.native
class Events protected () extends js.Object {
  def this(inGrid: js.Any) = this()
  /**
    * css class to apply to grid content cells when activated(mouse down)
    *
    */
  var cellActiveClass: String = js.native
  /**
    * css class to apply to grid header cells when activated(mouse down)
    *
    */
  var headerCellActiveClass: String = js.native
  /**
    * css class to apply to grid rows when activated(mouse down)
    *
    */
  var rowActiveClass: String = js.native
  /**
    * Grid key up event handler.
    *
    * @param e Un-decorated event object
    */
  def dokeyup(e: Event_): Unit = js.native
  /**
    *
    * @param e
    */
  def domousedown(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def domouseup(e: js.Any): Unit = js.native
  /**
    * Overwritten, see dojox.grid._Events.onCellClick()
    *
    * @param e
    */
  def onCellClick(e: js.Any): Unit = js.native
  /**
    * Overwritten, see dojox.grid._Events.onCellDblClick()
    *
    * @param e
    */
  def onCellDblClick(e: js.Any): Unit = js.native
  /**
    * Overwritten, see dojox.grid._Events.onCellMouseDown()
    *
    * @param e
    */
  def onCellMouseDown(e: js.Any): Unit = js.native
  /**
    * New - Event fired when mouse is up inside content cell.
    *
    * @param e Decorated event object that contains reference to grid, cell, and rowIndex
    */
  def onCellMouseUp(e: Event_): Unit = js.native
  /**
    * Overwritten, see dojox.grid._Events.onHeaderCellClick()
    *
    * @param e
    */
  def onHeaderCellClick(e: js.Any): Unit = js.native
  /**
    * Overwritten, see dojox.grid._Events.onHeaderCellMouseDown()
    *
    * @param e
    */
  def onHeaderCellMouseDown(e: js.Any): Unit = js.native
  /**
    * Overwritten, see dojox.grid._Events.onHeaderCellMouseOut()
    *
    * @param e
    */
  def onHeaderCellMouseOut(e: js.Any): Unit = js.native
  /**
    * New event
    *
    * @param e
    */
  def onHeaderCellMouseUp(e: js.Any): Unit = js.native
  /**
    * Overwritten, see dojox.grid._Events.onKeyDown();
    *
    * @param e
    */
  def onKeyDown(e: js.Any): Unit = js.native
  /**
    * New - Event fired when mouse is up inside grid.
    *
    * @param e Decorated event object that contains reference to grid, cell, and rowIndex
    */
  def onMouseUp(e: Event_): Unit = js.native
  /**
    *
    * @param e
    */
  def onMouseUpRow(e: js.Any): Unit = js.native
  /**
    * Overwritten, see dojox.grid._Events.onRowClick()
    *
    * @param e
    */
  def onRowClick(e: js.Any): Unit = js.native
  /**
    * Overwritten, see dojox.grid._Events.onRowContextMenu()
    *
    * @param e
    */
  def onRowContextMenu(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def onRowMouseUp(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def onRowSelectorMouseDown(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def onRowSelectorMouseUp(e: js.Any): Unit = js.native
  /**
    * New - Event fired when a selected region context menu is accessed via mouse right click.
    *
    * @param e Decorated event object which contains reference to grid and info of selectedregions(selection type - row|column, selected index - [...])
    */
  def onSelectedRegionContextMenu(e: Event_): Unit = js.native
}

