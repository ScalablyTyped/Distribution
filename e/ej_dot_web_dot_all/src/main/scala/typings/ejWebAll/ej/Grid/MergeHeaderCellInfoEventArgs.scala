package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeHeaderCellInfoEventArgs extends js.Object {
  /** Returns the column headers.
    */
  var columnHeaders: js.UndefOr[js.Any] = js.native
  /** Method to merge the header cells.
    */
  var headerCellMerge: js.UndefOr[js.Function2[/* startIndex */ Double, /* count */ Double, Unit]] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
}

object MergeHeaderCellInfoEventArgs {
  @scala.inline
  def apply(): MergeHeaderCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeHeaderCellInfoEventArgs]
  }
  @scala.inline
  implicit class MergeHeaderCellInfoEventArgsOps[Self <: MergeHeaderCellInfoEventArgs] (val x: Self) extends AnyVal {
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
    def setColumnHeaders(value: js.Any): Self = this.set("columnHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHeaders: Self = this.set("columnHeaders", js.undefined)
    @scala.inline
    def setHeaderCellMerge(value: (/* startIndex */ Double, /* count */ Double) => Unit): Self = this.set("headerCellMerge", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHeaderCellMerge: Self = this.set("headerCellMerge", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
  
}

