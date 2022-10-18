package typings.estreeWalker

import typings.estreeWalker.anon.Remove
import typings.estreeWalker.typesWalkerMod.WalkerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAsyncMod {
  
  @JSImport("estree-walker/types/async", "AsyncWalker")
  @js.native
  open class AsyncWalker protected () extends WalkerBase {
    /**
      *
      * @param {AsyncHandler} enter
      * @param {AsyncHandler} leave
      */
    def this(
      enter: js.ThisFunction4[
            /* this */ Remove, 
            /* node */ typings.estree.mod.BaseNode, 
            /* parent */ typings.estree.mod.BaseNode, 
            /* key */ String, 
            /* index */ Double, 
            js.Promise[Unit]
          ],
      leave: js.ThisFunction4[
            /* this */ Remove, 
            /* node */ typings.estree.mod.BaseNode, 
            /* parent */ typings.estree.mod.BaseNode, 
            /* key */ String, 
            /* index */ Double, 
            js.Promise[Unit]
          ]
    ) = this()
    
    /** @type {AsyncHandler} */
    def enter(node: typings.estree.mod.BaseNode, parent: typings.estree.mod.BaseNode, key: String, index: Double): js.Promise[Unit] = js.native
    /** @type {AsyncHandler} */
    @JSName("enter")
    var enter_Original: AsyncHandler = js.native
    
    /** @type {AsyncHandler} */
    def leave(node: typings.estree.mod.BaseNode, parent: typings.estree.mod.BaseNode, key: String, index: Double): js.Promise[Unit] = js.native
    /** @type {AsyncHandler} */
    @JSName("leave")
    var leave_Original: AsyncHandler = js.native
    
    /**
      *
      * @param {BaseNode} node
      * @param {BaseNode} parent
      * @param {string} [prop]
      * @param {number} [index]
      * @returns {Promise<BaseNode>}
      */
    def visit(node: typings.estree.mod.BaseNode, parent: typings.estree.mod.BaseNode): js.Promise[typings.estree.mod.BaseNode] = js.native
    def visit(node: typings.estree.mod.BaseNode, parent: typings.estree.mod.BaseNode, prop: String): js.Promise[typings.estree.mod.BaseNode] = js.native
    def visit(
      node: typings.estree.mod.BaseNode,
      parent: typings.estree.mod.BaseNode,
      prop: String,
      index: Double
    ): js.Promise[typings.estree.mod.BaseNode] = js.native
    def visit(node: typings.estree.mod.BaseNode, parent: typings.estree.mod.BaseNode, prop: Unit, index: Double): js.Promise[typings.estree.mod.BaseNode] = js.native
  }
  
  type AsyncHandler = js.ThisFunction4[
    /* this */ Remove, 
    /* node */ typings.estree.mod.BaseNode, 
    /* parent */ typings.estree.mod.BaseNode, 
    /* key */ String, 
    /* index */ Double, 
    js.Promise[Unit]
  ]
  
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
    
    extension [Self <: WalkerContext](x: Self) {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setReplace(value: typings.estree.mod.BaseNode => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setSkip(value: () => Unit): Self = StObject.set(x, "skip", js.Any.fromFunction0(value))
    }
  }
}
