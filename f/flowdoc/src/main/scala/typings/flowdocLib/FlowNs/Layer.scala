package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer
  extends flowdocLib.Node {
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  var position: Point
  var size: Size
  @JSName("type")
  var type_Layer: flowdocLib.flowdocLibStrings.LAYER | flowdocLib.flowdocLibStrings.HOTSPOT
}

object Layer {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    position: Point,
    size: Size,
    `type`: flowdocLib.flowdocLibStrings.LAYER | flowdocLib.flowdocLibStrings.HOTSPOT,
    connections: js.Array[Connection] = null
  ): Layer = {
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Layer]
  }
}

