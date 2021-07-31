package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayoutMetricsResponse extends StObject {
  
  /**
    * Size of scrollable area.
    */
  var contentSize: Rect
  
  /**
    * Metrics relating to the layout viewport.
    */
  var layoutViewport: LayoutViewport
  
  /**
    * Metrics relating to the visual viewport.
    */
  var visualViewport: VisualViewport
}
object GetLayoutMetricsResponse {
  
  @scala.inline
  def apply(contentSize: Rect, layoutViewport: LayoutViewport, visualViewport: VisualViewport): GetLayoutMetricsResponse = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any], layoutViewport = layoutViewport.asInstanceOf[js.Any], visualViewport = visualViewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayoutMetricsResponse]
  }
  
  @scala.inline
  implicit class GetLayoutMetricsResponseMutableBuilder[Self <: GetLayoutMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentSize(value: Rect): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutViewport(value: LayoutViewport): Self = StObject.set(x, "layoutViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualViewport(value: VisualViewport): Self = StObject.set(x, "visualViewport", value.asInstanceOf[js.Any])
  }
}
