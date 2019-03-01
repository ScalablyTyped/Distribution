package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxValidation extends js.Object {
  def requireSelectAtLeast(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CheckboxValidation
  def requireSelectAtMost(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CheckboxValidation
  def requireSelectExactly(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CheckboxValidation
}

object CheckboxValidation {
  @scala.inline
  def apply(
    requireSelectAtLeast: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, CheckboxValidation],
    requireSelectAtMost: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, CheckboxValidation],
    requireSelectExactly: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, CheckboxValidation]
  ): CheckboxValidation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireSelectAtLeast")(requireSelectAtLeast)
    __obj.updateDynamic("requireSelectAtMost")(requireSelectAtMost)
    __obj.updateDynamic("requireSelectExactly")(requireSelectExactly)
    __obj.asInstanceOf[CheckboxValidation]
  }
}

