package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapRibbon control.
  */
@js.native
trait BootstrapClientRibbon extends ASPxClientRibbon {
  
  def GetQuickAccessToolbarItem(name: String): ASPxClientRibbonItem = js.native
}
object BootstrapClientRibbon {
  
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
    GetQuickAccessToolbarItem: String => ASPxClientRibbonItem,
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
  ): BootstrapClientRibbon = {
    val __obj = js.Dynamic.literal(ActiveTabChanged = ActiveTabChanged.asInstanceOf[js.Any], AdjustControl = js.Any.fromFunction0(AdjustControl), CommandExecuted = CommandExecuted.asInstanceOf[js.Any], DialogBoxLauncherClicked = DialogBoxLauncherClicked.asInstanceOf[js.Any], FileTabClicked = FileTabClicked.asInstanceOf[js.Any], GetActiveTab = js.Any.fromFunction0(GetActiveTab), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemValueByName = js.Any.fromFunction1(GetItemValueByName), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMinimized = js.Any.fromFunction0(GetMinimized), GetParentControl = js.Any.fromFunction0(GetParentControl), GetQuickAccessToolbarItem = js.Any.fromFunction1(GetQuickAccessToolbarItem), GetTab = js.Any.fromFunction1(GetTab), GetTabByName = js.Any.fromFunction1(GetTabByName), GetTabCount = js.Any.fromFunction0(GetTabCount), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], KeyTipsClosedOnEscape = KeyTipsClosedOnEscape.asInstanceOf[js.Any], MinimizationStateChanged = MinimizationStateChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetActiveTab = js.Any.fromFunction1(SetActiveTab), SetActiveTabIndex = js.Any.fromFunction1(SetActiveTabIndex), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetContextTabCategoryVisible = js.Any.fromFunction2(SetContextTabCategoryVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetItemValueByName = js.Any.fromFunction2(SetItemValueByName), SetMinimized = js.Any.fromFunction1(SetMinimized), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowKeyTips = js.Any.fromFunction0(ShowKeyTips), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientRibbon]
  }
  
  @scala.inline
  implicit class BootstrapClientRibbonOps[Self <: BootstrapClientRibbon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetQuickAccessToolbarItem(value: String => ASPxClientRibbonItem): Self = this.set("GetQuickAccessToolbarItem", js.Any.fromFunction1(value))
  }
}
