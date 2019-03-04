package typings
package forceDashGraphLib.forceDashGraphMod.ForceGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphLink extends GraphEntity {
  var source: java.lang.String | GraphNode
  var target: java.lang.String | GraphNode
  var `type`: java.lang.String
}

object GraphLink {
  @scala.inline
  def apply(
    id: java.lang.String,
    source: java.lang.String | GraphNode,
    target: java.lang.String | GraphNode,
    `type`: java.lang.String
  ): GraphLink = {
    val __obj = js.Dynamic.literal(id = id, source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GraphLink]
  }
}

