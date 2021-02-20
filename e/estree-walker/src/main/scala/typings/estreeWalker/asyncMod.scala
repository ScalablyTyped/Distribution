package typings.estreeWalker

import typings.estree.mod.BaseNode
import typings.estreeWalker.walkerMod.WalkerBase
import typings.estreeWalker.walkerMod.WalkerContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("estree-walker/types/async", "AsyncWalkerClass")
  @js.native
  class AsyncWalkerClass protected () extends WalkerBase {
    def this(walker: AsyncWalker) = this()
    
    var enter: js.UndefOr[AsyncWalkerHandler] = js.native
    
    var leave: js.UndefOr[AsyncWalkerHandler] = js.native
    
    def visit(node: BaseNode, parent: BaseNode, enter: AsyncWalkerHandler, leave: AsyncWalkerHandler): js.Promise[BaseNode] = js.native
    def visit(
      node: BaseNode,
      parent: BaseNode,
      enter: AsyncWalkerHandler,
      leave: AsyncWalkerHandler,
      prop: js.UndefOr[scala.Nothing],
      index: Double
    ): js.Promise[BaseNode] = js.native
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
  }
  
  @js.native
  trait AsyncWalker extends StObject {
    
    var enter: js.UndefOr[AsyncWalkerHandler] = js.native
    
    var leave: js.UndefOr[AsyncWalkerHandler] = js.native
  }
  object AsyncWalker {
    
    @scala.inline
    def apply(): AsyncWalker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncWalker]
    }
    
    @scala.inline
    implicit class AsyncWalkerMutableBuilder[Self <: AsyncWalker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnter(value: AsyncWalkerHandler): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setLeave(value: AsyncWalkerHandler): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
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
