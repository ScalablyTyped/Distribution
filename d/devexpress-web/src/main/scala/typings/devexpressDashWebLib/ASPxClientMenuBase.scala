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

object ASPxClientMenuBase {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    CloseUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]],
    GetClientVisible: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetItem: scala.Double => ASPxClientMenuItem,
    GetItemByName: java.lang.String => ASPxClientMenuItem,
    GetItemCount: () => scala.Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetRootItem: () => ASPxClientMenuItem,
    GetSelectedItem: () => ASPxClientMenuItem,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientMenuItemClickEventHandler[ASPxClientMenuBase]],
    ItemMouseOut: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]],
    ItemMouseOver: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]],
    PopUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetSelectedItem: ASPxClientMenuItem => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    name: java.lang.String
  ): ASPxClientMenuBase = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CloseUp = CloseUp, GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRootItem = js.Any.fromFunction0(GetRootItem), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, ItemClick = ItemClick, ItemMouseOut = ItemMouseOut, ItemMouseOver = ItemMouseOver, PopUp = PopUp, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[ASPxClientMenuBase]
  }
}

