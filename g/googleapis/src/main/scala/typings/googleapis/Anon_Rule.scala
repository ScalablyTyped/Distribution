package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Rule extends js.Object {
  var rule: js.UndefOr[js.Array[Anon_Action]] = js.native
}

object Anon_Rule {
  @scala.inline
  def apply(rule: js.Array[Anon_Action] = null): Anon_Rule = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Rule]
  }
}

