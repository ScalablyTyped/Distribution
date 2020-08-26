package typings.devextreme.anon

import typings.devextreme.devextremeStrings.pan
import typings.devextreme.devextremeStrings.zoom
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.viz.VizRange
import typings.devextreme.mod.DevExpress.viz.chartAxisObject
import typings.devextreme.mod.DevExpress.viz.dxChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionType extends js.Object {
  var actionType: js.UndefOr[zoom | pan] = js.native
  var axis: js.UndefOr[chartAxisObject] = js.native
  var cancel: js.UndefOr[Boolean] = js.native
  var component: js.UndefOr[dxChart] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var previousRange: js.UndefOr[VizRange] = js.native
  var range: js.UndefOr[VizRange] = js.native
  var rangeEnd: js.UndefOr[typings.std.Date | Double] = js.native
  var rangeStart: js.UndefOr[typings.std.Date | Double] = js.native
  var shift: js.UndefOr[Double] = js.native
  var zoomFactor: js.UndefOr[Double] = js.native
}

object ActionType {
  @scala.inline
  def apply(): ActionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionType]
  }
  @scala.inline
  implicit class ActionTypeOps[Self <: ActionType] (val x: Self) extends AnyVal {
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
    def setActionType(value: zoom | pan): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    @scala.inline
    def setAxis(value: chartAxisObject): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setComponent(value: dxChart): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setEvent(value: event): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPreviousRange(value: VizRange): Self = this.set("previousRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousRange: Self = this.set("previousRange", js.undefined)
    @scala.inline
    def setRange(value: VizRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRangeEnd(value: typings.std.Date | Double): Self = this.set("rangeEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeEnd: Self = this.set("rangeEnd", js.undefined)
    @scala.inline
    def setRangeStart(value: typings.std.Date | Double): Self = this.set("rangeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeStart: Self = this.set("rangeStart", js.undefined)
    @scala.inline
    def setShift(value: Double): Self = this.set("shift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
    @scala.inline
    def setZoomFactor(value: Double): Self = this.set("zoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomFactor: Self = this.set("zoomFactor", js.undefined)
  }
  
}

