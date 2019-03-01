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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Image]
  }
}

