package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base for the ASPxClientPageControl objects.
  */
trait ASPxClientTabControlBase extends ASPxClientControl {
  /**
    * Fires on the client side after the active tab has been changed within a tab control.
    */
  var ActiveTabChanged: ASPxClientEvent[ASPxClientTabControlTabEventHandler[ASPxClientTabControlBase]]
  /**
    * Fires on the client side before the active tab is changed within a tab control.
    */
  var ActiveTabChanging: ASPxClientEvent[ASPxClientTabControlTabCancelEventHandler[ASPxClientTabControlBase]]
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTabControlBase]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by a client tab control.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTabControlBase]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTabControlBase]]
  /**
    * Fires when a tab is clicked.
    */
  var TabClick: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]]
  /**
    * Modifies a tab page's size in accordance with the content.
    */
  def AdjustSize(): scala.Unit
  /**
    * Returns the active tab within the tab control.
    */
  def GetActiveTab(): ASPxClientTab
  /**
    * Returns the index of the active tab within the tab control.
    */
  def GetActiveTabIndex(): scala.Double
  /**
    * Returns a tab specified by its index.
    * @param index An integer value specifying the zero-based index of the tab object to retrieve.
    */
  def GetTab(index: scala.Double): ASPxClientTab
  /**
    * Returns a tab specified by its name.
    * @param name A string value specifying the name of the tab.
    */
  def GetTabByName(name: java.lang.String): ASPxClientTab
  /**
    * Returns the number of tabs in the ASPxTabControl.
    */
  def GetTabCount(): scala.Double
  /**
    * Makes the specified tab active within the tab control on the client side.
    * @param tab An ASPxClientTab object specifying the tab to select.
    */
  def SetActiveTab(tab: ASPxClientTab): scala.Unit
  /**
    * Makes a tab active within the tab control, specifying the tab's index.
    * @param index An integer value specifying the index of the tab to select.
    */
  def SetActiveTabIndex(index: scala.Double): scala.Unit
}

object ASPxClientTabControlBase {
  @scala.inline
  def apply(
    ActiveTabChanged: ASPxClientEvent[ASPxClientTabControlTabEventHandler[ASPxClientTabControlBase]],
    ActiveTabChanging: ASPxClientEvent[ASPxClientTabControlTabCancelEventHandler[ASPxClientTabControlBase]],
    AdjustControl: () => scala.Unit,
    AdjustSize: () => scala.Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTabControlBase]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTabControlBase]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTabControlBase]],
    GetActiveTab: () => ASPxClientTab,
    GetActiveTabIndex: () => scala.Double,
    GetClientVisible: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetTab: scala.Double => ASPxClientTab,
    GetTabByName: java.lang.String => ASPxClientTab,
    GetTabCount: () => scala.Double,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetActiveTab: ASPxClientTab => scala.Unit,
    SetActiveTabIndex: scala.Double => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    TabClick: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]],
    name: java.lang.String
  ): ASPxClientTabControlBase = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged, ActiveTabChanging = ActiveTabChanging, AdjustControl = js.Any.fromFunction0(AdjustControl), AdjustSize = js.Any.fromFunction0(AdjustSize), BeginCallback = BeginCallback, CallbackError = CallbackError, EndCallback = EndCallback, GetActiveTab = js.Any.fromFunction0(GetActiveTab), GetActiveTabIndex = js.Any.fromFunction0(GetActiveTabIndex), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetTab = js.Any.fromFunction1(GetTab), GetTabByName = js.Any.fromFunction1(GetTabByName), GetTabCount = js.Any.fromFunction0(GetTabCount), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetActiveTab = js.Any.fromFunction1(SetActiveTab), SetActiveTabIndex = js.Any.fromFunction1(SetActiveTabIndex), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), TabClick = TabClick, name = name)
  
    __obj.asInstanceOf[ASPxClientTabControlBase]
  }
}

