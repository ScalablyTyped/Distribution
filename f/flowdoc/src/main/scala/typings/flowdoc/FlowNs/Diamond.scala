package typings.flowdoc.FlowNs

import typings.flowdoc.Shape
import typings.flowdoc.flowdocStrings.DIAMOND
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diamond extends Shape {
  @JSName("type")
  var type_Diamond: DIAMOND
}

object Diamond {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    `type`: DIAMOND,
    connections: js.Array[Connection] = null
  ): Diamond = {
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size)
    __obj.updateDynamic("type")(`type`)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Diamond]
  }
}

