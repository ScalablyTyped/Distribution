package typings
package esprimaDashWalkLib.esprimaDashWalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esprima-walk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Walk the provided AST; fn is called once for each node with a `type`
    * @param {ESTree.Program} ast program to walk
    * @param {function} fn function invoked for each node with type
    */
  def apply(
    ast: estreeLib.estreeMod.Program,
    fn: js.Function1[/* node */ estreeLib.estreeMod.Node, scala.Unit]
  ): scala.Unit = js.native
  def walk(
    ast: estreeLib.estreeMod.Program,
    fn: js.Function1[/* node */ estreeLib.estreeMod.Node, scala.Unit]
  ): scala.Unit = js.native
  def walkAddParent(ast: estreeLib.estreeMod.Program, fn: js.Function1[/* node */ NodeWithParent, scala.Unit]): scala.Unit = js.native
}

