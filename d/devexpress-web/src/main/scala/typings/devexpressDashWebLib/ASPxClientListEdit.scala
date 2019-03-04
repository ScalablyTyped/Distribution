package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base for client editor objects that display a list of items.
  */
trait ASPxClientListEdit extends ASPxClientEdit {
  /**
    * Occurs on the client side after a different item in the list has been selected (focus has been moved from one item to another).
    */
  var SelectedIndexChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientListEdit]]
  /**
    * Returns the index of the selected item within the list editor.
    */
  def GetSelectedIndex(): scala.Double
  /**
    * Returns the list editor's selected item.
    */
  def GetSelectedItem(): ASPxClientListEditItem
  /**
    * Sets the list editor's selected item specified by its index.
    * @param index An integer value specifying the zero-based index of the item to select.
    */
  def SetSelectedIndex(index: scala.Double): scala.Unit
  /**
    * Sets the list editor's selected item.
    * @param item An ASPxClientListEditItem object that specifies the item to select.
    */
  def SetSelectedItem(item: ASPxClientListEditItem): scala.Unit
}

object ASPxClientListEdit {
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
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetReadOnly: js.Function0[scala.Boolean],
    GetSelectedIndex: js.Function0[scala.Double],
    GetSelectedItem: js.Function0[ASPxClientListEditItem],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectedIndexChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientListEdit]],
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
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientListEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, Focus = Focus, GetCaption = GetCaption, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetErrorText = GetErrorText, GetHeight = GetHeight, GetInputElement = GetInputElement, GetIsValid = GetIsValid, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetReadOnly = GetReadOnly, GetSelectedIndex = GetSelectedIndex, GetSelectedItem = GetSelectedItem, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, GotFocus = GotFocus, InCallback = InCallback, Init = Init, LostFocus = LostFocus, SelectedIndexChanged = SelectedIndexChanged, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetCaption = SetCaption, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetErrorText = SetErrorText, SetHeight = SetHeight, SetIsValid = SetIsValid, SetReadOnly = SetReadOnly, SetSelectedIndex = SetSelectedIndex, SetSelectedItem = SetSelectedItem, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, Validate = Validate, Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientListEdit]
  }
}

