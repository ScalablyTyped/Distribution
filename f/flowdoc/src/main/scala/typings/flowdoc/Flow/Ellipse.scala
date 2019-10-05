package typings.flowdoc.Flow

import typings.flowdoc.Shape
import typings.flowdoc.flowdocStrings.ELLIPSE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ellipse extends Shape {
  @JSName("type")
  var type_Ellipse: ELLIPSE
}

object Ellipse {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    `type`: ELLIPSE,
    connections: js.Array[Connection] = null
  ): Ellipse = {
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size)
    __obj.updateDynamic("type")(`type`)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Ellipse]
  }
}

