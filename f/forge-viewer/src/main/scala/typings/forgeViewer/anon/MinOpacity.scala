package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinOpacity extends StObject {
  
  var minOpacity: js.UndefOr[Double] = js.undefined
  
  var placementPosition: js.UndefOr[Double] = js.undefined
  
  var slicingPosition: js.UndefOr[Double] = js.undefined
  
  var `type`: String
  
  var width: js.UndefOr[Double] = js.undefined
}
object MinOpacity {
  
  inline def apply(`type`: String): MinOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinOpacity]
  }
  
  extension [Self <: MinOpacity](x: Self) {
    
    inline def setMinOpacity(value: Double): Self = StObject.set(x, "minOpacity", value.asInstanceOf[js.Any])
    
    inline def setMinOpacityUndefined: Self = StObject.set(x, "minOpacity", js.undefined)
    
    inline def setPlacementPosition(value: Double): Self = StObject.set(x, "placementPosition", value.asInstanceOf[js.Any])
    
    inline def setPlacementPositionUndefined: Self = StObject.set(x, "placementPosition", js.undefined)
    
    inline def setSlicingPosition(value: Double): Self = StObject.set(x, "slicingPosition", value.asInstanceOf[js.Any])
    
    inline def setSlicingPositionUndefined: Self = StObject.set(x, "slicingPosition", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
