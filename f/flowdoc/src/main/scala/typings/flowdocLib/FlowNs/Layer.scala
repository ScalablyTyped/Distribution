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
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("size")(size)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Layer]
  }
}

