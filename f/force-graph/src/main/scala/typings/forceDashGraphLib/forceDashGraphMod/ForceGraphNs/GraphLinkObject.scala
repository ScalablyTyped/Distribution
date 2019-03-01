package typings
package forceDashGraphLib.forceDashGraphMod.ForceGraphNs

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
  def apply(id: java.lang.String, source: GraphNode, target: GraphNode, `type`: java.lang.String): GraphLinkObject = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[GraphLinkObject]
  }
}

