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
    GetQuickActionItem: js.Function1[java.lang.String, ASPxClientRibbonItem],
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
  ): BootstrapClientRibbon = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged, AdjustControl = AdjustControl, CommandExecuted = CommandExecuted, DialogBoxLauncherClicked = DialogBoxLauncherClicked, FileTabClicked = FileTabClicked, GetActiveTab = GetActiveTab, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetHeight = GetHeight, GetItemByName = GetItemByName, GetItemValueByName = GetItemValueByName, GetMainElement = GetMainElement, GetMinimized = GetMinimized, GetParentControl = GetParentControl, GetQuickActionItem = GetQuickActionItem, GetTab = GetTab, GetTabByName = GetTabByName, GetTabCount = GetTabCount, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, KeyTipsClosedOnEscape = KeyTipsClosedOnEscape, MinimizationStateChanged = MinimizationStateChanged, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetActiveTab = SetActiveTab, SetActiveTabIndex = SetActiveTabIndex, SetClientVisible = SetClientVisible, SetContextTabCategoryVisible = SetContextTabCategoryVisible, SetEnabled = SetEnabled, SetHeight = SetHeight, SetItemValueByName = SetItemValueByName, SetMinimized = SetMinimized, SetVisible = SetVisible, SetWidth = SetWidth, ShowKeyTips = ShowKeyTips, name = name)
  
    __obj.asInstanceOf[BootstrapClientRibbon]
  }
}

