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
    AdjustControl: js.Function0[scala.Unit],
    Focus: js.Function0[scala.Unit],
    GetCaption: js.Function0[java.lang.String],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetErrorText: js.Function0[java.lang.String],
    GetHeight: js.Function0[scala.Double],
    GetInputElement: js.Function0[js.Object],
    GetIsValid: js.Function0[scala.Boolean],
    GetItem: js.Function1[scala.Double, ASPxClientListEditItem],
    GetItemCount: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetReadOnly: js.Function0[scala.Boolean],
    GetSelectedIndex: js.Function0[scala.Double],
    GetSelectedIndices: js.Function0[js.Array[scala.Double]],
    GetSelectedItem: js.Function0[ASPxClientListEditItem],
    GetSelectedItems: js.Function0[js.Array[ASPxClientListEditItem]],
    GetSelectedValues: js.Function0[js.Array[js.Object]],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectAll: js.Function0[scala.Unit],
    SelectIndices: js.Function1[js.Array[scala.Double], scala.Unit],
    SelectItems: js.Function1[js.Array[ASPxClientListEditItem], scala.Unit],
    SelectValues: js.Function1[js.Array[js.Object], scala.Unit],
    SelectedIndexChanged: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetErrorText: js.Function1[java.lang.String, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetIsValid: js.Function1[scala.Boolean, scala.Unit],
    SetReadOnly: js.Function1[scala.Boolean, scala.Unit],
    SetSelectedIndex: js.Function1[scala.Double, scala.Unit],
    SetSelectedItem: js.Function1[ASPxClientListEditItem, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    UnselectAll: js.Function0[scala.Unit],
    UnselectIndices: js.Function1[js.Array[scala.Double], scala.Unit],
    UnselectItems: js.Function1[js.Array[ASPxClientListEditItem], scala.Unit],
    UnselectValues: js.Function1[js.Array[js.Object], scala.Unit],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientCheckBoxList = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, Focus = Focus, GetCaption = GetCaption, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetErrorText = GetErrorText, GetHeight = GetHeight, GetInputElement = GetInputElement, GetIsValid = GetIsValid, GetItem = GetItem, GetItemCount = GetItemCount, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetReadOnly = GetReadOnly, GetSelectedIndex = GetSelectedIndex, GetSelectedIndices = GetSelectedIndices, GetSelectedItem = GetSelectedItem, GetSelectedItems = GetSelectedItems, GetSelectedValues = GetSelectedValues, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, GotFocus = GotFocus, InCallback = InCallback, Init = Init, LostFocus = LostFocus, SelectAll = SelectAll, SelectIndices = SelectIndices, SelectItems = SelectItems, SelectValues = SelectValues, SelectedIndexChanged = SelectedIndexChanged, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetCaption = SetCaption, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetErrorText = SetErrorText, SetHeight = SetHeight, SetIsValid = SetIsValid, SetReadOnly = SetReadOnly, SetSelectedIndex = SetSelectedIndex, SetSelectedItem = SetSelectedItem, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, UnselectAll = UnselectAll, UnselectIndices = UnselectIndices, UnselectItems = UnselectItems, UnselectValues = UnselectValues, Validate = Validate, Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientCheckBoxList]
  }
}

