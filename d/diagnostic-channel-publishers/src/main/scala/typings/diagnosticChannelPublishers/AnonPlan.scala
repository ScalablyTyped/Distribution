package typings.diagnosticChannelPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlan extends js.Object {
  var plan: js.UndefOr[String] = js.undefined
  var preparable: js.UndefOr[AnonArgs] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonPlan {
  @scala.inline
  def apply(plan: String = null, preparable: AnonArgs = null, text: String = null): AnonPlan = {
    val __obj = js.Dynamic.literal()
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (preparable != null) __obj.updateDynamic("preparable")(preparable.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlan]
  }
}

