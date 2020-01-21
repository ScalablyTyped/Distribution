package typings.fsExtraPromiseEs6

import typings.fsExtraPromiseEs6.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurr extends js.Object {
  var curr: Stats
  var prev: Stats
}

object AnonCurr {
  @scala.inline
  def apply(curr: Stats, prev: Stats): AnonCurr = {
    val __obj = js.Dynamic.literal(curr = curr.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurr]
  }
}

