package typings.fastHtmlParser

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("fast-html-parser", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
    
    @js.native
    sealed trait ELEMENT_NODE extends NodeType
    /* 1 */ val ELEMENT_NODE: typings.fastHtmlParser.mod.NodeType.ELEMENT_NODE with Double = js.native
    
    @js.native
    sealed trait TEXT_NODE extends NodeType
    /* 3 */ val TEXT_NODE: typings.fastHtmlParser.mod.NodeType.TEXT_NODE with Double = js.native
  }
  
  @JSImport("fast-html-parser", "parse")
  @js.native
  def parse(data: String): HTMLElement = js.native
  @JSImport("fast-html-parser", "parse")
  @js.native
  def parse(data: String, options: ParseOptions): HTMLElement = js.native
  
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
  
  @js.native
  trait ParseOptions extends StObject {
    
    var lowerCaseTagName: js.UndefOr[Boolean] = js.native
    
    var pre: js.UndefOr[Boolean] = js.native
    
    var script: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[Boolean] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLowerCaseTagName(value: Boolean): Self = StObject.set(x, "lowerCaseTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerCaseTagNameUndefined: Self = StObject.set(x, "lowerCaseTagName", js.undefined)
      
      @scala.inline
      def setPre(value: Boolean): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      @scala.inline
      def setScript(value: Boolean): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      @scala.inline
      def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
