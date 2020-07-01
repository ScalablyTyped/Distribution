package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  var rule: js.UndefOr[js.Array[Action]] = js.native
}

object Rule {
  @scala.inline
  def apply(rule: js.Array[Action] = null): Rule = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

