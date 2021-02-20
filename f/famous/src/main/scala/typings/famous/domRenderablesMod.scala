package typings.famous

import org.scalablytyped.runtime.StringDictionary
import typings.famous.coreMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domRenderablesMod {
  
  @JSImport("famous/dom-renderables", "DOMElement")
  @js.native
  class DOMElement protected () extends StObject {
    def this(node: Node) = this()
    def this(node: Node, options: IDOMElementOptions) = this()
    
    def addClass(value: String): DOMElement = js.native
    
    def on(event: String, listener: js.Function1[/* payload */ js.UndefOr[js.Any], Unit]): js.Function0[Unit] = js.native
    
    def onHide(): Unit = js.native
    
    def onShow(): Unit = js.native
    
    def removeClass(value: String): DOMElement = js.native
    
    def setAttribute(name: String, value: String): DOMElement = js.native
    
    def setContent(content: String): Node = js.native
    
    def setProperty(name: String, value: String): DOMElement = js.native
  }
  
  @js.native
  trait IDOMElementOptions extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[String]] = js.native
    
    var classes: js.UndefOr[js.Array[String]] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var cutout: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var properties: js.UndefOr[StringDictionary[String]] = js.native
    
    var tagName: js.UndefOr[String] = js.native
  }
  object IDOMElementOptions {
    
    @scala.inline
    def apply(): IDOMElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDOMElementOptions]
    }
    
    @scala.inline
    implicit class IDOMElementOptionsMutableBuilder[Self <: IDOMElementOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCutout(value: Boolean): Self = StObject.set(x, "cutout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCutoutUndefined: Self = StObject.set(x, "cutout", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}
