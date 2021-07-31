package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoChartMagnifyingGlass extends StObject {
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var zoomFactor: js.UndefOr[Double] = js.undefined
}
object GeoChartMagnifyingGlass {
  
  @scala.inline
  def apply(): GeoChartMagnifyingGlass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoChartMagnifyingGlass]
  }
  
  @scala.inline
  implicit class GeoChartMagnifyingGlassMutableBuilder[Self <: GeoChartMagnifyingGlass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
  }
}
