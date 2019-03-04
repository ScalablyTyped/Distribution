package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapHyperLink control.
  */
trait BootstrapClientHyperLink extends ASPxClientHyperLink {
  /**
    * Gets the CSS class of the icon displayed within the hyperlink badge.
    */
  def GetBadgeIconCssClass(): java.lang.String
  /**
    * Gets the text displayed within the hyperlink badge.
    */
  def GetBadgeText(): java.lang.String
  /**
    * Sets the CSS class of the icon displayed within the hyperlink badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
    * Sets the text displayed within the hyperlink badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: java.lang.String): scala.Unit
}

object BootstrapClientHyperLink {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    Click: ASPxClientEvent[ASPxClientEditEventHandler[ASPxClientStaticEdit]],
    GetBadgeIconCssClass: js.Function0[java.lang.String],
    GetBadgeText: js.Function0[java.lang.String],
    GetCaption: js.Function0[java.lang.String],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetNavigateUrl: js.Function0[java.lang.String],
    GetParentControl: js.Function0[js.Object],
    GetText: js.Function0[java.lang.String],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetBadgeIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetBadgeText: js.Function1[java.lang.String, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetNavigateUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): BootstrapClientHyperLink = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, Click = Click, GetBadgeIconCssClass = GetBadgeIconCssClass, GetBadgeText = GetBadgeText, GetCaption = GetCaption, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetHeight = GetHeight, GetMainElement = GetMainElement, GetNavigateUrl = GetNavigateUrl, GetParentControl = GetParentControl, GetText = GetText, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetBadgeIconCssClass = SetBadgeIconCssClass, SetBadgeText = SetBadgeText, SetCaption = SetCaption, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetHeight = SetHeight, SetNavigateUrl = SetNavigateUrl, SetText = SetText, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[BootstrapClientHyperLink]
  }
}

