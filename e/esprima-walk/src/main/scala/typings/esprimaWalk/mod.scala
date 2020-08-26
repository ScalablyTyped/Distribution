package typings.esprimaWalk

import typings.estree.mod.Program
import typings.std.AddEventListenerOptions
import typings.std.ChildNode
import typings.std.Document
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.GetRootNodeOptions
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeListOf
import typings.std.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esprima-walk", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* Inlined std.Node & {  parent :std.Node | undefined} */
  @js.native
  trait NodeWithParent extends js.Object {
    val ATTRIBUTE_NODE: Double = js.native
    /**
      * node is a CDATASection node.
      */
    val CDATA_SECTION_NODE: Double = js.native
    /**
      * node is a Comment node.
      */
    val COMMENT_NODE: Double = js.native
    /**
      * node is a DocumentFragment node.
      */
    val DOCUMENT_FRAGMENT_NODE: Double = js.native
    /**
      * node is a document.
      */
    val DOCUMENT_NODE: Double = js.native
    /**
      * Set when other is a descendant of node.
      */
    val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
    /**
      * Set when other is an ancestor of node.
      */
    val DOCUMENT_POSITION_CONTAINS: Double = js.native
    /**
      * Set when node and other are not in the same tree.
      */
    val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
    /**
      * Set when other is following node.
      */
    val DOCUMENT_POSITION_FOLLOWING: Double = js.native
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
    /**
      * Set when other is preceding node.
      */
    val DOCUMENT_POSITION_PRECEDING: Double = js.native
    /**
      * node is a doctype.
      */
    val DOCUMENT_TYPE_NODE: Double = js.native
    /**
      * node is an element.
      */
    val ELEMENT_NODE: Double = js.native
    val ENTITY_NODE: Double = js.native
    val ENTITY_REFERENCE_NODE: Double = js.native
    val NOTATION_NODE: Double = js.native
    /**
      * node is a ProcessingInstruction node.
      */
    val PROCESSING_INSTRUCTION_NODE: Double = js.native
    /**
      * node is a Text node.
      */
    val TEXT_NODE: Double = js.native
    /**
      * Returns node's node document's document base URL.
      */
    val baseURI: String = js.native
    /**
      * Returns the children.
      */
    val childNodes: NodeListOf[ChildNode] = js.native
    /**
      * Returns the first child.
      */
    val firstChild: ChildNode | Null = js.native
    /**
      * Returns true if node is connected and false otherwise.
      */
    val isConnected: Boolean = js.native
    /**
      * Returns the last child.
      */
    val lastChild: ChildNode | Null = js.native
    /** @deprecated */
    val namespaceURI: String | Null = js.native
    /**
      * Returns the next sibling.
      */
    val nextSibling: ChildNode | Null = js.native
    /**
      * Returns a string appropriate for the type of node.
      */
    val nodeName: String = js.native
    /**
      * Returns the type of node.
      */
    val nodeType: Double = js.native
    var nodeValue: String | Null = js.native
    /**
      * Returns the node document. Returns null for documents.
      */
    val ownerDocument: Document | Null = js.native
    var parent: js.UndefOr[Node] = js.native
    /**
      * Returns the parent element.
      */
    val parentElement: HTMLElement | Null = js.native
    /**
      * Returns the parent.
      */
    val parentNode: (Node with ParentNode) | Null = js.native
    /**
      * Returns the previous sibling.
      */
    val previousSibling: ChildNode | Null = js.native
    var textContent: String | Null = js.native
    /**
      * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
      * 
      * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
      * 
      * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
      * 
      * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
      * 
      * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
      * 
      * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
      */
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    def appendChild[T /* <: Node */](newChild: T): T = js.native
    /**
      * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
      */
    def cloneNode(): Node = js.native
    def cloneNode(deep: Boolean): Node = js.native
    /**
      * Returns a bitmask indicating the position of other relative to node.
      */
    def compareDocumentPosition(other: Node): Double = js.native
    /**
      * Returns true if other is an inclusive descendant of node, and false otherwise.
      */
    def contains(): Boolean = js.native
    def contains(other: Node): Boolean = js.native
    /**
      * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
      */
    def dispatchEvent(event: Event): Boolean = js.native
    /**
      * Returns node's root.
      */
    def getRootNode(): Node = js.native
    def getRootNode(options: GetRootNodeOptions): Node = js.native
    /**
      * Returns whether node has children.
      */
    def hasChildNodes(): Boolean = js.native
    def insertBefore[T /* <: Node */](newChild: T): T = js.native
    def insertBefore[T /* <: Node */](newChild: T, refChild: Node): T = js.native
    def isDefaultNamespace(): Boolean = js.native
    def isDefaultNamespace(namespace: String): Boolean = js.native
    /**
      * Returns whether node and otherNode have the same properties.
      */
    def isEqualNode(): Boolean = js.native
    def isEqualNode(otherNode: Node): Boolean = js.native
    def isSameNode(): Boolean = js.native
    def isSameNode(otherNode: Node): Boolean = js.native
    def lookupNamespaceURI(): String | Null = js.native
    def lookupNamespaceURI(prefix: String): String | Null = js.native
    def lookupPrefix(): String | Null = js.native
    def lookupPrefix(namespace: String): String | Null = js.native
    /**
      * Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes.
      */
    def normalize(): Unit = js.native
    def removeChild[T /* <: Node */](oldChild: T): T = js.native
    /**
      * Removes the event listener in target's event listener list with the same type, callback, and options.
      */
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    def replaceChild[T /* <: Node */](newChild: Node, oldChild: T): T = js.native
  }
  
  /**
    * Walk the provided AST; fn is called once for each node with a `type`
    * @param {ESTree.Program} ast program to walk
    * @param {function} fn function invoked for each node with type
    */
  def apply(ast: Program, fn: js.Function1[/* node */ typings.estree.mod.Node, Unit]): Unit = js.native
  def walk(ast: Program, fn: js.Function1[/* node */ typings.estree.mod.Node, Unit]): Unit = js.native
  def walkAddParent(ast: Program, fn: js.Function1[/* node */ NodeWithParent, Unit]): Unit = js.native
}

