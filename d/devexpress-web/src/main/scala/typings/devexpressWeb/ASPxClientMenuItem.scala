package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the menu's MenuItem object.
  */
@js.native
trait ASPxClientMenuItem extends StObject {
  
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
    val __obj = js.Dynamic.literal(GetChecked = js.Any.fromFunction0(GetChecked), GetEnabled = js.Any.fromFunction0(GetEnabled), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetChecked = js.Any.fromFunction1(SetChecked), SetEnabled = js.Any.fromFunction1(SetEnabled), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index.asInstanceOf[js.Any], indexPath = indexPath.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItem]
  }
  
  @scala.inline
  implicit class ASPxClientMenuItemMutableBuilder[Self <: ASPxClientMenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetChecked(value: () => Boolean): Self = StObject.set(x, "GetChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImageUrl(value: () => String): Self = StObject.set(x, "GetImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => ASPxClientMenuItem): Self = StObject.set(x, "GetItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemByName(value: String => ASPxClientMenuItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemCount(value: () => Double): Self = StObject.set(x, "GetItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNavigateUrl(value: () => String): Self = StObject.set(x, "GetNavigateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexPath(value: String): Self = StObject.set(x, "indexPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: ASPxClientMenuBase): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ASPxClientMenuItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetChecked(value: Boolean => Unit): Self = StObject.set(x, "SetChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImageUrl(value: String => Unit): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNavigateUrl(value: String => Unit): Self = StObject.set(x, "SetNavigateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "SetText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1(value))
  }
}
