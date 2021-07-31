package typings.fortawesomeFontawesomeSvgCore

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback extends StObject {
    
    def callback(): Unit
    
    var node: Node
  }
  object Callback {
    
    @scala.inline
    def apply(callback: () => Unit, node: Node): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
