package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a base for the ASPxClientTabControl and ASPxClientPageControl objects.
  */
trait ASPxClientTabControlBase
  extends StObject
     with ASPxClientControl {
  
  /**
    * Fires on the client side after the active tab has been changed within a tab control.
    */
  var ActiveTabChanged: ASPxClientEvent[ASPxClientTabControlTabEventHandler[ASPxClientTabControlBase]]
  
  /**
    * Fires on the client side before the active tab is changed within a tab control.
    */
  var ActiveTabChanging: ASPxClientEvent[ASPxClientTabControlTabCancelEventHandler[ASPxClientTabControlBase]]
  
  /**
    * Modifies a tab page's size in accordance with the content.
    */
  def AdjustSize(): Unit
  
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
    * Returns the active tab within the tab control.
    */
  def GetActiveTab(): ASPxClientTab
  
  /**
    * Returns the index of the active tab within the tab control.
    */
  def GetActiveTabIndex(): Double
  
  /**
    * Returns a tab specified by its index. An ASPxClientTab object representing the tab located at the specified index within the control's ASPxTabControl.Tabs collection.
    * @param index An integer value specifying the zero-based index of the tab object to retrieve.
    */
  def GetTab(index: Double): ASPxClientTab
  
  /**
    * Returns a tab specified by its name. An ASPxClientTab object that represents the tab with the specified name.
    * @param name A string value specifying the name of the tab.
    */
  def GetTabByName(name: String): ASPxClientTab
  
  /**
    * Returns the number of tabs in the ASPxTabControl.
    */
  def GetTabCount(): Double
  
  /**
    * Makes the specified tab active within the tab control on the client side.
    * @param tab An ASPxClientTab object specifying the tab to select.
    */
  def SetActiveTab(tab: ASPxClientTab): Unit
  
  /**
    * Makes a tab active within the tab control, specifying the tab's index.
    * @param index An integer value specifying the index of the tab to select.
    */
  def SetActiveTabIndex(index: Double): Unit
  
  /**
    * Fires when a tab is clicked.
    */
  var TabClick: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]]
}
object ASPxClientTabControlBase {
  
  @scala.inline
  def apply(
    ActiveTabChanged: ASPxClientEvent[ASPxClientTabControlTabEventHandler[ASPxClientTabControlBase]],
    ActiveTabChanging: ASPxClientEvent[ASPxClientTabControlTabCancelEventHandler[ASPxClientTabControlBase]],
    AdjustControl: () => Unit,
    AdjustSize: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTabControlBase]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTabControlBase]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTabControlBase]],
    GetActiveTab: () => ASPxClientTab,
    GetActiveTabIndex: () => Double,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetTab: Double => ASPxClientTab,
    GetTabByName: String => ASPxClientTab,
    GetTabCount: () => Double,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetActiveTab: ASPxClientTab => Unit,
    SetActiveTabIndex: Double => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    TabClick: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]],
    name: String
  ): ASPxClientTabControlBase = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged.asInstanceOf[js.Any], ActiveTabChanging = ActiveTabChanging.asInstanceOf[js.Any], AdjustControl = js.Any.fromFunction0(AdjustControl), AdjustSize = js.Any.fromFunction0(AdjustSize), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], GetActiveTab = js.Any.fromFunction0(GetActiveTab), GetActiveTabIndex = js.Any.fromFunction0(GetActiveTabIndex), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetTab = js.Any.fromFunction1(GetTab), GetTabByName = js.Any.fromFunction1(GetTabByName), GetTabCount = js.Any.fromFunction0(GetTabCount), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetActiveTab = js.Any.fromFunction1(SetActiveTab), SetActiveTabIndex = js.Any.fromFunction1(SetActiveTabIndex), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), TabClick = TabClick.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTabControlBase]
  }
  
  @scala.inline
  implicit class ASPxClientTabControlBaseMutableBuilder[Self <: ASPxClientTabControlBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTabChanged(value: ASPxClientEvent[ASPxClientTabControlTabEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "ActiveTabChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTabChanging(value: ASPxClientEvent[ASPxClientTabControlTabCancelEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "ActiveTabChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustSize(value: () => Unit): Self = StObject.set(x, "AdjustSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetActiveTab(value: () => ASPxClientTab): Self = StObject.set(x, "GetActiveTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveTabIndex(value: () => Double): Self = StObject.set(x, "GetActiveTabIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTab(value: Double => ASPxClientTab): Self = StObject.set(x, "GetTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTabByName(value: String => ASPxClientTab): Self = StObject.set(x, "GetTabByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTabCount(value: () => Double): Self = StObject.set(x, "GetTabCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetActiveTab(value: ASPxClientTab => Unit): Self = StObject.set(x, "SetActiveTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActiveTabIndex(value: Double => Unit): Self = StObject.set(x, "SetActiveTabIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabClick(value: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]]): Self = StObject.set(x, "TabClick", value.asInstanceOf[js.Any])
  }
}
