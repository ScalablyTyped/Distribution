package typings.domutils.legacyMod

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domutils/lib/legacy", "getElementById")
@js.native
object getElementById extends js.Object {
  def apply(id: String, element: js.Array[Node]): Element | Null = js.native
  def apply(id: String, element: js.Array[Node], recurse: Boolean): Element | Null = js.native
  def apply(id: String, element: Node): Element | Null = js.native
  def apply(id: String, element: Node, recurse: Boolean): Element | Null = js.native
  def apply(id: js.Function1[/* id */ String, Boolean], element: js.Array[Node]): Element | Null = js.native
  def apply(id: js.Function1[/* id */ String, Boolean], element: js.Array[Node], recurse: Boolean): Element | Null = js.native
  def apply(id: js.Function1[/* id */ String, Boolean], element: Node): Element | Null = js.native
  def apply(id: js.Function1[/* id */ String, Boolean], element: Node, recurse: Boolean): Element | Null = js.native
}

