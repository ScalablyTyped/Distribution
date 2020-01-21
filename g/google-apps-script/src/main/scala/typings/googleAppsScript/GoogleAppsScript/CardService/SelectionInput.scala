package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait SelectionInput extends js.Object {
  def addItem(text: js.Any, value: js.Any, selected: Boolean): SelectionInput
  def setFieldName(fieldName: String): SelectionInput
  def setOnChangeAction(action: Action): SelectionInput
  def setTitle(title: String): SelectionInput
  def setType(`type`: SelectionInputType): SelectionInput
}

object SelectionInput {
  @scala.inline
  def apply(
    addItem: (js.Any, js.Any, Boolean) => SelectionInput,
    setFieldName: String => SelectionInput,
    setOnChangeAction: Action => SelectionInput,
    setTitle: String => SelectionInput,
    setType: SelectionInputType => SelectionInput
  ): SelectionInput = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction3(addItem), setFieldName = js.Any.fromFunction1(setFieldName), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setTitle = js.Any.fromFunction1(setTitle), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[SelectionInput]
  }
}

