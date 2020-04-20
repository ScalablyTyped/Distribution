package typings.figma

import typings.figma.mod._Global_.TextNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: Double
  var node: TextNode
  var start: Double
}

object AnonEnd {
  @scala.inline
  def apply(end: Double, node: TextNode, start: Double): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

