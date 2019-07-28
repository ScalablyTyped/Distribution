package typings.forceDashGraph.forceDashGraphMod.ForceGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphNode extends GraphEntity {
  var name: String
  var `val`: js.Any
}

object GraphNode {
  @scala.inline
  def apply(id: String, name: String, `val`: js.Any): GraphNode = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[GraphNode]
  }
}

