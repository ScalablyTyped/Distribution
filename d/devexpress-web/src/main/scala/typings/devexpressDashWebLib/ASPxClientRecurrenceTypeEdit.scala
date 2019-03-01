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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("Focus")(Focus)
    __obj.updateDynamic("GetCaption")(GetCaption)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetErrorText")(GetErrorText)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetInputElement")(GetInputElement)
    __obj.updateDynamic("GetIsValid")(GetIsValid)
    __obj.updateDynamic("GetItem")(GetItem)
    __obj.updateDynamic("GetItemCount")(GetItemCount)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetReadOnly")(GetReadOnly)
    __obj.updateDynamic("GetRecurrenceType")(GetRecurrenceType)
    __obj.updateDynamic("GetSelectedIndex")(GetSelectedIndex)
    __obj.updateDynamic("GetSelectedItem")(GetSelectedItem)
    __obj.updateDynamic("GetValue")(GetValue)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("GotFocus")(GotFocus)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("LostFocus")(LostFocus)
    __obj.updateDynamic("SelectedIndexChanged")(SelectedIndexChanged)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetCaption")(SetCaption)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetErrorText")(SetErrorText)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetIsValid")(SetIsValid)
    __obj.updateDynamic("SetReadOnly")(SetReadOnly)
    __obj.updateDynamic("SetRecurrenceType")(SetRecurrenceType)
    __obj.updateDynamic("SetSelectedIndex")(SetSelectedIndex)
    __obj.updateDynamic("SetSelectedItem")(SetSelectedItem)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("Validate")(Validate)
    __obj.updateDynamic("Validation")(Validation)
    __obj.updateDynamic("ValueChanged")(ValueChanged)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientRecurrenceTypeEdit]
  }
}

