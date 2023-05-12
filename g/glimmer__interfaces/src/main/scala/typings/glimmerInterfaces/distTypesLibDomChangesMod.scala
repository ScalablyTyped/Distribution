package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import typings.glimmerInterfaces.distTypesLibDomBoundsMod.Bounds
import typings.simpleDomInterface.mod.Namespace
import typings.simpleDomInterface.mod.SimpleComment
import typings.simpleDomInterface.mod.SimpleElement
import typings.simpleDomInterface.mod.SimpleNode
import typings.simpleDomInterface.mod.SimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibDomChangesMod {
  
  @js.native
  trait GlimmerDOMOperations extends StObject {
    
    def createComment(data: String): SimpleComment = js.native
    
    def createElement(tag: String): SimpleElement = js.native
    def createElement(tag: String, context: SimpleElement): SimpleElement = js.native
    
    def createTextNode(text: String): SimpleText = js.native
    
    def insertBefore(parent: SimpleElement, node: SimpleNode, reference: Option[SimpleNode]): Unit = js.native
    
    def insertHTMLBefore(parent: SimpleElement, nextSibling: Option[SimpleNode], html: String): Bounds = js.native
  }
  
  @js.native
  trait GlimmerTreeChanges
    extends StObject
       with GlimmerDOMOperations {
    
    def insertAfter(element: SimpleElement, node: SimpleNode, reference: SimpleNode): Unit = js.native
    
    def removeAttribute(element: SimpleElement, name: String): Unit = js.native
    
    def setAttribute(element: SimpleElement, name: String, value: String): Unit = js.native
  }
  
  @js.native
  trait GlimmerTreeConstruction
    extends StObject
       with GlimmerDOMOperations {
    
    def setAttribute(element: SimpleElement, name: String, value: String): Unit = js.native
    def setAttribute(element: SimpleElement, name: String, value: String, namespace: Option[Namespace]): Unit = js.native
  }
}
