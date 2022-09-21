package typings.famous

import org.scalablytyped.runtime.StringDictionary
import typings.famous.coreMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domRenderablesMod {
  
  @JSImport("famous/dom-renderables", "DOMElement")
  @js.native
  open class DOMElement protected () extends StObject {
    def this(node: Node) = this()
    def this(node: Node, options: IDOMElementOptions) = this()
    
    def addClass(value: String): DOMElement = js.native
    
    def on(event: String, listener: js.Function1[/* payload */ js.UndefOr[Any], Unit]): js.Function0[Unit] = js.native
    
    def onHide(): Unit = js.native
    
    def onShow(): Unit = js.native
    
    def removeClass(value: String): DOMElement = js.native
    
    def setAttribute(name: String, value: String): DOMElement = js.native
    
    def setContent(content: String): Node = js.native
    
    def setProperty(name: String, value: String): DOMElement = js.native
  }
  
  trait IDOMElementOptions extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var cutout: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var tagName: js.UndefOr[String] = js.undefined
  }
  object IDOMElementOptions {
    
    inline def apply(): IDOMElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDOMElementOptions]
    }
    
    extension [Self <: IDOMElementOptions](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCutout(value: Boolean): Self = StObject.set(x, "cutout", value.asInstanceOf[js.Any])
      
      inline def setCutoutUndefined: Self = StObject.set(x, "cutout", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}
