package typings.estreeWalker

import typings.estreeWalker.typesWalkerMod.WalkerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSyncMod {
  
  @JSImport("estree-walker/types/sync", "SyncWalker")
  @js.native
  /**
    *
    * @param {SyncHandler} [enter]
    * @param {SyncHandler} [leave]
    */
  open class SyncWalker () extends WalkerBase {
    def this(enter: SyncHandler) = this()
    def this(enter: Unit, leave: SyncHandler) = this()
    def this(enter: SyncHandler, leave: SyncHandler) = this()
    
    /** @type {SyncHandler | undefined} */
    var enter: js.UndefOr[SyncHandler] = js.native
    
    /** @type {SyncHandler | undefined} */
    var leave: js.UndefOr[SyncHandler] = js.native
    
    /**
      * @template {Node} Parent
      * @param {Node} node
      * @param {Parent | null} parent
      * @param {keyof Parent} [prop]
      * @param {number | null} [index]
      * @returns {Node | null}
      */
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node): Node | Null = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Parent): Node | Null = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Parent, prop: /* keyof Parent */ String): Node | Null = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Parent, prop: /* keyof Parent */ String, index: Double): Node | Null = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Parent, prop: Unit, index: Double): Node | Null = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Null, prop: /* keyof Parent */ String): Node | Null = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Null, prop: /* keyof Parent */ String, index: Double): Node | Null = js.native
    def visit[Parent /* <: typings.estree.mod.Node */](node: Node, parent: Null, prop: Unit, index: Double): Node | Null = js.native
  }
  
  type Node = typings.estree.mod.Node
  
  type SyncHandler = js.ThisFunction4[
    /* this */ WalkerContext, 
    /* node */ Node, 
    /* parent */ Node | Null, 
    /* key */ js.UndefOr[String | Double | js.Symbol | Null], 
    /* index */ js.UndefOr[Double | Null], 
    Unit
  ]
  
  type WalkerContext = typings.estreeWalker.typesWalkerMod.WalkerContext
}
