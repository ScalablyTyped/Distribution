package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /** A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken. */
  var rule: js.UndefOr[js.Array[Action]] = js.undefined
}

object Rule {
  @scala.inline
  def apply(rule: js.Array[Action] = null): Rule = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

