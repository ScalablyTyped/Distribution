package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the menu's BootstrapMenuItem object.
  */
trait BootstrapClientMenuItem extends ASPxClientMenuItem {
  /**
    * Gets the immediate parent item to which the current item belongs.
    * Value: A BootstrapClientMenuItem object representing the item's immediate parent.
    */
  @JSName("parent")
  var parent_BootstrapClientMenuItem: BootstrapClientMenuItem
  /**
    * Gets the CSS class of the icon displayed within the menu item badge.
    */
  def GetBadgeIconCssClass(): java.lang.String
  /**
    * Gets the text displayed within the menu item badge.
    */
  def GetBadgeText(): java.lang.String
  /**
    * Gets the CSS class of the icon displayed by the menu item.
    */
  def GetIconCssClass(): java.lang.String
  /**
    * Sets the CSS class of the icon displayed within the menu item badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
    * Sets the text displayed within the menu item badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: java.lang.String): scala.Unit
  /**
    * Sets the CSS class of the icon displayed by the menu item.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: java.lang.String): scala.Unit
}

object BootstrapClientMenuItem {
  @scala.inline
  def apply(
    GetBadgeIconCssClass: js.Function0[java.lang.String],
    GetBadgeText: js.Function0[java.lang.String],
    GetChecked: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetIconCssClass: js.Function0[java.lang.String],
    GetImageUrl: js.Function0[java.lang.String],
    GetItem: js.Function1[scala.Double, BootstrapClientMenuItem],
    GetItemByName: js.Function1[java.lang.String, BootstrapClientMenuItem],
    GetItemCount: js.Function0[scala.Double],
    GetNavigateUrl: js.Function0[java.lang.String],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetBadgeIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetBadgeText: js.Function1[java.lang.String, scala.Unit],
    SetChecked: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetNavigateUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    index: scala.Double,
    indexPath: java.lang.String,
    menu: ASPxClientMenuBase,
    name: java.lang.String,
    parent: BootstrapClientMenuItem
  ): BootstrapClientMenuItem = {
    val __obj = js.Dynamic.literal(GetBadgeIconCssClass = GetBadgeIconCssClass, GetBadgeText = GetBadgeText, GetChecked = GetChecked, GetEnabled = GetEnabled, GetIconCssClass = GetIconCssClass, GetImageUrl = GetImageUrl, GetItem = GetItem, GetItemByName = GetItemByName, GetItemCount = GetItemCount, GetNavigateUrl = GetNavigateUrl, GetText = GetText, GetVisible = GetVisible, SetBadgeIconCssClass = SetBadgeIconCssClass, SetBadgeText = SetBadgeText, SetChecked = SetChecked, SetEnabled = SetEnabled, SetIconCssClass = SetIconCssClass, SetImageUrl = SetImageUrl, SetNavigateUrl = SetNavigateUrl, SetText = SetText, SetVisible = SetVisible, index = index, indexPath = indexPath, menu = menu, name = name, parent = parent)
  
    __obj.asInstanceOf[BootstrapClientMenuItem]
  }
}

