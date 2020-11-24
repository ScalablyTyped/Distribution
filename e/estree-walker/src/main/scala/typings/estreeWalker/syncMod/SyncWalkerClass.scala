package typings.estreeWalker.syncMod

import typings.estree.mod.BaseNode
import typings.estreeWalker.walkerMod.WalkerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("estree-walker/types/sync", "SyncWalkerClass")
@js.native
class SyncWalkerClass protected () extends WalkerBase {
  def this(walker: SyncWalker) = this()
  
  var enter: js.UndefOr[WalkerHandler] = js.native
  
  var leave: js.UndefOr[WalkerHandler] = js.native
  
  def visit(node: BaseNode, parent: BaseNode, enter: WalkerHandler, leave: WalkerHandler): BaseNode = js.native
  def visit(
    node: BaseNode,
    parent: BaseNode,
    enter: WalkerHandler,
    leave: WalkerHandler,
    prop: js.UndefOr[scala.Nothing],
    index: Double
  ): BaseNode = js.native
  def visit(node: BaseNode, parent: BaseNode, enter: WalkerHandler, leave: WalkerHandler, prop: String): BaseNode = js.native
  def visit(
    node: BaseNode,
    parent: BaseNode,
    enter: WalkerHandler,
    leave: WalkerHandler,
    prop: String,
    index: Double
  ): BaseNode = js.native
}
