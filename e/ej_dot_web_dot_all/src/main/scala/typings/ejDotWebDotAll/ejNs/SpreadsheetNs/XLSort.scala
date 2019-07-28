package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLSort extends js.Object {
  /** This method is used to sort a particular range of cells based on its cell or font color in the Spreadsheet.
    * @param {string} Pass {{'`PutCellColor`' | markdownify}} to sort by cell color or {{'`PutFontColor`' | markdownify}} for sort by font color.
    * @param {Spreadsheet.ColorOptions} Pass Object ColorOptions.
    * @param {string} Pass the range
    * @returns {void}
    */
  def sortByColor(operation: String, color: ColorOptions, range: String): Unit = js.native
  def sortByRange(range: String, columnName: String, direction: String): Boolean = js.native
  /** This method is used to sort a particular range of cells based on its values in the Spreadsheet.
    * @param {any[]|string} Pass the range to sort.
    * @param {string} Pass the column name.
    * @param {string} Pass the direction to sort
    * @returns {boolean}
    */
  def sortByRange(range: js.Array[_], columnName: String, direction: String): Boolean = js.native
}

