package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the menu's MenuItem object.
  */
@JSGlobal("ASPxClientMenuItem")
@js.native
class ASPxClientMenuItem () extends js.Object {
  /**
    * Gets the item's index within the parent's collection of items.
    */
  var index: Double = js.native
  /**
    * For internal use only.
    */
  var indexPath: String = js.native
  /**
    * Gets the menu object to which the current item belongs.
    */
  var menu: ASPxClientMenuBase = js.native
  /**
    * Gets the name that uniquely identifies the menu item.
    */
  var name: String = js.native
  /**
    * Gets the immediate parent item to which the current item belongs.
    */
  var parent: ASPxClientMenuItem = js.native
  /**
    * Indicates whether the menu item is checked.
    */
  def GetChecked(): Boolean = js.native
  /**
    * Returns a value specifying whether a menu item is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the URL pointing to the image displayed within the menu item.
    */
  def GetImageUrl(): String = js.native
  /**
    * Returns the current menu item's immediate subitem specified by its index. An ASPxClientMenuItem object representing the menu item's immediate subitem located at the specified index within the menu item's MenuItem.Items collection.
    * @param index An integer value specifying the zero-based index of the submenu item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientMenuItem = js.native
  /**
    * Returns the current menu item's subitem specified by its name. An ASPxClientMenuItem object that represents the current menu item's subitem with the specified name.
    * @param name A string value specifying the name of the menu item.
    */
  def GetItemByName(name: String): ASPxClientMenuItem = js.native
  /**
    * Returns the number of the current menu item's immediate child items.
    */
  def GetItemCount(): Double = js.native
  /**
    * Gets a URL which defines the navigation location for the menu item.
    */
  def GetNavigateUrl(): String = js.native
  /**
    * Returns text displayed within the menu item.
    */
  def GetText(): String = js.native
  /**
    * Returns a value specifying whether a menu item is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Specifies whether the menu item is checked.
    * @param value true if the menu item is checked; otherwise, false.
    */
  def SetChecked(value: Boolean): Unit = js.native
  /**
    * Specifies whether the menu item is enabled.
    * @param value true to enable the menu item; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Sets the URL which points to the image displayed within the menu item.
    * @param value A string value specifying the URL to the image displayed within the menu item.
    */
  def SetImageUrl(value: String): Unit = js.native
  /**
    * Specifies a URL which defines the navigation location for the menu item.
    * @param value A string value which specifies a URL to where the client web browser will navigate when the menu item is clicked.
    */
  def SetNavigateUrl(value: String): Unit = js.native
  /**
    * Sets the text to be displayed within the menu item.
    * @param value A string value specifying the text to be displayed within the menu item.
    */
  def SetText(value: String): Unit = js.native
  /**
    * Specifies the menu item's visibility.
    * @param value true if the menu item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

