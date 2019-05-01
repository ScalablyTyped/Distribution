package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeIdPlugin extends js.Object {
  var nodeId: java.lang.String
  var plugin: js.UndefOr[gatsbyLib.gatsbyMod.ActionPlugin] = js.undefined
}

object Anon_NodeIdPlugin {
  @scala.inline
  def apply(nodeId: java.lang.String, plugin: gatsbyLib.gatsbyMod.ActionPlugin = null): Anon_NodeIdPlugin = {
    val __obj = js.Dynamic.literal(nodeId = nodeId)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    __obj.asInstanceOf[Anon_NodeIdPlugin]
  }
}

