package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLClipboard extends js.Object {
  /** This method is used to copy the selected cells in the Spreadsheet.
    * @returns {void}
    */
  def copy(): scala.Unit
  /** This method is used to cut the selected cells in the Spreadsheet.
    * @returns {void}
    */
  def cut(): scala.Unit
  /** This method is used to paste the cut or copied cells data in the Spreadsheet.
    * @returns {void}
    */
  def paste(): scala.Unit
}

object XLClipboard {
  @scala.inline
  def apply(copy: js.Function0[scala.Unit], cut: js.Function0[scala.Unit], paste: js.Function0[scala.Unit]): XLClipboard = {
    val __obj = js.Dynamic.literal(copy = copy, cut = cut, paste = paste)
  
    __obj.asInstanceOf[XLClipboard]
  }
}

