package typings.fastDiff.mod

import typings.fastDiff.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorInfo extends js.Object {
  var newRange: Index
  var oldRange: Index
}

object CursorInfo {
  @scala.inline
  def apply(newRange: Index, oldRange: Index): CursorInfo = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorInfo]
  }
}

