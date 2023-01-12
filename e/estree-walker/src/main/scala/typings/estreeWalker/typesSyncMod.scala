package typings.estreeWalker

import typings.estreeWalker.anon.Remove
import typings.estreeWalker.typesWalkerMod.WalkerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSyncMod {
  
  @JSImport("estree-walker/types/sync", "SyncWalker")
  @js.native
  open class SyncWalker protected () extends WalkerBase {
    /**
      *
      * @param {SyncHandler} enter
      * @param {SyncHandler} leave
      */
    def this(
      enter: js.ThisFunction4[
            /* this */ Remove, 
            /* node */ typings.estree.mod.BaseNode, 
            /* parent */ typings.estree.mod.BaseNode, 
            /* key */ String, 
            /* index */ Double, 
            Unit
          ],
      leave: js.ThisFunction4[
            /* this */ Remove, 
            /* node */ typings.estree.mod.BaseNode, 
            /* parent */ typings.estree.mod.BaseNode, 
            /* key */ String, 
            /* index */ Double, 
            Unit
          ]
    ) = this()
    
    /** @type {SyncHandler} */
    def enter(node: typings.estree.mod.BaseNode, parent: typings.estree.mod.BaseNode, key: String, index: Double): Unit = js.native
    /** @type {SyncHandler} */
    @JSName("enter")
    var enter_Original: SyncHandler = js.native
    
    /** @type {SyncHandler} */
    def leave(node: typings.estree.mod.BaseNode, parent: typings.estree.mod.BaseNode, key: String, index: Double): Unit = js.native
    /** @type {SyncHandler} */
    @JSName("leave")
    var leave_Original: SyncHandler = js.native
    
    /**
      *
      * @param {BaseNode} node
      * @param {BaseNode} parent
      * @param {string} [prop]
      * @param {number} [index]
      * @returns {BaseNode}
      */
    def visit(node: typings.estree.mod.BaseNode, parent: typings.estree.mod.BaseNode): typings.estree.mod.BaseNode = js.native
    def visit(node: typings.estree.mod.BaseNode, parent: typings.estree.mod.BaseNode, prop: String): typings.estree.mod.BaseNode = js.native
    def visit(
      node: typings.estree.mod.BaseNode,
      parent: typings.estree.mod.BaseNode,
      prop: String,
      index: Double
    ): typings.estree.mod.BaseNode = js.native
    def visit(node: typings.estree.mod.BaseNode, parent: typings.estree.mod.BaseNode, prop: Unit, index: Double): typings.estree.mod.BaseNode = js.native
  }
  
  type BaseNode = typings.estree.mod.BaseNode
  
  type SyncHandler = js.ThisFunction4[
    /* this */ Remove, 
    /* node */ typings.estree.mod.BaseNode, 
    /* parent */ typings.estree.mod.BaseNode, 
    /* key */ String, 
    /* index */ Double, 
    Unit
  ]
  
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
