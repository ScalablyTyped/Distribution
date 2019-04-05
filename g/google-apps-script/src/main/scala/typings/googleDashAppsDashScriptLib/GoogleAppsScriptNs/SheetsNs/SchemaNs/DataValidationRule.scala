package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataValidationRule extends js.Object {
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  var inputMessage: js.UndefOr[java.lang.String] = js.undefined
  var showCustomUi: js.UndefOr[scala.Boolean] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object DataValidationRule {
  @scala.inline
  def apply(
    condition: BooleanCondition = null,
    inputMessage: java.lang.String = null,
    showCustomUi: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): DataValidationRule = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (inputMessage != null) __obj.updateDynamic("inputMessage")(inputMessage)
    if (!js.isUndefined(showCustomUi)) __obj.updateDynamic("showCustomUi")(showCustomUi)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[DataValidationRule]
  }
}

