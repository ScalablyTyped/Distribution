package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait CheckboxValidationBuilder extends js.Object {
  
  def requireSelectAtLeast(number: Integer): CheckboxValidationBuilder = js.native
  
  def requireSelectAtMost(number: Integer): CheckboxValidationBuilder = js.native
  
  def requireSelectExactly(number: Integer): CheckboxValidationBuilder = js.native
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
  
  @scala.inline
  implicit class CheckboxValidationBuilderOps[Self <: CheckboxValidationBuilder] (val x: Self) extends AnyVal {
    
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
    def setRequireSelectAtLeast(value: Integer => CheckboxValidationBuilder): Self = this.set("requireSelectAtLeast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireSelectAtMost(value: Integer => CheckboxValidationBuilder): Self = this.set("requireSelectAtMost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireSelectExactly(value: Integer => CheckboxValidationBuilder): Self = this.set("requireSelectExactly", js.Any.fromFunction1(value))
  }
}
