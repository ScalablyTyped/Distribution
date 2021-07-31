package typings.estreeWalker

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkerMod {
  
  @JSImport("estree-walker/types/walker", "WalkerBase")
  @js.native
  class WalkerBase () extends StObject {
    
    var context: WalkerContext = js.native
    
    def remove(parent: js.Any, prop: String, index: Double): Unit = js.native
    
    def replace(parent: js.Any, prop: String, index: Double, node: BaseNode): Unit = js.native
    
    var replacement: BaseNode = js.native
    
    var should_remove: Boolean = js.native
    
    var should_skip: Boolean = js.native
  }
  
  trait WalkerContext extends StObject {
    
    def remove(): Unit
    
    def replace(node: BaseNode): Unit
    
    def skip(): Unit
  }
  object WalkerContext {
    
    @scala.inline
    def apply(remove: () => Unit, replace: BaseNode => Unit, skip: () => Unit): WalkerContext = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove), replace = js.Any.fromFunction1(replace), skip = js.Any.fromFunction0(skip))
      __obj.asInstanceOf[WalkerContext]
    }
    
    @scala.inline
    implicit class WalkerContextMutableBuilder[Self <: WalkerContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReplace(value: BaseNode => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkip(value: () => Unit): Self = StObject.set(x, "skip", js.Any.fromFunction0(value))
    }
  }
}
