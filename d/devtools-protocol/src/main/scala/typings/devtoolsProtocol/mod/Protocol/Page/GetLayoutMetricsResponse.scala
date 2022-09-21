package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayoutMetricsResponse extends StObject {
  
  /**
    * Deprecated size of scrollable area. Is in DP. Use `cssContentSize` instead.
    */
  var contentSize: Rect
  
  /**
    * Size of scrollable area in CSS pixels.
    */
  var cssContentSize: Rect
  
  /**
    * Metrics relating to the layout viewport in CSS pixels.
    */
  var cssLayoutViewport: LayoutViewport
  
  /**
    * Metrics relating to the visual viewport in CSS pixels.
    */
  var cssVisualViewport: VisualViewport
  
  /**
    * Deprecated metrics relating to the layout viewport. Is in device pixels. Use `cssLayoutViewport` instead.
    */
  var layoutViewport: LayoutViewport
  
  /**
    * Deprecated metrics relating to the visual viewport. Is in device pixels. Use `cssVisualViewport` instead.
    */
  var visualViewport: VisualViewport
}
object GetLayoutMetricsResponse {
  
  inline def apply(
    contentSize: Rect,
    cssContentSize: Rect,
    cssLayoutViewport: LayoutViewport,
    cssVisualViewport: VisualViewport,
    layoutViewport: LayoutViewport,
    visualViewport: VisualViewport
  ): GetLayoutMetricsResponse = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any], cssContentSize = cssContentSize.asInstanceOf[js.Any], cssLayoutViewport = cssLayoutViewport.asInstanceOf[js.Any], cssVisualViewport = cssVisualViewport.asInstanceOf[js.Any], layoutViewport = layoutViewport.asInstanceOf[js.Any], visualViewport = visualViewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayoutMetricsResponse]
  }
  
  extension [Self <: GetLayoutMetricsResponse](x: Self) {
    
    inline def setContentSize(value: Rect): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    inline def setCssContentSize(value: Rect): Self = StObject.set(x, "cssContentSize", value.asInstanceOf[js.Any])
    
    inline def setCssLayoutViewport(value: LayoutViewport): Self = StObject.set(x, "cssLayoutViewport", value.asInstanceOf[js.Any])
    
    inline def setCssVisualViewport(value: VisualViewport): Self = StObject.set(x, "cssVisualViewport", value.asInstanceOf[js.Any])
    
    inline def setLayoutViewport(value: LayoutViewport): Self = StObject.set(x, "layoutViewport", value.asInstanceOf[js.Any])
    
    inline def setVisualViewport(value: VisualViewport): Self = StObject.set(x, "visualViewport", value.asInstanceOf[js.Any])
  }
}
