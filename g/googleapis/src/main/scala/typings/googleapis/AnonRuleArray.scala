package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRuleArray extends js.Object {
  var rule: js.UndefOr[js.Array[AnonActionCondition]] = js.native
}

object AnonRuleArray {
  @scala.inline
  def apply(rule: js.Array[AnonActionCondition] = null): AnonRuleArray = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRuleArray]
  }
}

