package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the menu's MenuItem object.
  */
trait ASPxClientMenuItem extends js.Object {
  /**
    * Gets the item's index within the parent's collection of items.
    * Value: An integer value representing the item's zero-based index within the Items collection of the parent object (a menu or item) to which the item belongs.
    */
  var index: Double
  /**
    * For internal use only.
    */
  var indexPath: String
  /**
    * Gets the menu object to which the current item belongs.
    * Value: An ASPxClientMenuBase object representing the menu to which the item belongs.
    */
  var menu: ASPxClientMenuBase
  /**
    * Gets the name that uniquely identifies the menu item.
    * Value: A string value that represents the value assigned to the item's Name property.
    */
  var name: String
  /**
    * Gets the immediate parent item to which the current item belongs.
    * Value: An ASPxClientMenuItem object representing the item's immediate parent.
    */
  var parent: ASPxClientMenuItem
  /**
    * Indicates whether the menu item is checked.
    */
  def GetChecked(): Boolean
  /**
    * Returns a value specifying whether a menu item is enabled.
    */
  def GetEnabled(): Boolean
  /**
    * Returns the URL pointing to the image displayed within the menu item.
    */
  def GetImageUrl(): String
  /**
    * Returns the current menu item's immediate subitem specified by its index.
    * @param index An integer value specifying the zero-based index of the submenu item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientMenuItem
  /**
    * Returns the current menu item's subitem specified by its name.
    * @param name A string value specifying the name of the menu item.
    */
  def GetItemByName(name: String): ASPxClientMenuItem
  /**
    * Returns the number of the current menu item's immediate child items.
    */
  def GetItemCount(): Double
  /**
    * Gets a URL which defines the navigation location for the menu item.
    */
  def GetNavigateUrl(): String
  /**
    * Returns text displayed within the menu item.
    */
  def GetText(): String
  /**
    * Returns a value specifying whether a menu item is displayed.
    */
  def GetVisible(): Boolean
  /**
    * Specifies whether the menu item is checked.
    * @param value true if the menu item is checked; otherwise, false.
    */
  def SetChecked(value: Boolean): Unit
  /**
    * Specifies whether the menu item is enabled.
    * @param value true to enable the menu item; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit
  /**
    * Sets the URL which points to the image displayed within the menu item.
    * @param value A string value specifying the URL to the image displayed within the menu item.
    */
  def SetImageUrl(value: String): Unit
  /**
    * Specifies a URL which defines the navigation location for the menu item.
    * @param value A string value which specifies a URL to where the client web browser will navigate when the menu item is clicked.
    */
  def SetNavigateUrl(value: String): Unit
  /**
    * Sets the text to be displayed within the menu item.
    * @param value A string value specifying the text to be displayed within the menu item.
    */
  def SetText(value: String): Unit
  /**
    * Specifies the menu item's visibility.
    * @param value true if the menu item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
}

object ASPxClientMenuItem {
  @scala.inline
  def apply(
    GetChecked: () => Boolean,
    GetEnabled: () => Boolean,
    GetImageUrl: () => String,
    GetItem: Double => ASPxClientMenuItem,
    GetItemByName: String => ASPxClientMenuItem,
    GetItemCount: () => Double,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetChecked: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    index: Double,
    indexPath: String,
    menu: ASPxClientMenuBase,
    name: String,
    parent: ASPxClientMenuItem
  ): ASPxClientMenuItem = {
    val __obj = js.Dynamic.literal(GetChecked = js.Any.fromFunction0(GetChecked), GetEnabled = js.Any.fromFunction0(GetEnabled), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetChecked = js.Any.fromFunction1(SetChecked), SetEnabled = js.Any.fromFunction1(SetEnabled), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index, indexPath = indexPath, menu = menu, name = name, parent = parent)
  
    __obj.asInstanceOf[ASPxClientMenuItem]
  }
}

