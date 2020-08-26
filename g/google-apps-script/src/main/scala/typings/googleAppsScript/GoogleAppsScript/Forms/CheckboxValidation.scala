package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidation for a CheckboxItem.
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
@js.native
trait CheckboxValidation extends js.Object {
  def requireSelectAtLeast(number: Integer): CheckboxValidation = js.native
  def requireSelectAtMost(number: Integer): CheckboxValidation = js.native
  def requireSelectExactly(number: Integer): CheckboxValidation = js.native
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
  @scala.inline
  implicit class CheckboxValidationOps[Self <: CheckboxValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequireSelectAtLeast(value: Integer => CheckboxValidation): Self = this.set("requireSelectAtLeast", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireSelectAtMost(value: Integer => CheckboxValidation): Self = this.set("requireSelectAtMost", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireSelectExactly(value: Integer => CheckboxValidation): Self = this.set("requireSelectExactly", js.Any.fromFunction1(value))
  }
  
}

