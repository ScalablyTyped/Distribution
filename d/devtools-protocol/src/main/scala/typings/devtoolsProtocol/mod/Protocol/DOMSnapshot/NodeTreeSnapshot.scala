package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeTreeSnapshot extends js.Object {
  /**
    * Attributes of an `Element` node. Flatten name, value pairs.
    */
  var attributes: js.UndefOr[js.Array[ArrayOfStrings]] = js.native
  /**
    * `Node`'s id, corresponds to DOM.Node.backendNodeId.
    */
  var backendNodeId: js.UndefOr[js.Array[BackendNodeId]] = js.native
  /**
    * The index of the document in the list of the snapshot documents.
    */
  var contentDocumentIndex: js.UndefOr[RareIntegerData] = js.native
  /**
    * The selected url for nodes with a srcset attribute.
    */
  var currentSourceURL: js.UndefOr[RareStringData] = js.native
  /**
    * Only set for radio and checkbox input elements, indicates if the element has been checked
    */
  var inputChecked: js.UndefOr[RareBooleanData] = js.native
  /**
    * Only set for input elements, contains the input's associated text value.
    */
  var inputValue: js.UndefOr[RareStringData] = js.native
  /**
    * Whether this DOM node responds to mouse clicks. This includes nodes that have had click
    * event listeners attached via JavaScript as well as anchor tags that naturally navigate when
    * clicked.
    */
  var isClickable: js.UndefOr[RareBooleanData] = js.native
  /**
    * `Node`'s nodeName.
    */
  var nodeName: js.UndefOr[js.Array[StringIndex]] = js.native
  /**
    * `Node`'s nodeType.
    */
  var nodeType: js.UndefOr[js.Array[integer]] = js.native
  /**
    * `Node`'s nodeValue.
    */
  var nodeValue: js.UndefOr[js.Array[StringIndex]] = js.native
  /**
    * Only set for option elements, indicates if the element has been selected
    */
  var optionSelected: js.UndefOr[RareBooleanData] = js.native
  /**
    * The url of the script (if any) that generates this node.
    */
  var originURL: js.UndefOr[RareStringData] = js.native
  /**
    * Parent node index.
    */
  var parentIndex: js.UndefOr[js.Array[integer]] = js.native
  /**
    * Type of a pseudo element node.
    */
  var pseudoType: js.UndefOr[RareStringData] = js.native
  /**
    * Only set for textarea elements, contains the text value.
    */
  var textValue: js.UndefOr[RareStringData] = js.native
}

object NodeTreeSnapshot {
  @scala.inline
  def apply(): NodeTreeSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTreeSnapshot]
  }
  @scala.inline
  implicit class NodeTreeSnapshotOps[Self <: NodeTreeSnapshot] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: ArrayOfStrings*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[ArrayOfStrings]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setBackendNodeIdVarargs(value: BackendNodeId*): Self = this.set("backendNodeId", js.Array(value :_*))
    @scala.inline
    def setBackendNodeId(value: js.Array[BackendNodeId]): Self = this.set("backendNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackendNodeId: Self = this.set("backendNodeId", js.undefined)
    @scala.inline
    def setContentDocumentIndex(value: RareIntegerData): Self = this.set("contentDocumentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDocumentIndex: Self = this.set("contentDocumentIndex", js.undefined)
    @scala.inline
    def setCurrentSourceURL(value: RareStringData): Self = this.set("currentSourceURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSourceURL: Self = this.set("currentSourceURL", js.undefined)
    @scala.inline
    def setInputChecked(value: RareBooleanData): Self = this.set("inputChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputChecked: Self = this.set("inputChecked", js.undefined)
    @scala.inline
    def setInputValue(value: RareStringData): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setIsClickable(value: RareBooleanData): Self = this.set("isClickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsClickable: Self = this.set("isClickable", js.undefined)
    @scala.inline
    def setNodeNameVarargs(value: StringIndex*): Self = this.set("nodeName", js.Array(value :_*))
    @scala.inline
    def setNodeName(value: js.Array[StringIndex]): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeName: Self = this.set("nodeName", js.undefined)
    @scala.inline
    def setNodeTypeVarargs(value: integer*): Self = this.set("nodeType", js.Array(value :_*))
    @scala.inline
    def setNodeType(value: js.Array[integer]): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    @scala.inline
    def setNodeValueVarargs(value: StringIndex*): Self = this.set("nodeValue", js.Array(value :_*))
    @scala.inline
    def setNodeValue(value: js.Array[StringIndex]): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeValue: Self = this.set("nodeValue", js.undefined)
    @scala.inline
    def setOptionSelected(value: RareBooleanData): Self = this.set("optionSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionSelected: Self = this.set("optionSelected", js.undefined)
    @scala.inline
    def setOriginURL(value: RareStringData): Self = this.set("originURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginURL: Self = this.set("originURL", js.undefined)
    @scala.inline
    def setParentIndexVarargs(value: integer*): Self = this.set("parentIndex", js.Array(value :_*))
    @scala.inline
    def setParentIndex(value: js.Array[integer]): Self = this.set("parentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentIndex: Self = this.set("parentIndex", js.undefined)
    @scala.inline
    def setPseudoType(value: RareStringData): Self = this.set("pseudoType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudoType: Self = this.set("pseudoType", js.undefined)
    @scala.inline
    def setTextValue(value: RareStringData): Self = this.set("textValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextValue: Self = this.set("textValue", js.undefined)
  }
  
}

