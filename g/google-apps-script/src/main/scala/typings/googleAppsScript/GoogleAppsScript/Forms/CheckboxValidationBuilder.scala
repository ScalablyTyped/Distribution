package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
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
trait CheckboxValidationBuilder extends StObject {
  
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
  implicit class CheckboxValidationBuilderMutableBuilder[Self <: CheckboxValidationBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequireSelectAtLeast(value: Integer => CheckboxValidationBuilder): Self = StObject.set(x, "requireSelectAtLeast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireSelectAtMost(value: Integer => CheckboxValidationBuilder): Self = StObject.set(x, "requireSelectAtMost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireSelectExactly(value: Integer => CheckboxValidationBuilder): Self = StObject.set(x, "requireSelectExactly", js.Any.fromFunction1(value))
  }
}
