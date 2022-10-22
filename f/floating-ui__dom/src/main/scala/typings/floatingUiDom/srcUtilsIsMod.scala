package typings.floatingUiDom

import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsIsMod {
  
  @JSImport("@floating-ui/dom/src/utils/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isContainingBlock(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContainingBlock")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElement(value: Any): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
  
  inline def isHTMLElement(value: Any): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLElement")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  
  inline def isLastTraversableNode(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLastTraversableNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLayoutViewport(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayoutViewport")().asInstanceOf[Boolean]
  
  inline def isNode(value: Any): /* is std.Node */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Node */ Boolean]
  
  inline def isOverflowElement(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOverflowElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isShadowRoot(node: Node): /* is std.ShadowRoot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShadowRoot")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.ShadowRoot */ Boolean]
  
  inline def isTableElement(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTableElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object global {
    
    trait Window extends StObject {
      
      var Element: Any
      
      var HTMLElement: Any
      
      var Node: Any
      
      var ShadowRoot: Any
    }
    object Window {
      
      inline def apply(Element: Any, HTMLElement: Any, Node: Any, ShadowRoot: Any): Window = {
        val __obj = js.Dynamic.literal(Element = Element.asInstanceOf[js.Any], HTMLElement = HTMLElement.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], ShadowRoot = ShadowRoot.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setElement(value: Any): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
        
        inline def setHTMLElement(value: Any): Self = StObject.set(x, "HTMLElement", value.asInstanceOf[js.Any])
        
        inline def setNode(value: Any): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
        
        inline def setShadowRoot(value: Any): Self = StObject.set(x, "ShadowRoot", value.asInstanceOf[js.Any])
      }
    }
  }
}
