package typings
package devexpressDashWebLib

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
  def GetSelectedIndices(): js.Array[scala.Double]
  /**
    * Returns an array of the check box list editor's selected items.
    */
  def GetSelectedItems(): js.Array[ASPxClientListEditItem]
  /**
    * Returns an array of the check box list editor's selected items values.
    */
  def GetSelectedValues(): js.Array[js.Object]
  /**
    * Selects all check box list items.
    */
  def SelectAll(): scala.Unit
  /**
    * Selects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def SelectIndices(indices: js.Array[scala.Double]): scala.Unit
  /**
    * Selects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def SelectItems(items: js.Array[ASPxClientListEditItem]): scala.Unit
  /**
    * Selects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def SelectValues(values: js.Array[js.Object]): scala.Unit
  /**
    * Unselects all check box list items.
    */
  def UnselectAll(): scala.Unit
  /**
    * Unselects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def UnselectIndices(indices: js.Array[scala.Double]): scala.Unit
  /**
    * Unselects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def UnselectItems(items: js.Array[ASPxClientListEditItem]): scala.Unit
  /**
    * Unselects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def UnselectValues(values: js.Array[js.Object]): scala.Unit
}

object ASPxClientCheckBoxList {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    Focus: () => scala.Unit,
    GetCaption: () => java.lang.String,
    GetClientVisible: () => scala.Boolean,
    GetEnabled: () => scala.Boolean,
    GetErrorText: () => java.lang.String,
    GetHeight: () => scala.Double,
    GetInputElement: () => js.Object,
    GetIsValid: () => scala.Boolean,
    GetItem: scala.Double => ASPxClientListEditItem,
    GetItemCount: () => scala.Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetReadOnly: () => scala.Boolean,
    GetSelectedIndex: () => scala.Double,
    GetSelectedIndices: () => js.Array[scala.Double],
    GetSelectedItem: () => ASPxClientListEditItem,
    GetSelectedItems: () => js.Array[ASPxClientListEditItem],
    GetSelectedValues: () => js.Array[js.Object],
    GetValue: () => js.Object,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectAll: () => scala.Unit,
    SelectIndices: js.Array[scala.Double] => scala.Unit,
    SelectItems: js.Array[ASPxClientListEditItem] => scala.Unit,
    SelectValues: js.Array[js.Object] => scala.Unit,
    SelectedIndexChanged: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetCaption: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetErrorText: java.lang.String => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetIsValid: scala.Boolean => scala.Unit,
    SetReadOnly: scala.Boolean => scala.Unit,
    SetSelectedIndex: scala.Double => scala.Unit,
    SetSelectedItem: ASPxClientListEditItem => scala.Unit,
    SetValue: js.Object => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    UnselectAll: () => scala.Unit,
    UnselectIndices: js.Array[scala.Double] => scala.Unit,
    UnselectItems: js.Array[ASPxClientListEditItem] => scala.Unit,
    UnselectValues: js.Array[js.Object] => scala.Unit,
    Validate: () => scala.Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientCheckBoxList = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetItem = js.Any.fromFunction1(GetItem), GetItemCount = js.Any.fromFunction0(GetItemCount), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetSelectedIndex = js.Any.fromFunction0(GetSelectedIndex), GetSelectedIndices = js.Any.fromFunction0(GetSelectedIndices), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetSelectedItems = js.Any.fromFunction0(GetSelectedItems), GetSelectedValues = js.Any.fromFunction0(GetSelectedValues), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus, InCallback = js.Any.fromFunction0(InCallback), Init = Init, LostFocus = LostFocus, SelectAll = js.Any.fromFunction0(SelectAll), SelectIndices = js.Any.fromFunction1(SelectIndices), SelectItems = js.Any.fromFunction1(SelectItems), SelectValues = js.Any.fromFunction1(SelectValues), SelectedIndexChanged = SelectedIndexChanged, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelectedIndex = js.Any.fromFunction1(SetSelectedIndex), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), UnselectAll = js.Any.fromFunction0(UnselectAll), UnselectIndices = js.Any.fromFunction1(UnselectIndices), UnselectItems = js.Any.fromFunction1(UnselectItems), UnselectValues = js.Any.fromFunction1(UnselectValues), Validate = js.Any.fromFunction0(Validate), Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientCheckBoxList]
  }
}

