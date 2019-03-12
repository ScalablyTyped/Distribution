package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an individual item of the Rich Edit's context menu.
  */
trait ASPxClientRichEditPopupMenuItem extends js.Object {
  /**
    * Gets or sets a value that specifies whether the current menu item starts a group.
    * Value: true if the current menu item starts a group; otherwise, false.
    */
  var beginGroup: scala.Boolean
  /**
    * Gets or sets a value that indicates whether the menu item is enabled, allowing the item to respond to end-user interactions.
    * Value: true if the item is enabled; otherwise, false.
    */
  var enabled: scala.Boolean
  /**
    * Gets or sets the CSS class name defining the menu item's image.
    * Value: A string value specifying the class name.
    */
  var imageClassName: java.lang.String
  /**
    * Gets or sets the URL of the menu item's image.
    * Value: A string value that specifies the location of an image.
    */
  var imageUrl: java.lang.String
  /**
    * Gets or sets the unique identifier name for the current menu item.
    * Value: A string value that specifies the item's unique identifier name.
    */
  var name: java.lang.String
  /**
    * Gets or sets a URL which defines the navigation location.
    * Value: A string value which represents a URL where the client web browser will navigate.
    */
  var navigateUrl: java.lang.String
  /**
    * Gets the immediate parent menu item to which the current menu item belongs.
    * Value: A ASPxClientRichEditPopupMenuItem object representing the menu item's immediate parent.
    */
  var parent: ASPxClientRichEditPopupMenuItem
  /**
    * Gets or sets the window or frame at which to target the contents of the URL associated with the current menu item.
    * Value: A string which identifies the window or frame at which to target the URL content.
    */
  var target: java.lang.String
  /**
    * Gets or sets the text content of the current menu item.
    * Value: A string value that specifies the text content of the menu item.
    */
  var text: java.lang.String
  /**
    * Gets or sets the current menu item's tooltip text.
    * Value: A string which specifies the text content of the current menu item's tooltip.
    */
  var tooltip: java.lang.String
  /**
    * Returns the menu item's sub-item with the specified index.
    * @param index An integer value specifying the index of the sub-item within a collection of the current menu item's submenu items.
    */
  def GetItem(index: scala.Double): ASPxClientRichEditPopupMenuItem
  /**
    * Returns the menu item's sub-item with the specified name property value.
    * @param name A string value specifying the name property value of the sub-item to find.
    */
  def GetItemByName(name: java.lang.String): ASPxClientRichEditPopupMenuItem
  /**
    * Returns the total number of the menu item's child items (submenu items).
    */
  def GetItemCount(): scala.Double
  /**
    * Gets a collection that contains the submenu items of the current menu item.
    */
  def GetSubItems(): ASPxClientRichEditPopupMenuItemCollection
}

object ASPxClientRichEditPopupMenuItem {
  @scala.inline
  def apply(
    GetItem: scala.Double => ASPxClientRichEditPopupMenuItem,
    GetItemByName: java.lang.String => ASPxClientRichEditPopupMenuItem,
    GetItemCount: () => scala.Double,
    GetSubItems: () => ASPxClientRichEditPopupMenuItemCollection,
    beginGroup: scala.Boolean,
    enabled: scala.Boolean,
    imageClassName: java.lang.String,
    imageUrl: java.lang.String,
    name: java.lang.String,
    navigateUrl: java.lang.String,
    parent: ASPxClientRichEditPopupMenuItem,
    target: java.lang.String,
    text: java.lang.String,
    tooltip: java.lang.String
  ): ASPxClientRichEditPopupMenuItem = {
    val __obj = js.Dynamic.literal(GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetSubItems = js.Any.fromFunction0(GetSubItems), beginGroup = beginGroup, enabled = enabled, imageClassName = imageClassName, imageUrl = imageUrl, name = name, navigateUrl = navigateUrl, parent = parent, target = target, text = text, tooltip = tooltip)
  
    __obj.asInstanceOf[ASPxClientRichEditPopupMenuItem]
  }
}

