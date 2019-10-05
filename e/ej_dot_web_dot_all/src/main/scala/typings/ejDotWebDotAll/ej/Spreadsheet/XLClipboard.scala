package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLClipboard extends js.Object {
  /** This method is used to copy the selected cells in the Spreadsheet.
    * @returns {void}
    */
  def copy(): Unit
  /** This method is used to cut the selected cells in the Spreadsheet.
    * @returns {void}
    */
  def cut(): Unit
  /** This method is used to paste the cut or copied cells data in the Spreadsheet.
    * @returns {void}
    */
  def paste(): Unit
}

object XLClipboard {
  @scala.inline
  def apply(copy: () => Unit, cut: () => Unit, paste: () => Unit): XLClipboard = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), cut = js.Any.fromFunction0(cut), paste = js.Any.fromFunction0(paste))
  
    __obj.asInstanceOf[XLClipboard]
  }
}

