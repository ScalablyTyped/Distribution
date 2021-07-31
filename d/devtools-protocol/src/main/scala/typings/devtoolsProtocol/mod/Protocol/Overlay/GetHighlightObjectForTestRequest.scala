package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHighlightObjectForTestRequest extends StObject {
  
  /**
    * The color format to get config with (default: hex).
    */
  var colorFormat: js.UndefOr[ColorFormat] = js.undefined
  
  /**
    * Whether to include distance info.
    */
  var includeDistance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to include style info.
    */
  var includeStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Id of the node to get highlight object for.
    */
  var nodeId: NodeId
  
  /**
    * Whether to show accessibility info (default: true).
    */
  var showAccessibilityInfo: js.UndefOr[Boolean] = js.undefined
}
object GetHighlightObjectForTestRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): GetHighlightObjectForTestRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHighlightObjectForTestRequest]
  }
  
  @scala.inline
  implicit class GetHighlightObjectForTestRequestMutableBuilder[Self <: GetHighlightObjectForTestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorFormat(value: ColorFormat): Self = StObject.set(x, "colorFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFormatUndefined: Self = StObject.set(x, "colorFormat", js.undefined)
    
    @scala.inline
    def setIncludeDistance(value: Boolean): Self = StObject.set(x, "includeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDistanceUndefined: Self = StObject.set(x, "includeDistance", js.undefined)
    
    @scala.inline
    def setIncludeStyle(value: Boolean): Self = StObject.set(x, "includeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeStyleUndefined: Self = StObject.set(x, "includeStyle", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAccessibilityInfo(value: Boolean): Self = StObject.set(x, "showAccessibilityInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAccessibilityInfoUndefined: Self = StObject.set(x, "showAccessibilityInfo", js.undefined)
  }
}
