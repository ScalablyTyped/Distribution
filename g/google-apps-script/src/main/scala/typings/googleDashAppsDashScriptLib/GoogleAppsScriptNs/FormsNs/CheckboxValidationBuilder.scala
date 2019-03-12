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
    requireSelectAtLeast: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => CheckboxValidationBuilder,
    requireSelectAtMost: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => CheckboxValidationBuilder,
    requireSelectExactly: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => CheckboxValidationBuilder
  ): CheckboxValidationBuilder = {
    val __obj = js.Dynamic.literal(requireSelectAtLeast = js.Any.fromFunction1(requireSelectAtLeast), requireSelectAtMost = js.Any.fromFunction1(requireSelectAtMost), requireSelectExactly = js.Any.fromFunction1(requireSelectExactly))
  
    __obj.asInstanceOf[CheckboxValidationBuilder]
  }
}

