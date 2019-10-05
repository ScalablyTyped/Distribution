package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalSetData extends js.Object {
  var goals: js.UndefOr[js.Array[GoalData]] = js.undefined
}

object GoalSetData {
  @scala.inline
  def apply(goals: js.Array[GoalData] = null): GoalSetData = {
    val __obj = js.Dynamic.literal()
    if (goals != null) __obj.updateDynamic("goals")(goals)
    __obj.asInstanceOf[GoalSetData]
  }
}

