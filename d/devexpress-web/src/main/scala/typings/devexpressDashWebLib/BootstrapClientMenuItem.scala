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
    GetBadgeIconCssClass: () => java.lang.String,
    GetBadgeText: () => java.lang.String,
    GetChecked: () => scala.Boolean,
    GetEnabled: () => scala.Boolean,
    GetIconCssClass: () => java.lang.String,
    GetImageUrl: () => java.lang.String,
    GetItem: scala.Double => BootstrapClientMenuItem,
    GetItemByName: java.lang.String => BootstrapClientMenuItem,
    GetItemCount: () => scala.Double,
    GetNavigateUrl: () => java.lang.String,
    GetText: () => java.lang.String,
    GetVisible: () => scala.Boolean,
    SetBadgeIconCssClass: java.lang.String => scala.Unit,
    SetBadgeText: java.lang.String => scala.Unit,
    SetChecked: scala.Boolean => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetIconCssClass: java.lang.String => scala.Unit,
    SetImageUrl: java.lang.String => scala.Unit,
    SetNavigateUrl: java.lang.String => scala.Unit,
    SetText: java.lang.String => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    index: scala.Double,
    indexPath: java.lang.String,
    menu: ASPxClientMenuBase,
    name: java.lang.String,
    parent: BootstrapClientMenuItem
  ): BootstrapClientMenuItem = {
    val __obj = js.Dynamic.literal(GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetChecked = js.Any.fromFunction0(GetChecked), GetEnabled = js.Any.fromFunction0(GetEnabled), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetChecked = js.Any.fromFunction1(SetChecked), SetEnabled = js.Any.fromFunction1(SetEnabled), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index, indexPath = indexPath, menu = menu, name = name, parent = parent)
  
    __obj.asInstanceOf[BootstrapClientMenuItem]
  }
}

