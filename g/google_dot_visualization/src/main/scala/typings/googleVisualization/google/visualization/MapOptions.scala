package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.MapTypeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
  var enableScrollWheel: js.UndefOr[Boolean] = js.undefined
  
  var icons: js.UndefOr[js.Object] = js.undefined
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var mapType: js.UndefOr[String] = js.undefined
  
  var mapTypeIds: js.UndefOr[js.Array[Any]] = js.undefined
  
  var maps: MapTypeId
  
  var showInfoWindow: js.UndefOr[Boolean] = js.undefined
  
  var showLine: js.UndefOr[Boolean] = js.undefined
  
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  
  var useMapTypeControl: js.UndefOr[Boolean] = js.undefined
  
  var zoomLevel: js.UndefOr[Double] = js.undefined
}
object MapOptions {
  
  inline def apply(maps: MapTypeId): MapOptions = {
    val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
  
  extension [Self <: MapOptions](x: Self) {
    
    inline def setEnableScrollWheel(value: Boolean): Self = StObject.set(x, "enableScrollWheel", value.asInstanceOf[js.Any])
    
    inline def setEnableScrollWheelUndefined: Self = StObject.set(x, "enableScrollWheel", js.undefined)
    
    inline def setIcons(value: js.Object): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMapType(value: String): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
    
    inline def setMapTypeIds(value: js.Array[Any]): Self = StObject.set(x, "mapTypeIds", value.asInstanceOf[js.Any])
    
    inline def setMapTypeIdsUndefined: Self = StObject.set(x, "mapTypeIds", js.undefined)
    
    inline def setMapTypeIdsVarargs(value: Any*): Self = StObject.set(x, "mapTypeIds", js.Array(value*))
    
    inline def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
    
    inline def setMaps(value: MapTypeId): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
    
    inline def setShowInfoWindow(value: Boolean): Self = StObject.set(x, "showInfoWindow", value.asInstanceOf[js.Any])
    
    inline def setShowInfoWindowUndefined: Self = StObject.set(x, "showInfoWindow", js.undefined)
    
    inline def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
    
    inline def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
    
    inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    
    inline def setUseMapTypeControl(value: Boolean): Self = StObject.set(x, "useMapTypeControl", value.asInstanceOf[js.Any])
    
    inline def setUseMapTypeControlUndefined: Self = StObject.set(x, "useMapTypeControl", js.undefined)
    
    inline def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    
    inline def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
  }
}
