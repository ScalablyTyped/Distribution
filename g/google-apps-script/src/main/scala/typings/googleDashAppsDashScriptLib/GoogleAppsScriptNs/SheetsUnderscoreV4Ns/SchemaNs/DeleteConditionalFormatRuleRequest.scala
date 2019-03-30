package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConditionalFormatRuleRequest extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

object DeleteConditionalFormatRuleRequest {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, sheetId: scala.Int | scala.Double = null): DeleteConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConditionalFormatRuleRequest]
  }
}

