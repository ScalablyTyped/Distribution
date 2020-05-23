package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientBeginCallbackEventHandler
import typings.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typings.devexpressWeb.ASPxClientEndCallbackEventHandler
import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientNavBarGroupCancelEventHandler
import typings.devexpressWeb.ASPxClientNavBarGroupClickEventHandler
import typings.devexpressWeb.ASPxClientNavBarGroupEventHandler
import typings.devexpressWeb.ASPxClientNavBarItemEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxNavBar control.
  */
@JSGlobal("ASPxClientNavBar")
@js.native
class ASPxClientNavBar ()
  extends typings.devexpressWeb.ASPxClientNavBar {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  override var BeginCallback: typings.devexpressWeb.ASPxClientEvent[ASPxClientBeginCallbackEventHandler[typings.devexpressWeb.ASPxClientNavBar]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientNavBar.
    */
  /* CompleteClass */
  override var CallbackError: typings.devexpressWeb.ASPxClientEvent[ASPxClientCallbackErrorEventHandler[typings.devexpressWeb.ASPxClientNavBar]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  override var EndCallback: typings.devexpressWeb.ASPxClientEvent[ASPxClientEndCallbackEventHandler[typings.devexpressWeb.ASPxClientNavBar]] = js.native
  /**
    * Fires on the client side after a group's expansion state has been changed.
    */
  /* CompleteClass */
  override var ExpandedChanged: typings.devexpressWeb.ASPxClientEvent[ASPxClientNavBarGroupEventHandler[typings.devexpressWeb.ASPxClientNavBar]] = js.native
  /**
    * Fires on the client side before the expansion state of a group is changed.
    */
  /* CompleteClass */
  override var ExpandedChanging: typings.devexpressWeb.ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[typings.devexpressWeb.ASPxClientNavBar]] = js.native
  /**
    * Fires when a group header is clicked.
    */
  /* CompleteClass */
  override var HeaderClick: typings.devexpressWeb.ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[typings.devexpressWeb.ASPxClientNavBar]] = js.native
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  override var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  /**
    * Fires after an item has been clicked.
    */
  /* CompleteClass */
  override var ItemClick: typings.devexpressWeb.ASPxClientEvent[ASPxClientNavBarItemEventHandler[typings.devexpressWeb.ASPxClientNavBar]] = js.native
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  /**
    * Collapses all groups of the navbar.
    */
  /* CompleteClass */
  override def CollapseAll(): Unit = js.native
  /**
    * Expands all groups of the navbar.
    */
  /* CompleteClass */
  override def ExpandAll(): Unit = js.native
  /**
    * Returns the navbar's active group.
    */
  /* CompleteClass */
  override def GetActiveGroup(): typings.devexpressWeb.ASPxClientNavBarGroup = js.native
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  /**
    * Returns a group specified by its index. An ASPxClientNavBarGroup object representing the group located at the specified index within the navbar's ASPxNavBar.Groups collection.
    * @param index An integer value specifying the zero-based index of the group object to retrieve.
    */
  /* CompleteClass */
  override def GetGroup(index: Double): typings.devexpressWeb.ASPxClientNavBarGroup = js.native
  /**
    * Returns a group specified by its name. An ASPxClientNavBarGroup object that represents the group with the specified name.
    * @param name A string value specifying the name of the group.
    */
  /* CompleteClass */
  override def GetGroupByName(name: String): typings.devexpressWeb.ASPxClientNavBarGroup = js.native
  /**
    * Returns the number of groups in the navbar.
    */
  /* CompleteClass */
  override def GetGroupCount(): Double = js.native
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  /**
    * Returns an item specified by its name. An ASPxClientNavBarItem object that represents the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  /* CompleteClass */
  override def GetItemByName(name: String): typings.devexpressWeb.ASPxClientNavBarItem = js.native
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  /**
    * Returns the selected item within the navbar control.
    */
  /* CompleteClass */
  override def GetSelectedItem(): typings.devexpressWeb.ASPxClientNavBarItem = js.native
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /**
    * Makes the specified group active.
    * @param group A ASPxClientNavBarGroup object that specifies the active group.
    */
  /* CompleteClass */
  override def SetActiveGroup(group: typings.devexpressWeb.ASPxClientNavBarGroup): Unit = js.native
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  /**
    * Selects the specified item within the navbar control on the client side.
    * @param item An ASPxClientNavBarItem object specifying the item to select.
    */
  /* CompleteClass */
  override def SetSelectedItem(item: typings.devexpressWeb.ASPxClientNavBarItem): Unit = js.native
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientNavBar")
@js.native
object ASPxClientNavBar extends js.Object {
  /**
    * Converts the specified object to the ASPxClientNavBar type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): typings.devexpressWeb.ASPxClientNavBar = js.native
}

