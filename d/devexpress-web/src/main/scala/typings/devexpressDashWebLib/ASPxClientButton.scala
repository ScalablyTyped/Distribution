package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxButton control.
  */
trait ASPxClientButton extends ASPxClientControl {
  /**
    * Occurs on the client side when the button's checked state is changed.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]]
  /**
    * Occurs on the client side after a button is clicked.
    */
  var Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]]
  /**
    * Fires on the client side when the button receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]
  /**
    * Fires on the client side when the button loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]
  /**
    * Simulates a mouse click action on the button control.
    */
  def DoClick(): scala.Unit
  /**
    * Sets input focus to the button.
    */
  def Focus(): scala.Unit
  /**
    * Returns a value indicating whether the button is checked.
    */
  def GetChecked(): scala.Boolean
  /**
    * Returns a value indicating whether the button is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Returns the URL pointing to the image displayed within the button.
    */
  def GetImageUrl(): java.lang.String
  /**
    * Returns the text displayed within the button.
    */
  def GetText(): java.lang.String
  /**
    * Sets a value that specifies the button's checked status.
    * @param value true if the button is checked; otherwise, false.
    */
  def SetChecked(value: scala.Boolean): scala.Unit
  /**
    * Sets a value specifying whether the button is enabled.
    * @param value true to enable the button; false to disable it.
    */
  def SetEnabled(value: scala.Boolean): scala.Unit
  /**
    * Sets the URL pointing to the image displayed within the button.
    * @param value A string value that is the URL to the image displayed within the button.
    */
  def SetImageUrl(value: java.lang.String): scala.Unit
  /**
    * Sets the text to be displayed within the button.
    * @param value A string value specifying the text to be displayed within the button.
    */
  def SetText(value: java.lang.String): scala.Unit
}

object ASPxClientButton {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]],
    Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]],
    DoClick: js.Function0[scala.Unit],
    Focus: js.Function0[scala.Unit],
    GetChecked: js.Function0[scala.Boolean],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetImageUrl: js.Function0[java.lang.String],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetChecked: js.Function1[scala.Boolean, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientButton = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, CheckedChanged = CheckedChanged, Click = Click, DoClick = DoClick, Focus = Focus, GetChecked = GetChecked, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetHeight = GetHeight, GetImageUrl = GetImageUrl, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetText = GetText, GetVisible = GetVisible, GetWidth = GetWidth, GotFocus = GotFocus, InCallback = InCallback, Init = Init, LostFocus = LostFocus, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetChecked = SetChecked, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetHeight = SetHeight, SetImageUrl = SetImageUrl, SetText = SetText, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientButton]
  }
}

