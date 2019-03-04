package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page
  extends flowdocLib.Node {
  var backgroundColor: Color
  var children: js.Array[Screen | Image | Rectangle | Ellipse | Diamond]
  var startNodeID: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_Page: flowdocLib.flowdocLibStrings.PAGE
}

object Page {
  @scala.inline
  def apply(
    backgroundColor: Color,
    children: js.Array[Screen | Image | Rectangle | Ellipse | Diamond],
    id: java.lang.String,
    name: java.lang.String,
    `type`: flowdocLib.flowdocLibStrings.PAGE,
    startNodeID: java.lang.String = null
  ): Page = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, children = children, id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    if (startNodeID != null) __obj.updateDynamic("startNodeID")(startNodeID)
    __obj.asInstanceOf[Page]
  }
}

