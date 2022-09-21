package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual item of the Spreadsheet's context menu.
  */
@JSGlobal("ASPxClientSpreadsheetPopupMenuItem")
@js.native
open class ASPxClientSpreadsheetPopupMenuItem ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuItem {
  
  /**
    * Returns the menu item's sub-item with the specified index. An ASPxClientSpreadsheetPopupMenuItem object representing the found sub-item.
    * @param index An integer value specifying the index of the sub-item within a collection of the current menu item's submenu items.
    */
  /* CompleteClass */
  override def GetItem(index: Double): typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuItem = js.native
  
  /**
    * Returns the menu item's sub-item with the specified ASPxClientSpreadsheetPopupMenuItem.name property value. An ASPxClientSpreadsheetPopupMenuItem object representing the found sub-item.
    * @param name A string value specifying the ASPxClientSpreadsheetPopupMenuItem.name property value of the sub-item to find.
    */
  /* CompleteClass */
  override def GetItemByName(name: String): typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuItem = js.native
  
  /**
    * Returns the total number of the menu item's child items (submenu items).
    */
  /* CompleteClass */
  override def GetItemCount(): Double = js.native
  
  /**
    * Gets a collection that contains the submenu items of the current menu item.
    */
  /* CompleteClass */
  override def GetSubItems(): typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuItemCollection = js.native
  
  /**
    * Gets or sets a value that specifies whether the current menu item starts a group.
    */
  /* CompleteClass */
  var beginGroup: Boolean = js.native
  
  /**
    * Gets or sets a value that indicates whether the menu item is enabled, allowing the item to respond to end-user interactions.
    */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * Gets or sets the CSS class name defining the menu item's image.
    */
  /* CompleteClass */
  var imageClassName: String = js.native
  
  /**
    * Gets or sets the URL of the menu item's image.
    */
  /* CompleteClass */
  var imageUrl: String = js.native
  
  /**
    * Gets or sets the unique identifier name for the current menu item.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets or sets an URL which defines the navigation location.
    */
  /* CompleteClass */
  var navigateUrl: String = js.native
  
  /**
    * Gets the immediate parent menu item to which the current menu item belongs.
    */
  /* CompleteClass */
  var parent: typings.devexpressWeb.ASPxClientSpreadsheetPopupMenuItem = js.native
  
  /**
    * Gets or sets the window or frame at which to target the contents of the URL associated with the current menu item.
    */
  /* CompleteClass */
  var target: String = js.native
  
  /**
    * Gets or sets the text content of the current menu item.
    */
  /* CompleteClass */
  var text: String = js.native
  
  /**
    * Gets or sets the current menu item's tooltip text.
    */
  /* CompleteClass */
  var tooltip: String = js.native
}
