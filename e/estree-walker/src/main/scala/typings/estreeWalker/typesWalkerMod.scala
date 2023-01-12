package typings.estreeWalker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWalkerMod {
  
  @JSImport("estree-walker/types/walker", "WalkerBase")
  @js.native
  open class WalkerBase () extends StObject {
    
    /** @type {WalkerContext} */
    var context: WalkerContext = js.native
    
    /**
      *
      * @param {any} parent
      * @param {string} prop
      * @param {number} index
      */
    def remove(parent: Any, prop: String, index: Double): Unit = js.native
    
    /**
      *
      * @param {any} parent
      * @param {string} prop
      * @param {number} index
      * @param {BaseNode} node
      */
    def replace(parent: Any, prop: String, index: Double, node: typings.estree.mod.BaseNode): Unit = js.native
    
    /** @type {BaseNode | null} */
    var replacement: BaseNode | Null = js.native
    
    /** @type {boolean} */
    var should_remove: Boolean = js.native
    
    /** @type {boolean} */
    var should_skip: Boolean = js.native
  }
  
  type BaseNode = typings.estree.mod.BaseNode
  
  trait WalkerContext extends StObject {
    
    def remove(): Unit
    
    def replace(node: typings.estree.mod.BaseNode): Unit
    
    def skip(): Unit
  }
  object WalkerContext {
    
    inline def apply(remove: () => Unit, replace: typings.estree.mod.BaseNode => Unit, skip: () => Unit): WalkerContext = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove), replace = js.Any.fromFunction1(replace), skip = js.Any.fromFunction0(skip))
      __obj.asInstanceOf[WalkerContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkerContext] (val x: Self) extends AnyVal {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setReplace(value: typings.estree.mod.BaseNode => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setSkip(value: () => Unit): Self = StObject.set(x, "skip", js.Any.fromFunction0(value))
    }
  }
}
