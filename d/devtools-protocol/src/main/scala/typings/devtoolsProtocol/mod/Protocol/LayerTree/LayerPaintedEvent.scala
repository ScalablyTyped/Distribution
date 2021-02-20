package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerPaintedEvent extends StObject {
  
  /**
    * Clip rectangle.
    */
  var clip: Rect = js.native
  
  /**
    * The id of the painted layer.
    */
  var layerId: LayerId = js.native
}
object LayerPaintedEvent {
  
  @scala.inline
  def apply(clip: Rect, layerId: LayerId): LayerPaintedEvent = {
    val __obj = js.Dynamic.literal(clip = clip.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPaintedEvent]
  }
  
  @scala.inline
  implicit class LayerPaintedEventMutableBuilder[Self <: LayerPaintedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClip(value: Rect): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerId(value: LayerId): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
  }
}
