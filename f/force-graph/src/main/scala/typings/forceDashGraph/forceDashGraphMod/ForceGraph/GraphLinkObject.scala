package typings.forceDashGraph.forceDashGraphMod.ForceGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphLinkObject extends GraphLink {
  @JSName("source")
  var source_GraphLinkObject: GraphNode
  @JSName("target")
  var target_GraphLinkObject: GraphNode
}

object GraphLinkObject {
  @scala.inline
  def apply(source: GraphNode, target: GraphNode, `type`: String, id: String = null): GraphLinkObject = {
    val __obj = js.Dynamic.literal(source = source, target = target)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GraphLinkObject]
  }
}

