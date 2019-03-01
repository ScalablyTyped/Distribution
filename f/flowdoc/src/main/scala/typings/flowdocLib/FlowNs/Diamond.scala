package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diamond
  extends flowdocLib.Shape {
  @JSName("type")
  var type_Diamond: flowdocLib.flowdocLibStrings.DIAMOND
}

object Diamond {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    position: Point,
    size: Size,
    `type`: flowdocLib.flowdocLibStrings.DIAMOND,
    connections: js.Array[Connection] = null
  ): Diamond = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("size")(size)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Diamond]
  }
}

