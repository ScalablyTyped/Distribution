package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import typings.simpleDomInterface.mod.SimpleElement
import typings.simpleDomInterface.mod.SimpleNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibDomBoundsMod {
  
  trait Bounds extends StObject {
    
    def firstNode(): SimpleNode
    
    def lastNode(): SimpleNode
    
    // a method to future-proof for wormholing; may not be needed ultimately
    def parentElement(): SimpleElement
  }
  object Bounds {
    
    inline def apply(firstNode: () => SimpleNode, lastNode: () => SimpleNode, parentElement: () => SimpleElement): Bounds = {
      val __obj = js.Dynamic.literal(firstNode = js.Any.fromFunction0(firstNode), lastNode = js.Any.fromFunction0(lastNode), parentElement = js.Any.fromFunction0(parentElement))
      __obj.asInstanceOf[Bounds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
      
      inline def setFirstNode(value: () => SimpleNode): Self = StObject.set(x, "firstNode", js.Any.fromFunction0(value))
      
      inline def setLastNode(value: () => SimpleNode): Self = StObject.set(x, "lastNode", js.Any.fromFunction0(value))
      
      inline def setParentElement(value: () => SimpleElement): Self = StObject.set(x, "parentElement", js.Any.fromFunction0(value))
    }
  }
  
  trait Cursor extends StObject {
    
    val element: SimpleElement
    
    val nextSibling: Option[SimpleNode]
  }
  object Cursor {
    
    inline def apply(element: SimpleElement): Cursor = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], nextSibling = null)
      __obj.asInstanceOf[Cursor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
      
      inline def setElement(value: SimpleElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setNextSibling(value: Option[SimpleNode]): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
      
      inline def setNextSiblingNull: Self = StObject.set(x, "nextSibling", null)
    }
  }
}
