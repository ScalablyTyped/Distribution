package typings.domhandler

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("domhandler", "DomHandler")
  @js.native
  class DomHandler protected () extends StObject {
    def this(callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], js.Any]) = this()
    def this(
      callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], js.Any],
      options: DomHandlerOptions
    ) = this()
    
    def oncdatastart(): Unit = js.native
    
    def onclosetag(): Unit = js.native
    
    def oncomment(data: String): Unit = js.native
    
    def oncommentend(): Unit = js.native
    
    /***
      * Signals the handler that parsing is done
      */
    def onend(): Unit = js.native
    
    def onerror(error: Error): Unit = js.native
    
    def onopentag(name: String, attribs: StringDictionary[String]): Unit = js.native
    
    def onparserinit(parser: js.Any): Unit = js.native
    
    def onprocessinginstruction(name: String, data: String): Unit = js.native
    
    /***
      * Resets the handler back to starting state
      */
    def onreset(): Unit = js.native
    
    def ontext(data: String): Unit = js.native
  }
  
  trait DomElement extends StObject {
    
    var attribs: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var children: js.UndefOr[js.Array[DomElement]] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var next: js.UndefOr[DomElement] = js.undefined
    
    var parent: js.UndefOr[DomElement] = js.undefined
    
    var prev: js.UndefOr[DomElement] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DomElement {
    
    inline def apply(): DomElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomElement]
    }
    
    extension [Self <: DomElement](x: Self) {
      
      inline def setAttribs(value: StringDictionary[String]): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      inline def setAttribsUndefined: Self = StObject.set(x, "attribs", js.undefined)
      
      inline def setChildren(value: js.Array[DomElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: DomElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNext(value: DomElement): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setParent(value: DomElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPrev(value: DomElement): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DomHandlerOptions extends StObject {
    
    /***
      * Indicates whether the whitespace in text nodes should be normalized
      * (= all whitespace should be replaced with single spaces). The default value is "false".
      */
    var normalizeWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /***
      * Adds DOM level 1 properties to all elements.
      */
    var withDomLvl1: js.UndefOr[Boolean] = js.undefined
    
    /***
      * Indicates whether a endIndex property will be added to nodes.
      * When the parser is used in a non-streaming fashion, endIndex is an integer
      * indicating the position of the end of the node in the document.
      * The default value is "false".
      */
    var withEndIndices: js.UndefOr[Boolean] = js.undefined
    
    /***
      * Indicates whether a startIndex property will be added to nodes.
      * When the parser is used in a non-streaming fashion, startIndex is an integer
      * indicating the position of the start of the node in the document.
      * The default value is "false".
      */
    var withStartIndices: js.UndefOr[Boolean] = js.undefined
  }
  object DomHandlerOptions {
    
    inline def apply(): DomHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomHandlerOptions]
    }
    
    extension [Self <: DomHandlerOptions](x: Self) {
      
      inline def setNormalizeWhitespace(value: Boolean): Self = StObject.set(x, "normalizeWhitespace", value.asInstanceOf[js.Any])
      
      inline def setNormalizeWhitespaceUndefined: Self = StObject.set(x, "normalizeWhitespace", js.undefined)
      
      inline def setWithDomLvl1(value: Boolean): Self = StObject.set(x, "withDomLvl1", value.asInstanceOf[js.Any])
      
      inline def setWithDomLvl1Undefined: Self = StObject.set(x, "withDomLvl1", js.undefined)
      
      inline def setWithEndIndices(value: Boolean): Self = StObject.set(x, "withEndIndices", value.asInstanceOf[js.Any])
      
      inline def setWithEndIndicesUndefined: Self = StObject.set(x, "withEndIndices", js.undefined)
      
      inline def setWithStartIndices(value: Boolean): Self = StObject.set(x, "withStartIndices", value.asInstanceOf[js.Any])
      
      inline def setWithStartIndicesUndefined: Self = StObject.set(x, "withStartIndices", js.undefined)
    }
  }
  
  trait Element
    extends StObject
       with DomElement {
    
    @JSName("name")
    var name_Element: String
  }
  object Element {
    
    inline def apply(name: String): Element = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node
    extends StObject
       with DomElement {
    
    val firstChild: DomElement
    
    val lastChild: DomElement
    
    val nodeType: Double
  }
  object Node {
    
    inline def apply(firstChild: DomElement, lastChild: DomElement, nodeType: Double): Node = {
      val __obj = js.Dynamic.literal(firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setFirstChild(value: DomElement): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      inline def setLastChild(value: DomElement): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
}
