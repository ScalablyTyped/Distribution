package typings.estraverse.mod

import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("estraverse", "traverse")
@js.native
object traverse extends js.Object {
  def apply(ast: Node, visitor: Visitor): Unit = js.native
}

