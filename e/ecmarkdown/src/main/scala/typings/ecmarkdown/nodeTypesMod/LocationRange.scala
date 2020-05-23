package typings.ecmarkdown.nodeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRange extends js.Object {
  var end: Position
  var start: Position
}

object LocationRange {
  @scala.inline
  def apply(end: Position, start: Position): LocationRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRange]
  }
}

