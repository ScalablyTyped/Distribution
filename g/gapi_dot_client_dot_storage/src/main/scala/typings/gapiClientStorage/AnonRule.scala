package typings.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRule extends js.Object {
  /** A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken. */
  var rule: js.UndefOr[js.Array[AnonAction]] = js.undefined
}

object AnonRule {
  @scala.inline
  def apply(rule: js.Array[AnonAction] = null): AnonRule = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRule]
  }
}

