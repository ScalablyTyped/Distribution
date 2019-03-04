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
    AdjustControl: js.Function0[scala.Unit],
    AdjustSize: js.Function0[scala.Unit],
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTabControlBase]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTabControlBase]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTabControlBase]],
    GetActiveTab: js.Function0[ASPxClientTab],
    GetActiveTabIndex: js.Function0[scala.Double],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetTab: js.Function1[scala.Double, ASPxClientTab],
    GetTabByName: js.Function1[java.lang.String, ASPxClientTab],
    GetTabCount: js.Function0[scala.Double],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetActiveTab: js.Function1[ASPxClientTab, scala.Unit],
    SetActiveTabIndex: js.Function1[scala.Double, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    TabClick: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]],
    name: java.lang.String
  ): ASPxClientTabControlBase = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged, ActiveTabChanging = ActiveTabChanging, AdjustControl = AdjustControl, AdjustSize = AdjustSize, BeginCallback = BeginCallback, CallbackError = CallbackError, EndCallback = EndCallback, GetActiveTab = GetActiveTab, GetActiveTabIndex = GetActiveTabIndex, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetTab = GetTab, GetTabByName = GetTabByName, GetTabCount = GetTabCount, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetActiveTab = SetActiveTab, SetActiveTabIndex = SetActiveTabIndex, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, TabClick = TabClick, name = name)
  
    __obj.asInstanceOf[ASPxClientTabControlBase]
  }
}

