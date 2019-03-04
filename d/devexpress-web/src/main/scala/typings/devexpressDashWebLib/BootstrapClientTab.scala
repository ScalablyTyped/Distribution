package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of a tab control's BootstrapTabPage object.
  */
trait BootstrapClientTab extends ASPxClientTab {
  /**
    * Gets the CSS class of an icon displayed by the tab when it is active.
    */
  def GetActiveIconCssClass(): java.lang.String
  /**
    * Gets the CSS class of the icon displayed within the tab badge.
    */
  def GetBadgeIconCssClass(): java.lang.String
  /**
    * Gets the text displayed within the tab badge.
    */
  def GetBadgeText(): java.lang.String
  /**
    * Gets the CSS class of the icon displayed by the tab.
    */
  def GetIconCssClass(): java.lang.String
  /**
    * Sets the CSS class of an icon displayed by the tab when it is active.
    * @param cssClass A String containing the name of a CSS class.
    */
  def SetActiveIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
    * Sets the CSS class of the icon displayed within the tab badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
    * Sets the text displayed within the tab badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: java.lang.String): scala.Unit
  /**
    * Sets the CSS class of the icon displayed by the tab.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: java.lang.String): scala.Unit
}

object BootstrapClientTab {
  @scala.inline
  def apply(
    GetActiveIconCssClass: js.Function0[java.lang.String],
    GetActiveImageUrl: js.Function0[java.lang.String],
    GetBadgeIconCssClass: js.Function0[java.lang.String],
    GetBadgeText: js.Function0[java.lang.String],
    GetEnabled: js.Function0[scala.Boolean],
    GetIconCssClass: js.Function0[java.lang.String],
    GetImageUrl: js.Function0[java.lang.String],
    GetNavigateUrl: js.Function0[java.lang.String],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetActiveIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetActiveImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetBadgeIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetBadgeText: js.Function1[java.lang.String, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetNavigateUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    index: scala.Double,
    name: java.lang.String,
    tabControl: ASPxClientTabControlBase
  ): BootstrapClientTab = {
    val __obj = js.Dynamic.literal(GetActiveIconCssClass = GetActiveIconCssClass, GetActiveImageUrl = GetActiveImageUrl, GetBadgeIconCssClass = GetBadgeIconCssClass, GetBadgeText = GetBadgeText, GetEnabled = GetEnabled, GetIconCssClass = GetIconCssClass, GetImageUrl = GetImageUrl, GetNavigateUrl = GetNavigateUrl, GetText = GetText, GetVisible = GetVisible, SetActiveIconCssClass = SetActiveIconCssClass, SetActiveImageUrl = SetActiveImageUrl, SetBadgeIconCssClass = SetBadgeIconCssClass, SetBadgeText = SetBadgeText, SetEnabled = SetEnabled, SetIconCssClass = SetIconCssClass, SetImageUrl = SetImageUrl, SetNavigateUrl = SetNavigateUrl, SetText = SetText, SetVisible = SetVisible, index = index, name = name, tabControl = tabControl)
  
    __obj.asInstanceOf[BootstrapClientTab]
  }
}

