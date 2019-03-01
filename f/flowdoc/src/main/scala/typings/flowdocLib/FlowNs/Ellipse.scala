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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("size")(size)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Ellipse]
  }
}

