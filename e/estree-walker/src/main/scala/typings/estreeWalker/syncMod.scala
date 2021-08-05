package typings.estreeWalker

import typings.estree.mod.BaseNode
import typings.estreeWalker.walkerMod.WalkerBase
import typings.estreeWalker.walkerMod.WalkerContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("estree-walker/types/sync", "SyncWalkerClass")
  @js.native
  class SyncWalkerClass protected () extends WalkerBase {
    def this(walker: SyncWalker) = this()
    
    /* protected */ var enter: js.UndefOr[WalkerHandler] = js.native
    
    /* protected */ var leave: js.UndefOr[WalkerHandler] = js.native
    
    def visit(node: BaseNode, parent: BaseNode, enter: WalkerHandler, leave: WalkerHandler): BaseNode = js.native
    def visit(node: BaseNode, parent: BaseNode, enter: WalkerHandler, leave: WalkerHandler, prop: String): BaseNode = js.native
    def visit(
      node: BaseNode,
      parent: BaseNode,
      enter: WalkerHandler,
      leave: WalkerHandler,
      prop: String,
      index: Double
    ): BaseNode = js.native
    def visit(
      node: BaseNode,
      parent: BaseNode,
      enter: WalkerHandler,
      leave: WalkerHandler,
      prop: Unit,
      index: Double
    ): BaseNode = js.native
  }
  
  trait SyncWalker extends StObject {
    
    var enter: js.UndefOr[WalkerHandler] = js.undefined
    
    var leave: js.UndefOr[WalkerHandler] = js.undefined
  }
  object SyncWalker {
    
    inline def apply(): SyncWalker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncWalker]
    }
    
    extension [Self <: SyncWalker](x: Self) {
      
      inline def setEnter(value: WalkerHandler): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setLeave(value: WalkerHandler): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  type WalkerHandler = js.ThisFunction4[
    /* this */ WalkerContext, 
    /* node */ BaseNode, 
    /* parent */ BaseNode, 
    /* key */ String, 
    /* index */ Double, 
    Unit
  ]
}
