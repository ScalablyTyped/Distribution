package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCandleStickSeriesHoverStyle
  extends StObject
     with dxChartSeriesTypesCommonSeriesHoverStyle {
  
  /**
    * Configures hatching that applies when a user points to the series.
    */
  @JSName("hatching")
  var hatching_dxChartSeriesTypesCandleStickSeriesHoverStyle: js.UndefOr[dxChartSeriesTypesCandleStickSeriesHoverStyleHatching] = js.undefined
}
object dxChartSeriesTypesCandleStickSeriesHoverStyle {
  
  inline def apply(): dxChartSeriesTypesCandleStickSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesHoverStyle]
  }
  
  extension [Self <: dxChartSeriesTypesCandleStickSeriesHoverStyle](x: Self) {
    
    inline def setHatching(value: dxChartSeriesTypesCandleStickSeriesHoverStyleHatching): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    inline def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
  }
}
