package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.StepAreaSeries */
@js.native
trait dxChartSeriesTypesStepAreaSeries extends dxChartSeriesTypesCommonSeries {
  /** @name dxChartSeriesTypes.StepAreaSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesAggregation] = js.native
  /** @name dxChartSeriesTypes.StepAreaSeries.border */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesBorder] = js.native
  /** @name dxChartSeriesTypes.StepAreaSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStepAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  /** @name dxChartSeriesTypes.StepAreaSeries.hoverStyle */
  @JSName("hoverStyle")
  var hoverStyle_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesHoverStyle] = js.native
  /** @name dxChartSeriesTypes.StepAreaSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesLabel] = js.native
  /** @name dxChartSeriesTypes.StepAreaSeries.point */
  @JSName("point")
  var point_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesPoint] = js.native
  /** @name dxChartSeriesTypes.StepAreaSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStepAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
  /** @name dxChartSeriesTypes.StepAreaSeries.selectionStyle */
  @JSName("selectionStyle")
  var selectionStyle_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesSelectionStyle] = js.native
}

object dxChartSeriesTypesStepAreaSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesStepAreaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesStepAreaSeriesOps[Self <: dxChartSeriesTypesStepAreaSeries] (val x: Self) extends AnyVal {
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
    def setAggregation(value: dxChartSeriesTypesStepAreaSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    @scala.inline
    def setBorder(value: dxChartSeriesTypesStepAreaSeriesBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setHoverStyle(value: dxChartSeriesTypesStepAreaSeriesHoverStyle): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    @scala.inline
    def setLabel(value: dxChartSeriesTypesStepAreaSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPoint(value: dxChartSeriesTypesStepAreaSeriesPoint): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSelectionStyle(value: dxChartSeriesTypesStepAreaSeriesSelectionStyle): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
  }
  
}

