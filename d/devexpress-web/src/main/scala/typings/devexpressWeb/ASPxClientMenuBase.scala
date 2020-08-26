package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base type for the ASPxClientMenu and ASPxClientPopupMenu objects.
  */
@js.native
trait ASPxClientMenuBase extends ASPxClientControl {
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

object ASPxClientMenuBase {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    CloseUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]],
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetItem: Double => ASPxClientMenuItem,
    GetItemByName: String => ASPxClientMenuItem,
    GetItemCount: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetRootItem: () => ASPxClientMenuItem,
    GetSelectedItem: () => ASPxClientMenuItem,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientMenuItemClickEventHandler[ASPxClientMenuBase]],
    ItemMouseOut: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]],
    ItemMouseOver: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]],
    PopUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetSelectedItem: ASPxClientMenuItem => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientMenuBase = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CloseUp = CloseUp.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRootItem = js.Any.fromFunction0(GetRootItem), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], ItemMouseOut = ItemMouseOut.asInstanceOf[js.Any], ItemMouseOver = ItemMouseOver.asInstanceOf[js.Any], PopUp = PopUp.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuBase]
  }
  @scala.inline
  implicit class ASPxClientMenuBaseOps[Self <: ASPxClientMenuBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloseUp(value: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]]): Self = this.set("CloseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetItem(value: Double => ASPxClientMenuItem): Self = this.set("GetItem", js.Any.fromFunction1(value))
    @scala.inline
    def setGetItemByName(value: String => ASPxClientMenuItem): Self = this.set("GetItemByName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetItemCount(value: () => Double): Self = this.set("GetItemCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRootItem(value: () => ASPxClientMenuItem): Self = this.set("GetRootItem", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelectedItem(value: () => ASPxClientMenuItem): Self = this.set("GetSelectedItem", js.Any.fromFunction0(value))
    @scala.inline
    def setItemClick(value: ASPxClientEvent[ASPxClientMenuItemClickEventHandler[ASPxClientMenuBase]]): Self = this.set("ItemClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemMouseOut(value: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]]): Self = this.set("ItemMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemMouseOver(value: ASPxClientEvent[ASPxClientMenuItemMouseEventHandler[ASPxClientMenuBase]]): Self = this.set("ItemMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopUp(value: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]]): Self = this.set("PopUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetSelectedItem(value: ASPxClientMenuItem => Unit): Self = this.set("SetSelectedItem", js.Any.fromFunction1(value))
  }
  
}

