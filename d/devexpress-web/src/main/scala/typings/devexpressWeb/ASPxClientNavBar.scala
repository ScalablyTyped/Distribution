package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxNavBar control.
  */
@JSGlobal("ASPxClientNavBar")
@js.native
class ASPxClientNavBar () extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientNavBar.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Fires on the client side after a group's expansion state has been changed.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Fires on the client side before the expansion state of a group is changed.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Fires when a group header is clicked.
    */
  var HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Fires after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Collapses all groups of the navbar.
    */
  def CollapseAll(): Unit = js.native
  /**
    * Expands all groups of the navbar.
    */
  def ExpandAll(): Unit = js.native
  /**
    * Returns the navbar's active group.
    */
  def GetActiveGroup(): ASPxClientNavBarGroup = js.native
  /**
    * Returns a group specified by its index. An ASPxClientNavBarGroup object representing the group located at the specified index within the navbar's ASPxNavBar.Groups collection.
    * @param index An integer value specifying the zero-based index of the group object to retrieve.
    */
  def GetGroup(index: Double): ASPxClientNavBarGroup = js.native
  /**
    * Returns a group specified by its name. An ASPxClientNavBarGroup object that represents the group with the specified name.
    * @param name A string value specifying the name of the group.
    */
  def GetGroupByName(name: String): ASPxClientNavBarGroup = js.native
  /**
    * Returns the number of groups in the navbar.
    */
  def GetGroupCount(): Double = js.native
  /**
    * Returns an item specified by its name. An ASPxClientNavBarItem object that represents the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientNavBarItem = js.native
  /**
    * Returns the selected item within the navbar control.
    */
  def GetSelectedItem(): ASPxClientNavBarItem = js.native
  /**
    * Makes the specified group active.
    * @param group A ASPxClientNavBarGroup object that specifies the active group.
    */
  def SetActiveGroup(group: ASPxClientNavBarGroup): Unit = js.native
  /**
    * Selects the specified item within the navbar control on the client side.
    * @param item An ASPxClientNavBarItem object specifying the item to select.
    */
  def SetSelectedItem(item: ASPxClientNavBarItem): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientNavBar")
@js.native
object ASPxClientNavBar extends js.Object {
  /**
    * Converts the specified object to the ASPxClientNavBar type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientNavBar = js.native
}

