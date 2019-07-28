package typings.forceDashGraph.forceDashGraphMod.ForceGraphNs

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
  def apply(id: String, index: Double, name: String, `val`: js.Any, x: Double, y: Double): GraphNodeObject = {
    val __obj = js.Dynamic.literal(id = id, index = index, name = name, x = x, y = y)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[GraphNodeObject]
  }
}

