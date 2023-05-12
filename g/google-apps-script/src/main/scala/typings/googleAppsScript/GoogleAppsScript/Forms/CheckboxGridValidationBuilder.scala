package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DataValidationBuilder for a CheckboxGridValidation.
  *
  *     // Add a checkbox grid item to a form and restrict it to one response per column.
  *     var checkboxGridItem = form.addCheckboxGridItem();
  *     checkboxGridItem.setTitle('Where did you celebrate New Years?')
  *       .setRows(['New York', 'San Francisco', 'London'])
  *       .setColumns(['2014', '2015', '2016', '2017']);
  *     var checkboxGridValidation = FormApp.createcheckboxGridValidation()
  *       .setHelpText(“Select one item per column.”)
  *       .requireLimitOneResponsePerColumn()
  *       .build();
  *     checkboxGridItem.setValidation(checkboxGridValidation);
  */
trait CheckboxGridValidationBuilder extends StObject {
  
  def build(): CheckboxGridValidation
  
  def requireLimitOneResponsePerColumn(): CheckboxGridValidationBuilder
  
  def setHelpText(text: String): CheckboxGridValidationBuilder
}
object CheckboxGridValidationBuilder {
  
  inline def apply(
    build: () => CheckboxGridValidation,
    requireLimitOneResponsePerColumn: () => CheckboxGridValidationBuilder,
    setHelpText: String => CheckboxGridValidationBuilder
  ): CheckboxGridValidationBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), requireLimitOneResponsePerColumn = js.Any.fromFunction0(requireLimitOneResponsePerColumn), setHelpText = js.Any.fromFunction1(setHelpText))
    __obj.asInstanceOf[CheckboxGridValidationBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxGridValidationBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: () => CheckboxGridValidation): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setRequireLimitOneResponsePerColumn(value: () => CheckboxGridValidationBuilder): Self = StObject.set(x, "requireLimitOneResponsePerColumn", js.Any.fromFunction0(value))
    
    inline def setSetHelpText(value: String => CheckboxGridValidationBuilder): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
  }
}
