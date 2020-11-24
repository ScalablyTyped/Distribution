package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.FullStackedSplineSeries]
  */
@js.native
trait dxChartSeriesTypesFullStackedSplineSeries extends dxChartSeriesTypesCommonSeries {
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineSeries.aggregation]
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesFullStackedSplineSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineSeriesAggregation] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineSeries.hoverMode]
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesFullStackedSplineSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineSeries.label]
    */
  @JSName("label")
  var label_dxChartSeriesTypesFullStackedSplineSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineSeriesLabel] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineSeries.selectionMode]
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesFullStackedSplineSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}
object dxChartSeriesTypesFullStackedSplineSeries {
  
  @scala.inline
  def apply(): dxChartSeriesTypesFullStackedSplineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedSplineSeries]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesFullStackedSplineSeriesOps[Self <: dxChartSeriesTypesFullStackedSplineSeries] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: dxChartSeriesTypesFullStackedSplineSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartSeriesTypesFullStackedSplineSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
