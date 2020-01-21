package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRuleAnonActionCondition extends js.Object {
  var rule: js.UndefOr[js.Array[AnonActionCondition]] = js.native
}

object AnonRuleAnonActionCondition {
  @scala.inline
  def apply(rule: js.Array[AnonActionCondition] = null): AnonRuleAnonActionCondition = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRuleAnonActionCondition]
  }
}

