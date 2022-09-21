package typings.domParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dom-parser", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DomParser {
    
    /* CompleteClass */
    override def parseFromString(html: String): Dom = js.native
  }
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("dom-parser", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeType & Double] = js.native
    
    @js.native
    sealed trait ELEMENT_NODE
      extends StObject
         with NodeType
    /* 1 */ val ELEMENT_NODE: typings.domParser.mod.NodeType.ELEMENT_NODE & Double = js.native
    
    @js.native
    sealed trait TEXT_NODE
      extends StObject
         with NodeType
    /* 3 */ val TEXT_NODE: typings.domParser.mod.NodeType.TEXT_NODE & Double = js.native
  }
  
  trait DOMSearchable extends StObject {
    
    def getElementById(id: String): Node | Null
    
    def getElementsByClassName(className: String): js.Array[Node] | Null
    
    def getElementsByName(name: String): js.Array[Node] | Null
    
    def getElementsByTagName(tagName: String): js.Array[Node] | Null
  }
  object DOMSearchable {
    
    inline def apply(
      getElementById: String => Node | Null,
      getElementsByClassName: String => js.Array[Node] | Null,
      getElementsByName: String => js.Array[Node] | Null,
      getElementsByTagName: String => js.Array[Node] | Null
    ): DOMSearchable = {
      val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName))
      __obj.asInstanceOf[DOMSearchable]
    }
    
    extension [Self <: DOMSearchable](x: Self) {
      
      inline def setGetElementById(value: String => Node | Null): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
      
      inline def setGetElementsByClassName(value: String => js.Array[Node] | Null): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
      
      inline def setGetElementsByName(value: String => js.Array[Node] | Null): Self = StObject.set(x, "getElementsByName", js.Any.fromFunction1(value))
      
      inline def setGetElementsByTagName(value: String => js.Array[Node] | Null): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    }
  }
  
  trait Dom
    extends StObject
       with DOMSearchable {
    
    def getElementsByAttribute(attr: String, value: String): js.Array[Node] | Null
  }
  object Dom {
    
    inline def apply(
      getElementById: String => Node | Null,
      getElementsByAttribute: (String, String) => js.Array[Node] | Null,
      getElementsByClassName: String => js.Array[Node] | Null,
      getElementsByName: String => js.Array[Node] | Null,
      getElementsByTagName: String => js.Array[Node] | Null
    ): Dom = {
      val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById), getElementsByAttribute = js.Any.fromFunction2(getElementsByAttribute), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName))
      __obj.asInstanceOf[Dom]
    }
    
    extension [Self <: Dom](x: Self) {
      
      inline def setGetElementsByAttribute(value: (String, String) => js.Array[Node] | Null): Self = StObject.set(x, "getElementsByAttribute", js.Any.fromFunction2(value))
    }
  }
  
  trait DomParser extends StObject {
    
    def parseFromString(html: String): Dom
  }
  object DomParser {
    
    inline def apply(parseFromString: String => Dom): DomParser = {
      val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction1(parseFromString))
      __obj.asInstanceOf[DomParser]
    }
    
    extension [Self <: DomParser](x: Self) {
      
      inline def setParseFromString(value: String => Dom): Self = StObject.set(x, "parseFromString", js.Any.fromFunction1(value))
    }
  }
  
  trait Node
    extends StObject
       with DOMSearchable {
    
    var attributes: js.Array[String]
    
    var childNodes: js.Array[Node]
    
    var firstChild: Node | Null
    
    def getAttribute(name: String): String | Null
    
    var innerHTML: String
    
    var lastChild: Node | Null
    
    var nodeName: String
    
    var nodeType: NodeType
    
    var outerHTML: String
    
    var parentNode: Node | Null
    
    var textContent: String
  }
  object Node {
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], getAttribute = js.Any.fromFunction1(getAttribute), getElementById = js.Any.fromFunction1(getElementById), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), innerHTML = innerHTML.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any], firstChild = null, lastChild = null, parentNode = null)
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setChildNodes(value: js.Array[Node]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: Node*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setFirstChild(value: Node): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      inline def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
      
      inline def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      inline def setLastChild(value: Node): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
      
      inline def setLastChildNull: Self = StObject.set(x, "lastChild", null)
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: NodeType): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
      
      inline def setParentNode(value: Node): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    }
  }
}
