package typings
package dynatableLib.JQueryDynatableNs

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
  def add($column: dynatableLib.JQuery, position: scala.Double): scala.Unit = js.native
  def add($column: dynatableLib.JQuery, position: scala.Double, skipAppend: scala.Boolean): scala.Unit = js.native
  def add(
    $column: dynatableLib.JQuery,
    position: scala.Double,
    skipAppend: scala.Boolean,
    skipUpdate: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Add several `data-` attributes on the provided `$cell`
    *
    * @param $cell A jQuery object pointing to the target cell
    * @return the modified jQuery object `$cell`
    */
  def attachGeneratedAttributes($cell: dynatableLib.JQuery): dynatableLib.JQuery = js.native
  /**
    * Generate a jQuery object if none is provided and decorate it by calling `attachGeneratedAttributes`
    *
    * @param $cell An optional jQuery object pointing to the target cell
    */
  def generate(): dynatableLib.JQuery = js.native
  def generate($cell: dynatableLib.JQuery): dynatableLib.JQuery = js.native
  /**
    * Parse the table header row, analyse its cells and save the columns.
    *
    * @return Could return an `$.error()` if nothing is found.
    */
  def getFromTable(): scala.Unit | dynatableLib.JQuery = js.native
  /** Initializes `settings.table.columns` array and calls `getFromTable()` */
  def init(): scala.Unit = js.native
  /**
    * Check if the `$element` is valid (if it is a `table`)
    *
    * @return A boolean
    */
  def initOnLoad(): scala.Boolean = js.native
  def remove(columnIndexOrId: java.lang.String): scala.Unit = js.native
  /**
    * Generate a jQuery object  if none is provided and decorate it by calling `attachGeneratedAttributes`
    *
    * @param columnIndexOrId A number (the column index) or a string (the column id)
    */
  def remove(columnIndexOrId: scala.Double): scala.Unit = js.native
  /**
    * Remove the column from `settings.table.columns`
    *
    * @param index A number (the column index)
    */
  def removeFromArray(index: scala.Double): scala.Unit = js.native
  /**
    * Remove the column from the DOM
    *
    * @param columnId A string matching the id used in `data-dynatable-column` attribute
    */
  def removeFromTable(columnId: java.lang.String): scala.Unit = js.native
}

