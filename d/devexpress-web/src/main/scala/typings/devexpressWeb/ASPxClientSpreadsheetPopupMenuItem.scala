package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual item of the Spreadsheet's context menu.
  */
trait ASPxClientSpreadsheetPopupMenuItem extends StObject {
  
  /**
    * Returns the menu item's sub-item with the specified index. An ASPxClientSpreadsheetPopupMenuItem object representing the found sub-item.
    * @param index An integer value specifying the index of the sub-item within a collection of the current menu item's submenu items.
    */
  def GetItem(index: Double): ASPxClientSpreadsheetPopupMenuItem
  
  /**
    * Returns the menu item's sub-item with the specified ASPxClientSpreadsheetPopupMenuItem.name property value. An ASPxClientSpreadsheetPopupMenuItem object representing the found sub-item.
    * @param name A string value specifying the ASPxClientSpreadsheetPopupMenuItem.name property value of the sub-item to find.
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
  
  /**
    * Gets or sets a value that specifies whether the current menu item starts a group.
    */
  var beginGroup: Boolean
  
  /**
    * Gets or sets a value that indicates whether the menu item is enabled, allowing the item to respond to end-user interactions.
    */
  var enabled: Boolean
  
  /**
    * Gets or sets the CSS class name defining the menu item's image.
    */
  var imageClassName: String
  
  /**
    * Gets or sets the URL of the menu item's image.
    */
  var imageUrl: String
  
  /**
    * Gets or sets the unique identifier name for the current menu item.
    */
  var name: String
  
  /**
    * Gets or sets an URL which defines the navigation location.
    */
  var navigateUrl: String
  
  /**
    * Gets the immediate parent menu item to which the current menu item belongs.
    */
  var parent: ASPxClientSpreadsheetPopupMenuItem
  
  /**
    * Gets or sets the window or frame at which to target the contents of the URL associated with the current menu item.
    */
  var target: String
  
  /**
    * Gets or sets the text content of the current menu item.
    */
  var text: String
  
  /**
    * Gets or sets the current menu item's tooltip text.
    */
  var tooltip: String
}
object ASPxClientSpreadsheetPopupMenuItem {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetSubItems = js.Any.fromFunction0(GetSubItems), beginGroup = beginGroup.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], imageClassName = imageClassName.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navigateUrl = navigateUrl.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetPopupMenuItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientSpreadsheetPopupMenuItem] (val x: Self) extends AnyVal {
    
    inline def setBeginGroup(value: Boolean): Self = StObject.set(x, "beginGroup", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setGetItem(value: Double => ASPxClientSpreadsheetPopupMenuItem): Self = StObject.set(x, "GetItem", js.Any.fromFunction1(value))
    
    inline def setGetItemByName(value: String => ASPxClientSpreadsheetPopupMenuItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: () => Double): Self = StObject.set(x, "GetItemCount", js.Any.fromFunction0(value))
    
    inline def setGetSubItems(value: () => ASPxClientSpreadsheetPopupMenuItemCollection): Self = StObject.set(x, "GetSubItems", js.Any.fromFunction0(value))
    
    inline def setImageClassName(value: String): Self = StObject.set(x, "imageClassName", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNavigateUrl(value: String): Self = StObject.set(x, "navigateUrl", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ASPxClientSpreadsheetPopupMenuItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
