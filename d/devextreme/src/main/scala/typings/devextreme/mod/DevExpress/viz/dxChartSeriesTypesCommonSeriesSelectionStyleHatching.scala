package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.HatchDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCommonSeriesSelectionStyleHatching extends StObject {
  
  /**
    * Specifies the direction of hatching lines.
    */
  var direction: js.UndefOr[HatchDirection] = js.undefined
  
  /**
    * Specifies how transparent hatching lines should be.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the distance between two side-by-side hatching lines in pixels.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width of hatching lines in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxChartSeriesTypesCommonSeriesSelectionStyleHatching {
  
  inline def apply(): dxChartSeriesTypesCommonSeriesSelectionStyleHatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesSelectionStyleHatching]
  }
  
  extension [Self <: dxChartSeriesTypesCommonSeriesSelectionStyleHatching](x: Self) {
    
    inline def setDirection(value: HatchDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
