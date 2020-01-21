package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The history of each state this submission has been in.
  */
@js.native
trait SchemaStateHistory extends js.Object {
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

object SchemaStateHistory {
  @scala.inline
  def apply(actorUserId: String = null, state: String = null, stateTimestamp: String = null): SchemaStateHistory = {
    val __obj = js.Dynamic.literal()
    if (actorUserId != null) __obj.updateDynamic("actorUserId")(actorUserId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateTimestamp != null) __obj.updateDynamic("stateTimestamp")(stateTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStateHistory]
  }
}

