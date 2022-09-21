package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var assignedSlot: js.UndefOr[BackendNode] = js.undefined
  
  /**
    * Attributes of the `Element` node in the form of flat array `[name1, value1, name2, value2]`.
    */
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The BackendNodeId for this node.
    */
  var backendNodeId: BackendNodeId
  
  /**
    * Base URL that `Document` or `FrameOwner` node uses for URL completion.
    */
  var baseURL: js.UndefOr[String] = js.undefined
  
  /**
    * Child count for `Container` nodes.
    */
  var childNodeCount: js.UndefOr[integer] = js.undefined
  
  /**
    * Child nodes of this node when requested with children.
    */
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  
  var compatibilityMode: js.UndefOr[CompatibilityMode] = js.undefined
  
  /**
    * Content document for frame owner elements.
    */
  var contentDocument: js.UndefOr[Node] = js.undefined
  
  /**
    * Distributed nodes for given insertion point.
    */
  var distributedNodes: js.UndefOr[js.Array[BackendNode]] = js.undefined
  
  /**
    * Document URL that `Document` or `FrameOwner` node points to.
    */
  var documentURL: js.UndefOr[String] = js.undefined
  
  /**
    * Frame ID for frame owner elements.
    */
  var frameId: js.UndefOr[FrameId] = js.undefined
  
  /**
    * Deprecated, as the HTML Imports API has been removed (crbug.com/937746).
    * This property used to return the imported document for the HTMLImport links.
    * The property is always undefined now.
    */
  var importedDocument: js.UndefOr[Node] = js.undefined
  
  /**
    * `DocumentType`'s internalSubset.
    */
  var internalSubset: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the node is SVG.
    */
  var isSVG: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `Node`'s localName.
    */
  var localName: String
  
  /**
    * `Attr`'s name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Node identifier that is passed into the rest of the DOM messages as the `nodeId`. Backend
    * will only push node with given `id` once. It is aware of all requested nodes and will only
    * fire DOM events for nodes known to the client.
    */
  var nodeId: NodeId
  
  /**
    * `Node`'s nodeName.
    */
  var nodeName: String
  
  /**
    * `Node`'s nodeType.
    */
  var nodeType: integer
  
  /**
    * `Node`'s nodeValue.
    */
  var nodeValue: String
  
  /**
    * The id of the parent node if any.
    */
  var parentId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * Pseudo elements associated with this node.
    */
  var pseudoElements: js.UndefOr[js.Array[Node]] = js.undefined
  
  /**
    * Pseudo element identifier for this node. Only present if there is a
    * valid pseudoType.
    */
  var pseudoIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Pseudo element type for this node.
    */
  var pseudoType: js.UndefOr[PseudoType] = js.undefined
  
  /**
    * `DocumentType`'s publicId.
    */
  var publicId: js.UndefOr[String] = js.undefined
  
  /**
    * Shadow root type.
    */
  var shadowRootType: js.UndefOr[ShadowRootType] = js.undefined
  
  /**
    * Shadow root list for given element host.
    */
  var shadowRoots: js.UndefOr[js.Array[Node]] = js.undefined
  
  /**
    * `DocumentType`'s systemId.
    */
  var systemId: js.UndefOr[String] = js.undefined
  
  /**
    * Content document fragment for template elements.
    */
  var templateContent: js.UndefOr[Node] = js.undefined
  
  /**
    * `Attr`'s value.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * `Document`'s XML version in case of XML documents.
    */
  var xmlVersion: js.UndefOr[String] = js.undefined
}
object Node {
  
  inline def apply(
    backendNodeId: BackendNodeId,
    localName: String,
    nodeId: NodeId,
    nodeName: String,
    nodeType: integer,
    nodeValue: String
  ): Node = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setAssignedSlot(value: BackendNode): Self = StObject.set(x, "assignedSlot", value.asInstanceOf[js.Any])
    
    inline def setAssignedSlotUndefined: Self = StObject.set(x, "assignedSlot", js.undefined)
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    inline def setChildNodeCount(value: integer): Self = StObject.set(x, "childNodeCount", value.asInstanceOf[js.Any])
    
    inline def setChildNodeCountUndefined: Self = StObject.set(x, "childNodeCount", js.undefined)
    
    inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCompatibilityMode(value: CompatibilityMode): Self = StObject.set(x, "compatibilityMode", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityModeUndefined: Self = StObject.set(x, "compatibilityMode", js.undefined)
    
    inline def setContentDocument(value: Node): Self = StObject.set(x, "contentDocument", value.asInstanceOf[js.Any])
    
    inline def setContentDocumentUndefined: Self = StObject.set(x, "contentDocument", js.undefined)
    
    inline def setDistributedNodes(value: js.Array[BackendNode]): Self = StObject.set(x, "distributedNodes", value.asInstanceOf[js.Any])
    
    inline def setDistributedNodesUndefined: Self = StObject.set(x, "distributedNodes", js.undefined)
    
    inline def setDistributedNodesVarargs(value: BackendNode*): Self = StObject.set(x, "distributedNodes", js.Array(value*))
    
    inline def setDocumentURL(value: String): Self = StObject.set(x, "documentURL", value.asInstanceOf[js.Any])
    
    inline def setDocumentURLUndefined: Self = StObject.set(x, "documentURL", js.undefined)
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setImportedDocument(value: Node): Self = StObject.set(x, "importedDocument", value.asInstanceOf[js.Any])
    
    inline def setImportedDocumentUndefined: Self = StObject.set(x, "importedDocument", js.undefined)
    
    inline def setInternalSubset(value: String): Self = StObject.set(x, "internalSubset", value.asInstanceOf[js.Any])
    
    inline def setInternalSubsetUndefined: Self = StObject.set(x, "internalSubset", js.undefined)
    
    inline def setIsSVG(value: Boolean): Self = StObject.set(x, "isSVG", value.asInstanceOf[js.Any])
    
    inline def setIsSVGUndefined: Self = StObject.set(x, "isSVG", js.undefined)
    
    inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeType(value: integer): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: NodeId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setPseudoElements(value: js.Array[Node]): Self = StObject.set(x, "pseudoElements", value.asInstanceOf[js.Any])
    
    inline def setPseudoElementsUndefined: Self = StObject.set(x, "pseudoElements", js.undefined)
    
    inline def setPseudoElementsVarargs(value: Node*): Self = StObject.set(x, "pseudoElements", js.Array(value*))
    
    inline def setPseudoIdentifier(value: String): Self = StObject.set(x, "pseudoIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPseudoIdentifierUndefined: Self = StObject.set(x, "pseudoIdentifier", js.undefined)
    
    inline def setPseudoType(value: PseudoType): Self = StObject.set(x, "pseudoType", value.asInstanceOf[js.Any])
    
    inline def setPseudoTypeUndefined: Self = StObject.set(x, "pseudoType", js.undefined)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
    
    inline def setShadowRootType(value: ShadowRootType): Self = StObject.set(x, "shadowRootType", value.asInstanceOf[js.Any])
    
    inline def setShadowRootTypeUndefined: Self = StObject.set(x, "shadowRootType", js.undefined)
    
    inline def setShadowRoots(value: js.Array[Node]): Self = StObject.set(x, "shadowRoots", value.asInstanceOf[js.Any])
    
    inline def setShadowRootsUndefined: Self = StObject.set(x, "shadowRoots", js.undefined)
    
    inline def setShadowRootsVarargs(value: Node*): Self = StObject.set(x, "shadowRoots", js.Array(value*))
    
    inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    
    inline def setSystemIdUndefined: Self = StObject.set(x, "systemId", js.undefined)
    
    inline def setTemplateContent(value: Node): Self = StObject.set(x, "templateContent", value.asInstanceOf[js.Any])
    
    inline def setTemplateContentUndefined: Self = StObject.set(x, "templateContent", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setXmlVersion(value: String): Self = StObject.set(x, "xmlVersion", value.asInstanceOf[js.Any])
    
    inline def setXmlVersionUndefined: Self = StObject.set(x, "xmlVersion", js.undefined)
  }
}
