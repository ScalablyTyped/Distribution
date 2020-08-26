package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the data of edited cell record..
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns state of a record whether it is in expanded or collapsed state.
    */
  var expanded: js.UndefOr[Boolean] = js.native
  /** Returns the row index of collapsing record.
    */
  var recordIndex: js.UndefOr[Double] = js.native
}

object CollapsingEventArgs {
  @scala.inline
  def apply(): CollapsingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsingEventArgs]
  }
  @scala.inline
  implicit class CollapsingEventArgsOps[Self <: CollapsingEventArgs] (val x: Self) extends AnyVal {
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
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setRecordIndex(value: Double): Self = this.set("recordIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordIndex: Self = this.set("recordIndex", js.undefined)
  }
  
}

