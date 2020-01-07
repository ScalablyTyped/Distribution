package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_RuleAnonActionCondition extends js.Object {
  var rule: js.UndefOr[js.Array[Anon_ActionCondition]] = js.native
}

object Anon_RuleAnonActionCondition {
  @scala.inline
  def apply(rule: js.Array[Anon_ActionCondition] = null): Anon_RuleAnonActionCondition = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RuleAnonActionCondition]
  }
}

