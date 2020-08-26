package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotalValue extends js.Object {
  var component: js.UndefOr[dxDataGrid] = js.native
  var groupIndex: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var summaryProcess: js.UndefOr[String] = js.native
  var totalValue: js.UndefOr[js.Any] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object TotalValue {
  @scala.inline
  def apply(): TotalValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalValue]
  }
  @scala.inline
  implicit class TotalValueOps[Self <: TotalValue] (val x: Self) extends AnyVal {
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
    def setComponent(value: dxDataGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIndex: Self = this.set("groupIndex", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSummaryProcess(value: String): Self = this.set("summaryProcess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryProcess: Self = this.set("summaryProcess", js.undefined)
    @scala.inline
    def setTotalValue(value: js.Any): Self = this.set("totalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalValue: Self = this.set("totalValue", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

