package typings.flowdoc

import typings.flowdoc.Flow.FileAsset
import typings.flowdoc.Flow.Point
import typings.flowdoc.Flow.Size
import typings.flowdoc.Flow.URLAsset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graphic extends Node {
  var position: Point
  var size: Size
  var source: FileAsset | URLAsset
}

object Graphic {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    source: FileAsset | URLAsset,
    `type`: NodeType
  ): Graphic = {
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size, source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Graphic]
  }
}

