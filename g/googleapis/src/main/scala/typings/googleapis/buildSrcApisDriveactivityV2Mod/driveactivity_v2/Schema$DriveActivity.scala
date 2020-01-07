package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Drive activity comprising one or more Actions by one or more
  * Actors on one or more Targets. Some Action groupings occur spontaneously,
  * such as moving an item into a shared folder triggering a permission change.
  * Other groupings of related Actions, such as multiple Actors editing one
  * item or moving multiple files into a new folder, are controlled by the
  * selection of a ConsolidationStrategy in the QueryDriveActivityRequest.
  */
@js.native
trait Schema$DriveActivity extends js.Object {
  /**
    * Details on all actions in this activity.
    */
  var actions: js.UndefOr[js.Array[Schema$Action]] = js.native
  /**
    * All actor(s) responsible for the activity.
    */
  var actors: js.UndefOr[js.Array[Schema$Actor]] = js.native
  /**
    * Key information about the primary action for this activity. This is
    * either representative, or the most important, of all actions in the
    * activity, according to the ConsolidationStrategy in the request.
    */
  var primaryActionDetail: js.UndefOr[Schema$ActionDetail] = js.native
  /**
    * All Drive objects this activity is about (e.g. file, folder, Team Drive).
    * This represents the state of the target immediately after the actions
    * occurred.
    */
  var targets: js.UndefOr[js.Array[Schema$Target]] = js.native
  /**
    * The activity occurred over this time range.
    */
  var timeRange: js.UndefOr[Schema$TimeRange] = js.native
  /**
    * The activity occurred at this specific time.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object Schema$DriveActivity {
  @scala.inline
  def apply(
    actions: js.Array[Schema$Action] = null,
    actors: js.Array[Schema$Actor] = null,
    primaryActionDetail: Schema$ActionDetail = null,
    targets: js.Array[Schema$Target] = null,
    timeRange: Schema$TimeRange = null,
    timestamp: String = null
  ): Schema$DriveActivity = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (actors != null) __obj.updateDynamic("actors")(actors.asInstanceOf[js.Any])
    if (primaryActionDetail != null) __obj.updateDynamic("primaryActionDetail")(primaryActionDetail.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DriveActivity]
  }
}

