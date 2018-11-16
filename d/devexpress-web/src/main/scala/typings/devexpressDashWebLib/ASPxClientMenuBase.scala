package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Serves as the base type for the ASPxClientPopupMenu objects.
 */

trait ASPxClientMenuBase extends ASPxClientControl {
  /**
       * Occurs on the client side when a submenu closes.
       */
  var CloseUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]]
  /**
       * Fires after a menu item has been clicked.
       */
  var ItemClick: ASPxClientEvent[ASPxClientMenuItemClickEventHandler[ASPxClientMenuBase]]
  /**
       * Occurs on the client side when the mouse cursor moves outside a menu item.
       */
  var ItemMouseOut: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]]
  /**
       * Occurs on the client side when the mouse cursor is moved into a menu item.
       */
  var ItemMouseOver: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]]
  /**
       * Occurs on the client side when a submenu pops up.
       */
  var PopUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]]
  /**
       * Returns the menu's root menu item specified by its index.
       * @param index An integer value specifying the zero-based index of the root menu item to be retrieved.
       */
  def GetItem(index: scala.Double): ASPxClientMenuItem
  /**
       * Returns a menu item specified by its name.
       * @param name A string value specifying the name of the menu item.
       */
  def GetItemByName(name: java.lang.String): ASPxClientMenuItem
  /**
       * Returns the number of menu items at the root menu level.
       */
  def GetItemCount(): scala.Double
  /**
       * Returns a root menu item.
       */
  def GetRootItem(): ASPxClientMenuItem
  /**
       * Returns the selected item within the menu control.
       */
  def GetSelectedItem(): ASPxClientMenuItem
  /**
       * Selects the specified menu item within a menu control on the client side.
       * @param item An ASPxClientMenuItem object specifying the menu item to select.
       */
  def SetSelectedItem(item: ASPxClientMenuItem): scala.Unit
}

