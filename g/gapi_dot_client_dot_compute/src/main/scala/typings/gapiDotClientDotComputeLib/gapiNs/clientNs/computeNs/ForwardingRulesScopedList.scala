package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingRulesScopedList extends js.Object {
  /** List of forwarding rules contained in this scope. */
  var forwardingRules: js.UndefOr[js.Array[ForwardingRule]] = js.undefined
  /** Informational warning which replaces the list of forwarding rules when the list is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object ForwardingRulesScopedList {
  @scala.inline
  def apply(
    forwardingRules: js.Array[ForwardingRule] = null,
    warning: gapiDotClientDotComputeLib.Anon_Code = null
  ): ForwardingRulesScopedList = {
    val __obj = js.Dynamic.literal()
    if (forwardingRules != null) __obj.updateDynamic("forwardingRules")(forwardingRules)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[ForwardingRulesScopedList]
  }
}

