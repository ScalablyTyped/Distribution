package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConditionalFormatRuleResponse extends js.Object {
  /** The index of the new rule. */
  var newIndex: js.UndefOr[Double] = js.undefined
  /**
    * The new rule that replaced the old rule (if replacing),
    * or the rule that was moved (if moved)
    */
  var newRule: js.UndefOr[ConditionalFormatRule] = js.undefined
  /**
    * The old index of the rule. Not set if a rule was replaced
    * (because it is the same as new_index).
    */
  var oldIndex: js.UndefOr[Double] = js.undefined
  /**
    * The old (deleted) rule. Not set if a rule was moved
    * (because it is the same as new_rule).
    */
  var oldRule: js.UndefOr[ConditionalFormatRule] = js.undefined
}

object UpdateConditionalFormatRuleResponse {
  @scala.inline
  def apply(
    newIndex: Int | Double = null,
    newRule: ConditionalFormatRule = null,
    oldIndex: Int | Double = null,
    oldRule: ConditionalFormatRule = null
  ): UpdateConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    if (newRule != null) __obj.updateDynamic("newRule")(newRule)
    if (oldIndex != null) __obj.updateDynamic("oldIndex")(oldIndex.asInstanceOf[js.Any])
    if (oldRule != null) __obj.updateDynamic("oldRule")(oldRule)
    __obj.asInstanceOf[UpdateConditionalFormatRuleResponse]
  }
}

