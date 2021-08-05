package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An input field that allows choosing between a set of predefined options.
  *
  *     var checkboxGroup = CardService.newSelectionInput()
  *         .setType(CardService.SelectionInputType.CHECK_BOX)
  *         .setTitle("A group of checkboxes. Multiple selections are allowed.")
  *         .setFieldName("checkbox_field")
  *         .addItem("checkbox one title", "checkbox_one_value", false)
  *         .addItem("checkbox two title", "checkbox_two_value", true)
  *         .addItem("checkbox three title", "checkbox_three_value", false)
  *         .setOnChangeAction(CardService.newAction()
  *             .setFunctionName("handleCheckboxChange"));
  *
  *     var radioGroup = CardService.newSelectionInput()
  *         .setType(CardService.SelectionInputType.RADIO_BUTTON)
  *         .setTitle("A group of radio buttons. Only a single selection is allowed.")
  *         .setFieldName("checkbox_field")
  *         .addItem("radio button one title", "radio_one_value", true)
  *         .addItem("radio button two title", "radio_two_value", true)
  *         .addItem("radio button three title", "radio_three_value", false);
  */
trait SelectionInput extends StObject {
  
  def addItem(text: js.Any, value: js.Any, selected: Boolean): SelectionInput
  
  def setFieldName(fieldName: String): SelectionInput
  
  def setOnChangeAction(action: Action): SelectionInput
  
  def setTitle(title: String): SelectionInput
  
  def setType(`type`: SelectionInputType): SelectionInput
}
object SelectionInput {
  
  inline def apply(
    addItem: (js.Any, js.Any, Boolean) => SelectionInput,
    setFieldName: String => SelectionInput,
    setOnChangeAction: Action => SelectionInput,
    setTitle: String => SelectionInput,
    setType: SelectionInputType => SelectionInput
  ): SelectionInput = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction3(addItem), setFieldName = js.Any.fromFunction1(setFieldName), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setTitle = js.Any.fromFunction1(setTitle), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[SelectionInput]
  }
  
  extension [Self <: SelectionInput](x: Self) {
    
    inline def setAddItem(value: (js.Any, js.Any, Boolean) => SelectionInput): Self = StObject.set(x, "addItem", js.Any.fromFunction3(value))
    
    inline def setSetFieldName(value: String => SelectionInput): Self = StObject.set(x, "setFieldName", js.Any.fromFunction1(value))
    
    inline def setSetOnChangeAction(value: Action => SelectionInput): Self = StObject.set(x, "setOnChangeAction", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => SelectionInput): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetType(value: SelectionInputType => SelectionInput): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
  }
}
