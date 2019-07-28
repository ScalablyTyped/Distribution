package typings.flowdoc.FlowNs

import typings.flowdoc.Shape
import typings.flowdoc.flowdocStrings.RECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends Shape {
  @JSName("type")
  var type_Rectangle: RECT
}

object Rectangle {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    `type`: RECT,
    connections: js.Array[Connection] = null
  ): Rectangle = {
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size)
    __obj.updateDynamic("type")(`type`)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Rectangle]
  }
}

