package typings.domutils.legacyMod

import typings.domelementtype.mod.ElementType
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domutils/lib/legacy", "getElementsByTagType")
@js.native
object getElementsByTagType extends js.Object {
  def apply(`type`: js.Function1[/* type */ ElementType, Boolean], element: js.Array[Node]): js.Array[Node] = js.native
  def apply(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    element: js.Array[Node],
    recurse: js.UndefOr[scala.Nothing],
    limit: Double
  ): js.Array[Node] = js.native
  def apply(`type`: js.Function1[/* type */ ElementType, Boolean], element: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
  def apply(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    element: js.Array[Node],
    recurse: Boolean,
    limit: Double
  ): js.Array[Node] = js.native
  def apply(`type`: js.Function1[/* type */ ElementType, Boolean], element: Node): js.Array[Node] = js.native
  def apply(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    element: Node,
    recurse: js.UndefOr[scala.Nothing],
    limit: Double
  ): js.Array[Node] = js.native
  def apply(`type`: js.Function1[/* type */ ElementType, Boolean], element: Node, recurse: Boolean): js.Array[Node] = js.native
  def apply(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    element: Node,
    recurse: Boolean,
    limit: Double
  ): js.Array[Node] = js.native
  def apply(`type`: ElementType, element: js.Array[Node]): js.Array[Node] = js.native
  def apply(`type`: ElementType, element: js.Array[Node], recurse: js.UndefOr[scala.Nothing], limit: Double): js.Array[Node] = js.native
  def apply(`type`: ElementType, element: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
  def apply(`type`: ElementType, element: js.Array[Node], recurse: Boolean, limit: Double): js.Array[Node] = js.native
  def apply(`type`: ElementType, element: Node): js.Array[Node] = js.native
  def apply(`type`: ElementType, element: Node, recurse: js.UndefOr[scala.Nothing], limit: Double): js.Array[Node] = js.native
  def apply(`type`: ElementType, element: Node, recurse: Boolean): js.Array[Node] = js.native
  def apply(`type`: ElementType, element: Node, recurse: Boolean, limit: Double): js.Array[Node] = js.native
}

