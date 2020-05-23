package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddConditionalFormatRuleRequest extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var rule: js.UndefOr[ConditionalFormatRule] = js.undefined
}

object AddConditionalFormatRuleRequest {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, rule: ConditionalFormatRule = null): AddConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConditionalFormatRuleRequest]
  }
}

