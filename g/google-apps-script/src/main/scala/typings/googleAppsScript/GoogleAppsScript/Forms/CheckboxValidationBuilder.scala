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
  
  def setHelpText(text: String): CheckboxValidationBuilder
}
object CheckboxValidationBuilder {
  
  inline def apply(
    build: () => CheckboxValidation,
    requireSelectAtLeast: Integer => CheckboxValidationBuilder,
    requireSelectAtMost: Integer => CheckboxValidationBuilder,
    requireSelectExactly: Integer => CheckboxValidationBuilder,
    setHelpText: String => CheckboxValidationBuilder
  ): CheckboxValidationBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), requireSelectAtLeast = js.Any.fromFunction1(requireSelectAtLeast), requireSelectAtMost = js.Any.fromFunction1(requireSelectAtMost), requireSelectExactly = js.Any.fromFunction1(requireSelectExactly), setHelpText = js.Any.fromFunction1(setHelpText))
    __obj.asInstanceOf[CheckboxValidationBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxValidationBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: () => CheckboxValidation): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setRequireSelectAtLeast(value: Integer => CheckboxValidationBuilder): Self = StObject.set(x, "requireSelectAtLeast", js.Any.fromFunction1(value))
    
    inline def setRequireSelectAtMost(value: Integer => CheckboxValidationBuilder): Self = StObject.set(x, "requireSelectAtMost", js.Any.fromFunction1(value))
    
    inline def setRequireSelectExactly(value: Integer => CheckboxValidationBuilder): Self = StObject.set(x, "requireSelectExactly", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => CheckboxValidationBuilder): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
  }
}
