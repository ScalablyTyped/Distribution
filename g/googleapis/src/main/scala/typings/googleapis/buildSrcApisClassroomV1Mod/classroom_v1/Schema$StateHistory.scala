package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The history of each state this submission has been in.
  */
@js.native
trait Schema$StateHistory extends js.Object {
  /**
    * The teacher or student who made the change
    */
  var actorUserId: js.UndefOr[String] = js.native
  /**
    * The workflow pipeline stage.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * When the submission entered this state.
    */
  var stateTimestamp: js.UndefOr[String] = js.native
}

object Schema$StateHistory {
  @scala.inline
  def apply(actorUserId: String = null, state: String = null, stateTimestamp: String = null): Schema$StateHistory = {
    val __obj = js.Dynamic.literal()
    if (actorUserId != null) __obj.updateDynamic("actorUserId")(actorUserId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateTimestamp != null) __obj.updateDynamic("stateTimestamp")(stateTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StateHistory]
  }
}

