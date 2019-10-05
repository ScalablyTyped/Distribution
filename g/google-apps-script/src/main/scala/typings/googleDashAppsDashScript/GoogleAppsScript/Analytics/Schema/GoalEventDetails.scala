package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalEventDetails extends js.Object {
  var eventConditions: js.UndefOr[js.Array[GoalEventDetailsEventConditions]] = js.undefined
  var useEventValue: js.UndefOr[Boolean] = js.undefined
}

object GoalEventDetails {
  @scala.inline
  def apply(
    eventConditions: js.Array[GoalEventDetailsEventConditions] = null,
    useEventValue: js.UndefOr[Boolean] = js.undefined
  ): GoalEventDetails = {
    val __obj = js.Dynamic.literal()
    if (eventConditions != null) __obj.updateDynamic("eventConditions")(eventConditions)
    if (!js.isUndefined(useEventValue)) __obj.updateDynamic("useEventValue")(useEventValue)
    __obj.asInstanceOf[GoalEventDetails]
  }
}

