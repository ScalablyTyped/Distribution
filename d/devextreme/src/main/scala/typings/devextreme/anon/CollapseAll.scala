package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseAll extends js.Object {
  var collapseAll: js.UndefOr[String] = js.native
  var dataNotAvailable: js.UndefOr[String] = js.native
  var expandAll: js.UndefOr[String] = js.native
  var exportToExcel: js.UndefOr[String] = js.native
  var grandTotal: js.UndefOr[String] = js.native
  var noData: js.UndefOr[String] = js.native
  var removeAllSorting: js.UndefOr[String] = js.native
  var showFieldChooser: js.UndefOr[String] = js.native
  var sortColumnBySummary: js.UndefOr[String] = js.native
  var sortRowBySummary: js.UndefOr[String] = js.native
  var total: js.UndefOr[String] = js.native
}

object CollapseAll {
  @scala.inline
  def apply(): CollapseAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseAll]
  }
  @scala.inline
  implicit class CollapseAllOps[Self <: CollapseAll] (val x: Self) extends AnyVal {
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
    def setCollapseAll(value: String): Self = this.set("collapseAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseAll: Self = this.set("collapseAll", js.undefined)
    @scala.inline
    def setDataNotAvailable(value: String): Self = this.set("dataNotAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataNotAvailable: Self = this.set("dataNotAvailable", js.undefined)
    @scala.inline
    def setExpandAll(value: String): Self = this.set("expandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandAll: Self = this.set("expandAll", js.undefined)
    @scala.inline
    def setExportToExcel(value: String): Self = this.set("exportToExcel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportToExcel: Self = this.set("exportToExcel", js.undefined)
    @scala.inline
    def setGrandTotal(value: String): Self = this.set("grandTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrandTotal: Self = this.set("grandTotal", js.undefined)
    @scala.inline
    def setNoData(value: String): Self = this.set("noData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoData: Self = this.set("noData", js.undefined)
    @scala.inline
    def setRemoveAllSorting(value: String): Self = this.set("removeAllSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveAllSorting: Self = this.set("removeAllSorting", js.undefined)
    @scala.inline
    def setShowFieldChooser(value: String): Self = this.set("showFieldChooser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFieldChooser: Self = this.set("showFieldChooser", js.undefined)
    @scala.inline
    def setSortColumnBySummary(value: String): Self = this.set("sortColumnBySummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortColumnBySummary: Self = this.set("sortColumnBySummary", js.undefined)
    @scala.inline
    def setSortRowBySummary(value: String): Self = this.set("sortRowBySummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortRowBySummary: Self = this.set("sortRowBySummary", js.undefined)
    @scala.inline
    def setTotal(value: String): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

