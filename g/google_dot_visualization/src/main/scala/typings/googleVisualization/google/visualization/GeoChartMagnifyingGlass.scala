package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoChartMagnifyingGlass extends StObject {
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var zoomFactor: js.UndefOr[Double] = js.undefined
}
object GeoChartMagnifyingGlass {
  
  inline def apply(): GeoChartMagnifyingGlass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoChartMagnifyingGlass]
  }
  
  extension [Self <: GeoChartMagnifyingGlass](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    
    inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
  }
}
