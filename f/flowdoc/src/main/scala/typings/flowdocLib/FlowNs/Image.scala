package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image
  extends flowdocLib.Graphic {
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  @JSName("type")
  var type_Image: flowdocLib.flowdocLibStrings.IMAGE
}

object Image {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    position: Point,
    size: Size,
    source: FileAsset | URLAsset,
    `type`: flowdocLib.flowdocLibStrings.IMAGE,
    connections: js.Array[Connection] = null
  ): Image = {
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size, source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Image]
  }
}

