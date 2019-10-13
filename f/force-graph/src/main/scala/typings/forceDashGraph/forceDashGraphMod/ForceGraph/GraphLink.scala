package typings.forceDashGraph.forceDashGraphMod.ForceGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphLink extends GraphEntity {
  var source: String | GraphNode
  var target: String | GraphNode
  var `type`: String
}

object GraphLink {
  @scala.inline
  def apply(source: String | GraphNode, target: String | GraphNode, `type`: String, id: String = null): GraphLink = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GraphLink]
  }
}

