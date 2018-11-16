package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLFilter extends js.Object {
  /** This method is used to clear the filter in filtered columns in the Spreadsheet.
               * @returns {void}
               */
  def clearFilter(): scala.Unit = js.native
  /** This method is used to apply filter for the selected range of cells in the Spreadsheet.
               * @param {string|any[]} Pass the range of the selected cells.
               * @returns {void}
               */
  def filter(range: java.lang.String): scala.Unit = js.native
  /** This method is used to apply filter for the selected range of cells in the Spreadsheet.
               * @param {string|any[]} Pass the range of the selected cells.
               * @returns {void}
               */
  def filter(range: js.Array[_]): scala.Unit = js.native
  /** This method is used to apply filter for the column by active cell's value in the Spreadsheet.
               * @returns {void}
               */
  def filterByActiveCell(): scala.Unit = js.native
}

