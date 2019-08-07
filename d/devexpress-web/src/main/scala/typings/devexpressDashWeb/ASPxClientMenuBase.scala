package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base type for the ASPxClientMenu and ASPxClientPopupMenu objects.
  */
@JSGlobal("ASPxClientMenuBase")
@js.native
class ASPxClientMenuBase () extends ASPxClientControl {
  /**
    * Occurs on the client side when a submenu closes.
    */
  var CloseUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]] = js.native
  /**
    * Fires after a menu item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientMenuItemClickEventHandler[ASPxClientMenuBase]] = js.native
  /**
    * Occurs on the client side when the mouse cursor moves outside a menu item.
    */
  var ItemMouseOut: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]] = js.native
  /**
    * Occurs on the client side when the mouse cursor is moved into a menu item.
    */
  var ItemMouseOver: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]] = js.native
  /**
    * Occurs on the client side when a submenu pops up.
    */
  var PopUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]] = js.native
  /**
    * Returns the menu's root menu item specified by its index. An ASPxClientMenuItem object representing the root item located at the specified index within the menu's ASPxMenuBase.Items collection.
    * @param index An integer value specifying the zero-based index of the root menu item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientMenuItem = js.native
  /**
    * Returns a menu item specified by its name. An ASPxClientMenuItem object that represents the menu item with the specified name.
    * @param name A string value specifying the name of the menu item.
    */
  def GetItemByName(name: String): ASPxClientMenuItem = js.native
  /**
    * Returns the number of menu items at the root menu level.
    */
  def GetItemCount(): Double = js.native
  /**
    * Returns a root menu item.
    */
  def GetRootItem(): ASPxClientMenuItem = js.native
  /**
    * Returns the selected item within the menu control.
    */
  def GetSelectedItem(): ASPxClientMenuItem = js.native
  /**
    * Selects the specified menu item within a menu control on the client side.
    * @param item An ASPxClientMenuItem object specifying the menu item to select.
    */
  def SetSelectedItem(item: ASPxClientMenuItem): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientMenuBase")
@js.native
object ASPxClientMenuBase extends js.Object {
  /**
    * Returns a collection of client menu objects.
    */
  def GetMenuCollection(): ASPxClientMenuCollection = js.native
}

