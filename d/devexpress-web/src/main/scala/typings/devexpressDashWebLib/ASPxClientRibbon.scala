package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxRibbon control.
  */
trait ASPxClientRibbon extends ASPxClientControl {
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
    * Fires after key tips are closed by pressing Esc.
    */
  var KeyTipsClosedOnEscape: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]]
  /**
    * Occurs on the client side when the ribbon minimization state is changed by end-user actions.
    */
  var MinimizationStateChanged: ASPxClientEvent[ASPxClientRibbonMinimizationStateEventHandler[ASPxClientRibbon]]
  /**
    * Returns the active tab within the ribbon control.
    */
  def GetActiveTab(): ASPxClientRibbonTab
  /**
    * Returns a value indicating whether the ribbon is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Returns a ribbon item specified by its name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: java.lang.String): ASPxClientRibbonItem
  /**
    * Returns a value of item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemValueByName(name: java.lang.String): js.Object
  /**
    * Gets a value specifying whether the ribbon is minimized.
    */
  def GetMinimized(): scala.Boolean
  /**
    * Returns a tab specified by its index.
    * @param index An integer value specifying the zero-based index of the tab object to retrieve.
    */
  def GetTab(index: scala.Double): ASPxClientRibbonTab
  /**
    * Returns a tab specified by its name.
    * @param name A string value specifying the name of the tab.
    */
  def GetTabByName(name: java.lang.String): ASPxClientRibbonTab
  /**
    * Returns the number of tabs in the ribbon Tabs collection.
    */
  def GetTabCount(): scala.Double
  /**
    * Makes the specified tab active in the ribbon control on the client side.
    * @param tab A ASPxClientRibbonTab object specifying the tab selection.
    */
  def SetActiveTab(tab: ASPxClientRibbonTab): scala.Unit
  /**
    * Makes a tab active within the ribbon control, specifying the tab's index.
    * @param index An integer value specifying the index of the tab to select.
    */
  def SetActiveTabIndex(index: scala.Double): scala.Unit
  /**
    * Specifies the visibility of a context tab category specified by its name.
    * @param categoryName A Name property value of the required category.
    * @param visible true to make a category visible; false to make it hidden.
    */
  def SetContextTabCategoryVisible(categoryName: java.lang.String, visible: scala.Boolean): scala.Unit
  /**
    * Specifies whether the ribbon control is enabled.
    * @param enabled true to enable the ribbon; false to disable it.
    */
  def SetEnabled(enabled: scala.Boolean): scala.Unit
  /**
    * Sets the value of the item with the specified name.
    * @param name A string value specifying the name of the item.
    * @param value An object that is the new item value.
    */
  def SetItemValueByName(name: java.lang.String, value: js.Object): scala.Unit
  /**
    * Specifies whether the ribbon is minimized.
    * @param minimized true to set the ribbon state to minimized; false to set the ribbon state to normal.
    */
  def SetMinimized(minimized: scala.Boolean): scala.Unit
  /**
    * Shows ribbon key tips.
    */
  def ShowKeyTips(): scala.Unit
}

object ASPxClientRibbon {
  @scala.inline
  def apply(
    ActiveTabChanged: ASPxClientEvent[ASPxClientRibbonTabEventHandler[ASPxClientRibbon]],
    AdjustControl: () => scala.Unit,
    CommandExecuted: ASPxClientEvent[ASPxClientRibbonCommandExecutedEventHandler[ASPxClientRibbon]],
    DialogBoxLauncherClicked: ASPxClientEvent[ASPxClientRibbonDialogBoxLauncherClickedEventHandler[ASPxClientRibbon]],
    FileTabClicked: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]],
    GetActiveTab: () => ASPxClientRibbonTab,
    GetClientVisible: () => scala.Boolean,
    GetEnabled: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetItemByName: java.lang.String => ASPxClientRibbonItem,
    GetItemValueByName: java.lang.String => js.Object,
    GetMainElement: () => js.Object,
    GetMinimized: () => scala.Boolean,
    GetParentControl: () => js.Object,
    GetTab: scala.Double => ASPxClientRibbonTab,
    GetTabByName: java.lang.String => ASPxClientRibbonTab,
    GetTabCount: () => scala.Double,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyTipsClosedOnEscape: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]],
    MinimizationStateChanged: ASPxClientEvent[ASPxClientRibbonMinimizationStateEventHandler[ASPxClientRibbon]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetActiveTab: ASPxClientRibbonTab => scala.Unit,
    SetActiveTabIndex: scala.Double => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetContextTabCategoryVisible: (java.lang.String, scala.Boolean) => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetItemValueByName: (java.lang.String, js.Object) => scala.Unit,
    SetMinimized: scala.Boolean => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    ShowKeyTips: () => scala.Unit,
    name: java.lang.String
  ): ASPxClientRibbon = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged, AdjustControl = js.Any.fromFunction0(AdjustControl), CommandExecuted = CommandExecuted, DialogBoxLauncherClicked = DialogBoxLauncherClicked, FileTabClicked = FileTabClicked, GetActiveTab = js.Any.fromFunction0(GetActiveTab), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemValueByName = js.Any.fromFunction1(GetItemValueByName), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMinimized = js.Any.fromFunction0(GetMinimized), GetParentControl = js.Any.fromFunction0(GetParentControl), GetTab = js.Any.fromFunction1(GetTab), GetTabByName = js.Any.fromFunction1(GetTabByName), GetTabCount = js.Any.fromFunction0(GetTabCount), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, KeyTipsClosedOnEscape = KeyTipsClosedOnEscape, MinimizationStateChanged = MinimizationStateChanged, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetActiveTab = js.Any.fromFunction1(SetActiveTab), SetActiveTabIndex = js.Any.fromFunction1(SetActiveTabIndex), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetContextTabCategoryVisible = js.Any.fromFunction2(SetContextTabCategoryVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetItemValueByName = js.Any.fromFunction2(SetItemValueByName), SetMinimized = js.Any.fromFunction1(SetMinimized), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowKeyTips = js.Any.fromFunction0(ShowKeyTips), name = name)
  
    __obj.asInstanceOf[ASPxClientRibbon]
  }
}

