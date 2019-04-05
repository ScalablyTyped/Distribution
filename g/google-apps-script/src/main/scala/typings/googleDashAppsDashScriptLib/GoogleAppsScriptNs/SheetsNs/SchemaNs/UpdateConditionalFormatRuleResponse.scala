package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConditionalFormatRuleResponse extends js.Object {
  var newIndex: js.UndefOr[scala.Double] = js.undefined
  var newRule: js.UndefOr[ConditionalFormatRule] = js.undefined
  var oldIndex: js.UndefOr[scala.Double] = js.undefined
  var oldRule: js.UndefOr[ConditionalFormatRule] = js.undefined
}

object UpdateConditionalFormatRuleResponse {
  @scala.inline
  def apply(
    newIndex: scala.Int | scala.Double = null,
    newRule: ConditionalFormatRule = null,
    oldIndex: scala.Int | scala.Double = null,
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

