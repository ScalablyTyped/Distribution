package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventConditions extends js.Object {
  /** List of event conditions. */
  var eventConditions: js.UndefOr[js.Array[Anon_ComparisonType]] = js.undefined
  /** Determines if the event value should be used as the value for this goal. */
  var useEventValue: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EventConditions {
  @scala.inline
  def apply(
    eventConditions: js.Array[Anon_ComparisonType] = null,
    useEventValue: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EventConditions = {
    val __obj = js.Dynamic.literal()
    if (eventConditions != null) __obj.updateDynamic("eventConditions")(eventConditions)
    if (!js.isUndefined(useEventValue)) __obj.updateDynamic("useEventValue")(useEventValue)
    __obj.asInstanceOf[Anon_EventConditions]
  }
}

