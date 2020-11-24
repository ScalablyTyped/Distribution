package typings.esquery.mod

import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esquery", "match")
@js.native
object `match` extends js.Object {
  
  /** From a JS AST and a selector AST, collect all JS AST nodes that match the selector. */
  def apply(ast: Node, selector: Selector): js.Array[Node] = js.native
}
