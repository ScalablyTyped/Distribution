package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.DashStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCommonSeriesSelectionStyle extends StObject {
  
  /**
    * Configures the appearance adopted by the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user selects the series.
    */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyleBorder] = js.undefined
  
  /**
    * Specifies the color of the series in the selected state.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the dash style of the series line when the series is in the selected state. Applies only to line-like series.
    */
  var dashStyle: js.UndefOr[DashStyle] = js.undefined
  
  /**
    * Configures hatching that applies when a user selects the series.
    */
  var hatching: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyleHatching] = js.undefined
  
  /**
    * Specifies the pixel-measured width of the series line when the series is in the selected state.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxChartSeriesTypesCommonSeriesSelectionStyle {
  
  inline def apply(): dxChartSeriesTypesCommonSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesSelectionStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartSeriesTypesCommonSeriesSelectionStyle] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: dxChartSeriesTypesCommonSeriesSelectionStyleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: DashStyle): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setHatching(value: dxChartSeriesTypesCommonSeriesSelectionStyleHatching): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    inline def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
