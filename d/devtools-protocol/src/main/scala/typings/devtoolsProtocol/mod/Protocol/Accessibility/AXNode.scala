package typings.devtoolsProtocol.mod.Protocol.Accessibility

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AXNode extends StObject {
  
  /**
    * The backend ID for the associated DOM node, if any.
    */
  var backendDOMNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * IDs for each of this node's child nodes.
    */
  var childIds: js.UndefOr[js.Array[AXNodeId]] = js.undefined
  
  /**
    * This `Node`'s Chrome raw role.
    */
  var chromeRole: js.UndefOr[AXValue] = js.undefined
  
  /**
    * The accessible description for this `Node`.
    */
  var description: js.UndefOr[AXValue] = js.undefined
  
  /**
    * The frame ID for the frame associated with this nodes document.
    */
  var frameId: js.UndefOr[FrameId] = js.undefined
  
  /**
    * Whether this node is ignored for accessibility
    */
  var ignored: Boolean
  
  /**
    * Collection of reasons why this node is hidden.
    */
  var ignoredReasons: js.UndefOr[js.Array[AXProperty]] = js.undefined
  
  /**
    * The accessible name for this `Node`.
    */
  var name: js.UndefOr[AXValue] = js.undefined
  
  /**
    * Unique identifier for this node.
    */
  var nodeId: AXNodeId
  
  /**
    * ID for this node's parent.
    */
  var parentId: js.UndefOr[AXNodeId] = js.undefined
  
  /**
    * All other properties
    */
  var properties: js.UndefOr[js.Array[AXProperty]] = js.undefined
  
  /**
    * This `Node`'s role, whether explicit or implicit.
    */
  var role: js.UndefOr[AXValue] = js.undefined
  
  /**
    * The value for this `Node`.
    */
  var value: js.UndefOr[AXValue] = js.undefined
}
object AXNode {
  
  inline def apply(ignored: Boolean, nodeId: AXNodeId): AXNode = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AXNode] (val x: Self) extends AnyVal {
    
    inline def setBackendDOMNodeId(value: BackendNodeId): Self = StObject.set(x, "backendDOMNodeId", value.asInstanceOf[js.Any])
    
    inline def setBackendDOMNodeIdUndefined: Self = StObject.set(x, "backendDOMNodeId", js.undefined)
    
    inline def setChildIds(value: js.Array[AXNodeId]): Self = StObject.set(x, "childIds", value.asInstanceOf[js.Any])
    
    inline def setChildIdsUndefined: Self = StObject.set(x, "childIds", js.undefined)
    
    inline def setChildIdsVarargs(value: AXNodeId*): Self = StObject.set(x, "childIds", js.Array(value*))
    
    inline def setChromeRole(value: AXValue): Self = StObject.set(x, "chromeRole", value.asInstanceOf[js.Any])
    
    inline def setChromeRoleUndefined: Self = StObject.set(x, "chromeRole", js.undefined)
    
    inline def setDescription(value: AXValue): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setIgnoredReasons(value: js.Array[AXProperty]): Self = StObject.set(x, "ignoredReasons", value.asInstanceOf[js.Any])
    
    inline def setIgnoredReasonsUndefined: Self = StObject.set(x, "ignoredReasons", js.undefined)
    
    inline def setIgnoredReasonsVarargs(value: AXProperty*): Self = StObject.set(x, "ignoredReasons", js.Array(value*))
    
    inline def setName(value: AXValue): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeId(value: AXNodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: AXNodeId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setProperties(value: js.Array[AXProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: AXProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setRole(value: AXValue): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
