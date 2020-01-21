package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateHistory extends js.Object {
  var actorUserId: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var stateTimestamp: js.UndefOr[String] = js.undefined
}

object StateHistory {
  @scala.inline
  def apply(actorUserId: String = null, state: String = null, stateTimestamp: String = null): StateHistory = {
    val __obj = js.Dynamic.literal()
    if (actorUserId != null) __obj.updateDynamic("actorUserId")(actorUserId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateTimestamp != null) __obj.updateDynamic("stateTimestamp")(stateTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateHistory]
  }
}

