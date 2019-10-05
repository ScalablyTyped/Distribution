package typings.flowdoc.Flow

import typings.flowdoc.Graphic
import typings.flowdoc.flowdocStrings.IMAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends Graphic {
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  @JSName("type")
  var type_Image: IMAGE
}

object Image {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    source: FileAsset | URLAsset,
    `type`: IMAGE,
    connections: js.Array[Connection] = null
  ): Image = {
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size, source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Image]
  }
}

