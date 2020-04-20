package typings.fastDiff.mod

import typings.fastDiff.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorInfo extends js.Object {
  var newRange: AnonIndex
  var oldRange: AnonIndex
}

object CursorInfo {
  @scala.inline
  def apply(newRange: AnonIndex, oldRange: AnonIndex): CursorInfo = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorInfo]
  }
}

