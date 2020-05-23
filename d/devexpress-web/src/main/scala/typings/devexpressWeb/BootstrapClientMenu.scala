package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapMenu control.
  */
trait BootstrapClientMenu extends ASPxClientMenu {
  /**
    * Selects the specified menu item within the Menu control on the client side.
    * @param item A BootstrapClientMenuItem object specifying the menu item to select.
    */
  def SetSelectedItem(item: BootstrapClientMenuItem): Unit
}

object BootstrapClientMenu {
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
    GetOrientation: () => String,
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
    SetOrientation: String => Unit,
    SetSelectedItem: BootstrapClientMenuItem => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ToggleSideMenu: () => Unit,
    name: String
  ): BootstrapClientMenu = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CloseUp = CloseUp.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetMainElement = js.Any.fromFunction0(GetMainElement), GetOrientation = js.Any.fromFunction0(GetOrientation), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRootItem = js.Any.fromFunction0(GetRootItem), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], ItemMouseOut = ItemMouseOut.asInstanceOf[js.Any], ItemMouseOver = ItemMouseOver.asInstanceOf[js.Any], PopUp = PopUp.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetOrientation = js.Any.fromFunction1(SetOrientation), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ToggleSideMenu = js.Any.fromFunction0(ToggleSideMenu), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenu]
  }
}

