package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ForwardingRulesScopedList extends js.Object {
  /**
    * A list of forwarding rules contained in this scope.
    */
  var forwardingRules: js.UndefOr[js.Array[Schema$ForwardingRule]] = js.native
  /**
    * Informational warning which replaces the list of forwarding rules when
    * the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$ForwardingRulesScopedList {
  @scala.inline
  def apply(forwardingRules: js.Array[Schema$ForwardingRule] = null, warning: Anon_Code = null): Schema$ForwardingRulesScopedList = {
    val __obj = js.Dynamic.literal()
    if (forwardingRules != null) __obj.updateDynamic("forwardingRules")(forwardingRules.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ForwardingRulesScopedList]
  }
}

