package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.AreaSeries]
  */
@js.native
trait dxChartSeriesTypesAreaSeries extends dxChartSeriesTypesCommonSeries {
  
  /**
    * [descr:dxChartSeriesTypes.AreaSeries.aggregation]
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesAreaSeries: js.UndefOr[dxChartSeriesTypesAreaSeriesAggregation] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.AreaSeries.hoverMode]
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.AreaSeries.label]
    */
  @JSName("label")
  var label_dxChartSeriesTypesAreaSeries: js.UndefOr[dxChartSeriesTypesAreaSeriesLabel] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.AreaSeries.point]
    */
  @JSName("point")
  var point_dxChartSeriesTypesAreaSeries: js.UndefOr[dxChartSeriesTypesAreaSeriesPoint] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.AreaSeries.selectionMode]
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}
object dxChartSeriesTypesAreaSeries {
  
  @scala.inline
  def apply(): dxChartSeriesTypesAreaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesAreaSeries]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesAreaSeriesOps[Self <: dxChartSeriesTypesAreaSeries] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: dxChartSeriesTypesAreaSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartSeriesTypesAreaSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setPoint(value: dxChartSeriesTypesAreaSeriesPoint): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
