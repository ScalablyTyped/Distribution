package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EventConditions extends js.Object {
  var eventConditions: js.UndefOr[js.Array[Anon_ComparisonType]] = js.native
  var useEventValue: js.UndefOr[Boolean] = js.native
}

object Anon_EventConditions {
  @scala.inline
  def apply(
    eventConditions: js.Array[Anon_ComparisonType] = null,
    useEventValue: js.UndefOr[Boolean] = js.undefined
  ): Anon_EventConditions = {
    val __obj = js.Dynamic.literal()
    if (eventConditions != null) __obj.updateDynamic("eventConditions")(eventConditions.asInstanceOf[js.Any])
    if (!js.isUndefined(useEventValue)) __obj.updateDynamic("useEventValue")(useEventValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventConditions]
  }
}

