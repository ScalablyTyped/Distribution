package typings
package forceDashGraphLib.forceDashGraphMod.ForceGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphNode extends GraphEntity {
  var name: java.lang.String
  var `val`: js.Any
}

object GraphNode {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, `val`: js.Any): GraphNode = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[GraphNode]
  }
}

