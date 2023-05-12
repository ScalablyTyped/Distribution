package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable1
import typings.googleMaps.google.maps.visualization.HeatmapLayer
import typings.googleMaps.google.maps.visualization.HeatmapLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualizationLibrary extends StObject {
  
  var HeatmapLayer: Instantiable1[
    /* opts */ js.UndefOr[HeatmapLayerOptions | Null], 
    typings.googleMaps.google.maps.visualization.HeatmapLayer
  ]
}
object VisualizationLibrary {
  
  inline def apply(HeatmapLayer: Instantiable1[/* opts */ js.UndefOr[HeatmapLayerOptions | Null], HeatmapLayer]): VisualizationLibrary = {
    val __obj = js.Dynamic.literal(HeatmapLayer = HeatmapLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualizationLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualizationLibrary] (val x: Self) extends AnyVal {
    
    inline def setHeatmapLayer(value: Instantiable1[/* opts */ js.UndefOr[HeatmapLayerOptions | Null], HeatmapLayer]): Self = StObject.set(x, "HeatmapLayer", value.asInstanceOf[js.Any])
  }
}
