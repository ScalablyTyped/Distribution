package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLPrint extends js.Object {
  /** This method is used to print the selected contents in the Spreadsheet.
    * @returns {void}
    */
  def printSelection(): Unit
  /** This method is used to print the entire contents in the active sheet.
    * @returns {void}
    */
  def printSheet(): Unit
}

object XLPrint {
  @scala.inline
  def apply(printSelection: () => Unit, printSheet: () => Unit): XLPrint = {
    val __obj = js.Dynamic.literal(printSelection = js.Any.fromFunction0(printSelection), printSheet = js.Any.fromFunction0(printSheet))
  
    __obj.asInstanceOf[XLPrint]
  }
}

