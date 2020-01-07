package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ActionCondition extends js.Object {
  var action: js.UndefOr[Anon_TypeString] = js.native
  var condition: js.UndefOr[Anon_AgeCreatedBefore] = js.native
}

object Anon_ActionCondition {
  @scala.inline
  def apply(action: Anon_TypeString = null, condition: Anon_AgeCreatedBefore = null): Anon_ActionCondition = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionCondition]
  }
}

