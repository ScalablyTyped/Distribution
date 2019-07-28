package typings.flowdoc.FlowNs

import typings.flowdoc.Graphic
import typings.flowdoc.flowdocStrings.SCREEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen extends Graphic {
  var children: js.Array[Layer]
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  @JSName("type")
  var type_Screen: SCREEN
}

object Screen {
  @scala.inline
  def apply(
    children: js.Array[Layer],
    id: String,
    name: String,
    position: Point,
    size: Size,
    source: FileAsset | URLAsset,
    `type`: SCREEN,
    connections: js.Array[Connection] = null
  ): Screen = {
    val __obj = js.Dynamic.literal(children = children, id = id, name = name, position = position, size = size, source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Screen]
  }
}

