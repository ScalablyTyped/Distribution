package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventConditions extends js.Object {
  /** List of event conditions. */
  var eventConditions: js.UndefOr[js.Array[ComparisonType]] = js.undefined
  /** Determines if the event value should be used as the value for this goal. */
  var useEventValue: js.UndefOr[Boolean] = js.undefined
}

object EventConditions {
  @scala.inline
  def apply(
    eventConditions: js.Array[ComparisonType] = null,
    useEventValue: js.UndefOr[Boolean] = js.undefined
  ): EventConditions = {
    val __obj = js.Dynamic.literal()
    if (eventConditions != null) __obj.updateDynamic("eventConditions")(eventConditions.asInstanceOf[js.Any])
    if (!js.isUndefined(useEventValue)) __obj.updateDynamic("useEventValue")(useEventValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventConditions]
  }
}

