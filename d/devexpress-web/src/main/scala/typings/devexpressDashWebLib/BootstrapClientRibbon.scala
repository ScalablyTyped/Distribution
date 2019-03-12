package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapClientRibbon extends ASPxClientRibbon {
  /**
    * 
    * @param name 
    */
  def GetQuickActionItem(name: java.lang.String): ASPxClientRibbonItem
}

object BootstrapClientRibbon {
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
    GetQuickActionItem: java.lang.String => ASPxClientRibbonItem,
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
  ): BootstrapClientRibbon = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged, AdjustControl = js.Any.fromFunction0(AdjustControl), CommandExecuted = CommandExecuted, DialogBoxLauncherClicked = DialogBoxLauncherClicked, FileTabClicked = FileTabClicked, GetActiveTab = js.Any.fromFunction0(GetActiveTab), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemValueByName = js.Any.fromFunction1(GetItemValueByName), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMinimized = js.Any.fromFunction0(GetMinimized), GetParentControl = js.Any.fromFunction0(GetParentControl), GetQuickActionItem = js.Any.fromFunction1(GetQuickActionItem), GetTab = js.Any.fromFunction1(GetTab), GetTabByName = js.Any.fromFunction1(GetTabByName), GetTabCount = js.Any.fromFunction0(GetTabCount), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, KeyTipsClosedOnEscape = KeyTipsClosedOnEscape, MinimizationStateChanged = MinimizationStateChanged, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetActiveTab = js.Any.fromFunction1(SetActiveTab), SetActiveTabIndex = js.Any.fromFunction1(SetActiveTabIndex), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetContextTabCategoryVisible = js.Any.fromFunction2(SetContextTabCategoryVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetItemValueByName = js.Any.fromFunction2(SetItemValueByName), SetMinimized = js.Any.fromFunction1(SetMinimized), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowKeyTips = js.Any.fromFunction0(ShowKeyTips), name = name)
  
    __obj.asInstanceOf[BootstrapClientRibbon]
  }
}

