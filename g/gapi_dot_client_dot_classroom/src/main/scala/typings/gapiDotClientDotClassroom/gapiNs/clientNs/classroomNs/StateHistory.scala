package typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateHistory extends js.Object {
  /** The teacher or student who made the change */
  var actorUserId: js.UndefOr[String] = js.undefined
  /** The workflow pipeline stage. */
  var state: js.UndefOr[String] = js.undefined
  /** When the submission entered this state. */
  var stateTimestamp: js.UndefOr[String] = js.undefined
}

object StateHistory {
  @scala.inline
  def apply(actorUserId: String = null, state: String = null, stateTimestamp: String = null): StateHistory = {
    val __obj = js.Dynamic.literal()
    if (actorUserId != null) __obj.updateDynamic("actorUserId")(actorUserId)
    if (state != null) __obj.updateDynamic("state")(state)
    if (stateTimestamp != null) __obj.updateDynamic("stateTimestamp")(stateTimestamp)
    __obj.asInstanceOf[StateHistory]
  }
}

