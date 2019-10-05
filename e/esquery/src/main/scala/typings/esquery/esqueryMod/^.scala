package typings.esquery.esqueryMod

import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esquery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Query the code AST using the selector string. */
  def apply(ast: Node, selector: String): js.Array[Node] = js.native
}

