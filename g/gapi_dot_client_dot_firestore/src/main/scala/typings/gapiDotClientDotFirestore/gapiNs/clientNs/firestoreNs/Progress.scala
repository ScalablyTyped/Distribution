package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  /**
    * An estimate of how much work has been completed. Note that this may be
    * greater than `work_estimated`.
    */
  var workCompleted: js.UndefOr[String] = js.undefined
  /**
    * An estimate of how much work needs to be performed. Zero if the
    * work estimate is unavailable. May change as work progresses.
    */
  var workEstimated: js.UndefOr[String] = js.undefined
}

object Progress {
  @scala.inline
  def apply(workCompleted: String = null, workEstimated: String = null): Progress = {
    val __obj = js.Dynamic.literal()
    if (workCompleted != null) __obj.updateDynamic("workCompleted")(workCompleted)
    if (workEstimated != null) __obj.updateDynamic("workEstimated")(workEstimated)
    __obj.asInstanceOf[Progress]
  }
}

