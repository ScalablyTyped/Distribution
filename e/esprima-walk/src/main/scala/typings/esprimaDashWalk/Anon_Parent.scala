package typings.esprimaDashWalk

import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Parent extends js.Object {
  var parent: js.UndefOr[Node] = js.undefined
}

object Anon_Parent {
  @scala.inline
  def apply(parent: Node = null): Anon_Parent = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Parent]
  }
}

