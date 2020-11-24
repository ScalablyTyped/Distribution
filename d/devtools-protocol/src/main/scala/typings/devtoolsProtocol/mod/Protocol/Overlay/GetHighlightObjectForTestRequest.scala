package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHighlightObjectForTestRequest extends js.Object {
  
  /**
    * The color format to get config with (default: hex).
    */
  var colorFormat: js.UndefOr[ColorFormat] = js.native
  
  /**
    * Whether to include distance info.
    */
  var includeDistance: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to include style info.
    */
  var includeStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * Id of the node to get highlight object for.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Whether to show accessibility info (default: true).
    */
  var showAccessibilityInfo: js.UndefOr[Boolean] = js.native
}
object GetHighlightObjectForTestRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): GetHighlightObjectForTestRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHighlightObjectForTestRequest]
  }
  
  @scala.inline
  implicit class GetHighlightObjectForTestRequestOps[Self <: GetHighlightObjectForTestRequest] (val x: Self) extends AnyVal {
    
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
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFormat(value: ColorFormat): Self = this.set("colorFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorFormat: Self = this.set("colorFormat", js.undefined)
    
    @scala.inline
    def setIncludeDistance(value: Boolean): Self = this.set("includeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDistance: Self = this.set("includeDistance", js.undefined)
    
    @scala.inline
    def setIncludeStyle(value: Boolean): Self = this.set("includeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeStyle: Self = this.set("includeStyle", js.undefined)
    
    @scala.inline
    def setShowAccessibilityInfo(value: Boolean): Self = this.set("showAccessibilityInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAccessibilityInfo: Self = this.set("showAccessibilityInfo", js.undefined)
  }
}
