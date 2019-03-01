package typings
package devexpressDashWebLib

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
    * Gets or sets an URL which defines the navigation location.
    * Value: A string value which represents an URL where the client web browser will navigate.
    */
  var navigateUrl: java.lang.String
  /**
    * Gets the immediate parent menu item to which the current menu item belongs.
    * Value: A ASPxClientSpreadsheetPopupMenuItem object representing the menu item's immediate parent.
    */
  var parent: ASPxClientSpreadsheetPopupMenuItem
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
  def GetItem(index: scala.Double): ASPxClientSpreadsheetPopupMenuItem
  /**
    * Returns the menu item's sub-item with the specified name property value.
    * @param name A string value specifying the name property value of the sub-item to find.
    */
  def GetItemByName(name: java.lang.String): ASPxClientSpreadsheetPopupMenuItem
  /**
    * Returns the total number of the menu item's child items (submenu items).
    */
  def GetItemCount(): scala.Double
  /**
    * Gets a collection that contains the submenu items of the current menu item.
    */
  def GetSubItems(): ASPxClientSpreadsheetPopupMenuItemCollection
}

object ASPxClientSpreadsheetPopupMenuItem {
  @scala.inline
  def apply(
    GetItem: js.Function1[scala.Double, ASPxClientSpreadsheetPopupMenuItem],
    GetItemByName: js.Function1[java.lang.String, ASPxClientSpreadsheetPopupMenuItem],
    GetItemCount: js.Function0[scala.Double],
    GetSubItems: js.Function0[ASPxClientSpreadsheetPopupMenuItemCollection],
    beginGroup: scala.Boolean,
    enabled: scala.Boolean,
    imageClassName: java.lang.String,
    imageUrl: java.lang.String,
    name: java.lang.String,
    navigateUrl: java.lang.String,
    parent: ASPxClientSpreadsheetPopupMenuItem,
    target: java.lang.String,
    text: java.lang.String,
    tooltip: java.lang.String
  ): ASPxClientSpreadsheetPopupMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetItem")(GetItem)
    __obj.updateDynamic("GetItemByName")(GetItemByName)
    __obj.updateDynamic("GetItemCount")(GetItemCount)
    __obj.updateDynamic("GetSubItems")(GetSubItems)
    __obj.updateDynamic("beginGroup")(beginGroup)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("imageClassName")(imageClassName)
    __obj.updateDynamic("imageUrl")(imageUrl)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("navigateUrl")(navigateUrl)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ASPxClientSpreadsheetPopupMenuItem]
  }
}

