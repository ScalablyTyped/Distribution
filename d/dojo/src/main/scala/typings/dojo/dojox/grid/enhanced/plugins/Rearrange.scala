package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced._Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/Rearrange.html
  *
  * Provides a set of method to re-arrange the structure of grid.
  *
  * @param grid
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.Rearrange")
@js.native
class Rearrange protected () extends _Plugin {
  def this(grid: js.Any, args: js.Any) = this()
  /**
    *
    * @param sourceGrid
    * @param cellsToMove
    * @param target
    */
  def changeCells(sourceGrid: js.Any, cellsToMove: js.Any, target: js.Any): Unit = js.native
  /**
    *
    * @param cellsToClear
    */
  def clearCells(cellsToClear: js.Any): Unit = js.native
  /**
    *
    * @param cellsToMove
    * @param target
    */
  def copyCells(cellsToMove: js.Any, target: js.Any): Unit = js.native
  /**
    *
    * @param sourceGrid
    * @param rowsToMove
    * @param targetPos
    */
  def insertRows(sourceGrid: js.Any, rowsToMove: js.Any, targetPos: js.Any): Unit = js.native
  /**
    *
    * @param cellsToMove
    * @param target
    */
  def moveCells(cellsToMove: js.Any, target: js.Any): Unit = js.native
  /**
    * Move a set of columns to a given position.
    *
    * @param colsToMove Array of column indexes.
    * @param targetPos The target position
    */
  def moveColumns(colsToMove: js.Array[Double], targetPos: Double): Unit = js.native
  /**
    * Move a set of rows to a given position
    *
    * @param rowsToMove Array of row indexes.
    * @param targetPos The target position
    */
  def moveRows(rowsToMove: js.Array[Double], targetPos: Double): Unit = js.native
  /**
    *
    * @param rowsToRemove
    */
  def removeRows(rowsToRemove: js.Any): Unit = js.native
  /**
    *
    * @param args
    */
  def setArgs(args: js.Any): Unit = js.native
}

