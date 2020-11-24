package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.RangeAreaSeries]
  */
@js.native
trait dxChartSeriesTypesRangeAreaSeries extends dxChartSeriesTypesCommonSeries {
  
  /**
    * [descr:dxChartSeriesTypes.RangeAreaSeries.aggregation]
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesRangeAreaSeries: js.UndefOr[dxChartSeriesTypesRangeAreaSeriesAggregation] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.RangeAreaSeries.hoverMode]
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesRangeAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.RangeAreaSeries.label]
    */
  @JSName("label")
  var label_dxChartSeriesTypesRangeAreaSeries: js.UndefOr[dxChartSeriesTypesRangeAreaSeriesLabel] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.RangeAreaSeries.point]
    */
  @JSName("point")
  var point_dxChartSeriesTypesRangeAreaSeries: js.UndefOr[dxChartSeriesTypesRangeAreaSeriesPoint] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.RangeAreaSeries.selectionMode]
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesRangeAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}
object dxChartSeriesTypesRangeAreaSeries {
  
  @scala.inline
  def apply(): dxChartSeriesTypesRangeAreaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesRangeAreaSeries]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesRangeAreaSeriesOps[Self <: dxChartSeriesTypesRangeAreaSeries] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: dxChartSeriesTypesRangeAreaSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartSeriesTypesRangeAreaSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setPoint(value: dxChartSeriesTypesRangeAreaSeriesPoint): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
