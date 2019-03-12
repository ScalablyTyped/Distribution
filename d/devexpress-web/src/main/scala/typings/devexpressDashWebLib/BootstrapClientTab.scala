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
    GetActiveIconCssClass: () => java.lang.String,
    GetActiveImageUrl: () => java.lang.String,
    GetBadgeIconCssClass: () => java.lang.String,
    GetBadgeText: () => java.lang.String,
    GetEnabled: () => scala.Boolean,
    GetIconCssClass: () => java.lang.String,
    GetImageUrl: () => java.lang.String,
    GetNavigateUrl: () => java.lang.String,
    GetText: () => java.lang.String,
    GetVisible: () => scala.Boolean,
    SetActiveIconCssClass: java.lang.String => scala.Unit,
    SetActiveImageUrl: java.lang.String => scala.Unit,
    SetBadgeIconCssClass: java.lang.String => scala.Unit,
    SetBadgeText: java.lang.String => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetIconCssClass: java.lang.String => scala.Unit,
    SetImageUrl: java.lang.String => scala.Unit,
    SetNavigateUrl: java.lang.String => scala.Unit,
    SetText: java.lang.String => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    index: scala.Double,
    name: java.lang.String,
    tabControl: ASPxClientTabControlBase
  ): BootstrapClientTab = {
    val __obj = js.Dynamic.literal(GetActiveIconCssClass = js.Any.fromFunction0(GetActiveIconCssClass), GetActiveImageUrl = js.Any.fromFunction0(GetActiveImageUrl), GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetEnabled = js.Any.fromFunction0(GetEnabled), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetActiveIconCssClass = js.Any.fromFunction1(SetActiveIconCssClass), SetActiveImageUrl = js.Any.fromFunction1(SetActiveImageUrl), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetEnabled = js.Any.fromFunction1(SetEnabled), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index, name = name, tabControl = tabControl)
  
    __obj.asInstanceOf[BootstrapClientTab]
  }
}

