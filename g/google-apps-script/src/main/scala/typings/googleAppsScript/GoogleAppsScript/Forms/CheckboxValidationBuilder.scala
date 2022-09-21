package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait CheckboxValidationBuilder extends StObject {
  
  def build(): CheckboxValidation
  
  def requireSelectAtLeast(number: Integer): CheckboxValidationBuilder
  
  def requireSelectAtMost(number: Integer): CheckboxValidationBuilder
  
  def requireSelectExactly(number: Integer): CheckboxValidationBuilder
}
object CheckboxValidationBuilder {
  
  inline def apply(
    build: () => CheckboxValidation,
    requireSelectAtLeast: Integer => CheckboxValidationBuilder,
    requireSelectAtMost: Integer => CheckboxValidationBuilder,
    requireSelectExactly: Integer => CheckboxValidationBuilder
  ): CheckboxValidationBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), requireSelectAtLeast = js.Any.fromFunction1(requireSelectAtLeast), requireSelectAtMost = js.Any.fromFunction1(requireSelectAtMost), requireSelectExactly = js.Any.fromFunction1(requireSelectExactly))
    __obj.asInstanceOf[CheckboxValidationBuilder]
  }
  
  extension [Self <: CheckboxValidationBuilder](x: Self) {
    
    inline def setBuild(value: () => CheckboxValidation): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setRequireSelectAtLeast(value: Integer => CheckboxValidationBuilder): Self = StObject.set(x, "requireSelectAtLeast", js.Any.fromFunction1(value))
    
    inline def setRequireSelectAtMost(value: Integer => CheckboxValidationBuilder): Self = StObject.set(x, "requireSelectAtMost", js.Any.fromFunction1(value))
    
    inline def setRequireSelectExactly(value: Integer => CheckboxValidationBuilder): Self = StObject.set(x, "requireSelectExactly", js.Any.fromFunction1(value))
  }
}
