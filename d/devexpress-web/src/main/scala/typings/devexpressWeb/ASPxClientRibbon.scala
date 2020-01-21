package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxRibbon control.
  */
@JSGlobal("ASPxClientRibbon")
@js.native
class ASPxClientRibbon () extends ASPxClientControl {
  /**
    * Fires on the client side after the active tab has been changed within a ribbon control.
    */
  var ActiveTabChanged: ASPxClientEvent[ASPxClientRibbonTabEventHandler[ASPxClientRibbon]] = js.native
  /**
    * Occurs after an end-user executes an action on a ribbon item.
    */
  var CommandExecuted: ASPxClientEvent[ASPxClientRibbonCommandExecutedEventHandler[ASPxClientRibbon]] = js.native
  /**
    * Fires on the client side after a dialog box launcher has been clicked.
    */
  var DialogBoxLauncherClicked: ASPxClientEvent[ASPxClientRibbonDialogBoxLauncherClickedEventHandler[ASPxClientRibbon]] = js.native
  /**
    * Occurs when the file tab is clicked.
    */
  var FileTabClicked: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]] = js.native
  /**
    * Fires after key tips are closed by pressing Esc.
    */
  var KeyTipsClosedOnEscape: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRibbon]] = js.native
  /**
    * Occurs on the client side when the ribbon minimization state is changed by end-user actions.
    */
  var MinimizationStateChanged: ASPxClientEvent[ASPxClientRibbonMinimizationStateEventHandler[ASPxClientRibbon]] = js.native
  /**
    * Returns the active tab within the ribbon control.
    */
  def GetActiveTab(): ASPxClientRibbonTab = js.native
  /**
    * Returns a value indicating whether the ribbon is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns a ribbon item specified by its name. An ASPxClientRibbonItem object that is the ribbon item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientRibbonItem = js.native
  /**
    * Returns a value of item with the specified name. An Object that is the value of the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemValueByName(name: String): js.Any = js.native
  /**
    * Gets a value specifying whether the ribbon is minimized.
    */
  def GetMinimized(): Boolean = js.native
  /**
    * Returns a tab specified by its index. An ASPxClientRibbonTab object that is the tab located at the specified index within the control's ASPxRibbon.Tabs collection.
    * @param index An integer value specifying the zero-based index of the tab object to retrieve.
    */
  def GetTab(index: Double): ASPxClientRibbonTab = js.native
  /**
    * Returns a tab specified by its name. An ASPxClientRibbonTab object that is the tab with the specified name.
    * @param name A string value specifying the name of the tab.
    */
  def GetTabByName(name: String): ASPxClientRibbonTab = js.native
  /**
    * Returns the number of tabs in the ribbon ASPxRibbon.Tabs collection.
    */
  def GetTabCount(): Double = js.native
  /**
    * Makes the specified tab active in the ribbon control on the client side.
    * @param tab A ASPxClientRibbonTab object specifying the tab selection.
    */
  def SetActiveTab(tab: ASPxClientRibbonTab): Unit = js.native
  /**
    * Makes a tab active within the ribbon control, specifying the tab's index.
    * @param index An integer value specifying the index of the tab to select.
    */
  def SetActiveTabIndex(index: Double): Unit = js.native
  /**
    * Specifies the visibility of a context tab category specified by its name.
    * @param categoryName A String value that is the RibbonContextTabCategory.Name property value of the required category.
    * @param visible true to make a category visible; false to make it hidden.
    */
  def SetContextTabCategoryVisible(categoryName: String, visible: Boolean): Unit = js.native
  /**
    * Specifies whether the ribbon control is enabled.
    * @param enabled true to enable the ribbon; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit = js.native
  /**
    * Sets the value of the item with the specified name.
    * @param name A string value specifying the name of the item.
    * @param value An object that is the new item value.
    */
  def SetItemValueByName(name: String, value: js.Any): Unit = js.native
  /**
    * Specifies whether the ribbon is minimized.
    * @param minimized true to set the ribbon state to minimized; false to set the ribbon state to normal.
    */
  def SetMinimized(minimized: Boolean): Unit = js.native
  /**
    * Shows ribbon key tips.
    */
  def ShowKeyTips(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientRibbon")
@js.native
object ASPxClientRibbon extends js.Object {
  /**
    * Converts the specified object to the ASPxClientRibbon type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientRibbon = js.native
}

