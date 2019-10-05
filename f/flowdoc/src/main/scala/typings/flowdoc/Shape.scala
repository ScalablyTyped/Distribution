package typings.flowdoc

import typings.flowdoc.Flow.Connection
import typings.flowdoc.Flow.Point
import typings.flowdoc.Flow.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends Node {
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  var position: Point
  var size: Size
}

object Shape {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    `type`: NodeType,
    connections: js.Array[Connection] = null
  ): Shape = {
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size)
    __obj.updateDynamic("type")(`type`)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Shape]
  }
}

