package typings.glimmerInterfaces

import typings.simpleDomInterface.mod.Namespace
import typings.simpleDomInterface.mod.SimpleDocumentFragment
import typings.simpleDomInterface.mod.SimpleElement
import typings.simpleDomInterface.mod.SimpleNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibDomTreeConstructionMod {
  
  type NodeToken = Double
  
  trait NodeTokens extends StObject {
    
    def reify(token: NodeToken): SimpleNode
  }
  object NodeTokens {
    
    inline def apply(reify: NodeToken => SimpleNode): NodeTokens = {
      val __obj = js.Dynamic.literal(reify = js.Any.fromFunction1(reify))
      __obj.asInstanceOf[NodeTokens]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeTokens] (val x: Self) extends AnyVal {
      
      inline def setReify(value: NodeToken => SimpleNode): Self = StObject.set(x, "reify", js.Any.fromFunction1(value))
    }
  }
  
  trait Reifiable extends StObject {
    
    def reify(tokens: NodeTokens): Unit
  }
  object Reifiable {
    
    inline def apply(reify: NodeTokens => Unit): Reifiable = {
      val __obj = js.Dynamic.literal(reify = js.Any.fromFunction1(reify))
      __obj.asInstanceOf[Reifiable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reifiable] (val x: Self) extends AnyVal {
      
      inline def setReify(value: NodeTokens => Unit): Self = StObject.set(x, "reify", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SpecTreeConstruction extends StObject {
    
    def appendComment(text: String): NodeToken = js.native
    
    def appendText(text: String): NodeToken = js.native
    
    def appendTo(parent: SimpleDocumentFragment): NodeTokens = js.native
    def appendTo(parent: SimpleElement): NodeTokens = js.native
    
    def closeElement(): Unit = js.native
    
    def openElement(name: String): NodeToken = js.native
    def openElement(name: String, ns: Namespace): NodeToken = js.native
    
    def setAttribute(name: String, value: String): Unit = js.native
    def setAttribute(name: String, value: String, namespace: Namespace): Unit = js.native
  }
}
