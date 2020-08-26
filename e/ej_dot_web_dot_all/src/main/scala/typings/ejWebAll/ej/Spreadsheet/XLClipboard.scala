package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLClipboard extends js.Object {
  /** This method is used to copy the selected cells in the Spreadsheet.
    * @returns {void}
    */
  def copy(): Unit = js.native
  /** This method is used to cut the selected cells in the Spreadsheet.
    * @returns {void}
    */
  def cut(): Unit = js.native
  /** This method is used to paste the cut or copied cells data in the Spreadsheet.
    * @returns {void}
    */
  def paste(): Unit = js.native
}

object XLClipboard {
  @scala.inline
  def apply(copy: () => Unit, cut: () => Unit, paste: () => Unit): XLClipboard = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), cut = js.Any.fromFunction0(cut), paste = js.Any.fromFunction0(paste))
    __obj.asInstanceOf[XLClipboard]
  }
  @scala.inline
  implicit class XLClipboardOps[Self <: XLClipboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopy(value: () => Unit): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCut(value: () => Unit): Self = this.set("cut", js.Any.fromFunction0(value))
    @scala.inline
    def setPaste(value: () => Unit): Self = this.set("paste", js.Any.fromFunction0(value))
  }
  
}

