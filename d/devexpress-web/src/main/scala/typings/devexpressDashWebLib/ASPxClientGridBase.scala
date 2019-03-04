package typings
package devexpressDashWebLib

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
  def GetToolbar(index: scala.Double): ASPxClientMenu
  /**
    * Returns a toolbar specified by its name.
    * @param name A string value specifying the toolbar name.
    */
  def GetToolbarByName(name: java.lang.String): ASPxClientMenu
}

object ASPxClientGridBase {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetToolbar: js.Function1[scala.Double, ASPxClientMenu],
    GetToolbarByName: js.Function1[java.lang.String, ASPxClientMenu],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    ToolbarItemClick: ASPxClientEvent[ASPxClientGridToolbarItemClickEventHandler[ASPxClientGridBase]],
    name: java.lang.String
  ): ASPxClientGridBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetToolbar = GetToolbar, GetToolbarByName = GetToolbarByName, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, ToolbarItemClick = ToolbarItemClick, name = name)
  
    __obj.asInstanceOf[ASPxClientGridBase]
  }
}

