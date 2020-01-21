package typings.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventConditions extends js.Object {
  /** List of event conditions. */
  var eventConditions: js.UndefOr[js.Array[AnonComparisonType]] = js.undefined
  /** Determines if the event value should be used as the value for this goal. */
  var useEventValue: js.UndefOr[Boolean] = js.undefined
}

object AnonEventConditions {
  @scala.inline
  def apply(
    eventConditions: js.Array[AnonComparisonType] = null,
    useEventValue: js.UndefOr[Boolean] = js.undefined
  ): AnonEventConditions = {
    val __obj = js.Dynamic.literal()
    if (eventConditions != null) __obj.updateDynamic("eventConditions")(eventConditions.asInstanceOf[js.Any])
    if (!js.isUndefined(useEventValue)) __obj.updateDynamic("useEventValue")(useEventValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventConditions]
  }
}

