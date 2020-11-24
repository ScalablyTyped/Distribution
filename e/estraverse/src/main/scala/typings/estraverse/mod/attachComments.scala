package typings.estraverse.mod

import typings.estree.mod.Comment
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("estraverse", "attachComments")
@js.native
object attachComments extends js.Object {
  
  def apply(tree: Node, providedComments: js.Array[Comment], tokens: js.Array[Node]): Node = js.native
}
