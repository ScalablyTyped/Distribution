package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartExplorer extends StObject {
  
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  
  var axis: js.UndefOr[String] = js.undefined
  
  var keepInBounds: js.UndefOr[Boolean] = js.undefined
  
  var maxZoomIn: js.UndefOr[Double] = js.undefined
  
  var maxZoomOut: js.UndefOr[Double] = js.undefined
  
  var zoomDelta: js.UndefOr[Double] = js.undefined
}
object ChartExplorer {
  
  inline def apply(): ChartExplorer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartExplorer]
  }
  
  extension [Self <: ChartExplorer](x: Self) {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setKeepInBounds(value: Boolean): Self = StObject.set(x, "keepInBounds", value.asInstanceOf[js.Any])
    
    inline def setKeepInBoundsUndefined: Self = StObject.set(x, "keepInBounds", js.undefined)
    
    inline def setMaxZoomIn(value: Double): Self = StObject.set(x, "maxZoomIn", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomInUndefined: Self = StObject.set(x, "maxZoomIn", js.undefined)
    
    inline def setMaxZoomOut(value: Double): Self = StObject.set(x, "maxZoomOut", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomOutUndefined: Self = StObject.set(x, "maxZoomOut", js.undefined)
    
    inline def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
    
    inline def setZoomDeltaUndefined: Self = StObject.set(x, "zoomDelta", js.undefined)
  }
}
