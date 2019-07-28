package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxMenu object.
  */
trait ASPxClientMenu extends ASPxClientMenuBase {
  /**
    * Gets a value specifying the menu orientation.
    */
  def GetOrientation(): String
  /**
    * Sets the menu orientation.
    * @param orientation 'Vertical' to orient the menu vertically; 'Horizontal' to orient the menu horizontally.
    */
  def SetOrientation(orientation: String): Unit
  /**
    * Expands or collapses the side menu.
    */
  def ToggleSideMenu(): Unit
}

object ASPxClientMenu {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    CloseUp: ASPxClientEvent[ASPxClientMenuItemEventHandler[ASPxClientMenuBase]],
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetItem: Double => ASPxClientMenuItem,
    GetItemByName: String => ASPxClientMenuItem,
    GetItemCount: () => Double,
    GetMainElement: () => js.Object,
    GetOrientation: () => String,
    GetParentControl: () => js.Object,
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
    SetSelectedItem: ASPxClientMenuItem => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ToggleSideMenu: () => Unit,
    name: String
  ): ASPxClientMenu = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CloseUp = CloseUp, GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetMainElement = js.Any.fromFunction0(GetMainElement), GetOrientation = js.Any.fromFunction0(GetOrientation), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRootItem = js.Any.fromFunction0(GetRootItem), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, ItemClick = ItemClick, ItemMouseOut = ItemMouseOut, ItemMouseOver = ItemMouseOver, PopUp = PopUp, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetOrientation = js.Any.fromFunction1(SetOrientation), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ToggleSideMenu = js.Any.fromFunction0(ToggleSideMenu), name = name)
  
    __obj.asInstanceOf[ASPxClientMenu]
  }
}

