package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the NavBar extension.
  */
trait MVCxClientNavBar extends ASPxClientNavBar {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientNavBar: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientNavBar]]
}

object MVCxClientNavBar {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    BeginCallback: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientNavBar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]],
    CollapseAll: js.Function0[scala.Unit],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]],
    ExpandAll: js.Function0[scala.Unit],
    ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]],
    ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]],
    GetActiveGroup: js.Function0[ASPxClientNavBarGroup],
    GetClientVisible: js.Function0[scala.Boolean],
    GetGroup: js.Function1[scala.Double, ASPxClientNavBarGroup],
    GetGroupByName: js.Function1[java.lang.String, ASPxClientNavBarGroup],
    GetGroupCount: js.Function0[scala.Double],
    GetHeight: js.Function0[scala.Double],
    GetItemByName: js.Function1[java.lang.String, ASPxClientNavBarItem],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetSelectedItem: js.Function0[ASPxClientNavBarItem],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetActiveGroup: js.Function1[ASPxClientNavBarGroup, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetSelectedItem: js.Function1[ASPxClientNavBarItem, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): MVCxClientNavBar = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, BeginCallback = BeginCallback, CallbackError = CallbackError, CollapseAll = CollapseAll, EndCallback = EndCallback, ExpandAll = ExpandAll, ExpandedChanged = ExpandedChanged, ExpandedChanging = ExpandedChanging, GetActiveGroup = GetActiveGroup, GetClientVisible = GetClientVisible, GetGroup = GetGroup, GetGroupByName = GetGroupByName, GetGroupCount = GetGroupCount, GetHeight = GetHeight, GetItemByName = GetItemByName, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetSelectedItem = GetSelectedItem, GetVisible = GetVisible, GetWidth = GetWidth, HeaderClick = HeaderClick, InCallback = InCallback, Init = Init, ItemClick = ItemClick, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetActiveGroup = SetActiveGroup, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetSelectedItem = SetSelectedItem, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[MVCxClientNavBar]
  }
}

