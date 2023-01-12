package typings.forgeViewer.anon

import typings.forgeViewer.forgeViewerStrings.PlanarHeatmap
import typings.forgeViewer.forgeViewerStrings.max
import typings.forgeViewer.forgeViewerStrings.middle
import typings.forgeViewer.forgeViewerStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacePosition extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var placePosition: js.UndefOr[min | max] = js.undefined
  
  var position: js.UndefOr[min | middle | max] = js.undefined
  
  var slicingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var `type`: PlanarHeatmap
  
  var width: js.UndefOr[Double] = js.undefined
}
object PlacePosition {
  
  inline def apply(): PlacePosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PlanarHeatmap")
    __obj.asInstanceOf[PlacePosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlacePosition] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPlacePosition(value: min | max): Self = StObject.set(x, "placePosition", value.asInstanceOf[js.Any])
    
    inline def setPlacePositionUndefined: Self = StObject.set(x, "placePosition", js.undefined)
    
    inline def setPosition(value: min | middle | max): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSlicingEnabled(value: Boolean): Self = StObject.set(x, "slicingEnabled", value.asInstanceOf[js.Any])
    
    inline def setSlicingEnabledUndefined: Self = StObject.set(x, "slicingEnabled", js.undefined)
    
    inline def setType(value: PlanarHeatmap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
