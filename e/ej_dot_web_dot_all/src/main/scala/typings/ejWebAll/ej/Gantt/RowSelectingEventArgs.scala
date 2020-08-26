package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowSelectingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the data selecting record.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected row chart element.
    */
  var previousChartRow: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected data.
    */
  var previousData: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected row grid element.
    */
  var previousGridRow: js.UndefOr[js.Any] = js.native
  /** Returns the previous selected row index.
    */
  var previousIndex: js.UndefOr[String] = js.native
  /** Returns the index of selecting row record.
    */
  var recordIndex: js.UndefOr[String] = js.native
  /** Returns the selecting row chart element.
    */
  var targetChartRow: js.UndefOr[js.Any] = js.native
  /** Returns the selecting row grid element.
    */
  var targetGridRow: js.UndefOr[js.Any] = js.native
}

object RowSelectingEventArgs {
  @scala.inline
  def apply(): RowSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectingEventArgs]
  }
  @scala.inline
  implicit class RowSelectingEventArgsOps[Self <: RowSelectingEventArgs] (val x: Self) extends AnyVal {
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
    def setPreviousChartRow(value: js.Any): Self = this.set("previousChartRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousChartRow: Self = this.set("previousChartRow", js.undefined)
    @scala.inline
    def setPreviousData(value: js.Any): Self = this.set("previousData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousData: Self = this.set("previousData", js.undefined)
    @scala.inline
    def setPreviousGridRow(value: js.Any): Self = this.set("previousGridRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousGridRow: Self = this.set("previousGridRow", js.undefined)
    @scala.inline
    def setPreviousIndex(value: String): Self = this.set("previousIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousIndex: Self = this.set("previousIndex", js.undefined)
    @scala.inline
    def setRecordIndex(value: String): Self = this.set("recordIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordIndex: Self = this.set("recordIndex", js.undefined)
    @scala.inline
    def setTargetChartRow(value: js.Any): Self = this.set("targetChartRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetChartRow: Self = this.set("targetChartRow", js.undefined)
    @scala.inline
    def setTargetGridRow(value: js.Any): Self = this.set("targetGridRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGridRow: Self = this.set("targetGridRow", js.undefined)
  }
  
}

