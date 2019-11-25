package typings.fastDashDiff.fastDashDiffMod

import typings.fastDashDiff.Anon_Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorInfo extends js.Object {
  var newRange: Anon_Index
  var oldRange: Anon_Index
}

object CursorInfo {
  @scala.inline
  def apply(newRange: Anon_Index, oldRange: Anon_Index): CursorInfo = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CursorInfo]
  }
}

