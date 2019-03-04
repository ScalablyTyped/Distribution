package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLPrint extends js.Object {
  /** This method is used to print the selected contents in the Spreadsheet.
    * @returns {void}
    */
  def printSelection(): scala.Unit
  /** This method is used to print the entire contents in the active sheet.
    * @returns {void}
    */
  def printSheet(): scala.Unit
}

object XLPrint {
  @scala.inline
  def apply(printSelection: js.Function0[scala.Unit], printSheet: js.Function0[scala.Unit]): XLPrint = {
    val __obj = js.Dynamic.literal(printSelection = printSelection, printSheet = printSheet)
  
    __obj.asInstanceOf[XLPrint]
  }
}

