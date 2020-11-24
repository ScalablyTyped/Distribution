package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxNavBar control.
  */
@js.native
trait ASPxClientNavBar extends ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientNavBar.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]] = js.native
  
  /**
    * Collapses all groups of the navbar.
    */
  def CollapseAll(): Unit = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]] = js.native
  
  /**
    * Expands all groups of the navbar.
    */
  def ExpandAll(): Unit = js.native
  
  /**
    * Fires on the client side after a group's expansion state has been changed.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]] = js.native
  
  /**
    * Fires on the client side before the expansion state of a group is changed.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]] = js.native
  
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
    * Fires when a group header is clicked.
    */
  var HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]] = js.native
  
  /**
    * Fires after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]] = js.native
  
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
object ASPxClientNavBar {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]],
    CollapseAll: () => Unit,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]],
    ExpandAll: () => Unit,
    ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]],
    ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]],
    GetActiveGroup: () => ASPxClientNavBarGroup,
    GetClientVisible: () => Boolean,
    GetGroup: Double => ASPxClientNavBarGroup,
    GetGroupByName: String => ASPxClientNavBarGroup,
    GetGroupCount: () => Double,
    GetHeight: () => Double,
    GetItemByName: String => ASPxClientNavBarItem,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetSelectedItem: () => ASPxClientNavBarItem,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetActiveGroup: ASPxClientNavBarGroup => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetSelectedItem: ASPxClientNavBarItem => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientNavBar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CollapseAll = js.Any.fromFunction0(CollapseAll), EndCallback = EndCallback.asInstanceOf[js.Any], ExpandAll = js.Any.fromFunction0(ExpandAll), ExpandedChanged = ExpandedChanged.asInstanceOf[js.Any], ExpandedChanging = ExpandedChanging.asInstanceOf[js.Any], GetActiveGroup = js.Any.fromFunction0(GetActiveGroup), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetGroup = js.Any.fromFunction1(GetGroup), GetGroupByName = js.Any.fromFunction1(GetGroupByName), GetGroupCount = js.Any.fromFunction0(GetGroupCount), GetHeight = js.Any.fromFunction0(GetHeight), GetItemByName = js.Any.fromFunction1(GetItemByName), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), HeaderClick = HeaderClick.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetActiveGroup = js.Any.fromFunction1(SetActiveGroup), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBar]
  }
  
  @scala.inline
  implicit class ASPxClientNavBarOps[Self <: ASPxClientNavBar] (val x: Self) extends AnyVal {
    
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
    def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]]): Self = this.set("BeginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]]): Self = this.set("CallbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseAll(value: () => Unit): Self = this.set("CollapseAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]]): Self = this.set("EndCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandAll(value: () => Unit): Self = this.set("ExpandAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandedChanged(value: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]]): Self = this.set("ExpandedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedChanging(value: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]]): Self = this.set("ExpandedChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetActiveGroup(value: () => ASPxClientNavBarGroup): Self = this.set("GetActiveGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroup(value: Double => ASPxClientNavBarGroup): Self = this.set("GetGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroupByName(value: String => ASPxClientNavBarGroup): Self = this.set("GetGroupByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroupCount(value: () => Double): Self = this.set("GetGroupCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemByName(value: String => ASPxClientNavBarItem): Self = this.set("GetItemByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSelectedItem(value: () => ASPxClientNavBarItem): Self = this.set("GetSelectedItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaderClick(value: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]]): Self = this.set("HeaderClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemClick(value: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]]): Self = this.set("ItemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetActiveGroup(value: ASPxClientNavBarGroup => Unit): Self = this.set("SetActiveGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectedItem(value: ASPxClientNavBarItem => Unit): Self = this.set("SetSelectedItem", js.Any.fromFunction1(value))
  }
}
