package typings.figma.anon

import typings.figma.mod.global.TextNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: Double
  var node: TextNode
  var start: Double
}

object End {
  @scala.inline
  def apply(end: Double, node: TextNode, start: Double): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

