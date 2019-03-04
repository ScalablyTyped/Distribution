package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the RecurrenceTypeEdit.
  */
trait ASPxClientRecurrenceTypeEdit extends ASPxClientCheckListBase {
  /**
    * Gets the selected recurrence type.
    */
  def GetRecurrenceType(): ASPxClientRecurrenceType
  /**
    * Sets the selected recurrence type.
    * @param recurrenceType An ASPxClientRecurrenceType enumeration value.
    */
  def SetRecurrenceType(recurrenceType: ASPxClientRecurrenceType): scala.Unit
}

object ASPxClientRecurrenceTypeEdit {
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
    GetRecurrenceType: js.Function0[ASPxClientRecurrenceType],
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
    SetRecurrenceType: js.Function1[ASPxClientRecurrenceType, scala.Unit],
    SetSelectedIndex: js.Function1[scala.Double, scala.Unit],
    SetSelectedItem: js.Function1[ASPxClientListEditItem, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientRecurrenceTypeEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, Focus = Focus, GetCaption = GetCaption, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetErrorText = GetErrorText, GetHeight = GetHeight, GetInputElement = GetInputElement, GetIsValid = GetIsValid, GetItem = GetItem, GetItemCount = GetItemCount, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetReadOnly = GetReadOnly, GetRecurrenceType = GetRecurrenceType, GetSelectedIndex = GetSelectedIndex, GetSelectedItem = GetSelectedItem, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, GotFocus = GotFocus, InCallback = InCallback, Init = Init, LostFocus = LostFocus, SelectedIndexChanged = SelectedIndexChanged, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetCaption = SetCaption, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetErrorText = SetErrorText, SetHeight = SetHeight, SetIsValid = SetIsValid, SetReadOnly = SetReadOnly, SetRecurrenceType = SetRecurrenceType, SetSelectedIndex = SetSelectedIndex, SetSelectedItem = SetSelectedItem, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, Validate = Validate, Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientRecurrenceTypeEdit]
  }
}

