package typings.estreeWalker

import typings.estreeWalker.typesWalkerMod.WalkerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAsyncMod {
  
  @JSImport("estree-walker/types/async", "AsyncWalker")
  @js.native
  /**
    *
    * @param {AsyncHandler} [enter]
    * @param {AsyncHandler} [leave]
    */
  open class AsyncWalker () extends WalkerBase {
    def this(enter: AsyncHandler) = this()
    def this(enter: Unit, leave: AsyncHandler) = this()
    def this(enter: AsyncHandler, leave: AsyncHandler) = this()
    
    /** @type {AsyncHandler | undefined} */
    var enter: js.UndefOr[AsyncHandler] = js.native
    
    /** @type {AsyncHandler | undefined} */
    var leave: js.UndefOr[AsyncHandler] = js.native
    
    /**
      * @template {Node} Parent
      * @param {Node} node
      * @param {Parent | null} parent
      * @param {keyof Parent} [prop]
      * @param {number | null} [index]
      * @returns {Promise<Node | null>}
      */
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node): js.Promise[Node | Null] = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Parent): js.Promise[Node | Null] = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Parent, prop: /* keyof Parent */ String): js.Promise[Node | Null] = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Parent, prop: /* keyof Parent */ String, index: Double): js.Promise[Node | Null] = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Parent, prop: Unit, index: Double): js.Promise[Node | Null] = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Null, prop: /* keyof Parent */ String): js.Promise[Node | Null] = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Null, prop: /* keyof Parent */ String, index: Double): js.Promise[Node | Null] = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Null, prop: Unit, index: Double): js.Promise[Node | Null] = js.native
  }
  
  type AsyncHandler = js.ThisFunction4[
    /* this */ WalkerContext, 
    /* node */ Node, 
    /* parent */ Node | Null, 
    /* key */ js.UndefOr[String | Double | js.Symbol | Null], 
    /* index */ js.UndefOr[Double | Null], 
    js.Promise[Unit]
  ]
  
  type Node = typings.estree.mod.Node
  
  type WalkerContext = typings.estreeWalker.typesWalkerMod.WalkerContext
}
