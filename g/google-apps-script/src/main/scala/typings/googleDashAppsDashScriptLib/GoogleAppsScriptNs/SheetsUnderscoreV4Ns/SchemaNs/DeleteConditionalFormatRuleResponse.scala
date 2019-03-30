package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConditionalFormatRuleResponse extends js.Object {
  var rule: js.UndefOr[ConditionalFormatRule] = js.undefined
}

object DeleteConditionalFormatRuleResponse {
  @scala.inline
  def apply(rule: ConditionalFormatRule = null): DeleteConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[DeleteConditionalFormatRuleResponse]
  }
}

