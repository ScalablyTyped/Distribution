package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxCheckBoxList object.
  */
trait ASPxClientCheckBoxList extends ASPxClientCheckListBase {
  /**
    * Occurs on the client side after a different item in the check box list has been selected (focus has been moved from one item to another).
    */
  @JSName("SelectedIndexChanged")
  var SelectedIndexChanged_ASPxClientCheckBoxList: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]]
  /**
    * Returns an array of the check box list editor's selected items indices.
    */
  def GetSelectedIndices(): js.Array[Double]
  /**
    * Returns an array of the check box list editor's selected items.
    */
  def GetSelectedItems(): js.Array[ASPxClientListEditItem]
  /**
    * Returns an array of the check box list editor's selected items values.
    */
  def GetSelectedValues(): js.Array[_]
  /**
    * Selects all check box list items.
    */
  def SelectAll(): Unit
  /**
    * Selects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def SelectIndices(indices: js.Array[Double]): Unit
  /**
    * Selects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def SelectItems(items: js.Array[ASPxClientListEditItem]): Unit
  /**
    * Selects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def SelectValues(values: js.Array[_]): Unit
  /**
    * Unselects all check box list items.
    */
  def UnselectAll(): Unit
  /**
    * Unselects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def UnselectIndices(indices: js.Array[Double]): Unit
  /**
    * Unselects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def UnselectItems(items: js.Array[ASPxClientListEditItem]): Unit
  /**
    * Unselects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def UnselectValues(values: js.Array[_]): Unit
}

object ASPxClientCheckBoxList {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Focus: () => Unit,
    GetCaption: () => String,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => js.Any,
    GetIsValid: () => Boolean,
    GetItem: Double => ASPxClientListEditItem,
    GetItemCount: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetReadOnly: () => Boolean,
    GetSelectedIndex: () => Double,
    GetSelectedIndices: () => js.Array[Double],
    GetSelectedItem: () => ASPxClientListEditItem,
    GetSelectedItems: () => js.Array[ASPxClientListEditItem],
    GetSelectedValues: () => js.Array[_],
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectAll: () => Unit,
    SelectIndices: js.Array[Double] => Unit,
    SelectItems: js.Array[ASPxClientListEditItem] => Unit,
    SelectValues: js.Array[_] => Unit,
    SelectedIndexChanged: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetReadOnly: Boolean => Unit,
    SetSelectedIndex: Double => Unit,
    SetSelectedItem: ASPxClientListEditItem => Unit,
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    UnselectAll: () => Unit,
    UnselectIndices: js.Array[Double] => Unit,
    UnselectItems: js.Array[ASPxClientListEditItem] => Unit,
    UnselectValues: js.Array[_] => Unit,
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientCheckBoxList = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetItem = js.Any.fromFunction1(GetItem), GetItemCount = js.Any.fromFunction0(GetItemCount), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetSelectedIndex = js.Any.fromFunction0(GetSelectedIndex), GetSelectedIndices = js.Any.fromFunction0(GetSelectedIndices), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetSelectedItems = js.Any.fromFunction0(GetSelectedItems), GetSelectedValues = js.Any.fromFunction0(GetSelectedValues), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll), SelectIndices = js.Any.fromFunction1(SelectIndices), SelectItems = js.Any.fromFunction1(SelectItems), SelectValues = js.Any.fromFunction1(SelectValues), SelectedIndexChanged = SelectedIndexChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelectedIndex = js.Any.fromFunction1(SetSelectedIndex), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), UnselectAll = js.Any.fromFunction0(UnselectAll), UnselectIndices = js.Any.fromFunction1(UnselectIndices), UnselectItems = js.Any.fromFunction1(UnselectItems), UnselectValues = js.Any.fromFunction1(UnselectValues), Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCheckBoxList]
  }
}

