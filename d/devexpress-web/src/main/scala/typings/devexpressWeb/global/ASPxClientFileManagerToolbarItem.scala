package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the file manager's FileManagerToolbarItemBase object.
  */
@JSGlobal("ASPxClientFileManagerToolbarItem")
@js.native
class ASPxClientFileManagerToolbarItem ()
  extends typings.devexpressWeb.ASPxClientFileManagerToolbarItem {
  /**
    * Gets the item's index within the parent's collection of items.
    */
  /* CompleteClass */
  override var index: Double = js.native
  /**
    * For internal use only.
    */
  /* CompleteClass */
  override var indexPath: String = js.native
  /**
    * Gets the menu object to which the current item belongs.
    */
  /* CompleteClass */
  override var menu: typings.devexpressWeb.ASPxClientMenuBase = js.native
  /**
    * Gets the name that uniquely identifies the menu item.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the immediate parent item to which the current item belongs.
    */
  /* CompleteClass */
  override var parent: typings.devexpressWeb.ASPxClientMenuItem = js.native
  /**
    * Indicates whether the menu item is checked.
    */
  /* CompleteClass */
  override def GetChecked(): Boolean = js.native
  /**
    * Returns a value specifying whether a menu item is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  /**
    * Returns the URL pointing to the image displayed within the menu item.
    */
  /* CompleteClass */
  override def GetImageUrl(): String = js.native
  /**
    * Returns the current menu item's immediate subitem specified by its index. An ASPxClientMenuItem object representing the menu item's immediate subitem located at the specified index within the menu item's MenuItem.Items collection.
    * @param index An integer value specifying the zero-based index of the submenu item to be retrieved.
    */
  /* CompleteClass */
  override def GetItem(index: Double): typings.devexpressWeb.ASPxClientMenuItem = js.native
  /**
    * Returns the current menu item's subitem specified by its name. An ASPxClientMenuItem object that represents the current menu item's subitem with the specified name.
    * @param name A string value specifying the name of the menu item.
    */
  /* CompleteClass */
  override def GetItemByName(name: String): typings.devexpressWeb.ASPxClientMenuItem = js.native
  /**
    * Returns the number of the current menu item's immediate child items.
    */
  /* CompleteClass */
  override def GetItemCount(): Double = js.native
  /**
    * Gets a URL which defines the navigation location for the menu item.
    */
  /* CompleteClass */
  override def GetNavigateUrl(): String = js.native
  /**
    * Returns text displayed within the menu item.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  /**
    * Returns a value specifying whether a menu item is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Specifies whether the menu item is checked.
    * @param value true if the menu item is checked; otherwise, false.
    */
  /* CompleteClass */
  override def SetChecked(value: Boolean): Unit = js.native
  /**
    * Specifies whether the menu item is enabled.
    * @param value true to enable the menu item; otherwise, false.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Sets the URL which points to the image displayed within the menu item.
    * @param value A string value specifying the URL to the image displayed within the menu item.
    */
  /* CompleteClass */
  override def SetImageUrl(value: String): Unit = js.native
  /**
    * Specifies a URL which defines the navigation location for the menu item.
    * @param value A string value which specifies a URL to where the client web browser will navigate when the menu item is clicked.
    */
  /* CompleteClass */
  override def SetNavigateUrl(value: String): Unit = js.native
  /**
    * Sets the text to be displayed within the menu item.
    * @param value A string value specifying the text to be displayed within the menu item.
    */
  /* CompleteClass */
  override def SetText(value: String): Unit = js.native
  /**
    * Specifies the menu item's visibility.
    * @param value true if the menu item is visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetVisible(value: Boolean): Unit = js.native
}

