package typings.estreeWalker

import typings.estree.mod.BaseNode
import typings.estreeWalker.walkerMod.WalkerBase
import typings.estreeWalker.walkerMod.WalkerContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("estree-walker/types/async", "AsyncWalkerClass")
  @js.native
  class AsyncWalkerClass protected () extends WalkerBase {
    def this(walker: AsyncWalker) = this()
    
    /* protected */ var enter: js.UndefOr[AsyncWalkerHandler] = js.native
    
    /* protected */ var leave: js.UndefOr[AsyncWalkerHandler] = js.native
    
    def visit(node: BaseNode, parent: BaseNode, enter: AsyncWalkerHandler, leave: AsyncWalkerHandler): js.Promise[BaseNode] = js.native
    def visit(
      node: BaseNode,
      parent: BaseNode,
      enter: AsyncWalkerHandler,
      leave: AsyncWalkerHandler,
      prop: String
    ): js.Promise[BaseNode] = js.native
    def visit(
      node: BaseNode,
      parent: BaseNode,
      enter: AsyncWalkerHandler,
      leave: AsyncWalkerHandler,
      prop: String,
      index: Double
    ): js.Promise[BaseNode] = js.native
    def visit(
      node: BaseNode,
      parent: BaseNode,
      enter: AsyncWalkerHandler,
      leave: AsyncWalkerHandler,
      prop: Unit,
      index: Double
    ): js.Promise[BaseNode] = js.native
  }
  
  trait AsyncWalker extends StObject {
    
    var enter: js.UndefOr[AsyncWalkerHandler] = js.undefined
    
    var leave: js.UndefOr[AsyncWalkerHandler] = js.undefined
  }
  object AsyncWalker {
    
    inline def apply(): AsyncWalker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncWalker]
    }
    
    extension [Self <: AsyncWalker](x: Self) {
      
      inline def setEnter(value: AsyncWalkerHandler): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setLeave(value: AsyncWalkerHandler): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  type AsyncWalkerHandler = js.ThisFunction4[
    /* this */ WalkerContext, 
    /* node */ BaseNode, 
    /* parent */ BaseNode, 
    /* key */ String, 
    /* index */ Double, 
    js.Promise[Unit]
  ]
}
