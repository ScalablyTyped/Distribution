package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoType
import typings.devtoolsProtocol.mod.Protocol.DOM.ShadowRootType
import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.EventListener
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMNode extends StObject {
  
  /**
    * Attributes of an `Element` node.
    */
  var attributes: js.UndefOr[js.Array[NameValue]] = js.undefined
  
  /**
    * `Node`'s id, corresponds to DOM.Node.backendNodeId.
    */
  var backendNodeId: BackendNodeId
  
  /**
    * Base URL that `Document` or `FrameOwner` node uses for URL completion.
    */
  var baseURL: js.UndefOr[String] = js.undefined
  
  /**
    * The indexes of the node's child nodes in the `domNodes` array returned by `getSnapshot`, if
    * any.
    */
  var childNodeIndexes: js.UndefOr[js.Array[integer]] = js.undefined
  
  /**
    * The index of a frame owner element's content document in the `domNodes` array returned by
    * `getSnapshot`, if any.
    */
  var contentDocumentIndex: js.UndefOr[integer] = js.undefined
  
  /**
    * Only set for documents, contains the document's content language.
    */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The selected url for nodes with a srcset attribute.
    */
  var currentSourceURL: js.UndefOr[String] = js.undefined
  
  /**
    * Only set for documents, contains the document's character set encoding.
    */
  var documentEncoding: js.UndefOr[String] = js.undefined
  
  /**
    * Document URL that `Document` or `FrameOwner` node points to.
    */
  var documentURL: js.UndefOr[String] = js.undefined
  
  /**
    * Details of the node's event listeners, if any.
    */
  var eventListeners: js.UndefOr[js.Array[EventListener]] = js.undefined
  
  /**
    * Frame ID for frame owner elements and also for the document node.
    */
  var frameId: js.UndefOr[FrameId] = js.undefined
  
  /**
    * Only set for radio and checkbox input elements, indicates if the element has been checked
    */
  var inputChecked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only set for input elements, contains the input's associated text value.
    */
  var inputValue: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this DOM node responds to mouse clicks. This includes nodes that have had click
    * event listeners attached via JavaScript as well as anchor tags that naturally navigate when
    * clicked.
    */
  var isClickable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The index of the node's related layout tree node in the `layoutTreeNodes` array returned by
    * `getSnapshot`, if any.
    */
  var layoutNodeIndex: js.UndefOr[integer] = js.undefined
  
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
    * Only set for option elements, indicates if the element has been selected
    */
  var optionSelected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The url of the script (if any) that generates this node.
    */
  var originURL: js.UndefOr[String] = js.undefined
  
  /**
    * Indexes of pseudo elements associated with this node in the `domNodes` array returned by
    * `getSnapshot`, if any.
    */
  var pseudoElementIndexes: js.UndefOr[js.Array[integer]] = js.undefined
  
  /**
    * Type of a pseudo element node.
    */
  var pseudoType: js.UndefOr[PseudoType] = js.undefined
  
  /**
    * `DocumentType` node's publicId.
    */
  var publicId: js.UndefOr[String] = js.undefined
  
  /**
    * Scroll offsets, set when this node is a Document.
    */
  var scrollOffsetX: js.UndefOr[Double] = js.undefined
  
  var scrollOffsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow root type.
    */
  var shadowRootType: js.UndefOr[ShadowRootType] = js.undefined
  
  /**
    * `DocumentType` node's systemId.
    */
  var systemId: js.UndefOr[String] = js.undefined
  
  /**
    * Only set for textarea elements, contains the text value.
    */
  var textValue: js.UndefOr[String] = js.undefined
}
object DOMNode {
  
  inline def apply(backendNodeId: BackendNodeId, nodeName: String, nodeType: integer, nodeValue: String): DOMNode = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMNode] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[NameValue]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: NameValue*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    inline def setChildNodeIndexes(value: js.Array[integer]): Self = StObject.set(x, "childNodeIndexes", value.asInstanceOf[js.Any])
    
    inline def setChildNodeIndexesUndefined: Self = StObject.set(x, "childNodeIndexes", js.undefined)
    
    inline def setChildNodeIndexesVarargs(value: integer*): Self = StObject.set(x, "childNodeIndexes", js.Array(value*))
    
    inline def setContentDocumentIndex(value: integer): Self = StObject.set(x, "contentDocumentIndex", value.asInstanceOf[js.Any])
    
    inline def setContentDocumentIndexUndefined: Self = StObject.set(x, "contentDocumentIndex", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setCurrentSourceURL(value: String): Self = StObject.set(x, "currentSourceURL", value.asInstanceOf[js.Any])
    
    inline def setCurrentSourceURLUndefined: Self = StObject.set(x, "currentSourceURL", js.undefined)
    
    inline def setDocumentEncoding(value: String): Self = StObject.set(x, "documentEncoding", value.asInstanceOf[js.Any])
    
    inline def setDocumentEncodingUndefined: Self = StObject.set(x, "documentEncoding", js.undefined)
    
    inline def setDocumentURL(value: String): Self = StObject.set(x, "documentURL", value.asInstanceOf[js.Any])
    
    inline def setDocumentURLUndefined: Self = StObject.set(x, "documentURL", js.undefined)
    
    inline def setEventListeners(value: js.Array[EventListener]): Self = StObject.set(x, "eventListeners", value.asInstanceOf[js.Any])
    
    inline def setEventListenersUndefined: Self = StObject.set(x, "eventListeners", js.undefined)
    
    inline def setEventListenersVarargs(value: EventListener*): Self = StObject.set(x, "eventListeners", js.Array(value*))
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setInputChecked(value: Boolean): Self = StObject.set(x, "inputChecked", value.asInstanceOf[js.Any])
    
    inline def setInputCheckedUndefined: Self = StObject.set(x, "inputChecked", js.undefined)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setIsClickable(value: Boolean): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
    
    inline def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
    
    inline def setLayoutNodeIndex(value: integer): Self = StObject.set(x, "layoutNodeIndex", value.asInstanceOf[js.Any])
    
    inline def setLayoutNodeIndexUndefined: Self = StObject.set(x, "layoutNodeIndex", js.undefined)
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeType(value: integer): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    inline def setOptionSelected(value: Boolean): Self = StObject.set(x, "optionSelected", value.asInstanceOf[js.Any])
    
    inline def setOptionSelectedUndefined: Self = StObject.set(x, "optionSelected", js.undefined)
    
    inline def setOriginURL(value: String): Self = StObject.set(x, "originURL", value.asInstanceOf[js.Any])
    
    inline def setOriginURLUndefined: Self = StObject.set(x, "originURL", js.undefined)
    
    inline def setPseudoElementIndexes(value: js.Array[integer]): Self = StObject.set(x, "pseudoElementIndexes", value.asInstanceOf[js.Any])
    
    inline def setPseudoElementIndexesUndefined: Self = StObject.set(x, "pseudoElementIndexes", js.undefined)
    
    inline def setPseudoElementIndexesVarargs(value: integer*): Self = StObject.set(x, "pseudoElementIndexes", js.Array(value*))
    
    inline def setPseudoType(value: PseudoType): Self = StObject.set(x, "pseudoType", value.asInstanceOf[js.Any])
    
    inline def setPseudoTypeUndefined: Self = StObject.set(x, "pseudoType", js.undefined)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
    
    inline def setScrollOffsetX(value: Double): Self = StObject.set(x, "scrollOffsetX", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetXUndefined: Self = StObject.set(x, "scrollOffsetX", js.undefined)
    
    inline def setScrollOffsetY(value: Double): Self = StObject.set(x, "scrollOffsetY", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetYUndefined: Self = StObject.set(x, "scrollOffsetY", js.undefined)
    
    inline def setShadowRootType(value: ShadowRootType): Self = StObject.set(x, "shadowRootType", value.asInstanceOf[js.Any])
    
    inline def setShadowRootTypeUndefined: Self = StObject.set(x, "shadowRootType", js.undefined)
    
    inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    
    inline def setSystemIdUndefined: Self = StObject.set(x, "systemId", js.undefined)
    
    inline def setTextValue(value: String): Self = StObject.set(x, "textValue", value.asInstanceOf[js.Any])
    
    inline def setTextValueUndefined: Self = StObject.set(x, "textValue", js.undefined)
  }
}
