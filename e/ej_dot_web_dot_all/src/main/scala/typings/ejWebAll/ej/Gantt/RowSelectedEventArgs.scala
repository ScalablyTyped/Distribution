package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the data of selected record.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the index of selecting row record.
    */
  var recordIndex: js.UndefOr[Double] = js.native
  /** Returns the selecting row element.
    */
  var targetRow: js.UndefOr[js.Any] = js.native
}

object RowSelectedEventArgs {
  @scala.inline
  def apply(): RowSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectedEventArgs]
  }
  @scala.inline
  implicit class RowSelectedEventArgsOps[Self <: RowSelectedEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setRecordIndex(value: Double): Self = this.set("recordIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordIndex: Self = this.set("recordIndex", js.undefined)
    @scala.inline
    def setTargetRow(value: js.Any): Self = this.set("targetRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetRow: Self = this.set("targetRow", js.undefined)
  }
  
}

