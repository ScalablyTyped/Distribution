package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesStepAreaSeries
  extends StObject
     with dxChartSeriesTypesCommonSeries {
  
  /**
    * Configures data aggregation for the series.
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesAggregation] = js.undefined
  
  /**
    * Configures the series border (in area-like series) or the series point border (in bar-like and bubble series).
    */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesBorder] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user points to a series.
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStepAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.undefined
  
  /**
    * Configures the appearance adopted by the series when a user points to it.
    */
  @JSName("hoverStyle")
  var hoverStyle_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesHoverStyle] = js.undefined
  
  /**
    * Configures point labels.
    */
  @JSName("label")
  var label_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesLabel] = js.undefined
  
  /**
    * Configures series points in scatter, line- and area-like series.
    */
  @JSName("point")
  var point_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesPoint] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects a series.
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStepAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.undefined
  
  /**
    * Configures the appearance adopted by the series when a user selects it.
    */
  @JSName("selectionStyle")
  var selectionStyle_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesSelectionStyle] = js.undefined
}
object dxChartSeriesTypesStepAreaSeries {
  
  inline def apply(): dxChartSeriesTypesStepAreaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartSeriesTypesStepAreaSeries] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: dxChartSeriesTypesStepAreaSeriesAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setBorder(value: dxChartSeriesTypesStepAreaSeriesBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setHoverStyle(value: dxChartSeriesTypesStepAreaSeriesHoverStyle): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setLabel(value: dxChartSeriesTypesStepAreaSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPoint(value: dxChartSeriesTypesStepAreaSeriesPoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setSelectionMode(value: includePoints | excludePoints | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionStyle(value: dxChartSeriesTypesStepAreaSeriesSelectionStyle): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
  }
}
