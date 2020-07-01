package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventConditions extends js.Object {
  var eventConditions: js.UndefOr[js.Array[ComparisonType]] = js.native
  var useEventValue: js.UndefOr[Boolean] = js.native
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

