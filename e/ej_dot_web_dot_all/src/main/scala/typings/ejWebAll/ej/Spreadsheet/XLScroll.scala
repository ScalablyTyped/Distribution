package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLScroll extends js.Object {
  /** This method is used to scroll the sheet content to the specified cell address in the Spreadsheet.
    * @param {string} Pass the cell address that you want to scroll to it.
    * @returns {void}
    */
  def scrollToCell(range: String): Unit = js.native
}

object XLScroll {
  @scala.inline
  def apply(scrollToCell: String => Unit): XLScroll = {
    val __obj = js.Dynamic.literal(scrollToCell = js.Any.fromFunction1(scrollToCell))
    __obj.asInstanceOf[XLScroll]
  }
  @scala.inline
  implicit class XLScrollOps[Self <: XLScroll] (val x: Self) extends AnyVal {
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
    def setScrollToCell(value: String => Unit): Self = this.set("scrollToCell", js.Any.fromFunction1(value))
  }
  
}

