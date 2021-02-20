package typings.domParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dom-parser", JSImport.Namespace)
  @js.native
  class ^ () extends DomParser
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("dom-parser", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
    
    @js.native
    sealed trait ELEMENT_NODE extends NodeType
    /* 1 */ val ELEMENT_NODE: typings.domParser.mod.NodeType.ELEMENT_NODE with Double = js.native
    
    @js.native
    sealed trait TEXT_NODE extends NodeType
    /* 3 */ val TEXT_NODE: typings.domParser.mod.NodeType.TEXT_NODE with Double = js.native
  }
  
  @js.native
  trait DOMSearchable extends StObject {
    
    def getElementById(id: String): Node | Null = js.native
    
    def getElementsByClassName(className: String): js.Array[Node] | Null = js.native
    
    def getElementsByName(name: String): js.Array[Node] | Null = js.native
    
    def getElementsByTagName(tagName: String): js.Array[Node] | Null = js.native
  }
  object DOMSearchable {
    
    @scala.inline
    def apply(
      getElementById: String => Node | Null,
      getElementsByClassName: String => js.Array[Node] | Null,
      getElementsByName: String => js.Array[Node] | Null,
      getElementsByTagName: String => js.Array[Node] | Null
    ): DOMSearchable = {
      val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName))
      __obj.asInstanceOf[DOMSearchable]
    }
    
    @scala.inline
    implicit class DOMSearchableMutableBuilder[Self <: DOMSearchable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetElementById(value: String => Node | Null): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetElementsByClassName(value: String => js.Array[Node] | Null): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetElementsByName(value: String => js.Array[Node] | Null): Self = StObject.set(x, "getElementsByName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetElementsByTagName(value: String => js.Array[Node] | Null): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Dom extends DOMSearchable {
    
    def getElementsByAttribute(attribute: String): js.Array[Node] | Null = js.native
  }
  object Dom {
    
    @scala.inline
    def apply(
      getElementById: String => Node | Null,
      getElementsByAttribute: String => js.Array[Node] | Null,
      getElementsByClassName: String => js.Array[Node] | Null,
      getElementsByName: String => js.Array[Node] | Null,
      getElementsByTagName: String => js.Array[Node] | Null
    ): Dom = {
      val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById), getElementsByAttribute = js.Any.fromFunction1(getElementsByAttribute), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName))
      __obj.asInstanceOf[Dom]
    }
    
    @scala.inline
    implicit class DomMutableBuilder[Self <: Dom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetElementsByAttribute(value: String => js.Array[Node] | Null): Self = StObject.set(x, "getElementsByAttribute", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DomParser extends StObject {
    
    def parseFromString(html: String): Dom = js.native
  }
  object DomParser {
    
    @scala.inline
    def apply(parseFromString: String => Dom): DomParser = {
      val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction1(parseFromString))
      __obj.asInstanceOf[DomParser]
    }
    
    @scala.inline
    implicit class DomParserMutableBuilder[Self <: DomParser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParseFromString(value: String => Dom): Self = StObject.set(x, "parseFromString", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Node extends DOMSearchable {
    
    var attributes: js.Array[String] = js.native
    
    var childNodes: js.Array[Node] = js.native
    
    var firstChild: Node | Null = js.native
    
    def getAttribute(name: String): String | Null = js.native
    
    var innerHTML: String = js.native
    
    var lastChild: Node | Null = js.native
    
    var nodeName: String = js.native
    
    var nodeType: NodeType = js.native
    
    var outerHTML: String = js.native
    
    var parentNode: Node | Null = js.native
    
    var textContent: String = js.native
  }
  object Node {
    
    @scala.inline
    def apply(
      attributes: js.Array[String],
      childNodes: js.Array[Node],
      getAttribute: String => String | Null,
      getElementById: String => Node | Null,
      getElementsByClassName: String => js.Array[Node] | Null,
      getElementsByName: String => js.Array[Node] | Null,
      getElementsByTagName: String => js.Array[Node] | Null,
      innerHTML: String,
      nodeName: String,
      nodeType: NodeType,
      outerHTML: String,
      textContent: String
    ): Node = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], getAttribute = js.Any.fromFunction1(getAttribute), getElementById = js.Any.fromFunction1(getElementById), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), innerHTML = innerHTML.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setChildNodes(value: js.Array[Node]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildNodesVarargs(value: Node*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
      
      @scala.inline
      def setFirstChild(value: Node): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
      
      @scala.inline
      def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastChild(value: Node): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastChildNull: Self = StObject.set(x, "lastChild", null)
      
      @scala.inline
      def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeType(value: NodeType): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNode(value: Node): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      @scala.inline
      def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    }
  }
}
