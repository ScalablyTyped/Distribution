package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base object for all the editors that support validation.
  */
trait ASPxClientEdit extends ASPxClientEditBase {
  /**
    * Fires on the client side when the editor receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]
  /**
    * Fires on the client side when the editor loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]
  /**
    * Allows you to specify whether the value entered into the editor is valid, and whether the editor is allowed to lose focus.
    */
  var Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]]
  /**
    * Fires after the editor's value has been changed by end-user interactions.
    */
  var ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]]
  /**
    * Sets input focus to the editor.
    */
  def Focus(): scala.Unit
  /**
    * Gets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  def GetErrorText(): java.lang.String
  /**
    * Returns an HTML element that represents the control's input element.
    */
  def GetInputElement(): js.Object
  /**
    * Gets a value that indicates whether the editor's value passes validation.
    */
  def GetIsValid(): scala.Boolean
  /**
    * Returns a value indicating whether the editor's state is read-only on the client-side.
    */
  def GetReadOnly(): scala.Boolean
  /**
    * Sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    * @param errorText A string value representing the error text.
    */
  def SetErrorText(errorText: java.lang.String): scala.Unit
  /**
    * Sets a value that specifies whether the editor's value is valid.
    * @param isValid True if the editor's value is valid; otherwise, False.
    */
  def SetIsValid(isValid: scala.Boolean): scala.Unit
  /**
    * Specifies whether the control's state is read-only on the client side.
    * @param readOnly true, to make the control read-only on the client side; otherwise, false.
    */
  def SetReadOnly(readOnly: scala.Boolean): scala.Unit
  /**
    * Performs the editor's validation.
    */
  def Validate(): scala.Unit
}

object ASPxClientEdit {
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
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetErrorText: js.Function1[java.lang.String, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetIsValid: js.Function1[scala.Boolean, scala.Unit],
    SetReadOnly: js.Function1[scala.Boolean, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, Focus = Focus, GetCaption = GetCaption, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetErrorText = GetErrorText, GetHeight = GetHeight, GetInputElement = GetInputElement, GetIsValid = GetIsValid, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetReadOnly = GetReadOnly, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, GotFocus = GotFocus, InCallback = InCallback, Init = Init, LostFocus = LostFocus, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetCaption = SetCaption, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetErrorText = SetErrorText, SetHeight = SetHeight, SetIsValid = SetIsValid, SetReadOnly = SetReadOnly, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, Validate = Validate, Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientEdit]
  }
}

