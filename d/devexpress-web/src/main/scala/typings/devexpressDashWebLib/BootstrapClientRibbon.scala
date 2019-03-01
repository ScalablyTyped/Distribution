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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveTabChanged")(ActiveTabChanged)
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("CommandExecuted")(CommandExecuted)
    __obj.updateDynamic("DialogBoxLauncherClicked")(DialogBoxLauncherClicked)
    __obj.updateDynamic("FileTabClicked")(FileTabClicked)
    __obj.updateDynamic("GetActiveTab")(GetActiveTab)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetItemByName")(GetItemByName)
    __obj.updateDynamic("GetItemValueByName")(GetItemValueByName)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetMinimized")(GetMinimized)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetQuickActionItem")(GetQuickActionItem)
    __obj.updateDynamic("GetTab")(GetTab)
    __obj.updateDynamic("GetTabByName")(GetTabByName)
    __obj.updateDynamic("GetTabCount")(GetTabCount)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("KeyTipsClosedOnEscape")(KeyTipsClosedOnEscape)
    __obj.updateDynamic("MinimizationStateChanged")(MinimizationStateChanged)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetActiveTab")(SetActiveTab)
    __obj.updateDynamic("SetActiveTabIndex")(SetActiveTabIndex)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetContextTabCategoryVisible")(SetContextTabCategoryVisible)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetItemValueByName")(SetItemValueByName)
    __obj.updateDynamic("SetMinimized")(SetMinimized)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("ShowKeyTips")(ShowKeyTips)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BootstrapClientRibbon]
  }
}

