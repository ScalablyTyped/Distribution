package typings.glDashReact

import typings.glDashReact.glDashReactMod.Bus
import typings.glDashReact.glDashReactMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: Node | Bus
  var `type`: String
}

object Anon_Node {
  @scala.inline
  def apply(node: Node | Bus, `type`: String): Anon_Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Node]
  }
}

