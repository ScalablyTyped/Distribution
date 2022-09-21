package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesFullStackedLineSeries
  extends StObject
     with dxChartSeriesTypesCommonSeries {
  
  /**
    * Configures data aggregation for the series.
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesFullStackedLineSeries: js.UndefOr[dxChartSeriesTypesFullStackedLineSeriesAggregation] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user points to a series.
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesFullStackedLineSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.undefined
  
  /**
    * Configures point labels.
    */
  @JSName("label")
  var label_dxChartSeriesTypesFullStackedLineSeries: js.UndefOr[dxChartSeriesTypesFullStackedLineSeriesLabel] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects a series.
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesFullStackedLineSeries: js.UndefOr[includePoints | excludePoints | none] = js.undefined
}
object dxChartSeriesTypesFullStackedLineSeries {
  
  inline def apply(): dxChartSeriesTypesFullStackedLineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedLineSeries]
  }
  
  extension [Self <: dxChartSeriesTypesFullStackedLineSeries](x: Self) {
    
    inline def setAggregation(value: dxChartSeriesTypesFullStackedLineSeriesAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setLabel(value: dxChartSeriesTypesFullStackedLineSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelectionMode(value: includePoints | excludePoints | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
