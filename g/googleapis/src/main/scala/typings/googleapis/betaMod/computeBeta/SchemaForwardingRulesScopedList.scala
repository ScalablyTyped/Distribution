package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
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
  var warning: js.UndefOr[Code] = js.native
}

object SchemaForwardingRulesScopedList {
  @scala.inline
  def apply(): SchemaForwardingRulesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRulesScopedList]
  }
  @scala.inline
  implicit class SchemaForwardingRulesScopedListOps[Self <: SchemaForwardingRulesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForwardingRulesVarargs(value: SchemaForwardingRule*): Self = this.set("forwardingRules", js.Array(value :_*))
    @scala.inline
    def setForwardingRules(value: js.Array[SchemaForwardingRule]): Self = this.set("forwardingRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardingRules: Self = this.set("forwardingRules", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

