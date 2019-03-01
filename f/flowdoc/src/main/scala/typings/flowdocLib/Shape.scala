package typings
package flowdocLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends Node {
  var connections: js.UndefOr[js.Array[flowdocLib.FlowNs.Connection]] = js.undefined
  var position: flowdocLib.FlowNs.Point
  var size: flowdocLib.FlowNs.Size
}

object Shape {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    position: flowdocLib.FlowNs.Point,
    size: flowdocLib.FlowNs.Size,
    `type`: NodeType,
    connections: js.Array[flowdocLib.FlowNs.Connection] = null
  ): Shape = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("size")(size)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Shape]
  }
}

