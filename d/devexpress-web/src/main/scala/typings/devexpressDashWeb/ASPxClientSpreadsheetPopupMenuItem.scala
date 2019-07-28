package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an individual item of the Spreadsheet's context menu.
  */
trait ASPxClientSpreadsheetPopupMenuItem extends js.Object {
  /**
    * Gets or sets a value that specifies whether the current menu item starts a group.
    * Value: true if the current menu item starts a group; otherwise, false.
    */
  var beginGroup: Boolean
  /**
    * Gets or sets a value that indicates whether the menu item is enabled, allowing the item to respond to end-user interactions.
    * Value: true if the item is enabled; otherwise, false.
    */
  var enabled: Boolean
  /**
    * Gets or sets the CSS class name defining the menu item's image.
    * Value: A string value specifying the class name.
    */
  var imageClassName: String
  /**
    * Gets or sets the URL of the menu item's image.
    * Value: A string value that specifies the location of an image.
    */
  var imageUrl: String
  /**
    * Gets or sets the unique identifier name for the current menu item.
    * Value: A string value that specifies the item's unique identifier name.
    */
  var name: String
  /**
    * Gets or sets an URL which defines the navigation location.
    * Value: A string value which represents an URL where the client web browser will navigate.
    */
  var navigateUrl: String
  /**
    * Gets the immediate parent menu item to which the current menu item belongs.
    * Value: A ASPxClientSpreadsheetPopupMenuItem object representing the menu item's immediate parent.
    */
  var parent: ASPxClientSpreadsheetPopupMenuItem
  /**
    * Gets or sets the window or frame at which to target the contents of the URL associated with the current menu item.
    * Value: A string which identifies the window or frame at which to target the URL content.
    */
  var target: String
  /**
    * Gets or sets the text content of the current menu item.
    * Value: A string value that specifies the text content of the menu item.
    */
  var text: String
  /**
    * Gets or sets the current menu item's tooltip text.
    * Value: A string which specifies the text content of the current menu item's tooltip.
    */
  var tooltip: String
  /**
    * Returns the menu item's sub-item with the specified index.
    * @param index An integer value specifying the index of the sub-item within a collection of the current menu item's submenu items.
    */
  def GetItem(index: Double): ASPxClientSpreadsheetPopupMenuItem
  /**
    * Returns the menu item's sub-item with the specified name property value.
    * @param name A string value specifying the name property value of the sub-item to find.
    */
  def GetItemByName(name: String): ASPxClientSpreadsheetPopupMenuItem
  /**
    * Returns the total number of the menu item's child items (submenu items).
    */
  def GetItemCount(): Double
  /**
    * Gets a collection that contains the submenu items of the current menu item.
    */
  def GetSubItems(): ASPxClientSpreadsheetPopupMenuItemCollection
}

object ASPxClientSpreadsheetPopupMenuItem {
  @scala.inline
  def apply(
    GetItem: Double => ASPxClientSpreadsheetPopupMenuItem,
    GetItemByName: String => ASPxClientSpreadsheetPopupMenuItem,
    GetItemCount: () => Double,
    GetSubItems: () => ASPxClientSpreadsheetPopupMenuItemCollection,
    beginGroup: Boolean,
    enabled: Boolean,
    imageClassName: String,
    imageUrl: String,
    name: String,
    navigateUrl: String,
    parent: ASPxClientSpreadsheetPopupMenuItem,
    target: String,
    text: String,
    tooltip: String
  ): ASPxClientSpreadsheetPopupMenuItem = {
    val __obj = js.Dynamic.literal(GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetSubItems = js.Any.fromFunction0(GetSubItems), beginGroup = beginGroup, enabled = enabled, imageClassName = imageClassName, imageUrl = imageUrl, name = name, navigateUrl = navigateUrl, parent = parent, target = target, text = text, tooltip = tooltip)
  
    __obj.asInstanceOf[ASPxClientSpreadsheetPopupMenuItem]
  }
}

