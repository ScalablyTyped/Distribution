package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualViewport extends StObject {
  
  /**
    * Height (CSS pixels), excludes scrollbar if present.
    */
  var clientHeight: Double
  
  /**
    * Width (CSS pixels), excludes scrollbar if present.
    */
  var clientWidth: Double
  
  /**
    * Horizontal offset relative to the layout viewport (CSS pixels).
    */
  var offsetX: Double
  
  /**
    * Vertical offset relative to the layout viewport (CSS pixels).
    */
  var offsetY: Double
  
  /**
    * Horizontal offset relative to the document (CSS pixels).
    */
  var pageX: Double
  
  /**
    * Vertical offset relative to the document (CSS pixels).
    */
  var pageY: Double
  
  /**
    * Scale relative to the ideal viewport (size at width=device-width).
    */
  var scale: Double
  
  /**
    * Page zoom factor (CSS to device independent pixels ratio).
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object VisualViewport {
  
  inline def apply(
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
  
  extension [Self <: VisualViewport](x: Self) {
    
    inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
