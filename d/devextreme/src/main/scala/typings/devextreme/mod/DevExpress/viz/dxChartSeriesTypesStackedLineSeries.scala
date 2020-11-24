package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.StackedLineSeries]
  */
@js.native
trait dxChartSeriesTypesStackedLineSeries extends dxChartSeriesTypesCommonSeries {
  
  /**
    * [descr:dxChartSeriesTypes.StackedLineSeries.aggregation]
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStackedLineSeries: js.UndefOr[dxChartSeriesTypesStackedLineSeriesAggregation] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedLineSeries.hoverMode]
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStackedLineSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedLineSeries.label]
    */
  @JSName("label")
  var label_dxChartSeriesTypesStackedLineSeries: js.UndefOr[dxChartSeriesTypesStackedLineSeriesLabel] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedLineSeries.selectionMode]
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStackedLineSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}
object dxChartSeriesTypesStackedLineSeries {
  
  @scala.inline
  def apply(): dxChartSeriesTypesStackedLineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStackedLineSeries]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesStackedLineSeriesOps[Self <: dxChartSeriesTypesStackedLineSeries] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: dxChartSeriesTypesStackedLineSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartSeriesTypesStackedLineSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
