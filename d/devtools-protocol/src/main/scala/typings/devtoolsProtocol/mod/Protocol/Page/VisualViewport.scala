package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualViewport extends StObject {
  
  /**
    * Height (CSS pixels), excludes scrollbar if present.
    */
  var clientHeight: Double = js.native
  
  /**
    * Width (CSS pixels), excludes scrollbar if present.
    */
  var clientWidth: Double = js.native
  
  /**
    * Horizontal offset relative to the layout viewport (CSS pixels).
    */
  var offsetX: Double = js.native
  
  /**
    * Vertical offset relative to the layout viewport (CSS pixels).
    */
  var offsetY: Double = js.native
  
  /**
    * Horizontal offset relative to the document (CSS pixels).
    */
  var pageX: Double = js.native
  
  /**
    * Vertical offset relative to the document (CSS pixels).
    */
  var pageY: Double = js.native
  
  /**
    * Scale relative to the ideal viewport (size at width=device-width).
    */
  var scale: Double = js.native
  
  /**
    * Page zoom factor (CSS to device independent pixels ratio).
    */
  var zoom: js.UndefOr[Double] = js.native
}
object VisualViewport {
  
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    scale: Double
  ): VisualViewport = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualViewport]
  }
  
  @scala.inline
  implicit class VisualViewportMutableBuilder[Self <: VisualViewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
