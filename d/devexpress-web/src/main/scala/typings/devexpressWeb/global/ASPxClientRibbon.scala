package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientRibbonCommandExecutedEventHandler
import typings.devexpressWeb.ASPxClientRibbonDialogBoxLauncherClickedEventHandler
import typings.devexpressWeb.ASPxClientRibbonMinimizationStateEventHandler
import typings.devexpressWeb.ASPxClientRibbonTabEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxRibbon control.
  */
@JSGlobal("ASPxClientRibbon")
@js.native
class ASPxClientRibbon ()
  extends typings.devexpressWeb.ASPxClientRibbon {
  /**
    * Fires on the client side after the active tab has been changed within a ribbon control.
    */
  /* CompleteClass */
  override var ActiveTabChanged: typings.devexpressWeb.ASPxClientEvent[ASPxClientRibbonTabEventHandler[typings.devexpressWeb.ASPxClientRibbon]] = js.native
  /**
    * Occurs after an end-user executes an action on a ribbon item.
    */
  /* CompleteClass */
  override var CommandExecuted: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientRibbonCommandExecutedEventHandler[typings.devexpressWeb.ASPxClientRibbon]
  ] = js.native
  /**
    * Fires on the client side after a dialog box launcher has been clicked.
    */
  /* CompleteClass */
  override var DialogBoxLauncherClicked: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientRibbonDialogBoxLauncherClickedEventHandler[typings.devexpressWeb.ASPxClientRibbon]
  ] = js.native
  /**
    * Occurs when the file tab is clicked.
    */
  /* CompleteClass */
  override var FileTabClicked: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientRibbon]] = js.native
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  override var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  /**
    * Fires after key tips are closed by pressing Esc.
    */
  /* CompleteClass */
  override var KeyTipsClosedOnEscape: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientRibbon]] = js.native
  /**
    * Occurs on the client side when the ribbon minimization state is changed by end-user actions.
    */
  /* CompleteClass */
  override var MinimizationStateChanged: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientRibbonMinimizationStateEventHandler[typings.devexpressWeb.ASPxClientRibbon]
  ] = js.native
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  /**
    * Returns the active tab within the ribbon control.
    */
  /* CompleteClass */
  override def GetActiveTab(): typings.devexpressWeb.ASPxClientRibbonTab = js.native
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  /**
    * Returns a value indicating whether the ribbon is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  /**
    * Returns a ribbon item specified by its name. An ASPxClientRibbonItem object that is the ribbon item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  /* CompleteClass */
  override def GetItemByName(name: String): typings.devexpressWeb.ASPxClientRibbonItem = js.native
  /**
    * Returns a value of item with the specified name. An Object that is the value of the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  /* CompleteClass */
  override def GetItemValueByName(name: String): js.Any = js.native
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  /**
    * Gets a value specifying whether the ribbon is minimized.
    */
  /* CompleteClass */
  override def GetMinimized(): Boolean = js.native
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  /**
    * Returns a tab specified by its index. An ASPxClientRibbonTab object that is the tab located at the specified index within the control's ASPxRibbon.Tabs collection.
    * @param index An integer value specifying the zero-based index of the tab object to retrieve.
    */
  /* CompleteClass */
  override def GetTab(index: Double): typings.devexpressWeb.ASPxClientRibbonTab = js.native
  /**
    * Returns a tab specified by its name. An ASPxClientRibbonTab object that is the tab with the specified name.
    * @param name A string value specifying the name of the tab.
    */
  /* CompleteClass */
  override def GetTabByName(name: String): typings.devexpressWeb.ASPxClientRibbonTab = js.native
  /**
    * Returns the number of tabs in the ribbon ASPxRibbon.Tabs collection.
    */
  /* CompleteClass */
  override def GetTabCount(): Double = js.native
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /**
    * Makes the specified tab active in the ribbon control on the client side.
    * @param tab A ASPxClientRibbonTab object specifying the tab selection.
    */
  /* CompleteClass */
  override def SetActiveTab(tab: typings.devexpressWeb.ASPxClientRibbonTab): Unit = js.native
  /**
    * Makes a tab active within the ribbon control, specifying the tab's index.
    * @param index An integer value specifying the index of the tab to select.
    */
  /* CompleteClass */
  override def SetActiveTabIndex(index: Double): Unit = js.native
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the visibility of a context tab category specified by its name.
    * @param categoryName A String value that is the RibbonContextTabCategory.Name property value of the required category.
    * @param visible true to make a category visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetContextTabCategoryVisible(categoryName: String, visible: Boolean): Unit = js.native
  /**
    * Specifies whether the ribbon control is enabled.
    * @param enabled true to enable the ribbon; false to disable it.
    */
  /* CompleteClass */
  override def SetEnabled(enabled: Boolean): Unit = js.native
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  /**
    * Sets the value of the item with the specified name.
    * @param name A string value specifying the name of the item.
    * @param value An object that is the new item value.
    */
  /* CompleteClass */
  override def SetItemValueByName(name: String, value: js.Any): Unit = js.native
  /**
    * Specifies whether the ribbon is minimized.
    * @param minimized true to set the ribbon state to minimized; false to set the ribbon state to normal.
    */
  /* CompleteClass */
  override def SetMinimized(minimized: Boolean): Unit = js.native
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  /**
    * Shows ribbon key tips.
    */
  /* CompleteClass */
  override def ShowKeyTips(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientRibbon")
@js.native
object ASPxClientRibbon extends js.Object {
  /**
    * Converts the specified object to the ASPxClientRibbon type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): typings.devexpressWeb.ASPxClientRibbon = js.native
}

