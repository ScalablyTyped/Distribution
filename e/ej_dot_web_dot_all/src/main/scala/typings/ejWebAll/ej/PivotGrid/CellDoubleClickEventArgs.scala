package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellDoubleClickEventArgs extends js.Object {
  /** returns the custom object bound with PivotGrid control.
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** returns the HTML element of PivotGrid control.
    */
  var element: js.UndefOr[js.Any] = js.native
  /** returns the JSON details of the double respective on cell.
    */
  var selectedData: js.UndefOr[js.Array[_]] = js.native
}

object CellDoubleClickEventArgs {
  @scala.inline
  def apply(): CellDoubleClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellDoubleClickEventArgs]
  }
  @scala.inline
  implicit class CellDoubleClickEventArgsOps[Self <: CellDoubleClickEventArgs] (val x: Self) extends AnyVal {
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
    def setCustomObject(value: js.Any): Self = this.set("customObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomObject: Self = this.set("customObject", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setSelectedDataVarargs(value: js.Any*): Self = this.set("selectedData", js.Array(value :_*))
    @scala.inline
    def setSelectedData(value: js.Array[_]): Self = this.set("selectedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedData: Self = this.set("selectedData", js.undefined)
  }
  
}

