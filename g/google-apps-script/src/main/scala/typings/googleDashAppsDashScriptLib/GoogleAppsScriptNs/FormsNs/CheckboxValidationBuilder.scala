package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxValidationBuilder extends js.Object {
  def requireSelectAtLeast(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CheckboxValidationBuilder
  def requireSelectAtMost(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CheckboxValidationBuilder
  def requireSelectExactly(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CheckboxValidationBuilder
}

object CheckboxValidationBuilder {
  @scala.inline
  def apply(
    requireSelectAtLeast: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, CheckboxValidationBuilder],
    requireSelectAtMost: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, CheckboxValidationBuilder],
    requireSelectExactly: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, CheckboxValidationBuilder]
  ): CheckboxValidationBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireSelectAtLeast")(requireSelectAtLeast)
    __obj.updateDynamic("requireSelectAtMost")(requireSelectAtMost)
    __obj.updateDynamic("requireSelectExactly")(requireSelectExactly)
    __obj.asInstanceOf[CheckboxValidationBuilder]
  }
}

