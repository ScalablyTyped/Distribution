package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ellipse
  extends flowdocLib.Shape {
  @JSName("type")
  var type_Ellipse: flowdocLib.flowdocLibStrings.ELLIPSE
}

object Ellipse {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    position: Point,
    size: Size,
    `type`: flowdocLib.flowdocLibStrings.ELLIPSE,
    connections: js.Array[Connection] = null
  ): Ellipse = {
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size)
    __obj.updateDynamic("type")(`type`)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Ellipse]
  }
}

