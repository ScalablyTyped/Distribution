package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.FullStackedSplineAreaSeries]
  */
@js.native
trait dxChartSeriesTypesFullStackedSplineAreaSeries extends dxChartSeriesTypesCommonSeries {
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineAreaSeries.aggregation]
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesFullStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineAreaSeriesAggregation] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineAreaSeries.hoverMode]
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesFullStackedSplineAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineAreaSeries.label]
    */
  @JSName("label")
  var label_dxChartSeriesTypesFullStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineAreaSeriesLabel] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineAreaSeries.point]
    */
  @JSName("point")
  var point_dxChartSeriesTypesFullStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineAreaSeriesPoint] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineAreaSeries.selectionMode]
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesFullStackedSplineAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}
object dxChartSeriesTypesFullStackedSplineAreaSeries {
  
  @scala.inline
  def apply(): dxChartSeriesTypesFullStackedSplineAreaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedSplineAreaSeries]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesFullStackedSplineAreaSeriesOps[Self <: dxChartSeriesTypesFullStackedSplineAreaSeries] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: dxChartSeriesTypesFullStackedSplineAreaSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartSeriesTypesFullStackedSplineAreaSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setPoint(value: dxChartSeriesTypesFullStackedSplineAreaSeriesPoint): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
