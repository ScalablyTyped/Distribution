package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client ASPxGridView.
  */
trait ASPxClientGridBase extends ASPxClientControl {
  /**
    * Fires after a toolbar item has been clicked.
    */
  var ToolbarItemClick: ASPxClientEvent[ASPxClientGridToolbarItemClickEventHandler[ASPxClientGridBase]]
  /**
    * Returns a grid's toolbar specified by its index.
    * @param index An integer value specifying the zero-based index of the toolbar object to retrieve.
    */
  def GetToolbar(index: Double): ASPxClientMenu
  /**
    * Returns a toolbar specified by its name.
    * @param name A string value specifying the toolbar name.
    */
  def GetToolbarByName(name: String): ASPxClientMenu
}

object ASPxClientGridBase {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetToolbar: Double => ASPxClientMenu,
    GetToolbarByName: String => ASPxClientMenu,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ToolbarItemClick: ASPxClientEvent[ASPxClientGridToolbarItemClickEventHandler[ASPxClientGridBase]],
    name: String
  ): ASPxClientGridBase = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetToolbar = js.Any.fromFunction1(GetToolbar), GetToolbarByName = js.Any.fromFunction1(GetToolbarByName), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ToolbarItemClick = ToolbarItemClick, name = name)
  
    __obj.asInstanceOf[ASPxClientGridBase]
  }
}

