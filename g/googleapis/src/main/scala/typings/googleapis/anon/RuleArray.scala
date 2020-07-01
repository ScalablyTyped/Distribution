package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleArray extends js.Object {
  var rule: js.UndefOr[js.Array[ActionCondition]] = js.native
}

object RuleArray {
  @scala.inline
  def apply(rule: js.Array[ActionCondition] = null): RuleArray = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleArray]
  }
}

