package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerPaintedEvent extends js.Object {
  
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
  implicit class LayerPaintedEventOps[Self <: LayerPaintedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClip(value: Rect): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerId(value: LayerId): Self = this.set("layerId", value.asInstanceOf[js.Any])
  }
}
