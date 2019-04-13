package typings
package fastDashDiffLib.fastDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorInfo extends js.Object {
  var newRange: fastDashDiffLib.Anon_Index
  var oldRange: fastDashDiffLib.Anon_Index
}

object CursorInfo {
  @scala.inline
  def apply(newRange: fastDashDiffLib.Anon_Index, oldRange: fastDashDiffLib.Anon_Index): CursorInfo = {
    val __obj = js.Dynamic.literal(newRange = newRange, oldRange = oldRange)
  
    __obj.asInstanceOf[CursorInfo]
  }
}

