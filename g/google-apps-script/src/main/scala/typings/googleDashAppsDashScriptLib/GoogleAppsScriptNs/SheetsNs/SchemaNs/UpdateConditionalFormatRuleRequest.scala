package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConditionalFormatRuleRequest extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var newIndex: js.UndefOr[scala.Double] = js.undefined
  var rule: js.UndefOr[ConditionalFormatRule] = js.undefined
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

object UpdateConditionalFormatRuleRequest {
  @scala.inline
  def apply(
    index: scala.Int | scala.Double = null,
    newIndex: scala.Int | scala.Double = null,
    rule: ConditionalFormatRule = null,
    sheetId: scala.Int | scala.Double = null
  ): UpdateConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConditionalFormatRuleRequest]
  }
}

