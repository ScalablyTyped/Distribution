package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionCondition extends js.Object {
  var action: js.UndefOr[TypeString] = js.native
  var condition: js.UndefOr[CreatedBefore] = js.native
}

object ActionCondition {
  @scala.inline
  def apply(action: TypeString = null, condition: CreatedBefore = null): ActionCondition = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCondition]
  }
}

