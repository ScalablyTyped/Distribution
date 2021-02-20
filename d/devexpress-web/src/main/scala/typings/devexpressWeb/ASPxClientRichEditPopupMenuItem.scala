package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual item of the Rich Edit's context menu.
  */
@js.native
trait ASPxClientRichEditPopupMenuItem extends StObject {
  
  /**
    * Returns the menu item's sub-item with the specified index. An ASPxClientRichEditPopupMenuItem object representing the found sub-item.
    * @param index An integer value specifying the index of the sub-item within a collection of the current menu item's submenu items.
    */
  def GetItem(index: Double): ASPxClientRichEditPopupMenuItem = js.native
  
  /**
    * Returns the menu item's sub-item with the specified ASPxClientRichEditPopupMenuItem.name property value. An ASPxClientRichEditPopupMenuItem object representing the found sub-item.
    * @param name A string value specifying the ASPxClientRichEditPopupMenuItem.name property value of the sub-item to find.
    */
  def GetItemByName(name: String): ASPxClientRichEditPopupMenuItem = js.native
  
  /**
    * Returns the total number of the menu item's child items (submenu items).
    */
  def GetItemCount(): Double = js.native
  
  /**
    * Gets a collection that contains the submenu items of the current menu item.
    */
  def GetSubItems(): ASPxClientRichEditPopupMenuItemCollection = js.native
  
  /**
    * Gets or sets a value that specifies whether the current menu item starts a group.
    */
  var beginGroup: Boolean = js.native
  
  /**
    * Indicates whether the menu item is enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * Gets or sets the CSS class name defining the menu item's image.
    */
  var imageClassName: String = js.native
  
  /**
    * Gets or sets the URL of the menu item's image.
    */
  var imageUrl: String = js.native
  
  /**
    * Specifies the unique identifier name for the current menu item.
    */
  var name: String = js.native
  
  /**
    * Gets or sets a URL which defines the navigation location.
    */
  var navigateUrl: String = js.native
  
  /**
    * Gets the immediate parent menu item to which the current menu item belongs.
    */
  var parent: ASPxClientRichEditPopupMenuItem = js.native
  
  /**
    * Gets or sets the window or frame at which to target the contents of the URL associated with the current menu item.
    */
  var target: String = js.native
  
  /**
    * Specifies the text content of the current menu item.
    */
  var text: String = js.native
  
  /**
    * Gets or sets the current menu item's tooltip text.
    */
  var tooltip: String = js.native
}
object ASPxClientRichEditPopupMenuItem {
  
  @scala.inline
  def apply(
    GetItem: Double => ASPxClientRichEditPopupMenuItem,
    GetItemByName: String => ASPxClientRichEditPopupMenuItem,
    GetItemCount: () => Double,
    GetSubItems: () => ASPxClientRichEditPopupMenuItemCollection,
    beginGroup: Boolean,
    enabled: Boolean,
    imageClassName: String,
    imageUrl: String,
    name: String,
    navigateUrl: String,
    parent: ASPxClientRichEditPopupMenuItem,
    target: String,
    text: String,
    tooltip: String
  ): ASPxClientRichEditPopupMenuItem = {
    val __obj = js.Dynamic.literal(GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetSubItems = js.Any.fromFunction0(GetSubItems), beginGroup = beginGroup.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], imageClassName = imageClassName.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navigateUrl = navigateUrl.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditPopupMenuItem]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditPopupMenuItemMutableBuilder[Self <: ASPxClientRichEditPopupMenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginGroup(value: Boolean): Self = StObject.set(x, "beginGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetItem(value: Double => ASPxClientRichEditPopupMenuItem): Self = StObject.set(x, "GetItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemByName(value: String => ASPxClientRichEditPopupMenuItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemCount(value: () => Double): Self = StObject.set(x, "GetItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubItems(value: () => ASPxClientRichEditPopupMenuItemCollection): Self = StObject.set(x, "GetSubItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImageClassName(value: String): Self = StObject.set(x, "imageClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigateUrl(value: String): Self = StObject.set(x, "navigateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ASPxClientRichEditPopupMenuItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
