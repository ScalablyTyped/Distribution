package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.StackedSplineAreaSeries]
  */
@js.native
trait dxChartSeriesTypesStackedSplineAreaSeries extends dxChartSeriesTypesCommonSeries {
  
  /**
    * [descr:dxChartSeriesTypes.StackedSplineAreaSeries.aggregation]
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesStackedSplineAreaSeriesAggregation] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedSplineAreaSeries.hoverMode]
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStackedSplineAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedSplineAreaSeries.label]
    */
  @JSName("label")
  var label_dxChartSeriesTypesStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesStackedSplineAreaSeriesLabel] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedSplineAreaSeries.point]
    */
  @JSName("point")
  var point_dxChartSeriesTypesStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesStackedSplineAreaSeriesPoint] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedSplineAreaSeries.selectionMode]
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStackedSplineAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}
object dxChartSeriesTypesStackedSplineAreaSeries {
  
  @scala.inline
  def apply(): dxChartSeriesTypesStackedSplineAreaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStackedSplineAreaSeries]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesStackedSplineAreaSeriesOps[Self <: dxChartSeriesTypesStackedSplineAreaSeries] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: dxChartSeriesTypesStackedSplineAreaSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartSeriesTypesStackedSplineAreaSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setPoint(value: dxChartSeriesTypesStackedSplineAreaSeriesPoint): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
