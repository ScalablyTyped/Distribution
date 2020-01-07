package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of goals that were reached in an activity.
  */
@js.native
trait Schema$GoalSetData extends js.Object {
  /**
    * All the goals that were reached in the current activity.
    */
  var goals: js.UndefOr[js.Array[Schema$GoalData]] = js.native
}

object Schema$GoalSetData {
  @scala.inline
  def apply(goals: js.Array[Schema$GoalData] = null): Schema$GoalSetData = {
    val __obj = js.Dynamic.literal()
    if (goals != null) __obj.updateDynamic("goals")(goals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoalSetData]
  }
}

