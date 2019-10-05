package typings.flowdoc.Flow

import typings.flowdoc.Node
import typings.flowdoc.flowdocStrings.HOTSPOT
import typings.flowdoc.flowdocStrings.LAYER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends Node {
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  var position: Point
  var size: Size
  @JSName("type")
  var type_Layer: LAYER | HOTSPOT
}

object Layer {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    `type`: LAYER | HOTSPOT,
    connections: js.Array[Connection] = null
  ): Layer = {
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Layer]
  }
}

