package typings.domutils.legacyMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domutils/lib/legacy", "getElements")
@js.native
object getElements extends js.Object {
  def apply(options: TestElementOpts, element: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
  def apply(options: TestElementOpts, element: js.Array[Node], recurse: Boolean, limit: Double): js.Array[Node] = js.native
  def apply(options: TestElementOpts, element: Node, recurse: Boolean): js.Array[Node] = js.native
  def apply(options: TestElementOpts, element: Node, recurse: Boolean, limit: Double): js.Array[Node] = js.native
}

