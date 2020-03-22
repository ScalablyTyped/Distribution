package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActionCondition extends js.Object {
  var action: js.UndefOr[AnonTypeString] = js.native
  var condition: js.UndefOr[AnonCreatedBefore] = js.native
}

object AnonActionCondition {
  @scala.inline
  def apply(action: AnonTypeString = null, condition: AnonCreatedBefore = null): AnonActionCondition = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionCondition]
  }
}

