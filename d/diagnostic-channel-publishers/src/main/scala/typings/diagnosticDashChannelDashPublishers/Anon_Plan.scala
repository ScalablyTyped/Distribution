package typings.diagnosticDashChannelDashPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plan extends js.Object {
  var plan: js.UndefOr[String] = js.undefined
  var preparable: js.UndefOr[Anon_Args] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Anon_Plan {
  @scala.inline
  def apply(plan: String = null, preparable: Anon_Args = null, text: String = null): Anon_Plan = {
    val __obj = js.Dynamic.literal()
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (preparable != null) __obj.updateDynamic("preparable")(preparable)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Plan]
  }
}

