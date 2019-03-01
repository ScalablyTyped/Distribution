package typings
package flowdocLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graphic extends Node {
  var position: flowdocLib.FlowNs.Point
  var size: flowdocLib.FlowNs.Size
  var source: flowdocLib.FlowNs.FileAsset | flowdocLib.FlowNs.URLAsset
}

object Graphic {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    position: flowdocLib.FlowNs.Point,
    size: flowdocLib.FlowNs.Size,
    source: flowdocLib.FlowNs.FileAsset | flowdocLib.FlowNs.URLAsset,
    `type`: NodeType
  ): Graphic = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graphic]
  }
}

