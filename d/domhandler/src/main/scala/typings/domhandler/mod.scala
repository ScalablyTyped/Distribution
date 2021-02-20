package typings.domhandler

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("domhandler", "DomHandler")
  @js.native
  class DomHandler protected () extends StObject {
    def this(callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _]) = this()
    def this(
      callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _],
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
  
  @js.native
  trait DomElement extends StObject {
    
    var attribs: js.UndefOr[StringDictionary[String]] = js.native
    
    var children: js.UndefOr[js.Array[DomElement]] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var next: js.UndefOr[DomElement] = js.native
    
    var parent: js.UndefOr[DomElement] = js.native
    
    var prev: js.UndefOr[DomElement] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object DomElement {
    
    @scala.inline
    def apply(): DomElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomElement]
    }
    
    @scala.inline
    implicit class DomElementMutableBuilder[Self <: DomElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribs(value: StringDictionary[String]): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttribsUndefined: Self = StObject.set(x, "attribs", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[DomElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: DomElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNext(value: DomElement): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setParent(value: DomElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPrev(value: DomElement): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DomHandlerOptions extends StObject {
    
    /***
      * Indicates whether the whitespace in text nodes should be normalized
      * (= all whitespace should be replaced with single spaces). The default value is "false".
      */
    var normalizeWhitespace: js.UndefOr[Boolean] = js.native
    
    /***
      * Adds DOM level 1 properties to all elements.
      */
    var withDomLvl1: js.UndefOr[Boolean] = js.native
    
    /***
      * Indicates whether a endIndex property will be added to nodes.
      * When the parser is used in a non-streaming fashion, endIndex is an integer
      * indicating the position of the end of the node in the document.
      * The default value is "false".
      */
    var withEndIndices: js.UndefOr[Boolean] = js.native
    
    /***
      * Indicates whether a startIndex property will be added to nodes.
      * When the parser is used in a non-streaming fashion, startIndex is an integer
      * indicating the position of the start of the node in the document.
      * The default value is "false".
      */
    var withStartIndices: js.UndefOr[Boolean] = js.native
  }
  object DomHandlerOptions {
    
    @scala.inline
    def apply(): DomHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomHandlerOptions]
    }
    
    @scala.inline
    implicit class DomHandlerOptionsMutableBuilder[Self <: DomHandlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNormalizeWhitespace(value: Boolean): Self = StObject.set(x, "normalizeWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeWhitespaceUndefined: Self = StObject.set(x, "normalizeWhitespace", js.undefined)
      
      @scala.inline
      def setWithDomLvl1(value: Boolean): Self = StObject.set(x, "withDomLvl1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithDomLvl1Undefined: Self = StObject.set(x, "withDomLvl1", js.undefined)
      
      @scala.inline
      def setWithEndIndices(value: Boolean): Self = StObject.set(x, "withEndIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithEndIndicesUndefined: Self = StObject.set(x, "withEndIndices", js.undefined)
      
      @scala.inline
      def setWithStartIndices(value: Boolean): Self = StObject.set(x, "withStartIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithStartIndicesUndefined: Self = StObject.set(x, "withStartIndices", js.undefined)
    }
  }
  
  @js.native
  trait Element extends DomElement {
    
    @JSName("name")
    var name_Element: String = js.native
  }
  object Element {
    
    @scala.inline
    def apply(name: String): Element = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Node extends DomElement {
    
    val firstChild: DomElement = js.native
    
    val lastChild: DomElement = js.native
    
    val nodeType: Double = js.native
  }
  object Node {
    
    @scala.inline
    def apply(firstChild: DomElement, lastChild: DomElement, nodeType: Double): Node = {
      val __obj = js.Dynamic.literal(firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstChild(value: DomElement): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastChild(value: DomElement): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
}
