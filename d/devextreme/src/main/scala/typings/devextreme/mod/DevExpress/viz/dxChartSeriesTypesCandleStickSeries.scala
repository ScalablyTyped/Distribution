package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCandleStickSeries
  extends StObject
     with dxChartSeriesTypesCommonSeries {
  
  /**
    * Configures data aggregation for the series.
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesAggregation] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user pauses on a series.
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesCandleStickSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.undefined
  
  /**
    * Configures the appearance adopted by the series when a user points to it.
    */
  @JSName("hoverStyle")
  var hoverStyle_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesHoverStyle] = js.undefined
  
  /**
    * Configures point labels.
    */
  @JSName("label")
  var label_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesLabel] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects a point.
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesCandleStickSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.undefined
  
  /**
    * Configures the appearance adopted by the series when a user selects it.
    */
  @JSName("selectionStyle")
  var selectionStyle_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesSelectionStyle] = js.undefined
}
object dxChartSeriesTypesCandleStickSeries {
  
  inline def apply(): dxChartSeriesTypesCandleStickSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartSeriesTypesCandleStickSeries] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: dxChartSeriesTypesCandleStickSeriesAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setHoverStyle(value: dxChartSeriesTypesCandleStickSeriesHoverStyle): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setLabel(value: dxChartSeriesTypesCandleStickSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionStyle(value: dxChartSeriesTypesCandleStickSeriesSelectionStyle): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
  }
}
