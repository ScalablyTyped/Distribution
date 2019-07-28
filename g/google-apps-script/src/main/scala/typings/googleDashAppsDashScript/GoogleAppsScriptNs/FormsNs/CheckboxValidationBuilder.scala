package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxValidationBuilder extends js.Object {
  def requireSelectAtLeast(number: Integer): CheckboxValidationBuilder
  def requireSelectAtMost(number: Integer): CheckboxValidationBuilder
  def requireSelectExactly(number: Integer): CheckboxValidationBuilder
}

object CheckboxValidationBuilder {
  @scala.inline
  def apply(
    requireSelectAtLeast: Integer => CheckboxValidationBuilder,
    requireSelectAtMost: Integer => CheckboxValidationBuilder,
    requireSelectExactly: Integer => CheckboxValidationBuilder
  ): CheckboxValidationBuilder = {
    val __obj = js.Dynamic.literal(requireSelectAtLeast = js.Any.fromFunction1(requireSelectAtLeast), requireSelectAtMost = js.Any.fromFunction1(requireSelectAtMost), requireSelectExactly = js.Any.fromFunction1(requireSelectExactly))
  
    __obj.asInstanceOf[CheckboxValidationBuilder]
  }
}

