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
    AdjustControl: js.Function0[scala.Unit],
    CloseUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetItem: js.Function1[scala.Double, ASPxClientMenuItem],
    GetItemByName: js.Function1[java.lang.String, ASPxClientMenuItem],
    GetItemCount: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetRootItem: js.Function0[ASPxClientMenuItem],
    GetSelectedItem: js.Function0[ASPxClientMenuItem],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientMenuItemClickEventHandler[ASPxClientMenuBase]],
    ItemMouseOut: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]],
    ItemMouseOver: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]],
    PopUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetSelectedItem: js.Function1[ASPxClientMenuItem, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientMenuBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, CloseUp = CloseUp, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetItem = GetItem, GetItemByName = GetItemByName, GetItemCount = GetItemCount, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetRootItem = GetRootItem, GetSelectedItem = GetSelectedItem, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, ItemClick = ItemClick, ItemMouseOut = ItemMouseOut, ItemMouseOver = ItemMouseOver, PopUp = PopUp, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetSelectedItem = SetSelectedItem, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientMenuBase]
  }
}

