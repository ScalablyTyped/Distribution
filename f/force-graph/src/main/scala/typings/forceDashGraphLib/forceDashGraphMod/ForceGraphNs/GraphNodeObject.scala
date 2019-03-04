package typings
package forceDashGraphLib.forceDashGraphMod.ForceGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphNodeObject extends GraphNode {
  var index: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object GraphNodeObject {
  @scala.inline
  def apply(
    id: java.lang.String,
    index: scala.Double,
    name: java.lang.String,
    `val`: js.Any,
    x: scala.Double,
    y: scala.Double
  ): GraphNodeObject = {
    val __obj = js.Dynamic.literal(id = id, index = index, name = name, x = x, y = y)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[GraphNodeObject]
  }
}

