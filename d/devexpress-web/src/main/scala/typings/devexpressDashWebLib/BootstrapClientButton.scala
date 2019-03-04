package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapButton control.
  */
trait BootstrapClientButton extends ASPxClientButton {
  /**
    * Gets the CSS class of the icon displayed within the button badge.
    */
  def GetBadgeIconCssClass(): java.lang.String
  /**
    * Gets the text displayed within the button badge.
    */
  def GetBadgeText(): java.lang.String
  /**
    * Sets the CSS class of the icon displayed within the button badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
    * Sets the text displayed within the button badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: java.lang.String): scala.Unit
}

object BootstrapClientButton {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]],
    Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]],
    DoClick: js.Function0[scala.Unit],
    Focus: js.Function0[scala.Unit],
    GetBadgeIconCssClass: js.Function0[java.lang.String],
    GetBadgeText: js.Function0[java.lang.String],
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
    SetBadgeIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetBadgeText: js.Function1[java.lang.String, scala.Unit],
    SetChecked: js.Function1[scala.Boolean, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): BootstrapClientButton = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, CheckedChanged = CheckedChanged, Click = Click, DoClick = DoClick, Focus = Focus, GetBadgeIconCssClass = GetBadgeIconCssClass, GetBadgeText = GetBadgeText, GetChecked = GetChecked, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetHeight = GetHeight, GetImageUrl = GetImageUrl, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetText = GetText, GetVisible = GetVisible, GetWidth = GetWidth, GotFocus = GotFocus, InCallback = InCallback, Init = Init, LostFocus = LostFocus, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetBadgeIconCssClass = SetBadgeIconCssClass, SetBadgeText = SetBadgeText, SetChecked = SetChecked, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetHeight = SetHeight, SetImageUrl = SetImageUrl, SetText = SetText, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[BootstrapClientButton]
  }
}

