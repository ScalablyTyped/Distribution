package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRule extends js.Object {
  var rule: js.UndefOr[js.Array[AnonAction]] = js.native
}

object AnonRule {
  @scala.inline
  def apply(rule: js.Array[AnonAction] = null): AnonRule = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRule]
  }
}

