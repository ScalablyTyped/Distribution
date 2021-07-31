package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxRibbon control.
  */
trait ASPxClientRibbon
  extends StObject
     with ASPxClientControl {
  
  /**
    * Fires on the client side after the active tab has been changed within a ribbon control.
    */
  var ActiveTabChanged: ASPxClientEvent[ASPxClientRibbonTabEventHandler[ASPxClientRibbon]]
  
  /**
    * Occurs after an end-user executes an action on a ribbon item.
    */
  var CommandExecuted: ASPxClientEvent[ASPxClientRibbonCommandExecutedEventHandler[ASPxClientRibbon]]
  
  /**
    * Fires on the client side after a dialog box launcher has been clicked.
    */
  var DialogBoxLauncherClicked: ASPxClientEvent[ASPxClientRibbonDialogBoxLauncherClickedEventHandler[ASPxClientRibbon]]
  
  /**
    * Occurs when the file tab is clicked.
    */
  var FileTabClicked: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]]
  
  /**
    * Returns the active tab within the ribbon control.
    */
  def GetActiveTab(): ASPxClientRibbonTab
  
  /**
    * Returns a value indicating whether the ribbon is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Returns a ribbon item specified by its name. An ASPxClientRibbonItem object that is the ribbon item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientRibbonItem
  
  /**
    * Returns a value of item with the specified name. An Object that is the value of the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemValueByName(name: String): js.Any
  
  /**
    * Gets a value specifying whether the ribbon is minimized.
    */
  def GetMinimized(): Boolean
  
  /**
    * Returns a tab specified by its index. An ASPxClientRibbonTab object that is the tab located at the specified index within the control's ASPxRibbon.Tabs collection.
    * @param index An integer value specifying the zero-based index of the tab object to retrieve.
    */
  def GetTab(index: Double): ASPxClientRibbonTab
  
  /**
    * Returns a tab specified by its name. An ASPxClientRibbonTab object that is the tab with the specified name.
    * @param name A string value specifying the name of the tab.
    */
  def GetTabByName(name: String): ASPxClientRibbonTab
  
  /**
    * Returns the number of tabs in the ribbon ASPxRibbon.Tabs collection.
    */
  def GetTabCount(): Double
  
  /**
    * Fires after key tips are closed by pressing Esc.
    */
  var KeyTipsClosedOnEscape: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]]
  
  /**
    * Occurs on the client side when the ribbon minimization state is changed by end-user actions.
    */
  var MinimizationStateChanged: ASPxClientEvent[ASPxClientRibbonMinimizationStateEventHandler[ASPxClientRibbon]]
  
  /**
    * Makes the specified tab active in the ribbon control on the client side.
    * @param tab A ASPxClientRibbonTab object specifying the tab selection.
    */
  def SetActiveTab(tab: ASPxClientRibbonTab): Unit
  
  /**
    * Makes a tab active within the ribbon control, specifying the tab's index.
    * @param index An integer value specifying the index of the tab to select.
    */
  def SetActiveTabIndex(index: Double): Unit
  
  /**
    * Specifies the visibility of a context tab category specified by its name.
    * @param categoryName A String value that is the RibbonContextTabCategory.Name property value of the required category.
    * @param visible true to make a category visible; false to make it hidden.
    */
  def SetContextTabCategoryVisible(categoryName: String, visible: Boolean): Unit
  
  /**
    * Specifies whether the ribbon control is enabled.
    * @param enabled true to enable the ribbon; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit
  
  /**
    * Sets the value of the item with the specified name.
    * @param name A string value specifying the name of the item.
    * @param value An object that is the new item value.
    */
  def SetItemValueByName(name: String, value: js.Any): Unit
  
  /**
    * Specifies whether the ribbon is minimized.
    * @param minimized true to set the ribbon state to minimized; false to set the ribbon state to normal.
    */
  def SetMinimized(minimized: Boolean): Unit
  
  /**
    * Shows ribbon key tips.
    */
  def ShowKeyTips(): Unit
}
object ASPxClientRibbon {
  
  @scala.inline
  def apply(
    ActiveTabChanged: ASPxClientEvent[ASPxClientRibbonTabEventHandler[ASPxClientRibbon]],
    AdjustControl: () => Unit,
    CommandExecuted: ASPxClientEvent[ASPxClientRibbonCommandExecutedEventHandler[ASPxClientRibbon]],
    DialogBoxLauncherClicked: ASPxClientEvent[ASPxClientRibbonDialogBoxLauncherClickedEventHandler[ASPxClientRibbon]],
    FileTabClicked: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]],
    GetActiveTab: () => ASPxClientRibbonTab,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetItemByName: String => ASPxClientRibbonItem,
    GetItemValueByName: String => js.Any,
    GetMainElement: () => js.Any,
    GetMinimized: () => Boolean,
    GetParentControl: () => js.Any,
    GetTab: Double => ASPxClientRibbonTab,
    GetTabByName: String => ASPxClientRibbonTab,
    GetTabCount: () => Double,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyTipsClosedOnEscape: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]],
    MinimizationStateChanged: ASPxClientEvent[ASPxClientRibbonMinimizationStateEventHandler[ASPxClientRibbon]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetActiveTab: ASPxClientRibbonTab => Unit,
    SetActiveTabIndex: Double => Unit,
    SetClientVisible: Boolean => Unit,
    SetContextTabCategoryVisible: (String, Boolean) => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetItemValueByName: (String, js.Any) => Unit,
    SetMinimized: Boolean => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ShowKeyTips: () => Unit,
    name: String
  ): ASPxClientRibbon = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged.asInstanceOf[js.Any], AdjustControl = js.Any.fromFunction0(AdjustControl), CommandExecuted = CommandExecuted.asInstanceOf[js.Any], DialogBoxLauncherClicked = DialogBoxLauncherClicked.asInstanceOf[js.Any], FileTabClicked = FileTabClicked.asInstanceOf[js.Any], GetActiveTab = js.Any.fromFunction0(GetActiveTab), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemValueByName = js.Any.fromFunction1(GetItemValueByName), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMinimized = js.Any.fromFunction0(GetMinimized), GetParentControl = js.Any.fromFunction0(GetParentControl), GetTab = js.Any.fromFunction1(GetTab), GetTabByName = js.Any.fromFunction1(GetTabByName), GetTabCount = js.Any.fromFunction0(GetTabCount), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], KeyTipsClosedOnEscape = KeyTipsClosedOnEscape.asInstanceOf[js.Any], MinimizationStateChanged = MinimizationStateChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetActiveTab = js.Any.fromFunction1(SetActiveTab), SetActiveTabIndex = js.Any.fromFunction1(SetActiveTabIndex), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetContextTabCategoryVisible = js.Any.fromFunction2(SetContextTabCategoryVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetItemValueByName = js.Any.fromFunction2(SetItemValueByName), SetMinimized = js.Any.fromFunction1(SetMinimized), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowKeyTips = js.Any.fromFunction0(ShowKeyTips), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbon]
  }
  
  @scala.inline
  implicit class ASPxClientRibbonMutableBuilder[Self <: ASPxClientRibbon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTabChanged(value: ASPxClientEvent[ASPxClientRibbonTabEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "ActiveTabChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandExecuted(value: ASPxClientEvent[ASPxClientRibbonCommandExecutedEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "CommandExecuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogBoxLauncherClicked(value: ASPxClientEvent[ASPxClientRibbonDialogBoxLauncherClickedEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "DialogBoxLauncherClicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTabClicked(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "FileTabClicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetActiveTab(value: () => ASPxClientRibbonTab): Self = StObject.set(x, "GetActiveTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemByName(value: String => ASPxClientRibbonItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemValueByName(value: String => js.Any): Self = StObject.set(x, "GetItemValueByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMinimized(value: () => Boolean): Self = StObject.set(x, "GetMinimized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTab(value: Double => ASPxClientRibbonTab): Self = StObject.set(x, "GetTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTabByName(value: String => ASPxClientRibbonTab): Self = StObject.set(x, "GetTabByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTabCount(value: () => Double): Self = StObject.set(x, "GetTabCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyTipsClosedOnEscape(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "KeyTipsClosedOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizationStateChanged(value: ASPxClientEvent[ASPxClientRibbonMinimizationStateEventHandler[ASPxClientRibbon]]): Self = StObject.set(x, "MinimizationStateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetActiveTab(value: ASPxClientRibbonTab => Unit): Self = StObject.set(x, "SetActiveTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActiveTabIndex(value: Double => Unit): Self = StObject.set(x, "SetActiveTabIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContextTabCategoryVisible(value: (String, Boolean) => Unit): Self = StObject.set(x, "SetContextTabCategoryVisible", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItemValueByName(value: (String, js.Any) => Unit): Self = StObject.set(x, "SetItemValueByName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetMinimized(value: Boolean => Unit): Self = StObject.set(x, "SetMinimized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowKeyTips(value: () => Unit): Self = StObject.set(x, "ShowKeyTips", js.Any.fromFunction0(value))
  }
}
