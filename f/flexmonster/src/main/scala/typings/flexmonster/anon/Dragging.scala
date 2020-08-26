package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dragging extends js.Object {
  var dragging: js.UndefOr[Boolean] = js.native
  var drillThroughMaxRows: js.UndefOr[Double] = js.native
  var grandTotalsPosition: js.UndefOr[String] = js.native
  var showAutoCalculationBar: js.UndefOr[Boolean] = js.native
  var showEmptyValues: js.UndefOr[Boolean] = js.native
  var showFilter: js.UndefOr[Boolean] = js.native
  var showGrandTotals: js.UndefOr[String] = js.native
  var showHeaders: js.UndefOr[Boolean] = js.native
  var showHierarchies: js.UndefOr[Boolean] = js.native
  var showHierarchyCaptions: js.UndefOr[Boolean] = js.native
  var showReportFiltersArea: js.UndefOr[Boolean] = js.native
  var showTotals: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Dragging {
  @scala.inline
  def apply(): Dragging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dragging]
  }
  @scala.inline
  implicit class DraggingOps[Self <: Dragging] (val x: Self) extends AnyVal {
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
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    @scala.inline
    def setDrillThroughMaxRows(value: Double): Self = this.set("drillThroughMaxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillThroughMaxRows: Self = this.set("drillThroughMaxRows", js.undefined)
    @scala.inline
    def setGrandTotalsPosition(value: String): Self = this.set("grandTotalsPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrandTotalsPosition: Self = this.set("grandTotalsPosition", js.undefined)
    @scala.inline
    def setShowAutoCalculationBar(value: Boolean): Self = this.set("showAutoCalculationBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAutoCalculationBar: Self = this.set("showAutoCalculationBar", js.undefined)
    @scala.inline
    def setShowEmptyValues(value: Boolean): Self = this.set("showEmptyValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowEmptyValues: Self = this.set("showEmptyValues", js.undefined)
    @scala.inline
    def setShowFilter(value: Boolean): Self = this.set("showFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFilter: Self = this.set("showFilter", js.undefined)
    @scala.inline
    def setShowGrandTotals(value: String): Self = this.set("showGrandTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGrandTotals: Self = this.set("showGrandTotals", js.undefined)
    @scala.inline
    def setShowHeaders(value: Boolean): Self = this.set("showHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeaders: Self = this.set("showHeaders", js.undefined)
    @scala.inline
    def setShowHierarchies(value: Boolean): Self = this.set("showHierarchies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHierarchies: Self = this.set("showHierarchies", js.undefined)
    @scala.inline
    def setShowHierarchyCaptions(value: Boolean): Self = this.set("showHierarchyCaptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHierarchyCaptions: Self = this.set("showHierarchyCaptions", js.undefined)
    @scala.inline
    def setShowReportFiltersArea(value: Boolean): Self = this.set("showReportFiltersArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowReportFiltersArea: Self = this.set("showReportFiltersArea", js.undefined)
    @scala.inline
    def setShowTotals(value: Boolean): Self = this.set("showTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTotals: Self = this.set("showTotals", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

