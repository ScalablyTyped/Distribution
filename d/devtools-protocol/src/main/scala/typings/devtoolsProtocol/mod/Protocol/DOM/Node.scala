package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /**
    * Attributes of the `Element` node in the form of flat array `[name1, value1, name2, value2]`.
    */
  var attributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The BackendNodeId for this node.
    */
  var backendNodeId: BackendNodeId = js.native
  /**
    * Base URL that `Document` or `FrameOwner` node uses for URL completion.
    */
  var baseURL: js.UndefOr[String] = js.native
  /**
    * Child count for `Container` nodes.
    */
  var childNodeCount: js.UndefOr[integer] = js.native
  /**
    * Child nodes of this node when requested with children.
    */
  var children: js.UndefOr[js.Array[Node]] = js.native
  /**
    * Content document for frame owner elements.
    */
  var contentDocument: js.UndefOr[Node] = js.native
  /**
    * Distributed nodes for given insertion point.
    */
  var distributedNodes: js.UndefOr[js.Array[BackendNode]] = js.native
  /**
    * Document URL that `Document` or `FrameOwner` node points to.
    */
  var documentURL: js.UndefOr[String] = js.native
  /**
    * Frame ID for frame owner elements.
    */
  var frameId: js.UndefOr[FrameId] = js.native
  /**
    * Import document for the HTMLImport links.
    */
  var importedDocument: js.UndefOr[Node] = js.native
  /**
    * `DocumentType`'s internalSubset.
    */
  var internalSubset: js.UndefOr[String] = js.native
  /**
    * Whether the node is SVG.
    */
  var isSVG: js.UndefOr[Boolean] = js.native
  /**
    * `Node`'s localName.
    */
  var localName: String = js.native
  /**
    * `Attr`'s name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Node identifier that is passed into the rest of the DOM messages as the `nodeId`. Backend
    * will only push node with given `id` once. It is aware of all requested nodes and will only
    * fire DOM events for nodes known to the client.
    */
  var nodeId: NodeId = js.native
  /**
    * `Node`'s nodeName.
    */
  var nodeName: String = js.native
  /**
    * `Node`'s nodeType.
    */
  var nodeType: integer = js.native
  /**
    * `Node`'s nodeValue.
    */
  var nodeValue: String = js.native
  /**
    * The id of the parent node if any.
    */
  var parentId: js.UndefOr[NodeId] = js.native
  /**
    * Pseudo elements associated with this node.
    */
  var pseudoElements: js.UndefOr[js.Array[Node]] = js.native
  /**
    * Pseudo element type for this node.
    */
  var pseudoType: js.UndefOr[PseudoType] = js.native
  /**
    * `DocumentType`'s publicId.
    */
  var publicId: js.UndefOr[String] = js.native
  /**
    * Shadow root type.
    */
  var shadowRootType: js.UndefOr[ShadowRootType] = js.native
  /**
    * Shadow root list for given element host.
    */
  var shadowRoots: js.UndefOr[js.Array[Node]] = js.native
  /**
    * `DocumentType`'s systemId.
    */
  var systemId: js.UndefOr[String] = js.native
  /**
    * Content document fragment for template elements.
    */
  var templateContent: js.UndefOr[Node] = js.native
  /**
    * `Attr`'s value.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * `Document`'s XML version in case of XML documents.
    */
  var xmlVersion: js.UndefOr[String] = js.native
}

object Node {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setBackendNodeId(value: BackendNodeId): Self = this.set("backendNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalName(value: String): Self = this.set("localName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: integer): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    @scala.inline
    def setChildNodeCount(value: integer): Self = this.set("childNodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildNodeCount: Self = this.set("childNodeCount", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: Node*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Node]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setContentDocument(value: Node): Self = this.set("contentDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDocument: Self = this.set("contentDocument", js.undefined)
    @scala.inline
    def setDistributedNodesVarargs(value: BackendNode*): Self = this.set("distributedNodes", js.Array(value :_*))
    @scala.inline
    def setDistributedNodes(value: js.Array[BackendNode]): Self = this.set("distributedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributedNodes: Self = this.set("distributedNodes", js.undefined)
    @scala.inline
    def setDocumentURL(value: String): Self = this.set("documentURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentURL: Self = this.set("documentURL", js.undefined)
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    @scala.inline
    def setImportedDocument(value: Node): Self = this.set("importedDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportedDocument: Self = this.set("importedDocument", js.undefined)
    @scala.inline
    def setInternalSubset(value: String): Self = this.set("internalSubset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalSubset: Self = this.set("internalSubset", js.undefined)
    @scala.inline
    def setIsSVG(value: Boolean): Self = this.set("isSVG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSVG: Self = this.set("isSVG", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentId(value: NodeId): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setPseudoElementsVarargs(value: Node*): Self = this.set("pseudoElements", js.Array(value :_*))
    @scala.inline
    def setPseudoElements(value: js.Array[Node]): Self = this.set("pseudoElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudoElements: Self = this.set("pseudoElements", js.undefined)
    @scala.inline
    def setPseudoType(value: PseudoType): Self = this.set("pseudoType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudoType: Self = this.set("pseudoType", js.undefined)
    @scala.inline
    def setPublicId(value: String): Self = this.set("publicId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicId: Self = this.set("publicId", js.undefined)
    @scala.inline
    def setShadowRootType(value: ShadowRootType): Self = this.set("shadowRootType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowRootType: Self = this.set("shadowRootType", js.undefined)
    @scala.inline
    def setShadowRootsVarargs(value: Node*): Self = this.set("shadowRoots", js.Array(value :_*))
    @scala.inline
    def setShadowRoots(value: js.Array[Node]): Self = this.set("shadowRoots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowRoots: Self = this.set("shadowRoots", js.undefined)
    @scala.inline
    def setSystemId(value: String): Self = this.set("systemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemId: Self = this.set("systemId", js.undefined)
    @scala.inline
    def setTemplateContent(value: Node): Self = this.set("templateContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateContent: Self = this.set("templateContent", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setXmlVersion(value: String): Self = this.set("xmlVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlVersion: Self = this.set("xmlVersion", js.undefined)
  }
  
}

