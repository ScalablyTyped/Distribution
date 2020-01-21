package typings.googleapis.betaMod.computeBeta

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaForwardingRulesScopedList extends js.Object {
  /**
    * A list of forwarding rules contained in this scope.
    */
  var forwardingRules: js.UndefOr[js.Array[SchemaForwardingRule]] = js.native
  /**
    * Informational warning which replaces the list of forwarding rules when
    * the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaForwardingRulesScopedList {
  @scala.inline
  def apply(forwardingRules: js.Array[SchemaForwardingRule] = null, warning: AnonCode = null): SchemaForwardingRulesScopedList = {
    val __obj = js.Dynamic.literal()
    if (forwardingRules != null) __obj.updateDynamic("forwardingRules")(forwardingRules.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaForwardingRulesScopedList]
  }
}

