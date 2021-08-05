package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerPaintedEvent extends StObject {
  
  /**
    * Clip rectangle.
    */
  var clip: Rect
  
  /**
    * The id of the painted layer.
    */
  var layerId: LayerId
}
object LayerPaintedEvent {
  
  inline def apply(clip: Rect, layerId: LayerId): LayerPaintedEvent = {
    val __obj = js.Dynamic.literal(clip = clip.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPaintedEvent]
  }
  
  extension [Self <: LayerPaintedEvent](x: Self) {
    
    inline def setClip(value: Rect): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setLayerId(value: LayerId): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
  }
}
