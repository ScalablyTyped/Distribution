package typings
package glDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: glDashReactLib.glDashReactMod.Node | glDashReactLib.glDashReactMod.Bus
  var `type`: java.lang.String
}

object Anon_Node {
  @scala.inline
  def apply(
    node: glDashReactLib.glDashReactMod.Node | glDashReactLib.glDashReactMod.Bus,
    `type`: java.lang.String
  ): Anon_Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Node]
  }
}

