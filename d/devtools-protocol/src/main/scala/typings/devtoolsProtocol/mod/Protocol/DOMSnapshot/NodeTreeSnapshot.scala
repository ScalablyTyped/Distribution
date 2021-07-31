package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeTreeSnapshot extends StObject {
  
  /**
    * Attributes of an `Element` node. Flatten name, value pairs.
    */
  var attributes: js.UndefOr[js.Array[ArrayOfStrings]] = js.undefined
  
  /**
    * `Node`'s id, corresponds to DOM.Node.backendNodeId.
    */
  var backendNodeId: js.UndefOr[js.Array[BackendNodeId]] = js.undefined
  
  /**
    * The index of the document in the list of the snapshot documents.
    */
  var contentDocumentIndex: js.UndefOr[RareIntegerData] = js.undefined
  
  /**
    * The selected url for nodes with a srcset attribute.
    */
  var currentSourceURL: js.UndefOr[RareStringData] = js.undefined
  
  /**
    * Only set for radio and checkbox input elements, indicates if the element has been checked
    */
  var inputChecked: js.UndefOr[RareBooleanData] = js.undefined
  
  /**
    * Only set for input elements, contains the input's associated text value.
    */
  var inputValue: js.UndefOr[RareStringData] = js.undefined
  
  /**
    * Whether this DOM node responds to mouse clicks. This includes nodes that have had click
    * event listeners attached via JavaScript as well as anchor tags that naturally navigate when
    * clicked.
    */
  var isClickable: js.UndefOr[RareBooleanData] = js.undefined
  
  /**
    * `Node`'s nodeName.
    */
  var nodeName: js.UndefOr[js.Array[StringIndex]] = js.undefined
  
  /**
    * `Node`'s nodeType.
    */
  var nodeType: js.UndefOr[js.Array[integer]] = js.undefined
  
  /**
    * `Node`'s nodeValue.
    */
  var nodeValue: js.UndefOr[js.Array[StringIndex]] = js.undefined
  
  /**
    * Only set for option elements, indicates if the element has been selected
    */
  var optionSelected: js.UndefOr[RareBooleanData] = js.undefined
  
  /**
    * The url of the script (if any) that generates this node.
    */
  var originURL: js.UndefOr[RareStringData] = js.undefined
  
  /**
    * Parent node index.
    */
  var parentIndex: js.UndefOr[js.Array[integer]] = js.undefined
  
  /**
    * Type of a pseudo element node.
    */
  var pseudoType: js.UndefOr[RareStringData] = js.undefined
  
  /**
    * Only set for textarea elements, contains the text value.
    */
  var textValue: js.UndefOr[RareStringData] = js.undefined
}
object NodeTreeSnapshot {
  
  @scala.inline
  def apply(): NodeTreeSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTreeSnapshot]
  }
  
  @scala.inline
  implicit class NodeTreeSnapshotMutableBuilder[Self <: NodeTreeSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[ArrayOfStrings]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: ArrayOfStrings*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setBackendNodeId(value: js.Array[BackendNodeId]): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    @scala.inline
    def setBackendNodeIdVarargs(value: BackendNodeId*): Self = StObject.set(x, "backendNodeId", js.Array(value :_*))
    
    @scala.inline
    def setContentDocumentIndex(value: RareIntegerData): Self = StObject.set(x, "contentDocumentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDocumentIndexUndefined: Self = StObject.set(x, "contentDocumentIndex", js.undefined)
    
    @scala.inline
    def setCurrentSourceURL(value: RareStringData): Self = StObject.set(x, "currentSourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSourceURLUndefined: Self = StObject.set(x, "currentSourceURL", js.undefined)
    
    @scala.inline
    def setInputChecked(value: RareBooleanData): Self = StObject.set(x, "inputChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputCheckedUndefined: Self = StObject.set(x, "inputChecked", js.undefined)
    
    @scala.inline
    def setInputValue(value: RareStringData): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    @scala.inline
    def setIsClickable(value: RareBooleanData): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
    
    @scala.inline
    def setNodeName(value: js.Array[StringIndex]): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
    
    @scala.inline
    def setNodeNameVarargs(value: StringIndex*): Self = StObject.set(x, "nodeName", js.Array(value :_*))
    
    @scala.inline
    def setNodeType(value: js.Array[integer]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    @scala.inline
    def setNodeTypeVarargs(value: integer*): Self = StObject.set(x, "nodeType", js.Array(value :_*))
    
    @scala.inline
    def setNodeValue(value: js.Array[StringIndex]): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValueUndefined: Self = StObject.set(x, "nodeValue", js.undefined)
    
    @scala.inline
    def setNodeValueVarargs(value: StringIndex*): Self = StObject.set(x, "nodeValue", js.Array(value :_*))
    
    @scala.inline
    def setOptionSelected(value: RareBooleanData): Self = StObject.set(x, "optionSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionSelectedUndefined: Self = StObject.set(x, "optionSelected", js.undefined)
    
    @scala.inline
    def setOriginURL(value: RareStringData): Self = StObject.set(x, "originURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginURLUndefined: Self = StObject.set(x, "originURL", js.undefined)
    
    @scala.inline
    def setParentIndex(value: js.Array[integer]): Self = StObject.set(x, "parentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIndexUndefined: Self = StObject.set(x, "parentIndex", js.undefined)
    
    @scala.inline
    def setParentIndexVarargs(value: integer*): Self = StObject.set(x, "parentIndex", js.Array(value :_*))
    
    @scala.inline
    def setPseudoType(value: RareStringData): Self = StObject.set(x, "pseudoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoTypeUndefined: Self = StObject.set(x, "pseudoType", js.undefined)
    
    @scala.inline
    def setTextValue(value: RareStringData): Self = StObject.set(x, "textValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextValueUndefined: Self = StObject.set(x, "textValue", js.undefined)
  }
}
