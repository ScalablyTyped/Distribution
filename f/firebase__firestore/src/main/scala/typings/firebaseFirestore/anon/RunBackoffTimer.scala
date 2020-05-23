package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunBackoffTimer extends js.Object {
  var runBackoffTimer: Boolean
}

object RunBackoffTimer {
  @scala.inline
  def apply(runBackoffTimer: Boolean): RunBackoffTimer = {
    val __obj = js.Dynamic.literal(runBackoffTimer = runBackoffTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunBackoffTimer]
  }
}

