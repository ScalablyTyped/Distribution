package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxNavBar control.
  */
trait ASPxClientNavBar extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientNavBar.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]]
  /**
    * Fires on the client side after a group's expansion state has been changed.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]]
  /**
    * Fires on the client side before the expansion state of a group is changed.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]]
  /**
    * Fires when a group header is clicked.
    */
  var HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]]
  /**
    * Fires after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]]
  /**
    * Collapses all groups of the navbar.
    */
  def CollapseAll(): scala.Unit
  /**
    * Expands all groups of the navbar.
    */
  def ExpandAll(): scala.Unit
  /**
    * Returns the navbar's active group.
    */
  def GetActiveGroup(): ASPxClientNavBarGroup
  /**
    * Returns a group specified by its index.
    * @param index An integer value specifying the zero-based index of the group object to retrieve.
    */
  def GetGroup(index: scala.Double): ASPxClientNavBarGroup
  /**
    * Returns a group specified by its name.
    * @param name A string value specifying the name of the group.
    */
  def GetGroupByName(name: java.lang.String): ASPxClientNavBarGroup
  /**
    * Returns the number of groups in the navbar.
    */
  def GetGroupCount(): scala.Double
  /**
    * Returns an item specified by its name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: java.lang.String): ASPxClientNavBarItem
  /**
    * Returns the selected item within the navbar control.
    */
  def GetSelectedItem(): ASPxClientNavBarItem
  /**
    * Makes the specified group active.
    * @param group A ASPxClientNavBarGroup object that specifies the active group.
    */
  def SetActiveGroup(group: ASPxClientNavBarGroup): scala.Unit
  /**
    * Selects the specified item within the navbar control on the client side.
    * @param item An ASPxClientNavBarItem object specifying the item to select.
    */
  def SetSelectedItem(item: ASPxClientNavBarItem): scala.Unit
}

object ASPxClientNavBar {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]],
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
  ): ASPxClientNavBar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback, CallbackError = CallbackError, CollapseAll = js.Any.fromFunction0(CollapseAll), EndCallback = EndCallback, ExpandAll = js.Any.fromFunction0(ExpandAll), ExpandedChanged = ExpandedChanged, ExpandedChanging = ExpandedChanging, GetActiveGroup = js.Any.fromFunction0(GetActiveGroup), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetGroup = js.Any.fromFunction1(GetGroup), GetGroupByName = js.Any.fromFunction1(GetGroupByName), GetGroupCount = js.Any.fromFunction0(GetGroupCount), GetHeight = js.Any.fromFunction0(GetHeight), GetItemByName = js.Any.fromFunction1(GetItemByName), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), HeaderClick = HeaderClick, InCallback = js.Any.fromFunction0(InCallback), Init = Init, ItemClick = ItemClick, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetActiveGroup = js.Any.fromFunction1(SetActiveGroup), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[ASPxClientNavBar]
  }
}

