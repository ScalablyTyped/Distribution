package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueCellHyperlinkClickEventArgs extends js.Object {
  /** returns the information about the clicked cell
    */
  var args: js.UndefOr[js.Any] = js.native
  /** returns the custom object bound to the control.
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** returns the HTML element of the control.
    */
  var element: js.UndefOr[js.Any] = js.native
}

object ValueCellHyperlinkClickEventArgs {
  @scala.inline
  def apply(): ValueCellHyperlinkClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueCellHyperlinkClickEventArgs]
  }
  @scala.inline
  implicit class ValueCellHyperlinkClickEventArgsOps[Self <: ValueCellHyperlinkClickEventArgs] (val x: Self) extends AnyVal {
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setCustomObject(value: js.Any): Self = this.set("customObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomObject: Self = this.set("customObject", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
  }
  
}

