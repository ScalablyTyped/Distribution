package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConditionalFormatRuleRequest extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var newIndex: js.UndefOr[Double] = js.undefined
  var rule: js.UndefOr[ConditionalFormatRule] = js.undefined
  var sheetId: js.UndefOr[Double] = js.undefined
}

object UpdateConditionalFormatRuleRequest {
  @scala.inline
  def apply(
    index: js.UndefOr[Double] = js.undefined,
    newIndex: js.UndefOr[Double] = js.undefined,
    rule: ConditionalFormatRule = null,
    sheetId: js.UndefOr[Double] = js.undefined
  ): UpdateConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newIndex)) __obj.updateDynamic("newIndex")(newIndex.get.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConditionalFormatRuleRequest]
  }
}

