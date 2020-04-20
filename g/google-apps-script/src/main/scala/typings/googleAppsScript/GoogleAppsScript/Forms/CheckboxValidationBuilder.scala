package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a CheckboxValidation.
  *
  *     // Add a checkBox item to a form and require exactly two selections.
  *     var checkBoxItem = form.addCheckboxItem();
  *     checkBoxItem.setTitle('What two condiments would you like on your hot dog?');
  *     checkBoxItem.setChoices([
  *       checkBoxItem.createChoice('Ketchup'),
  *       checkBoxItem.createChoice('Mustard'),
  *       checkBoxItem.createChoice('Relish')
  *     ]);
  *     var checkBoxValidation = FormApp.createCheckboxValidation()
  *       .setHelpText(“Select two condiments.”)
  *       .requireSelectExactly(2)
  *       .build();
  *     checkBoxItem.setValidation(checkBoxValidation);
  */
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

