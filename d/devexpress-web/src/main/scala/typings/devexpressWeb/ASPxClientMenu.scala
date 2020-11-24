package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxMenu object.
  */
@js.native
trait ASPxClientMenu extends ASPxClientMenuBase {
  
  /**
    * Gets a value specifying the menu orientation.
    */
  def GetOrientation(): String = js.native
  
  /**
    * Sets the menu orientation.
    * @param orientation 'Vertical' to orient the menu vertically; 'Horizontal' to orient the menu horizontally.
    */
  def SetOrientation(orientation: String): Unit = js.native
  
  /**
    * Expands or collapses the side menu.
    */
  def ToggleSideMenu(): Unit = js.native
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
    SetSelectedItem: ASPxClientMenuItem => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ToggleSideMenu: () => Unit,
    name: String
  ): ASPxClientMenu = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CloseUp = CloseUp.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetMainElement = js.Any.fromFunction0(GetMainElement), GetOrientation = js.Any.fromFunction0(GetOrientation), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRootItem = js.Any.fromFunction0(GetRootItem), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], ItemMouseOut = ItemMouseOut.asInstanceOf[js.Any], ItemMouseOver = ItemMouseOver.asInstanceOf[js.Any], PopUp = PopUp.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetOrientation = js.Any.fromFunction1(SetOrientation), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ToggleSideMenu = js.Any.fromFunction0(ToggleSideMenu), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenu]
  }
  
  @scala.inline
  implicit class ASPxClientMenuOps[Self <: ASPxClientMenu] (val x: Self) extends AnyVal {
    
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
    def setGetOrientation(value: () => String): Self = this.set("GetOrientation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOrientation(value: String => Unit): Self = this.set("SetOrientation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleSideMenu(value: () => Unit): Self = this.set("ToggleSideMenu", js.Any.fromFunction0(value))
  }
}
