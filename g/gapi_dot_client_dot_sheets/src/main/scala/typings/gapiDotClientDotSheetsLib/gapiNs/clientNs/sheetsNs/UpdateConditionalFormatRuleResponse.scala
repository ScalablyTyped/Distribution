package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConditionalFormatRuleResponse extends js.Object {
  /** The index of the new rule. */
  var newIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The new rule that replaced the old rule (if replacing),
    * or the rule that was moved (if moved)
    */
  var newRule: js.UndefOr[ConditionalFormatRule] = js.undefined
  /**
    * The old index of the rule. Not set if a rule was replaced
    * (because it is the same as new_index).
    */
  var oldIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The old (deleted) rule. Not set if a rule was moved
    * (because it is the same as new_rule).
    */
  var oldRule: js.UndefOr[ConditionalFormatRule] = js.undefined
}

