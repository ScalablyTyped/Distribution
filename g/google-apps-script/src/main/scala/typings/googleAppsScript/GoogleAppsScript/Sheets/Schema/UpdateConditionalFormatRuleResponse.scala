package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConditionalFormatRuleResponse extends js.Object {
  var newIndex: js.UndefOr[Double] = js.undefined
  var newRule: js.UndefOr[ConditionalFormatRule] = js.undefined
  var oldIndex: js.UndefOr[Double] = js.undefined
  var oldRule: js.UndefOr[ConditionalFormatRule] = js.undefined
}

object UpdateConditionalFormatRuleResponse {
  @scala.inline
  def apply(
    newIndex: js.UndefOr[Double] = js.undefined,
    newRule: ConditionalFormatRule = null,
    oldIndex: js.UndefOr[Double] = js.undefined,
    oldRule: ConditionalFormatRule = null
  ): UpdateConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newIndex)) __obj.updateDynamic("newIndex")(newIndex.get.asInstanceOf[js.Any])
    if (newRule != null) __obj.updateDynamic("newRule")(newRule.asInstanceOf[js.Any])
    if (!js.isUndefined(oldIndex)) __obj.updateDynamic("oldIndex")(oldIndex.get.asInstanceOf[js.Any])
    if (oldRule != null) __obj.updateDynamic("oldRule")(oldRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConditionalFormatRuleResponse]
  }
}

