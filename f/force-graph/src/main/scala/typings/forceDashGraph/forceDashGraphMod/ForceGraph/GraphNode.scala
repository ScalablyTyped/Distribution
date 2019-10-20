package typings.forceDashGraph.forceDashGraphMod.ForceGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphNode extends GraphEntity {
  var name: js.UndefOr[String] = js.undefined
  var `val`: js.UndefOr[js.Any] = js.undefined
}

object GraphNode {
  @scala.inline
  def apply(id: String, name: String = null, `val`: js.Any = null): GraphNode = {
    val __obj = js.Dynamic.literal(id = id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`val` != null) __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[GraphNode]
  }
}

