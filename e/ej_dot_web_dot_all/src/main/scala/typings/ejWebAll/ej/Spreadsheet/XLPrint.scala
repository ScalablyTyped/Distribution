package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLPrint extends js.Object {
  /** This method is used to print the selected contents in the Spreadsheet.
    * @returns {void}
    */
  def printSelection(): Unit = js.native
  /** This method is used to print the entire contents in the active sheet.
    * @returns {void}
    */
  def printSheet(): Unit = js.native
}

object XLPrint {
  @scala.inline
  def apply(printSelection: () => Unit, printSheet: () => Unit): XLPrint = {
    val __obj = js.Dynamic.literal(printSelection = js.Any.fromFunction0(printSelection), printSheet = js.Any.fromFunction0(printSheet))
    __obj.asInstanceOf[XLPrint]
  }
  @scala.inline
  implicit class XLPrintOps[Self <: XLPrint] (val x: Self) extends AnyVal {
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
    def setPrintSelection(value: () => Unit): Self = this.set("printSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setPrintSheet(value: () => Unit): Self = this.set("printSheet", js.Any.fromFunction0(value))
  }
  
}

