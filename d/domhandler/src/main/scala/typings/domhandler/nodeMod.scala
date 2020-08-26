package typings.domhandler

import org.scalablytyped.runtime.StringDictionary
import typings.domelementtype.mod.ElementType
import typings.domhandler.domhandlerStrings.cdata
import typings.domhandler.domhandlerStrings.comment
import typings.domhandler.domhandlerStrings.directive
import typings.domhandler.domhandlerStrings.script
import typings.domhandler.domhandlerStrings.style
import typings.domhandler.domhandlerStrings.tag
import typings.domhandler.domhandlerStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler/lib/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  @js.native
  class DataNode protected () extends Node {
    /**
      *
      * @param type The type of the node
      * @param data The content of the data node
      */
    def this(`type`: comment, data: String) = this()
    def this(`type`: directive, data: String) = this()
    def this(`type`: text, data: String) = this()
    var data: String = js.native
    var nodeValue: String = js.native
  }
  
  @js.native
  class Element protected () extends NodeWithChildren {
    /**
      *
      * @param name Name of the tag, eg. `div`, `span`
      * @param attribs Object mapping attribute names to attribute values
      */
    def this(name: String, attribs: StringDictionary[String]) = this()
    var attribs: StringDictionary[String] = js.native
    var name: String = js.native
    var tagName: String = js.native
  }
  
  @js.native
  class Node protected () extends js.Object {
    /**
      *
      * @param type The type of the node.
      */
    def this(`type`: ElementType) = this()
    /** The end index of the node. Requires `withEndIndices` on the handler to be `true. */
    var endIndex: Double | Null = js.native
    /** Next sibling */
    var next: Node | Null = js.native
    var nextSibling: Node | Null = js.native
    val nodeType: Double = js.native
    /** Parent of the node */
    var parent: NodeWithChildren | Null = js.native
    var parentNode: NodeWithChildren | Null = js.native
    /** Previous sibling */
    var prev: Node | Null = js.native
    var previousSibling: Node | Null = js.native
    /** The start index of the node. Requires `withStartIndices` on the handler to be `true. */
    var startIndex: Double | Null = js.native
    var `type`: ElementType = js.native
  }
  
  @js.native
  class NodeWithChildren protected () extends Node {
    /**
      *
      * @param type Type of the node.
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(`type`: cdata, children: js.Array[Node]) = this()
    def this(`type`: script, children: js.Array[Node]) = this()
    def this(`type`: style, children: js.Array[Node]) = this()
    def this(`type`: tag, children: js.Array[Node]) = this()
    var childNodes: js.Array[Node] = js.native
    var children: js.Array[Node] = js.native
    val firstChild: Node | Null = js.native
    val lastChild: Node | Null = js.native
  }
  
  @js.native
  class ProcessingInstruction protected () extends DataNode {
    def this(name: String, data: String) = this()
    var name: String = js.native
  }
  
}

