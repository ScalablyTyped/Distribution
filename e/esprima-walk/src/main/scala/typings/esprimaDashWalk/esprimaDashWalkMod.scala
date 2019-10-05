package typings.esprimaDashWalk

import typings.esprimaDashWalk.esprimaDashWalkMod.NodeWithParent
import typings.estree.estreeMod.Node
import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esprima-walk", JSImport.Namespace)
@js.native
object esprimaDashWalkMod extends js.Object {
  /**
    * Walk the provided AST; fn is called once for each node with a `type`
    * @param {ESTree.Program} ast program to walk
    * @param {function} fn function invoked for each node with type
    */
  def apply(ast: Program, fn: js.Function1[/* node */ Node, Unit]): Unit = js.native
  def walk(ast: Program, fn: js.Function1[/* node */ Node, Unit]): Unit = js.native
  def walkAddParent(ast: Program, fn: js.Function1[/* node */ NodeWithParent, Unit]): Unit = js.native
  type NodeWithParent = Node with Anon_Parent
}

