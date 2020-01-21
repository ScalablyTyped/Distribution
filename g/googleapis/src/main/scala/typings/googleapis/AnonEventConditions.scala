package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEventConditions extends js.Object {
  var eventConditions: js.UndefOr[js.Array[AnonComparisonType]] = js.native
  var useEventValue: js.UndefOr[Boolean] = js.native
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

