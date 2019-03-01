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
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[GraphNodeObject]
  }
}

