package typings.glReact

import typings.glReact.mod.Bus
import typings.glReact.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends js.Object {
  var node: Node | Bus
  var `type`: String
}

object AnonNode {
  @scala.inline
  def apply(node: Node | Bus, `type`: String): AnonNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
}

