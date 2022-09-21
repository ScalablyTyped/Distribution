package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesStepAreaSeriesSelectionStyle
  extends StObject
     with dxChartSeriesTypesCommonSeriesSelectionStyle {
  
  /**
    * Configures the appearance adopted by the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user selects the series.
    */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeriesSelectionStyle: js.UndefOr[dxChartSeriesTypesStepAreaSeriesSelectionStyleBorder] = js.undefined
}
object dxChartSeriesTypesStepAreaSeriesSelectionStyle {
  
  inline def apply(): dxChartSeriesTypesStepAreaSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeriesSelectionStyle]
  }
  
  extension [Self <: dxChartSeriesTypesStepAreaSeriesSelectionStyle](x: Self) {
    
    inline def setBorder(value: dxChartSeriesTypesStepAreaSeriesSelectionStyleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
