package typings.flowdoc.Flow

import typings.flowdoc.Node
import typings.flowdoc.flowdocStrings.PAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends Node {
  var backgroundColor: Color
  var children: js.Array[Screen | Image | Rectangle | Ellipse | Diamond]
  var startNodeID: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_Page: PAGE
}

object Page {
  @scala.inline
  def apply(
    backgroundColor: Color,
    children: js.Array[Screen | Image | Rectangle | Ellipse | Diamond],
    id: String,
    name: String,
    `type`: PAGE,
    startNodeID: String = null
  ): Page = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (startNodeID != null) __obj.updateDynamic("startNodeID")(startNodeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

