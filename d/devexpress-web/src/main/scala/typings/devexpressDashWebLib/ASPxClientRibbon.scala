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
    AdjustControl: js.Function0[scala.Unit],
    CommandExecuted: ASPxClientEvent[ASPxClientRibbonCommandExecutedEventHandler[ASPxClientRibbon]],
    DialogBoxLauncherClicked: ASPxClientEvent[ASPxClientRibbonDialogBoxLauncherClickedEventHandler[ASPxClientRibbon]],
    FileTabClicked: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]],
    GetActiveTab: js.Function0[ASPxClientRibbonTab],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetItemByName: js.Function1[java.lang.String, ASPxClientRibbonItem],
    GetItemValueByName: js.Function1[java.lang.String, js.Object],
    GetMainElement: js.Function0[js.Object],
    GetMinimized: js.Function0[scala.Boolean],
    GetParentControl: js.Function0[js.Object],
    GetTab: js.Function1[scala.Double, ASPxClientRibbonTab],
    GetTabByName: js.Function1[java.lang.String, ASPxClientRibbonTab],
    GetTabCount: js.Function0[scala.Double],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyTipsClosedOnEscape: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]],
    MinimizationStateChanged: ASPxClientEvent[ASPxClientRibbonMinimizationStateEventHandler[ASPxClientRibbon]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetActiveTab: js.Function1[ASPxClientRibbonTab, scala.Unit],
    SetActiveTabIndex: js.Function1[scala.Double, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetContextTabCategoryVisible: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetItemValueByName: js.Function2[java.lang.String, js.Object, scala.Unit],
    SetMinimized: js.Function1[scala.Boolean, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    ShowKeyTips: js.Function0[scala.Unit],
    name: java.lang.String
  ): ASPxClientRibbon = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged, AdjustControl = AdjustControl, CommandExecuted = CommandExecuted, DialogBoxLauncherClicked = DialogBoxLauncherClicked, FileTabClicked = FileTabClicked, GetActiveTab = GetActiveTab, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetHeight = GetHeight, GetItemByName = GetItemByName, GetItemValueByName = GetItemValueByName, GetMainElement = GetMainElement, GetMinimized = GetMinimized, GetParentControl = GetParentControl, GetTab = GetTab, GetTabByName = GetTabByName, GetTabCount = GetTabCount, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, KeyTipsClosedOnEscape = KeyTipsClosedOnEscape, MinimizationStateChanged = MinimizationStateChanged, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetActiveTab = SetActiveTab, SetActiveTabIndex = SetActiveTabIndex, SetClientVisible = SetClientVisible, SetContextTabCategoryVisible = SetContextTabCategoryVisible, SetEnabled = SetEnabled, SetHeight = SetHeight, SetItemValueByName = SetItemValueByName, SetMinimized = SetMinimized, SetVisible = SetVisible, SetWidth = SetWidth, ShowKeyTips = ShowKeyTips, name = name)
  
    __obj.asInstanceOf[ASPxClientRibbon]
  }
}

