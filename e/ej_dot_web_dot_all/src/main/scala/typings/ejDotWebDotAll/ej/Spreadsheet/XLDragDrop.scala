package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLDragDrop extends js.Object {
  /** This method is used to drag and drop the selected range of cells to destination range in the Spreadsheet.
    * @param {any|any[]} Pass the source range to perform drag and drop.
    * @param {any|any[]} Pass the destination range to drop the dragged cells.
    * @returns {void}
    */
  def moveRangeTo(sourceRange: js.Any, destinationRange: js.Any): Unit = js.native
  def moveRangeTo(sourceRange: js.Any, destinationRange: js.Array[_]): Unit = js.native
  def moveRangeTo(sourceRange: js.Array[_], destinationRange: js.Any): Unit = js.native
  def moveRangeTo(sourceRange: js.Array[_], destinationRange: js.Array[_]): Unit = js.native
}

