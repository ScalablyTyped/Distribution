package typings
package devexpressDashWebLib

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
  def GetOrientation(): java.lang.String
  /**
    * Sets the menu orientation.
    * @param orientation 'Vertical' to orient the menu vertically; 'Horizontal' to orient the menu horizontally.
    */
  def SetOrientation(orientation: java.lang.String): scala.Unit
  /**
    * Expands or collapses the side menu.
    */
  def ToggleSideMenu(): scala.Unit
}

object ASPxClientMenu {
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
    GetOrientation: js.Function0[java.lang.String],
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
    SetOrientation: js.Function1[java.lang.String, scala.Unit],
    SetSelectedItem: js.Function1[ASPxClientMenuItem, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    ToggleSideMenu: js.Function0[scala.Unit],
    name: java.lang.String
  ): ASPxClientMenu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("CloseUp")(CloseUp)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetItem")(GetItem)
    __obj.updateDynamic("GetItemByName")(GetItemByName)
    __obj.updateDynamic("GetItemCount")(GetItemCount)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetOrientation")(GetOrientation)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetRootItem")(GetRootItem)
    __obj.updateDynamic("GetSelectedItem")(GetSelectedItem)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("ItemClick")(ItemClick)
    __obj.updateDynamic("ItemMouseOut")(ItemMouseOut)
    __obj.updateDynamic("ItemMouseOver")(ItemMouseOver)
    __obj.updateDynamic("PopUp")(PopUp)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetOrientation")(SetOrientation)
    __obj.updateDynamic("SetSelectedItem")(SetSelectedItem)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("ToggleSideMenu")(ToggleSideMenu)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientMenu]
  }
}

