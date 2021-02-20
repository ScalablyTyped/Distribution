package typings.elementtree

import org.scalablytyped.runtime.StringDictionary
import typings.elementtree.anon.ToString
import typings.elementtree.elementtreeStrings.text
import typings.elementtree.elementtreeStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("elementtree", "CData")
  @js.native
  def CData(): Element = js.native
  @JSImport("elementtree", "CData")
  @js.native
  def CData(text: ElementText): Element = js.native
  
  @JSImport("elementtree", "Comment")
  @js.native
  def Comment(): Element = js.native
  @JSImport("elementtree", "Comment")
  @js.native
  def Comment(text: ElementText): Element = js.native
  
  @js.native
  trait Element extends StObject {
    
    def append(element: Element): Unit = js.native
    
    var attrib: Attributes = js.native
    
    def clear(): Unit = js.native
    
    def delItem(index: Double): Unit = js.native
    
    def delSlice(start: Double, stop: Double): Unit = js.native
    
    def extend(elements: js.Array[Element]): Unit = js.native
    
    def find(path: String): Element | Null = js.native
    
    def findall(path: String): js.Array[Element] = js.native
    
    def findtext(path: String): js.UndefOr[ElementText] = js.native
    
    def get(k: String): js.UndefOr[String] = js.native
    
    def getItem(index: Double): js.UndefOr[Element] = js.native
    
    def getSlice(start: Double, stop: Double): js.Array[Element] = js.native
    
    def getchildren(): js.Array[Element] = js.native
    
    def insert(index: Double, element: Element): Unit = js.native
    
    def items(): js.Array[js.Tuple2[String, String]] = js.native
    
    def keys(): js.Array[String] = js.native
    
    def len(): Double = js.native
    
    def makeelement(tag: ElementTag): Element = js.native
    def makeelement(tag: ElementTag, attrib: Attributes): Element = js.native
    
    def remove(element: Element): Unit = js.native
    
    def set(k: String): String = js.native
    def set(k: String, v: String): String = js.native
    
    def setItem(index: Double, element: Element): Unit = js.native
    
    def setSlice(start: Double, stop: Double, elements: js.Array[Element]): Unit = js.native
    
    var tag: ElementTag = js.native
    
    var tail: String | Null = js.native
    
    var text: ElementText | Null = js.native
  }
  @JSImport("elementtree", "Element")
  @js.native
  def Element(ElementTag: String): Element = js.native
  @JSImport("elementtree", "Element")
  @js.native
  def Element(ElementTag: String, attrib: Attributes): Element = js.native
  
  @JSImport("elementtree", "ElementTree")
  @js.native
  class ElementTree protected () extends StObject {
    def this(element: Element) = this()
    
    def _setroot(element: Element): Unit = js.native
    
    def find(path: String): Element | Null = js.native
    
    def findall(path: String): js.Array[Element] = js.native
    
    def findtext(path: String): js.UndefOr[ElementText] = js.native
    
    def getroot(): Element = js.native
    
    def parse(source: String): Element = js.native
    
    def write(): String = js.native
    def write(options: ElementTreeWriteOptions): String = js.native
  }
  
  @JSImport("elementtree", "ProcessingInstruction")
  @js.native
  def ProcessingInstruction(target: ElementText): Element = js.native
  @JSImport("elementtree", "ProcessingInstruction")
  @js.native
  def ProcessingInstruction(target: ElementText, text: ElementText): Element = js.native
  
  @JSImport("elementtree", "QName")
  @js.native
  class QName protected () extends StObject {
    def this(text_or_uri: String) = this()
    def this(text_or_uri: String, tag: String) = this()
    
    var text: String = js.native
  }
  
  @JSImport("elementtree", "SubElement")
  @js.native
  def SubElement(parent: Element, ElementTag: String): Element = js.native
  @JSImport("elementtree", "SubElement")
  @js.native
  def SubElement(parent: Element, ElementTag: String, attrib: Attributes): Element = js.native
  
  @JSImport("elementtree", "XML")
  @js.native
  def XML(data: String): Element = js.native
  
  @JSImport("elementtree", "parse")
  @js.native
  def parse(source: String): ElementTree = js.native
  
  @JSImport("elementtree", "register_namespace")
  @js.native
  def registerNamespace(prefix: String, uri: String): Unit = js.native
  
  @JSImport("elementtree", "tostring")
  @js.native
  def tostring(element: Element, options: ElementTreeWriteOptions): String = js.native
  
  type Attributes = StringDictionary[js.UndefOr[String]]
  
  type ElementTag = (js.Function1[js.UndefOr[ElementText], Element]) | (js.Function2[/* target */ ElementText, /* text */ js.UndefOr[ElementText], Element]) | String
  
  type ElementText = ToString | String
  
  @js.native
  trait ElementTreeWriteOptions extends StObject {
    
    var default_namespace: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    // default is 'utf-8'
    var indent: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[xml | text] = js.native
    
    // default is 'xml'
    var xml_declaration: js.UndefOr[Boolean] = js.native
  }
  object ElementTreeWriteOptions {
    
    @scala.inline
    def apply(): ElementTreeWriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementTreeWriteOptions]
    }
    
    @scala.inline
    implicit class ElementTreeWriteOptionsMutableBuilder[Self <: ElementTreeWriteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault_namespace(value: String): Self = StObject.set(x, "default_namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_namespaceUndefined: Self = StObject.set(x, "default_namespace", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setMethod(value: xml | text): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setXml_declaration(value: Boolean): Self = StObject.set(x, "xml_declaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXml_declarationUndefined: Self = StObject.set(x, "xml_declaration", js.undefined)
    }
  }
}
