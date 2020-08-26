package typings.flexmonster.mod

import typings.flexmonster.anon.Column
import typings.flexmonster.anon.DrillAll
import typings.flexmonster.anon.ExpandAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slice extends js.Object {
  var columns: js.UndefOr[js.Array[Hierarchy]] = js.native
  var drillThrough: js.UndefOr[js.Array[String]] = js.native
  var drills: js.UndefOr[DrillAll] = js.native
  var expands: js.UndefOr[ExpandAll] = js.native
  var flatOrder: js.UndefOr[js.Array[String]] = js.native
  var measures: js.UndefOr[js.Array[Measure]] = js.native
  var reportFilters: js.UndefOr[js.Array[Hierarchy]] = js.native
  var rows: js.UndefOr[js.Array[Hierarchy]] = js.native
  var sorting: js.UndefOr[Column] = js.native
}

object Slice {
  @scala.inline
  def apply(): Slice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slice]
  }
  @scala.inline
  implicit class SliceOps[Self <: Slice] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: Hierarchy*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Hierarchy]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDrillThroughVarargs(value: String*): Self = this.set("drillThrough", js.Array(value :_*))
    @scala.inline
    def setDrillThrough(value: js.Array[String]): Self = this.set("drillThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillThrough: Self = this.set("drillThrough", js.undefined)
    @scala.inline
    def setDrills(value: DrillAll): Self = this.set("drills", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrills: Self = this.set("drills", js.undefined)
    @scala.inline
    def setExpands(value: ExpandAll): Self = this.set("expands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpands: Self = this.set("expands", js.undefined)
    @scala.inline
    def setFlatOrderVarargs(value: String*): Self = this.set("flatOrder", js.Array(value :_*))
    @scala.inline
    def setFlatOrder(value: js.Array[String]): Self = this.set("flatOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatOrder: Self = this.set("flatOrder", js.undefined)
    @scala.inline
    def setMeasuresVarargs(value: Measure*): Self = this.set("measures", js.Array(value :_*))
    @scala.inline
    def setMeasures(value: js.Array[Measure]): Self = this.set("measures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasures: Self = this.set("measures", js.undefined)
    @scala.inline
    def setReportFiltersVarargs(value: Hierarchy*): Self = this.set("reportFilters", js.Array(value :_*))
    @scala.inline
    def setReportFilters(value: js.Array[Hierarchy]): Self = this.set("reportFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportFilters: Self = this.set("reportFilters", js.undefined)
    @scala.inline
    def setRowsVarargs(value: Hierarchy*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[Hierarchy]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSorting(value: Column): Self = this.set("sorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
  }
  
}

