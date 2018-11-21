package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Layer
  extends flowdocLib.Node {
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  var position: Point
  var size: Size
  @JSName("type")
  var type_Layer: flowdocLib.flowdocLibStrings.LAYER | flowdocLib.flowdocLibStrings.HOTSPOT
}

