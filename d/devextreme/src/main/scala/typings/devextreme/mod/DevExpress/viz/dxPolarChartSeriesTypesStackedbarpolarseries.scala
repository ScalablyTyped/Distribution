package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartSeriesTypesStackedbarpolarseries extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  /** @name dxPolarChartSeriesTypes.stackedbarpolarseries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxPolarChartSeriesTypesStackedbarpolarseries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
  /** @name dxPolarChartSeriesTypes.stackedbarpolarseries.label */
  @JSName("label")
  var label_dxPolarChartSeriesTypesStackedbarpolarseries: js.UndefOr[dxPolarChartSeriesTypesStackedbarpolarseriesLabel] = js.native
  /** @name dxPolarChartSeriesTypes.stackedbarpolarseries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxPolarChartSeriesTypesStackedbarpolarseries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
}

object dxPolarChartSeriesTypesStackedbarpolarseries {
  @scala.inline
  def apply(): dxPolarChartSeriesTypesStackedbarpolarseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesStackedbarpolarseries]
  }
  @scala.inline
  implicit class dxPolarChartSeriesTypesStackedbarpolarseriesOps[Self <: dxPolarChartSeriesTypesStackedbarpolarseries] (val x: Self) extends AnyVal {
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
    def setHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setLabel(value: dxPolarChartSeriesTypesStackedbarpolarseriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

