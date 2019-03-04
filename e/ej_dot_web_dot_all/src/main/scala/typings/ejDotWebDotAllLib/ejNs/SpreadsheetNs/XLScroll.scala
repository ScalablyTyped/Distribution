package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLScroll extends js.Object {
  /** This method is used to scroll the sheet content to the specified cell address in the Spreadsheet.
    * @param {string} Pass the cell address that you want to scroll to it.
    * @returns {void}
    */
  def scrollToCell(range: java.lang.String): scala.Unit
}

object XLScroll {
  @scala.inline
  def apply(scrollToCell: js.Function1[java.lang.String, scala.Unit]): XLScroll = {
    val __obj = js.Dynamic.literal(scrollToCell = scrollToCell)
  
    __obj.asInstanceOf[XLScroll]
  }
}

