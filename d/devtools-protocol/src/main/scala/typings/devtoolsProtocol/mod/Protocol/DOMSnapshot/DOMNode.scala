package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoType
import typings.devtoolsProtocol.mod.Protocol.DOM.ShadowRootType
import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.EventListener
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMNode extends js.Object {
  
  /**
    * Attributes of an `Element` node.
    */
  var attributes: js.UndefOr[js.Array[NameValue]] = js.native
  
  /**
    * `Node`'s id, corresponds to DOM.Node.backendNodeId.
    */
  var backendNodeId: BackendNodeId = js.native
  
  /**
    * Base URL that `Document` or `FrameOwner` node uses for URL completion.
    */
  var baseURL: js.UndefOr[String] = js.native
  
  /**
    * The indexes of the node's child nodes in the `domNodes` array returned by `getSnapshot`, if
    * any.
    */
  var childNodeIndexes: js.UndefOr[js.Array[integer]] = js.native
  
  /**
    * The index of a frame owner element's content document in the `domNodes` array returned by
    * `getSnapshot`, if any.
    */
  var contentDocumentIndex: js.UndefOr[integer] = js.native
  
  /**
    * Only set for documents, contains the document's content language.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  
  /**
    * The selected url for nodes with a srcset attribute.
    */
  var currentSourceURL: js.UndefOr[String] = js.native
  
  /**
    * Only set for documents, contains the document's character set encoding.
    */
  var documentEncoding: js.UndefOr[String] = js.native
  
  /**
    * Document URL that `Document` or `FrameOwner` node points to.
    */
  var documentURL: js.UndefOr[String] = js.native
  
  /**
    * Details of the node's event listeners, if any.
    */
  var eventListeners: js.UndefOr[js.Array[EventListener]] = js.native
  
  /**
    * Frame ID for frame owner elements and also for the document node.
    */
  var frameId: js.UndefOr[FrameId] = js.native
  
  /**
    * Only set for radio and checkbox input elements, indicates if the element has been checked
    */
  var inputChecked: js.UndefOr[Boolean] = js.native
  
  /**
    * Only set for input elements, contains the input's associated text value.
    */
  var inputValue: js.UndefOr[String] = js.native
  
  /**
    * Whether this DOM node responds to mouse clicks. This includes nodes that have had click
    * event listeners attached via JavaScript as well as anchor tags that naturally navigate when
    * clicked.
    */
  var isClickable: js.UndefOr[Boolean] = js.native
  
  /**
    * The index of the node's related layout tree node in the `layoutTreeNodes` array returned by
    * `getSnapshot`, if any.
    */
  var layoutNodeIndex: js.UndefOr[integer] = js.native
  
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
    * Only set for option elements, indicates if the element has been selected
    */
  var optionSelected: js.UndefOr[Boolean] = js.native
  
  /**
    * The url of the script (if any) that generates this node.
    */
  var originURL: js.UndefOr[String] = js.native
  
  /**
    * Indexes of pseudo elements associated with this node in the `domNodes` array returned by
    * `getSnapshot`, if any.
    */
  var pseudoElementIndexes: js.UndefOr[js.Array[integer]] = js.native
  
  /**
    * Type of a pseudo element node.
    */
  var pseudoType: js.UndefOr[PseudoType] = js.native
  
  /**
    * `DocumentType` node's publicId.
    */
  var publicId: js.UndefOr[String] = js.native
  
  /**
    * Scroll offsets, set when this node is a Document.
    */
  var scrollOffsetX: js.UndefOr[Double] = js.native
  
  var scrollOffsetY: js.UndefOr[Double] = js.native
  
  /**
    * Shadow root type.
    */
  var shadowRootType: js.UndefOr[ShadowRootType] = js.native
  
  /**
    * `DocumentType` node's systemId.
    */
  var systemId: js.UndefOr[String] = js.native
  
  /**
    * Only set for textarea elements, contains the text value.
    */
  var textValue: js.UndefOr[String] = js.native
}
object DOMNode {
  
  @scala.inline
  def apply(backendNodeId: BackendNodeId, nodeName: String, nodeType: integer, nodeValue: String): DOMNode = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMNode]
  }
  
  @scala.inline
  implicit class DOMNodeOps[Self <: DOMNode] (val x: Self) extends AnyVal {
    
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
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: integer): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: NameValue*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[NameValue]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    
    @scala.inline
    def setChildNodeIndexesVarargs(value: integer*): Self = this.set("childNodeIndexes", js.Array(value :_*))
    
    @scala.inline
    def setChildNodeIndexes(value: js.Array[integer]): Self = this.set("childNodeIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildNodeIndexes: Self = this.set("childNodeIndexes", js.undefined)
    
    @scala.inline
    def setContentDocumentIndex(value: integer): Self = this.set("contentDocumentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDocumentIndex: Self = this.set("contentDocumentIndex", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    
    @scala.inline
    def setCurrentSourceURL(value: String): Self = this.set("currentSourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentSourceURL: Self = this.set("currentSourceURL", js.undefined)
    
    @scala.inline
    def setDocumentEncoding(value: String): Self = this.set("documentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentEncoding: Self = this.set("documentEncoding", js.undefined)
    
    @scala.inline
    def setDocumentURL(value: String): Self = this.set("documentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentURL: Self = this.set("documentURL", js.undefined)
    
    @scala.inline
    def setEventListenersVarargs(value: EventListener*): Self = this.set("eventListeners", js.Array(value :_*))
    
    @scala.inline
    def setEventListeners(value: js.Array[EventListener]): Self = this.set("eventListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventListeners: Self = this.set("eventListeners", js.undefined)
    
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    
    @scala.inline
    def setInputChecked(value: Boolean): Self = this.set("inputChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputChecked: Self = this.set("inputChecked", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    
    @scala.inline
    def setIsClickable(value: Boolean): Self = this.set("isClickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClickable: Self = this.set("isClickable", js.undefined)
    
    @scala.inline
    def setLayoutNodeIndex(value: integer): Self = this.set("layoutNodeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutNodeIndex: Self = this.set("layoutNodeIndex", js.undefined)
    
    @scala.inline
    def setOptionSelected(value: Boolean): Self = this.set("optionSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionSelected: Self = this.set("optionSelected", js.undefined)
    
    @scala.inline
    def setOriginURL(value: String): Self = this.set("originURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginURL: Self = this.set("originURL", js.undefined)
    
    @scala.inline
    def setPseudoElementIndexesVarargs(value: integer*): Self = this.set("pseudoElementIndexes", js.Array(value :_*))
    
    @scala.inline
    def setPseudoElementIndexes(value: js.Array[integer]): Self = this.set("pseudoElementIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePseudoElementIndexes: Self = this.set("pseudoElementIndexes", js.undefined)
    
    @scala.inline
    def setPseudoType(value: PseudoType): Self = this.set("pseudoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePseudoType: Self = this.set("pseudoType", js.undefined)
    
    @scala.inline
    def setPublicId(value: String): Self = this.set("publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicId: Self = this.set("publicId", js.undefined)
    
    @scala.inline
    def setScrollOffsetX(value: Double): Self = this.set("scrollOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOffsetX: Self = this.set("scrollOffsetX", js.undefined)
    
    @scala.inline
    def setScrollOffsetY(value: Double): Self = this.set("scrollOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOffsetY: Self = this.set("scrollOffsetY", js.undefined)
    
    @scala.inline
    def setShadowRootType(value: ShadowRootType): Self = this.set("shadowRootType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowRootType: Self = this.set("shadowRootType", js.undefined)
    
    @scala.inline
    def setSystemId(value: String): Self = this.set("systemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemId: Self = this.set("systemId", js.undefined)
    
    @scala.inline
    def setTextValue(value: String): Self = this.set("textValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextValue: Self = this.set("textValue", js.undefined)
  }
}
