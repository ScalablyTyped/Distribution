package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the action.
  */
@js.native
trait Schema$Action extends js.Object {
  /**
    * The actor responsible for this action (or empty if all actors are
    * responsible).
    */
  var actor: js.UndefOr[Schema$Actor] = js.native
  /**
    * The type and detailed information about the action.
    */
  var detail: js.UndefOr[Schema$ActionDetail] = js.native
  /**
    * The target this action affects (or empty if affecting all targets). This
    * represents the state of the target immediately after this action
    * occurred.
    */
  var target: js.UndefOr[Schema$Target] = js.native
  /**
    * The action occurred over this time range.
    */
  var timeRange: js.UndefOr[Schema$TimeRange] = js.native
  /**
    * The action occurred at this specific time.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object Schema$Action {
  @scala.inline
  def apply(
    actor: Schema$Actor = null,
    detail: Schema$ActionDetail = null,
    target: Schema$Target = null,
    timeRange: Schema$TimeRange = null,
    timestamp: String = null
  ): Schema$Action = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Action]
  }
}

