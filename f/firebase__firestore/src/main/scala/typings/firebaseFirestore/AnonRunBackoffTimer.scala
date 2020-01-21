package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRunBackoffTimer extends js.Object {
  var runBackoffTimer: Boolean
}

object AnonRunBackoffTimer {
  @scala.inline
  def apply(runBackoffTimer: Boolean): AnonRunBackoffTimer = {
    val __obj = js.Dynamic.literal(runBackoffTimer = runBackoffTimer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRunBackoffTimer]
  }
}

