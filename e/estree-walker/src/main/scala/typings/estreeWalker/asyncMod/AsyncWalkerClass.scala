package typings.estreeWalker.asyncMod

import typings.estree.mod.BaseNode
import typings.estreeWalker.walkerMod.WalkerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
