package typings.fastHtmlParser

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-html-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("fast-html-parser", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeType & Double] = js.native
    
    @js.native
    sealed trait ELEMENT_NODE
      extends StObject
         with NodeType
    /* 1 */ val ELEMENT_NODE: typings.fastHtmlParser.mod.NodeType.ELEMENT_NODE & Double = js.native
    
    @js.native
    sealed trait TEXT_NODE
      extends StObject
         with NodeType
    /* 3 */ val TEXT_NODE: typings.fastHtmlParser.mod.NodeType.TEXT_NODE & Double = js.native
  }
  
  inline def parse(data: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def parse(data: String, options: ParseOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  type Attributes = StringDictionary[String]
  
  @js.native
  trait HTMLElement extends StObject {
    
    def appendChild(node: HTMLElement): HTMLElement = js.native
    
    val attributes: Attributes = js.native
    
    val childNodes: js.Array[HTMLElement] = js.native
    
    val classNames: js.Array[String] = js.native
    
    val firstChild: HTMLElement = js.native
    
    val id: String = js.native
    
    val isWhitespace: Boolean = js.native
    
    val lastChild: HTMLElement = js.native
    
    val nodeType: NodeType = js.native
    
    def querySelector(selector: String): HTMLElement | Null = js.native
    
    def querySelectorAll(selector: String): js.Array[HTMLElement] = js.native
    
    val rawAttributes: Attributes = js.native
    
    val rawAttrs: String = js.native
    
    val rawText: String = js.native
    
    def removeWhitespace(): HTMLElement = js.native
    
    val structure: String = js.native
    
    val structuredText: String = js.native
    
    val tagName: String = js.native
    
    val text: String = js.native
    
    def trimRight(): HTMLElement = js.native
    def trimRight(pattern: RegExp): HTMLElement = js.native
  }
  
  trait ParseOptions extends StObject {
    
    var lowerCaseTagName: js.UndefOr[Boolean] = js.undefined
    
    var pre: js.UndefOr[Boolean] = js.undefined
    
    var script: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setLowerCaseTagName(value: Boolean): Self = StObject.set(x, "lowerCaseTagName", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseTagNameUndefined: Self = StObject.set(x, "lowerCaseTagName", js.undefined)
      
      inline def setPre(value: Boolean): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setScript(value: Boolean): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
