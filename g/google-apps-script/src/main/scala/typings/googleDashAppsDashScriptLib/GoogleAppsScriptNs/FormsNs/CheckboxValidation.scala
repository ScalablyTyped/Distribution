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
    requireSelectAtLeast: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => CheckboxValidation,
    requireSelectAtMost: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => CheckboxValidation,
    requireSelectExactly: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => CheckboxValidation
  ): CheckboxValidation = {
    val __obj = js.Dynamic.literal(requireSelectAtLeast = js.Any.fromFunction1(requireSelectAtLeast), requireSelectAtMost = js.Any.fromFunction1(requireSelectAtMost), requireSelectExactly = js.Any.fromFunction1(requireSelectExactly))
  
    __obj.asInstanceOf[CheckboxValidation]
  }
}

