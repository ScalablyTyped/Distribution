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
  /** From a JS AST and a selector AST, collect all JS AST nodes that match the selector. */
  def `match`(ast: Node, selector: Selector): js.Array[Node] = js.native
  /** Given a `node` and its ancestors, determine if `node` is matched by `selector`. */
  def matches(node: Node, selector: Selector, ancestry: js.Array[Node]): Boolean = js.native
  /** Parse a selector and return its AST. */
  def parse(selector: String): js.UndefOr[Selector] = js.native
  /** Query the code AST using the selector string. */
  def query(ast: Node, selector: String): js.Array[Node] = js.native
}

