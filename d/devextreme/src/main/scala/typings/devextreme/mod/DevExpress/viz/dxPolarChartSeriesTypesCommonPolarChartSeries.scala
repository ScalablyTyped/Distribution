package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.BorderColor
import typings.devextreme.anon.ColorDashStyle
import typings.devextreme.anon.EdgeLength
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartSeriesTypesCommonPolarChartSeries extends js.Object {
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.argumentField */
  var argumentField: js.UndefOr[String] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.barPadding */
  var barPadding: js.UndefOr[Double] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.barWidth */
  var barWidth: js.UndefOr[Double] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.border */
  var border: js.UndefOr[ColorDashStyle] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.closed */
  var closed: js.UndefOr[Boolean] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.color */
  var color: js.UndefOr[String] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.hoverMode */
  var hoverMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
  ] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.hoverStyle */
  var hoverStyle: js.UndefOr[BorderColor] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.ignoreEmptyPoints */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label */
  var label: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeriesLabel] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.maxLabelCount */
  var maxLabelCount: js.UndefOr[Double] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.minBarSize */
  var minBarSize: js.UndefOr[Double] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.opacity */
  var opacity: js.UndefOr[Double] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point */
  var point: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeriesPoint] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.selectionMode */
  var selectionMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint
  ] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.selectionStyle */
  var selectionStyle: js.UndefOr[BorderColor] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.showInLegend */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.stack */
  var stack: js.UndefOr[String] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.tagField */
  var tagField: js.UndefOr[String] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.valueErrorBar */
  var valueErrorBar: js.UndefOr[EdgeLength] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.valueField */
  var valueField: js.UndefOr[String] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.visible */
  var visible: js.UndefOr[Boolean] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.width */
  var width: js.UndefOr[Double] = js.native
}

object dxPolarChartSeriesTypesCommonPolarChartSeries {
  @scala.inline
  def apply(): dxPolarChartSeriesTypesCommonPolarChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeries]
  }
  @scala.inline
  implicit class dxPolarChartSeriesTypesCommonPolarChartSeriesOps[Self <: dxPolarChartSeriesTypesCommonPolarChartSeries] (val x: Self) extends AnyVal {
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
    def setArgumentField(value: String): Self = this.set("argumentField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgumentField: Self = this.set("argumentField", js.undefined)
    @scala.inline
    def setBarPadding(value: Double): Self = this.set("barPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarPadding: Self = this.set("barPadding", js.undefined)
    @scala.inline
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarWidth: Self = this.set("barWidth", js.undefined)
    @scala.inline
    def setBorder(value: ColorDashStyle): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashStyle(value: dash | dot | longDash | solid): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setHoverMode(
      value: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
    ): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setHoverStyle(value: BorderColor): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    @scala.inline
    def setIgnoreEmptyPoints(value: Boolean): Self = this.set("ignoreEmptyPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreEmptyPoints: Self = this.set("ignoreEmptyPoints", js.undefined)
    @scala.inline
    def setLabel(value: dxPolarChartSeriesTypesCommonPolarChartSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMaxLabelCount(value: Double): Self = this.set("maxLabelCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLabelCount: Self = this.set("maxLabelCount", js.undefined)
    @scala.inline
    def setMinBarSize(value: Double): Self = this.set("minBarSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinBarSize: Self = this.set("minBarSize", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPoint(value: dxPolarChartSeriesTypesCommonPolarChartSeriesPoint): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setSelectionMode(value: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSelectionStyle(value: BorderColor): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
    @scala.inline
    def setShowInLegend(value: Boolean): Self = this.set("showInLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInLegend: Self = this.set("showInLegend", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setTagField(value: String): Self = this.set("tagField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagField: Self = this.set("tagField", js.undefined)
    @scala.inline
    def setValueErrorBar(value: EdgeLength): Self = this.set("valueErrorBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueErrorBar: Self = this.set("valueErrorBar", js.undefined)
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

