package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartSeriesTypesAreapolarseries extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  /** @name dxPolarChartSeriesTypes.areapolarseries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxPolarChartSeriesTypesAreapolarseries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  /** @name dxPolarChartSeriesTypes.areapolarseries.point */
  @JSName("point")
  var point_dxPolarChartSeriesTypesAreapolarseries: js.UndefOr[dxPolarChartSeriesTypesAreapolarseriesPoint] = js.native
  /** @name dxPolarChartSeriesTypes.areapolarseries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxPolarChartSeriesTypesAreapolarseries: js.UndefOr[includePoints | excludePoints | none] = js.native
}

object dxPolarChartSeriesTypesAreapolarseries {
  @scala.inline
  def apply(): dxPolarChartSeriesTypesAreapolarseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesAreapolarseries]
  }
  @scala.inline
  implicit class dxPolarChartSeriesTypesAreapolarseriesOps[Self <: dxPolarChartSeriesTypesAreapolarseries] (val x: Self) extends AnyVal {
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
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setPoint(value: dxPolarChartSeriesTypesAreapolarseriesPoint): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

