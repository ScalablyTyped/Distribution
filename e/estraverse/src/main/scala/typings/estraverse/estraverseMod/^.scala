package typings.estraverse.estraverseMod

import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("estraverse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def replace(ast: Node, visitor: Visitor): Node = js.native
  def traverse(ast: Node, visitor: Visitor): Unit = js.native
}

