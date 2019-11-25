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
  def apply(id: String, source: GraphNode, target: GraphNode, `type`: String): GraphLinkObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphLinkObject]
  }
}

