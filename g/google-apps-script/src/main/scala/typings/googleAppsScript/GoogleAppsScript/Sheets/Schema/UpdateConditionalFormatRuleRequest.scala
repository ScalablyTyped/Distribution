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
    index: Int | Double = null,
    newIndex: Int | Double = null,
    rule: ConditionalFormatRule = null,
    sheetId: Int | Double = null
  ): UpdateConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConditionalFormatRuleRequest]
  }
}

