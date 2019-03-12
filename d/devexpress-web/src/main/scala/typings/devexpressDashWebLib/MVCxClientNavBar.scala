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
    AdjustControl: () => scala.Unit,
    BeginCallback: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientNavBar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]],
    CollapseAll: () => scala.Unit,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]],
    ExpandAll: () => scala.Unit,
    ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]],
    ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]],
    GetActiveGroup: () => ASPxClientNavBarGroup,
    GetClientVisible: () => scala.Boolean,
    GetGroup: scala.Double => ASPxClientNavBarGroup,
    GetGroupByName: java.lang.String => ASPxClientNavBarGroup,
    GetGroupCount: () => scala.Double,
    GetHeight: () => scala.Double,
    GetItemByName: java.lang.String => ASPxClientNavBarItem,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetSelectedItem: () => ASPxClientNavBarItem,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]],
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetActiveGroup: ASPxClientNavBarGroup => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetSelectedItem: ASPxClientNavBarItem => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    name: java.lang.String
  ): MVCxClientNavBar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback, CallbackError = CallbackError, CollapseAll = js.Any.fromFunction0(CollapseAll), EndCallback = EndCallback, ExpandAll = js.Any.fromFunction0(ExpandAll), ExpandedChanged = ExpandedChanged, ExpandedChanging = ExpandedChanging, GetActiveGroup = js.Any.fromFunction0(GetActiveGroup), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetGroup = js.Any.fromFunction1(GetGroup), GetGroupByName = js.Any.fromFunction1(GetGroupByName), GetGroupCount = js.Any.fromFunction0(GetGroupCount), GetHeight = js.Any.fromFunction0(GetHeight), GetItemByName = js.Any.fromFunction1(GetItemByName), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), HeaderClick = HeaderClick, InCallback = js.Any.fromFunction0(InCallback), Init = Init, ItemClick = ItemClick, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetActiveGroup = js.Any.fromFunction1(SetActiveGroup), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[MVCxClientNavBar]
  }
}

