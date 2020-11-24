package typings.devtoolsProtocol.mod.Protocol.Accessibility

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AXNode extends js.Object {
  
  /**
    * The backend ID for the associated DOM node, if any.
    */
  var backendDOMNodeId: js.UndefOr[BackendNodeId] = js.native
  
  /**
    * IDs for each of this node's child nodes.
    */
  var childIds: js.UndefOr[js.Array[AXNodeId]] = js.native
  
  /**
    * The accessible description for this `Node`.
    */
  var description: js.UndefOr[AXValue] = js.native
  
  /**
    * Whether this node is ignored for accessibility
    */
  var ignored: Boolean = js.native
  
  /**
    * Collection of reasons why this node is hidden.
    */
  var ignoredReasons: js.UndefOr[js.Array[AXProperty]] = js.native
  
  /**
    * The accessible name for this `Node`.
    */
  var name: js.UndefOr[AXValue] = js.native
  
  /**
    * Unique identifier for this node.
    */
  var nodeId: AXNodeId = js.native
  
  /**
    * All other properties
    */
  var properties: js.UndefOr[js.Array[AXProperty]] = js.native
  
  /**
    * This `Node`'s role, whether explicit or implicit.
    */
  var role: js.UndefOr[AXValue] = js.native
  
  /**
    * The value for this `Node`.
    */
  var value: js.UndefOr[AXValue] = js.native
}
object AXNode {
  
  @scala.inline
  def apply(ignored: Boolean, nodeId: AXNodeId): AXNode = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXNode]
  }
  
  @scala.inline
  implicit class AXNodeOps[Self <: AXNode] (val x: Self) extends AnyVal {
    
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
    def setIgnored(value: Boolean): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: AXNodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendDOMNodeId(value: BackendNodeId): Self = this.set("backendDOMNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendDOMNodeId: Self = this.set("backendDOMNodeId", js.undefined)
    
    @scala.inline
    def setChildIdsVarargs(value: AXNodeId*): Self = this.set("childIds", js.Array(value :_*))
    
    @scala.inline
    def setChildIds(value: js.Array[AXNodeId]): Self = this.set("childIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildIds: Self = this.set("childIds", js.undefined)
    
    @scala.inline
    def setDescription(value: AXValue): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIgnoredReasonsVarargs(value: AXProperty*): Self = this.set("ignoredReasons", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredReasons(value: js.Array[AXProperty]): Self = this.set("ignoredReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoredReasons: Self = this.set("ignoredReasons", js.undefined)
    
    @scala.inline
    def setName(value: AXValue): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: AXProperty*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[AXProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRole(value: AXValue): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setValue(value: AXValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
