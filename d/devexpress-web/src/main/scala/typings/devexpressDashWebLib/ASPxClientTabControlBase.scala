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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveTabChanged")(ActiveTabChanged)
    __obj.updateDynamic("ActiveTabChanging")(ActiveTabChanging)
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("AdjustSize")(AdjustSize)
    __obj.updateDynamic("BeginCallback")(BeginCallback)
    __obj.updateDynamic("CallbackError")(CallbackError)
    __obj.updateDynamic("EndCallback")(EndCallback)
    __obj.updateDynamic("GetActiveTab")(GetActiveTab)
    __obj.updateDynamic("GetActiveTabIndex")(GetActiveTabIndex)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetTab")(GetTab)
    __obj.updateDynamic("GetTabByName")(GetTabByName)
    __obj.updateDynamic("GetTabCount")(GetTabCount)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetActiveTab")(SetActiveTab)
    __obj.updateDynamic("SetActiveTabIndex")(SetActiveTabIndex)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("TabClick")(TabClick)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientTabControlBase]
  }
}

