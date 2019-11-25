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
  def apply(id: String, index: Double, x: Double, y: Double, name: String = null, `val`: js.Any = null): GraphNodeObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphNodeObject]
  }
}

