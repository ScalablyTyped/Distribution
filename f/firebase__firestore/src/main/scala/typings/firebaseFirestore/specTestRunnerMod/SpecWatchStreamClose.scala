package typings.firebaseFirestore.specTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecWatchStreamClose extends js.Object {
  var error: SpecError
  var runBackoffTimer: Boolean
}

object SpecWatchStreamClose {
  @scala.inline
  def apply(error: SpecError, runBackoffTimer: Boolean): SpecWatchStreamClose = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], runBackoffTimer = runBackoffTimer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpecWatchStreamClose]
  }
}

