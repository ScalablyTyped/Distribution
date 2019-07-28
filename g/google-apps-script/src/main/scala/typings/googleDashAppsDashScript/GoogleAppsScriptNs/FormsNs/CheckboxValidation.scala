package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxValidation extends js.Object {
  def requireSelectAtLeast(number: Integer): CheckboxValidation
  def requireSelectAtMost(number: Integer): CheckboxValidation
  def requireSelectExactly(number: Integer): CheckboxValidation
}

object CheckboxValidation {
  @scala.inline
  def apply(
    requireSelectAtLeast: Integer => CheckboxValidation,
    requireSelectAtMost: Integer => CheckboxValidation,
    requireSelectExactly: Integer => CheckboxValidation
  ): CheckboxValidation = {
    val __obj = js.Dynamic.literal(requireSelectAtLeast = js.Any.fromFunction1(requireSelectAtLeast), requireSelectAtMost = js.Any.fromFunction1(requireSelectAtMost), requireSelectExactly = js.Any.fromFunction1(requireSelectExactly))
  
    __obj.asInstanceOf[CheckboxValidation]
  }
}

