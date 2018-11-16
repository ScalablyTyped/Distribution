package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLSort extends js.Object {
  /** This method is used to sort a particular range of cells based on its cell or font color in the Spreadsheet.
               * @param {string} Pass {{'`PutCellColor`' | markdownify}} to sort by cell color or {{'`PutFontColor`' | markdownify}} for sort by font color.
               * @param {any} Pass the HEX color code to sort.
               * @param {string} Pass the range
               * @returns {void}
               */
  def sortByColor(operation: java.lang.String, color: js.Any, range: java.lang.String): scala.Unit = js.native
  /** This method is used to sort a particular range of cells based on its values in the Spreadsheet.
               * @param {any[]|string} Pass the range to sort.
               * @param {string} Pass the column name.
               * @param {any} Pass the direction to sort (ascending or descending).
               * @returns {boolean}
               */
  def sortByRange(range: java.lang.String, columnName: java.lang.String, direction: js.Any): scala.Boolean = js.native
  /** This method is used to sort a particular range of cells based on its values in the Spreadsheet.
               * @param {any[]|string} Pass the range to sort.
               * @param {string} Pass the column name.
               * @param {any} Pass the direction to sort (ascending or descending).
               * @returns {boolean}
               */
  def sortByRange(range: js.Array[_], columnName: java.lang.String, direction: js.Any): scala.Boolean = js.native
}

