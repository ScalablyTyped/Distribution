package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen
  extends flowdocLib.Graphic {
  var children: js.Array[Layer]
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  @JSName("type")
  var type_Screen: flowdocLib.flowdocLibStrings.SCREEN
}

object Screen {
  @scala.inline
  def apply(
    children: js.Array[Layer],
    id: java.lang.String,
    name: java.lang.String,
    position: Point,
    size: Size,
    source: FileAsset | URLAsset,
    `type`: flowdocLib.flowdocLibStrings.SCREEN,
    connections: js.Array[Connection] = null
  ): Screen = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Screen]
  }
}

