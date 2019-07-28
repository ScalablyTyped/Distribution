package typings.dynatable.JQueryDynatableNs

import typings.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMColumns extends js.Object {
  /**
    * Add a new column at runtime
    *
    * @param $column A jQuery object containing the html markup for the `th`
    * @param position The position index indicating where we want to insert the new column
    * @param skipAppend A boolean allowing to skip the appending of the column header to table
    * @param skipUpdate A boolean allowing to skip the call to `dom.update()`
    */
  def add($column: JQuery, position: Double): Unit = js.native
  def add($column: JQuery, position: Double, skipAppend: Boolean): Unit = js.native
  def add($column: JQuery, position: Double, skipAppend: Boolean, skipUpdate: Boolean): Unit = js.native
  /**
    * Add several `data-` attributes on the provided `$cell`
    *
    * @param $cell A jQuery object pointing to the target cell
    * @return the modified jQuery object `$cell`
    */
  def attachGeneratedAttributes($cell: JQuery): JQuery = js.native
  /**
    * Generate a jQuery object if none is provided and decorate it by calling `attachGeneratedAttributes`
    *
    * @param $cell An optional jQuery object pointing to the target cell
    */
  def generate(): JQuery = js.native
  def generate($cell: JQuery): JQuery = js.native
  /**
    * Parse the table header row, analyse its cells and save the columns.
    *
    * @return Could return an `$.error()` if nothing is found.
    */
  def getFromTable(): Unit | JQuery = js.native
  /** Initializes `settings.table.columns` array and calls `getFromTable()` */
  def init(): Unit = js.native
  /**
    * Check if the `$element` is valid (if it is a `table`)
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean = js.native
  def remove(columnIndexOrId: String): Unit = js.native
  /**
    * Generate a jQuery object  if none is provided and decorate it by calling `attachGeneratedAttributes`
    *
    * @param columnIndexOrId A number (the column index) or a string (the column id)
    */
  def remove(columnIndexOrId: Double): Unit = js.native
  /**
    * Remove the column from `settings.table.columns`
    *
    * @param index A number (the column index)
    */
  def removeFromArray(index: Double): Unit = js.native
  /**
    * Remove the column from the DOM
    *
    * @param columnId A string matching the id used in `data-dynatable-column` attribute
    */
  def removeFromTable(columnId: String): Unit = js.native
}

