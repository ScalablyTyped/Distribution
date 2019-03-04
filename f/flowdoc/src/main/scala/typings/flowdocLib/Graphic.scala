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
    val __obj = js.Dynamic.literal(id = id, name = name, position = position, size = size, source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Graphic]
  }
}

