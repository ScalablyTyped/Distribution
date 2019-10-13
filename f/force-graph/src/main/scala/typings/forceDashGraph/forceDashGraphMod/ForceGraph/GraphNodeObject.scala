package typings.forceDashGraph.forceDashGraphMod.ForceGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphNodeObject extends GraphNode {
  var index: Double
  var x: Double
  var y: Double
}

object GraphNodeObject {
  @scala.inline
  def apply(index: Double, x: Double, y: Double, id: String = null, name: String = null, `val`: js.Any = null): GraphNodeObject = {
    val __obj = js.Dynamic.literal(index = index, x = x, y = y)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`val` != null) __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[GraphNodeObject]
  }
}

