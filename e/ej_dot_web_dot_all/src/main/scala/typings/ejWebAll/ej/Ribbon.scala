package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ribbon
  extends StObject
     with Widget_ {
  
  /** Add new option to Backstage page.
    * @param {any} select the object to add the backstage item
    * @param {number} index to the backstage item this is optional.
    * @returns {void}
    */
  def addBackStageItem(item: Any): Unit = js.native
  def addBackStageItem(item: Any, index: Double): Unit = js.native
  
  /** Adds contextual tab or contextual tab set dynamically in the ribbon control with contextual tabs object and index position. When index is null, ribbon contextual tab or contextual
    * tab set is added at the last index.
    * @param {any} contextual tab or contextual tab set object.
    * @param {number} index of the contextual tab or contextual tab set, this is optional.
    * @returns {void}
    */
  def addContextualTabs(contextualTabSet: Any): Unit = js.native
  def addContextualTabs(contextualTabSet: Any, index: Double): Unit = js.native
  
  /** Adds tab dynamically in the ribbon control with given name, tab group array and index position. When index is null, ribbon tab is added at the last index.
    * @param {string} ribbon tab display text.
    * @param {any[]} groups to be displayed in ribbon tab .
    * @param {number} index of the ribbon tab,this is optional.
    * @returns {void}
    */
  def addTab(tabText: String, ribbonGroups: js.Array[Any]): Unit = js.native
  def addTab(tabText: String, ribbonGroups: js.Array[Any], index: Double): Unit = js.native
  
  /** Adds tab group dynamically in the ribbon control with given tab index, tab group object and group index position. When group index is null, ribbon group is added at the last index.
    * @param {number} ribbon tab index.
    * @param {any} group to be displayed in ribbon tab .
    * @param {number} index of the ribbon group,this is optional.
    * @returns {void}
    */
  def addTabGroup(tabIndex: Double, tabGroup: Any): Unit = js.native
  def addTabGroup(tabIndex: Double, tabGroup: Any, groupIndex: Double): Unit = js.native
  
  /** Adds group content dynamically in the ribbon control with given tab index, group index, content, content index and sub group index position. When content index is null, content is
    * added at the last index.
    * @param {number} ribbon tab index.
    * @param {number} ribbon group index.
    * @param {any} content to be displayed in the ribbon group.
    * @param {number} ribbon content index. This is optional. If the value is not given, then by default contentIndex will be considered as 0.
    * @param {number} sub group index in the ribbon group. This is optional. If the value is not given, then by default contentIndex will be considered as 0.
    * @returns {void}
    */
  def addTabGroupContent(tabIndex: Double, groupIndex: Double, content: Any): Unit = js.native
  def addTabGroupContent(tabIndex: Double, groupIndex: Double, content: Any, contentIndex: Double): Unit = js.native
  def addTabGroupContent(tabIndex: Double, groupIndex: Double, content: Any, contentIndex: Double, subGroupIndex: Double): Unit = js.native
  def addTabGroupContent(tabIndex: Double, groupIndex: Double, content: Any, contentIndex: Unit, subGroupIndex: Double): Unit = js.native
  
  /** Collapses the ribbon tab content.
    * @returns {void}
    */
  def collapse(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Expands the ribbon tab content.
    * @returns {void}
    */
  def expand(): Unit = js.native
  
  /** Gets text of the given index tab in the ribbon control.
    * @param {number} index of the tab item.
    * @returns {string}
    */
  def getTabText(index: Double): String = js.native
  
  /** Hides the ribbon backstage page.
    * @returns {void}
    */
  def hideBackstage(): Unit = js.native
  
  /** Hides the given text tab in the ribbon control.
    * @param {string} text of the tab item.
    * @returns {void}
    */
  def hideTab(text: String): Unit = js.native
  
  /** Checks whether the given text tab in the ribbon control is enabled or not.
    * @param {string} text of the tab item.
    * @returns {boolean}
    */
  def isEnable(text: String): Boolean = js.native
  
  /** Checks whether the given text tab in the ribbon control is visible or not.
    * @param {string} text of the tab item.
    * @returns {boolean}
    */
  def isVisible(text: String): Boolean = js.native
  
  @JSName("model")
  var model_Ribbon: Model = js.native
  
  /** Remove option from Backstage.
    * @param {number} index to the backstage item
    * @returns {void}
    */
  def removeBackStageItem(index: Double): Unit = js.native
  
  /** Removes the given index tab item from the ribbon control.
    * @param {number} index of tab item.
    * @returns {void}
    */
  def removeTab(index: Double): Unit = js.native
  
  /** To customize whole content from Tab Group.
    * @param {number} ribbon tab index.
    * @param {string} ribbon group text.
    * @param {number} ribbon content index. This is optional. If the value is not given, all content groups will be removed.
    * @param {number} sub group index in the ribbon group. This is optional. If the value is not given, all content groups will be removed.
    * @returns {void}
    */
  def removeTabGroupContent(tabIndex: Double, groupText: String): Unit = js.native
  def removeTabGroupContent(tabIndex: Double, groupText: String, contentIndex: Double): Unit = js.native
  def removeTabGroupContent(tabIndex: Double, groupText: String, contentIndex: Double, subGroupIndex: Double): Unit = js.native
  def removeTabGroupContent(tabIndex: Double, groupText: String, contentIndex: Unit, subGroupIndex: Double): Unit = js.native
  
  /** Sets new text to the given text tab in the ribbon control.
    * @param {string} current text of the tab item.
    * @param {string} new text of the tab item.
    * @returns {void}
    */
  def setTabText(tabText: String, newText: String): Unit = js.native
  
  /** Displays the ribbon backstage page.
    * @returns {void}
    */
  def showBackstage(): Unit = js.native
  
  /** Displays the given text tab in the ribbon control.
    * @param {string} text of the tab item.
    * @returns {void}
    */
  def showTab(text: String): Unit = js.native
  
  /** Update option in existing Backstage.
    * @param {number} index to the backstage item
    * @param {any} select the object to add the backstage item
    * @returns {void}
    */
  def updateBackStageItem(index: Double): Unit = js.native
  def updateBackStageItem(index: Double, item: Any): Unit = js.native
  
  /** To customize Group alone in the inside content.
    * @param {number} ribbon tab index.
    * @param {string} group id to be displayed in ribbon tab .
    * @param {any} contentGroup is used in the object
    * @returns {void}
    */
  def updateGroup(tabIndex: Double, groupId: String): Unit = js.native
  def updateGroup(tabIndex: Double, groupId: String, contentGroup: Any): Unit = js.native
}
object Ribbon {
  
  @js.native
  sealed trait AlignType extends StObject
  @JSGlobal("ej.Ribbon.AlignType")
  @js.native
  object AlignType extends StObject {
    
    ///To align group content's in columns
    @js.native
    sealed trait Columns
      extends StObject
         with AlignType
    
    ///To align the group content's in row
    @js.native
    sealed trait Rows
      extends StObject
         with AlignType
  }
  
  @js.native
  sealed trait ApplicationTabType extends StObject
  @JSGlobal("ej.Ribbon.ApplicationTabType")
  @js.native
  object ApplicationTabType extends StObject {
    
    ///applicationTab display as backstage
    @js.native
    sealed trait Backstage
      extends StObject
         with ApplicationTabType
    
    ///applicationTab display as menu
    @js.native
    sealed trait Menu
      extends StObject
         with ApplicationTabType
  }
  
  @js.native
  sealed trait CustomItemType extends StObject
  @JSGlobal("ej.Ribbon.CustomItemType")
  @js.native
  object CustomItemType extends StObject {
    
    ///Specifies the button type in customGalleryItems
    @js.native
    sealed trait Button
      extends StObject
         with CustomItemType
    
    ///Specifies the menu type in customGalleryItems
    @js.native
    sealed trait Menu
      extends StObject
         with CustomItemType
  }
  
  @js.native
  sealed trait ItemType extends StObject
  @JSGlobal("ej.Ribbon.ItemType")
  @js.native
  object ItemType extends StObject {
    
    ///To render the button for ribbon backstage pageâ€™s contents
    @js.native
    sealed trait Button
      extends StObject
         with ItemType
    
    ///To render the tab for ribbon backstage pageâ€™s contents
    @js.native
    sealed trait Tab
      extends StObject
         with ItemType
  }
  
  @js.native
  sealed trait QuickAccessMode extends StObject
  @JSGlobal("ej.Ribbon.QuickAccessMode")
  @js.native
  object QuickAccessMode extends StObject {
    
    ///Add controls in menu
    @js.native
    sealed trait Menu
      extends StObject
         with QuickAccessMode
    
    ///Controls are hidden in Quick Access toolbar
    @js.native
    sealed trait None
      extends StObject
         with QuickAccessMode
    
    ///Add controls in toolBar
    @js.native
    sealed trait ToolBar
      extends StObject
         with QuickAccessMode
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSGlobal("ej.Ribbon.Type")
  @js.native
  object Type extends StObject {
    
    ///Specifies the button control
    @js.native
    sealed trait Button
      extends StObject
         with typings.ejWebAll.ej.Ribbon.Type
    
    ///To append external element's
    @js.native
    sealed trait Custom
      extends StObject
         with typings.ejWebAll.ej.Ribbon.Type
    
    ///Specifies the dropDown
    @js.native
    sealed trait DropDownList
      extends StObject
         with typings.ejWebAll.ej.Ribbon.Type
    
    ///Specifies the ribbon gallery
    @js.native
    sealed trait Gallery
      extends StObject
         with typings.ejWebAll.ej.Ribbon.Type
    
    ///Specifies the split button
    @js.native
    sealed trait SplitButton
      extends StObject
         with typings.ejWebAll.ej.Ribbon.Type
    
    ///Specifies the toggle button
    @js.native
    sealed trait ToggleButton
      extends StObject
         with typings.ejWebAll.ej.Ribbon.Type
  }
  
  trait ApplicationTab extends StObject {
    
    /** Specifies the ribbon backstage page items.
      * @default {Object}
      */
    var backstageSettings: js.UndefOr[ApplicationTabBackstageSettings] = js.undefined
    
    /** Specifies the ID of ul list to create application menu in the ribbon control.
      * @default {null}
      */
    var menuItemID: js.UndefOr[String] = js.undefined
    
    /** Specifies the menu members, events by using the menu settings for the menu in the application tab.
      * @default {Object}
      */
    var menuSettings: js.UndefOr[Any] = js.undefined
    
    /** Specifies the application menu or backstage page. Specify the type of application tab as &quot;ej.Ribbon.ApplicationTabType.Menu&quot; to render the application menu or
      * &quot;ej.Ribbon.ApplicationTabType.Backstage&quot; to render backstage page in the ribbon control.
      * @default {ej.Ribbon.ApplicationTabType.Menu}
      */
    var `type`: js.UndefOr[ApplicationTabType | String] = js.undefined
  }
  object ApplicationTab {
    
    inline def apply(): ApplicationTab = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationTab]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplicationTab] (val x: Self) extends AnyVal {
      
      inline def setBackstageSettings(value: ApplicationTabBackstageSettings): Self = StObject.set(x, "backstageSettings", value.asInstanceOf[js.Any])
      
      inline def setBackstageSettingsUndefined: Self = StObject.set(x, "backstageSettings", js.undefined)
      
      inline def setMenuItemID(value: String): Self = StObject.set(x, "menuItemID", value.asInstanceOf[js.Any])
      
      inline def setMenuItemIDUndefined: Self = StObject.set(x, "menuItemID", js.undefined)
      
      inline def setMenuSettings(value: Any): Self = StObject.set(x, "menuSettings", value.asInstanceOf[js.Any])
      
      inline def setMenuSettingsUndefined: Self = StObject.set(x, "menuSettings", js.undefined)
      
      inline def setType(value: ApplicationTabType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ApplicationTabBackstageSettings extends StObject {
    
    /** Specifies the width of backstage page header that contains tabs and buttons.
      * @default {null}
      */
    var headerWidth: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the height of ribbon backstage page.
      * @default {null}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the ribbon backstage page with its tab and button elements.
      * @default {Array}
      */
    var pages: js.UndefOr[js.Array[ApplicationTabBackstageSettingsPage]] = js.undefined
    
    /** Specifies the display text of application tab.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of ribbon backstage page.
      * @default {null}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object ApplicationTabBackstageSettings {
    
    inline def apply(): ApplicationTabBackstageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationTabBackstageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplicationTabBackstageSettings] (val x: Self) extends AnyVal {
      
      inline def setHeaderWidth(value: String | Double): Self = StObject.set(x, "headerWidth", value.asInstanceOf[js.Any])
      
      inline def setHeaderWidthUndefined: Self = StObject.set(x, "headerWidth", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPages(value: js.Array[ApplicationTabBackstageSettingsPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setPagesVarargs(value: ApplicationTabBackstageSettingsPage*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ApplicationTabBackstageSettingsPage extends StObject {
    
    /** Specifies the id of HTML elements like div,ul, etc., as ribbon backstage page's tab content.
      * @default {null}
      */
    var contentID: js.UndefOr[String] = js.undefined
    
    /** Specifies the separator between backstage page's tab and button elements.
      * @default {false}
      */
    var enableSeparator: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the id for ribbon backstage page's tab and button elements.
      * @default {null}
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Specifies the type for ribbon backstage page's contents. Set &quot;ej.Ribbon.BackStageItemType.Tab&quot; to render the tab or &quot;ej.Ribbon.BackStageItemType.Button&quot; to
      * render the button.
      * @default {ej.Ribbon.ItemType.Tab}
      */
    var itemType: js.UndefOr[ItemType | String] = js.undefined
    
    /** Specifies the text for ribbon backstage page's tab header and button elements.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object ApplicationTabBackstageSettingsPage {
    
    inline def apply(): ApplicationTabBackstageSettingsPage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationTabBackstageSettingsPage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplicationTabBackstageSettingsPage] (val x: Self) extends AnyVal {
      
      inline def setContentID(value: String): Self = StObject.set(x, "contentID", value.asInstanceOf[js.Any])
      
      inline def setContentIDUndefined: Self = StObject.set(x, "contentID", js.undefined)
      
      inline def setEnableSeparator(value: Boolean): Self = StObject.set(x, "enableSeparator", value.asInstanceOf[js.Any])
      
      inline def setEnableSeparatorUndefined: Self = StObject.set(x, "enableSeparator", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemType(value: ItemType | String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait BackstageItemClickEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the id of the target item.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the item clicked in the gallery.
      */
    var target: js.UndefOr[Double] = js.undefined
    
    /** returns the text of the target item.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BackstageItemClickEventArgs {
    
    inline def apply(): BackstageItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackstageItemClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackstageItemClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeTabRemoveEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns current tab item index in the ribbon control.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeTabRemoveEventArgs {
    
    inline def apply(): BeforeTabRemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeTabRemoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeTabRemoveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CollapseEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CollapseEventArgs {
    
    inline def apply(): CollapseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollapseEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CollapsePinSettings extends StObject {
    
    /** Specifies the custom tooltip for collapse pin.Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
      * @default {Object}
      */
    var customToolTip: js.UndefOr[Any] = js.undefined
    
    /** Sets tooltip for the collapse pin .
      * @default {null}
      */
    var toolTip: js.UndefOr[String] = js.undefined
  }
  object CollapsePinSettings {
    
    inline def apply(): CollapsePinSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsePinSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollapsePinSettings] (val x: Self) extends AnyVal {
      
      inline def setCustomToolTip(value: Any): Self = StObject.set(x, "customToolTip", value.asInstanceOf[js.Any])
      
      inline def setCustomToolTipUndefined: Self = StObject.set(x, "customToolTip", js.undefined)
      
      inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    }
  }
  
  trait ContextualTab extends StObject {
    
    /** Specifies the backgroundColor of the contextual tabs and tab set in the ribbon control.
      * @default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the borderColor of the contextual tabs and tab set in the ribbon control.
      * @default {null}
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the tabs to present in the contextual tabs and tab set. Refer to the tabs section for adding tabs into the contextual tabs and tab set.
      * @default {Array}
      */
    var tabs: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ContextualTab {
    
    inline def apply(): ContextualTab = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextualTab]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextualTab] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setTabs(value: js.Array[Any]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: Any*): Self = StObject.set(x, "tabs", js.Array(value*))
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns current ribbon tab item index
      */
    var deleteIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDeleteIndex(value: Double): Self = StObject.set(x, "deleteIndex", value.asInstanceOf[js.Any])
      
      inline def setDeleteIndexUndefined: Self = StObject.set(x, "deleteIndex", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExpandEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ExpandEventArgs {
    
    inline def apply(): ExpandEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpandEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExpandPinSettings extends StObject {
    
    /** Specifies the custom tooltip for expand pin.Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
      * @default {Object}
      */
    var customToolTip: js.UndefOr[Any] = js.undefined
    
    /** Sets tooltip for the expand pin.
      * @default {null}
      */
    var toolTip: js.UndefOr[String] = js.undefined
  }
  object ExpandPinSettings {
    
    inline def apply(): ExpandPinSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandPinSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpandPinSettings] (val x: Self) extends AnyVal {
      
      inline def setCustomToolTip(value: Any): Self = StObject.set(x, "customToolTip", value.asInstanceOf[js.Any])
      
      inline def setCustomToolTipUndefined: Self = StObject.set(x, "customToolTip", js.undefined)
      
      inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    }
  }
  
  trait GalleryItemClickEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the gallery model.
      */
    var galleryModel: js.UndefOr[Any] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the item clicked in the gallery.
      */
    var target: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object GalleryItemClickEventArgs {
    
    inline def apply(): GalleryItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GalleryItemClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GalleryItemClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setGalleryModel(value: Any): Self = StObject.set(x, "galleryModel", value.asInstanceOf[js.Any])
      
      inline def setGalleryModelUndefined: Self = StObject.set(x, "galleryModel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait GroupClickEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the control clicked in the group.
      */
    var target: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object GroupClickEventArgs {
    
    inline def apply(): GroupClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait GroupExpandEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the clicked group expander.
      */
    var target: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object GroupExpandEventArgs {
    
    inline def apply(): GroupExpandEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupExpandEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupExpandEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Enables the ribbon resize feature.allowResizing is a deprecated property of isResponsive.
      * @default {false}
      */
    var allowResizing: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the application tab to contain application menu or backstage page in the ribbon control.
      * @default {Object}
      */
    var applicationTab: js.UndefOr[ApplicationTab] = js.undefined
    
    /** Triggered when a tab or button in the backstage page is clicked successfully.
      */
    var backstageItemClick: js.UndefOr[js.Function1[/* e */ BackstageItemClickEventArgs, Unit]] = js.undefined
    
    /** Triggered before the ribbon tab item is removed.
      */
    var beforeTabRemove: js.UndefOr[js.Function1[/* e */ BeforeTabRemoveEventArgs, Unit]] = js.undefined
    
    /** Specifies the height, width, enableRTL, showRoundedCorner,enabled,cssClass property to the controls in the ribbon commonly andit will work only when those properties are not
      * defined in buttonSettings and content defaults.
      * @default {Object}
      */
    var buttonDefaults: js.UndefOr[Any] = js.undefined
    
    /** Triggered when the ribbon control is collapsed.
      */
    var collapse: js.UndefOr[js.Function1[/* e */ CollapseEventArgs, Unit]] = js.undefined
    
    /** Sets custom setting to the collapsible pin in the ribbon.
      * @default {Object}
      */
    var collapsePinSettings: js.UndefOr[CollapsePinSettings] = js.undefined
    
    /** Set collapsible property as true to render ribbon in initially collapsed state.
      * @default {false}
      */
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the contextual tabs and tab set to the ribbon control with the background color and border color. Refer to the tabs section for adding tabs into the contextual tab and
      * contextual tab set.
      * @default {Array}
      */
    var contextualTabs: js.UndefOr[js.Array[ContextualTab]] = js.undefined
    
    /** Triggered before the ribbon control is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the root CSS class for Ribbon which allow us to customize the appearance.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Triggered before the ribbon control is destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Specifies the index or indexes to disable the given index tab or indexes tabs in the ribbon control.
      * @default {0}
      */
    var disabledItemIndex: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Set enableOnDemand as true to load ribbon tab and backstage contents while corresponding item clicked.
      * @default {false}
      */
    var enableOnDemand: js.UndefOr[Boolean] = js.undefined
    
    /** Align content in the ribbon control from right to left by setting the property as true.
      * @default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the index or indexes to enable the given index tab or indexes tabs in the ribbon control.
      * @default {null}
      */
    var enabledItemIndex: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Triggered when the ribbon control is expanded.
      */
    var expand: js.UndefOr[js.Function1[/* e */ ExpandEventArgs, Unit]] = js.undefined
    
    /** Sets custom setting to the expandable pin in the ribbon.
      * @default {Object}
      */
    var expandPinSettings: js.UndefOr[ExpandPinSettings] = js.undefined
    
    /** Triggered when an item in the Gallery control is clicked successfully.
      */
    var galleryItemClick: js.UndefOr[js.Function1[/* e */ GalleryItemClickEventArgs, Unit]] = js.undefined
    
    /** Triggered when the control in the group is clicked successfully.
      */
    var groupClick: js.UndefOr[js.Function1[/* e */ GroupClickEventArgs, Unit]] = js.undefined
    
    /** Triggered when the group expander in the group is clicked successfully.
      */
    var groupExpand: js.UndefOr[js.Function1[/* e */ GroupExpandEventArgs, Unit]] = js.undefined
    
    /** When set to true, adapts the Ribbon layout to fit the screen size of devices on which it renders.
      * @default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered before the ribbon control is load.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
      * a particular country or region and  it will need to use the user's preference.
      * @default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Triggered when the QAT menu item is clicked successfully .
      */
    var qatMenuItemClick: js.UndefOr[js.Function1[/* e */ QatMenuItemClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the index of the ribbon tab to select the given index tab item in the ribbon control.
      * @default {1}
      */
    var selectedItemIndex: js.UndefOr[Double] = js.undefined
    
    /** Property to enable the ribbon quick access toolbar.
      * @default {false}
      */
    var showQAT: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered after adding the new ribbon tab item.
      */
    var tabAdd: js.UndefOr[js.Function1[/* e */ TabAddEventArgs, Unit]] = js.undefined
    
    /** Triggered when tab is clicked successfully in the ribbon control.
      */
    var tabClick: js.UndefOr[js.Function1[/* e */ TabClickEventArgs, Unit]] = js.undefined
    
    /** Triggered before the ribbon tab is created.
      */
    var tabCreate: js.UndefOr[js.Function1[/* e */ TabCreateEventArgs, Unit]] = js.undefined
    
    /** Triggered after the tab item is removed from the ribbon control.
      */
    var tabRemove: js.UndefOr[js.Function1[/* e */ TabRemoveEventArgs, Unit]] = js.undefined
    
    /** Triggered after the ribbon tab item is selected in the ribbon control.
      */
    var tabSelect: js.UndefOr[js.Function1[/* e */ TabSelectEventArgs, Unit]] = js.undefined
    
    /** Specifies the tabs and its groups. Also specifies the control details that has to be placed in the tab area in the ribbon control.
      * @default {Array}
      */
    var tabs: js.UndefOr[js.Array[typings.ejWebAll.ej.Ribbon.Tab]] = js.undefined
    
    /** Triggered when the expand/collapse button is clicked successfully .
      */
    var toggleButtonClick: js.UndefOr[js.Function1[/* e */ ToggleButtonClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the width to the ribbon control. You can set width in string or number format.
      * @default {null}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Ribbon.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Ribbon.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Ribbon.Model] (val x: Self) extends AnyVal {
      
      inline def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
      
      inline def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
      
      inline def setApplicationTab(value: ApplicationTab): Self = StObject.set(x, "applicationTab", value.asInstanceOf[js.Any])
      
      inline def setApplicationTabUndefined: Self = StObject.set(x, "applicationTab", js.undefined)
      
      inline def setBackstageItemClick(value: /* e */ BackstageItemClickEventArgs => Unit): Self = StObject.set(x, "backstageItemClick", js.Any.fromFunction1(value))
      
      inline def setBackstageItemClickUndefined: Self = StObject.set(x, "backstageItemClick", js.undefined)
      
      inline def setBeforeTabRemove(value: /* e */ BeforeTabRemoveEventArgs => Unit): Self = StObject.set(x, "beforeTabRemove", js.Any.fromFunction1(value))
      
      inline def setBeforeTabRemoveUndefined: Self = StObject.set(x, "beforeTabRemove", js.undefined)
      
      inline def setButtonDefaults(value: Any): Self = StObject.set(x, "buttonDefaults", value.asInstanceOf[js.Any])
      
      inline def setButtonDefaultsUndefined: Self = StObject.set(x, "buttonDefaults", js.undefined)
      
      inline def setCollapse(value: /* e */ CollapseEventArgs => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
      
      inline def setCollapsePinSettings(value: CollapsePinSettings): Self = StObject.set(x, "collapsePinSettings", value.asInstanceOf[js.Any])
      
      inline def setCollapsePinSettingsUndefined: Self = StObject.set(x, "collapsePinSettings", js.undefined)
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setContextualTabs(value: js.Array[ContextualTab]): Self = StObject.set(x, "contextualTabs", value.asInstanceOf[js.Any])
      
      inline def setContextualTabsUndefined: Self = StObject.set(x, "contextualTabs", js.undefined)
      
      inline def setContextualTabsVarargs(value: ContextualTab*): Self = StObject.set(x, "contextualTabs", js.Array(value*))
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDisabledItemIndex(value: js.Array[Any]): Self = StObject.set(x, "disabledItemIndex", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemIndexUndefined: Self = StObject.set(x, "disabledItemIndex", js.undefined)
      
      inline def setDisabledItemIndexVarargs(value: Any*): Self = StObject.set(x, "disabledItemIndex", js.Array(value*))
      
      inline def setEnableOnDemand(value: Boolean): Self = StObject.set(x, "enableOnDemand", value.asInstanceOf[js.Any])
      
      inline def setEnableOnDemandUndefined: Self = StObject.set(x, "enableOnDemand", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabledItemIndex(value: js.Array[Any]): Self = StObject.set(x, "enabledItemIndex", value.asInstanceOf[js.Any])
      
      inline def setEnabledItemIndexUndefined: Self = StObject.set(x, "enabledItemIndex", js.undefined)
      
      inline def setEnabledItemIndexVarargs(value: Any*): Self = StObject.set(x, "enabledItemIndex", js.Array(value*))
      
      inline def setExpand(value: /* e */ ExpandEventArgs => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      
      inline def setExpandPinSettings(value: ExpandPinSettings): Self = StObject.set(x, "expandPinSettings", value.asInstanceOf[js.Any])
      
      inline def setExpandPinSettingsUndefined: Self = StObject.set(x, "expandPinSettings", js.undefined)
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setGalleryItemClick(value: /* e */ GalleryItemClickEventArgs => Unit): Self = StObject.set(x, "galleryItemClick", js.Any.fromFunction1(value))
      
      inline def setGalleryItemClickUndefined: Self = StObject.set(x, "galleryItemClick", js.undefined)
      
      inline def setGroupClick(value: /* e */ GroupClickEventArgs => Unit): Self = StObject.set(x, "groupClick", js.Any.fromFunction1(value))
      
      inline def setGroupClickUndefined: Self = StObject.set(x, "groupClick", js.undefined)
      
      inline def setGroupExpand(value: /* e */ GroupExpandEventArgs => Unit): Self = StObject.set(x, "groupExpand", js.Any.fromFunction1(value))
      
      inline def setGroupExpandUndefined: Self = StObject.set(x, "groupExpand", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setQatMenuItemClick(value: /* e */ QatMenuItemClickEventArgs => Unit): Self = StObject.set(x, "qatMenuItemClick", js.Any.fromFunction1(value))
      
      inline def setQatMenuItemClickUndefined: Self = StObject.set(x, "qatMenuItemClick", js.undefined)
      
      inline def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemIndexUndefined: Self = StObject.set(x, "selectedItemIndex", js.undefined)
      
      inline def setShowQAT(value: Boolean): Self = StObject.set(x, "showQAT", value.asInstanceOf[js.Any])
      
      inline def setShowQATUndefined: Self = StObject.set(x, "showQAT", js.undefined)
      
      inline def setTabAdd(value: /* e */ TabAddEventArgs => Unit): Self = StObject.set(x, "tabAdd", js.Any.fromFunction1(value))
      
      inline def setTabAddUndefined: Self = StObject.set(x, "tabAdd", js.undefined)
      
      inline def setTabClick(value: /* e */ TabClickEventArgs => Unit): Self = StObject.set(x, "tabClick", js.Any.fromFunction1(value))
      
      inline def setTabClickUndefined: Self = StObject.set(x, "tabClick", js.undefined)
      
      inline def setTabCreate(value: /* e */ TabCreateEventArgs => Unit): Self = StObject.set(x, "tabCreate", js.Any.fromFunction1(value))
      
      inline def setTabCreateUndefined: Self = StObject.set(x, "tabCreate", js.undefined)
      
      inline def setTabRemove(value: /* e */ TabRemoveEventArgs => Unit): Self = StObject.set(x, "tabRemove", js.Any.fromFunction1(value))
      
      inline def setTabRemoveUndefined: Self = StObject.set(x, "tabRemove", js.undefined)
      
      inline def setTabSelect(value: /* e */ TabSelectEventArgs => Unit): Self = StObject.set(x, "tabSelect", js.Any.fromFunction1(value))
      
      inline def setTabSelectUndefined: Self = StObject.set(x, "tabSelect", js.undefined)
      
      inline def setTabs(value: js.Array[typings.ejWebAll.ej.Ribbon.Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: typings.ejWebAll.ej.Ribbon.Tab*): Self = StObject.set(x, "tabs", js.Array(value*))
      
      inline def setToggleButtonClick(value: /* e */ ToggleButtonClickEventArgs => Unit): Self = StObject.set(x, "toggleButtonClick", js.Any.fromFunction1(value))
      
      inline def setToggleButtonClickUndefined: Self = StObject.set(x, "toggleButtonClick", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait QatMenuItemClickEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the clicked menu item text.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object QatMenuItemClickEventArgs {
    
    inline def apply(): QatMenuItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QatMenuItemClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QatMenuItemClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Tab extends StObject {
    
    /** Specifies single group or multiple groups and its contents to each tab in the ribbon control.
      * @default {Array}
      */
    var groups: js.UndefOr[js.Array[TabsGroup]] = js.undefined
    
    /** Specifies the ID for each tab's content panel.
      * @default {null}
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Specifies the text of the tab in the ribbon control.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object Tab {
    
    inline def apply(): typings.ejWebAll.ej.Ribbon.Tab = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Ribbon.Tab]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Ribbon.Tab] (val x: Self) extends AnyVal {
      
      inline def setGroups(value: js.Array[TabsGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: TabsGroup*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait TabAddEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns new added tab content panel.
      */
    var tabContent: js.UndefOr[Any] = js.undefined
    
    /** returns new added tab header.
      */
    var tabHeader: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TabAddEventArgs {
    
    inline def apply(): TabAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabAddEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabAddEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTabContent(value: Any): Self = StObject.set(x, "tabContent", value.asInstanceOf[js.Any])
      
      inline def setTabContentUndefined: Self = StObject.set(x, "tabContent", js.undefined)
      
      inline def setTabHeader(value: Any): Self = StObject.set(x, "tabHeader", value.asInstanceOf[js.Any])
      
      inline def setTabHeaderUndefined: Self = StObject.set(x, "tabHeader", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TabClickEventArgs extends StObject {
    
    /** returns current active tab header .
      */
    var activeHeader: js.UndefOr[Any] = js.undefined
    
    /** returns current active index.
      */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns previous active tab header.
      */
    var prevActiveHeader: js.UndefOr[Any] = js.undefined
    
    /** returns previous active index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TabClickEventArgs {
    
    inline def apply(): TabClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActiveHeader(value: Any): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      inline def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevActiveHeader(value: Any): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      inline def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TabCreateEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns current ribbon tab item index
      */
    var deleteIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TabCreateEventArgs {
    
    inline def apply(): TabCreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabCreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabCreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDeleteIndex(value: Double): Self = StObject.set(x, "deleteIndex", value.asInstanceOf[js.Any])
      
      inline def setDeleteIndexUndefined: Self = StObject.set(x, "deleteIndex", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TabRemoveEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the removed index.
      */
    var removedIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TabRemoveEventArgs {
    
    inline def apply(): TabRemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabRemoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabRemoveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRemovedIndex(value: Double): Self = StObject.set(x, "removedIndex", value.asInstanceOf[js.Any])
      
      inline def setRemovedIndexUndefined: Self = StObject.set(x, "removedIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TabSelectEventArgs extends StObject {
    
    /** returns current active tab header .
      */
    var activeHeader: js.UndefOr[Any] = js.undefined
    
    /** returns current active index.
      */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns previous active tab header.
      */
    var prevActiveHeader: js.UndefOr[Any] = js.undefined
    
    /** returns previous active index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TabSelectEventArgs {
    
    inline def apply(): TabSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabSelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabSelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActiveHeader(value: Any): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      inline def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevActiveHeader(value: Any): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      inline def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TabsGroup extends StObject {
    
    /** Specifies the alignment of controls in the groups in 'row' type or 'column' type. Value for row type is &quot;ej.Ribbon.AlignType.Rows&quot; and for column type is
      * &quot;ej.Ribbon.alignType.columns&quot;.
      * @default {ej.Ribbon.AlignType.Rows}
      */
    var alignType: js.UndefOr[AlignType | String] = js.undefined
    
    /** Specifies the Syncfusion button, split button, dropdown list, toggle button, gallery, custom controls to the groups in the ribbon control.
      * @default {Array}
      */
    var content: js.UndefOr[js.Array[TabsGroupsContent]] = js.undefined
    
    /** Specifies the ID of custom items to be placed in the groups.
      * @default {null}
      */
    var contentID: js.UndefOr[String] = js.undefined
    
    /** Specifies the HTML contents to place into the groups.
      * @default {null}
      */
    var customContent: js.UndefOr[String] = js.undefined
    
    /** Specifies the group expander for groups in the ribbon control. Set &quot;true&quot; to enable the group expander.
      * @default {false}
      */
    var enableGroupExpander: js.UndefOr[Boolean] = js.undefined
    
    /** Sets custom setting to the groups in the ribbon control.
      * @default {Object}
      */
    var groupExpanderSettings: js.UndefOr[TabsGroupsGroupExpanderSettings] = js.undefined
    
    /** Specifies the text to the groups in the ribbon control.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the custom items such as div, table, controls by using the &quot;custom&quot; type.
      * @default {null}
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TabsGroup {
    
    inline def apply(): TabsGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsGroup] (val x: Self) extends AnyVal {
      
      inline def setAlignType(value: AlignType | String): Self = StObject.set(x, "alignType", value.asInstanceOf[js.Any])
      
      inline def setAlignTypeUndefined: Self = StObject.set(x, "alignType", js.undefined)
      
      inline def setContent(value: js.Array[TabsGroupsContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentID(value: String): Self = StObject.set(x, "contentID", value.asInstanceOf[js.Any])
      
      inline def setContentIDUndefined: Self = StObject.set(x, "contentID", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: TabsGroupsContent*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setCustomContent(value: String): Self = StObject.set(x, "customContent", value.asInstanceOf[js.Any])
      
      inline def setCustomContentUndefined: Self = StObject.set(x, "customContent", js.undefined)
      
      inline def setEnableGroupExpander(value: Boolean): Self = StObject.set(x, "enableGroupExpander", value.asInstanceOf[js.Any])
      
      inline def setEnableGroupExpanderUndefined: Self = StObject.set(x, "enableGroupExpander", js.undefined)
      
      inline def setGroupExpanderSettings(value: TabsGroupsGroupExpanderSettings): Self = StObject.set(x, "groupExpanderSettings", value.asInstanceOf[js.Any])
      
      inline def setGroupExpanderSettingsUndefined: Self = StObject.set(x, "groupExpanderSettings", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TabsGroupsContent extends StObject {
    
    /** Specifies the height, width, type, isBig property to the controls in the group commonly.
      * @default {Object}
      */
    var defaults: js.UndefOr[TabsGroupsContentDefaults] = js.undefined
    
    /** Specifies the controls such as Syncfusion button, split button, dropdown list, toggle button, gallery, custom controls in the subgroup of the ribbon tab .
      * @default {Array}
      */
    var groups: js.UndefOr[js.Array[TabsGroupsContentGroup]] = js.undefined
  }
  object TabsGroupsContent {
    
    inline def apply(): TabsGroupsContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsGroupsContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsGroupsContent] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: TabsGroupsContentDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setGroups(value: js.Array[TabsGroupsContentGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: TabsGroupsContentGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    }
  }
  
  trait TabsGroupsContentDefaults extends StObject {
    
    /** Specifies the controls height such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
      * @default {null}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the controls size such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
      * @default {false}
      */
    var isBig: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the controls type such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
      * @default {ej.Ribbon.Type.Button}
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Specifies the controls width such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
      * @default {null}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object TabsGroupsContentDefaults {
    
    inline def apply(): TabsGroupsContentDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsGroupsContentDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsGroupsContentDefaults] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsBig(value: Boolean): Self = StObject.set(x, "isBig", value.asInstanceOf[js.Any])
      
      inline def setIsBigUndefined: Self = StObject.set(x, "isBig", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TabsGroupsContentGroup extends StObject {
    
    /** Specifies the Syncfusion button members, events by using this buttonSettings.
      * @default {Object}
      */
    var buttonSettings: js.UndefOr[Any] = js.undefined
    
    /** It is used to set the count of gallery contents in a row.
      * @default {null}
      */
    var columns: js.UndefOr[Double] = js.undefined
    
    /** Specifies the custom items such as div, table, controls as custom controls with the type &quot;ej.Ribbon.Type.Custom&quot; in the groups.
      * @default {null}
      */
    var contentID: js.UndefOr[String] = js.undefined
    
    /** Specifies the CSS class property to apply styles to the button, split, dropdown controls in the groups.
      * @default {null}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Specifies the Syncfusion button and menu as gallery extra items.
      * @default {Array}
      */
    var customGalleryItems: js.UndefOr[js.Array[TabsGroupsContentGroupsCustomGalleryItem]] = js.undefined
    
    /** Provides custom tooltip for button, split button, dropdown list, toggle button, custom controls in the sub groups. Text and HTML support are also provided for title and content.
      * @default {Object}
      */
    var customToolTip: js.UndefOr[TabsGroupsContentGroupsCustomToolTip] = js.undefined
    
    /** Specifies the Syncfusion dropdown list members, events by using this dropdownSettings.
      * @default {Object}
      */
    var dropdownSettings: js.UndefOr[Any] = js.undefined
    
    /** Specifies the separator to the control that is in row type group. The separator separates the control from the next control in the group. Set &quot;true&quot; to enable the
      * separator.
      * @default {false}
      */
    var enableSeparator: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the count of gallery contents in a row, when the gallery is in expanded state.
      * @default {null}
      */
    var expandedColumns: js.UndefOr[Double] = js.undefined
    
    /** Defines each gallery content.
      * @default {Array}
      */
    var galleryItems: js.UndefOr[js.Array[TabsGroupsContentGroupsGalleryItem]] = js.undefined
    
    /** Specifies the Id for button, split button, dropdown list, toggle button, gallery, custom controls in the sub groups.
      * @default {null}
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Specifies the size for button, split button controls. Set &quot;true&quot; for big size and &quot;false&quot; for small size.
      * @default {null}
      */
    var isBig: js.UndefOr[Boolean] = js.undefined
    
    /** When isMobileOnly is true,its shows in mobile toolbar.isResponsive should be true for using this property.
      * @default {false}
      */
    var isMobileOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the height of each gallery content.
      * @default {null}
      */
    var itemHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Sets the width of each gallery content.
      * @default {null}
      */
    var itemWidth: js.UndefOr[String | Double] = js.undefined
    
    /** To add,show and hide controls in Quick Access toolbar.
      * @default {ej.Ribbon.QuickAccessMode.None}
      */
    var quickAccessMode: js.UndefOr[QuickAccessMode | String] = js.undefined
    
    /** Specifies the Syncfusion split button members, events by using this splitButtonSettings.
      * @default {Object}
      */
    var splitButtonSettings: js.UndefOr[Any] = js.undefined
    
    /** Specifies the text for button, split button, toggle button controls in the sub groups.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the Syncfusion toggle button members, events by using toggleButtonSettings.
      * @default {Object}
      */
    var toggleButtonSettings: js.UndefOr[Any] = js.undefined
    
    /** Specifies the tooltip for button, split button, dropdown list, toggle button, custom controls in the sub groups.
      * @default {null}
      */
    var toolTip: js.UndefOr[String] = js.undefined
    
    /** Specifies the type as &quot;ej.Ribbon.Type.Button&quot; or &quot;ej.Ribbon.Type.SplitButton&quot; or &quot;ej.Ribbon.Type.DropDownList&quot; or
      * &quot;ej.Ribbon.Type.ToggleButton&quot; or &quot;ej.Ribbon.Type.Custom&quot; or &quot;ej.Ribbon.Type.Gallery&quot; to render button, split, dropdown, toggle button, gallery,
      * custom controls.
      * @default {ej.Ribbon.Type.Button}
      */
    var `type`: js.UndefOr[typings.ejWebAll.ej.Type | String] = js.undefined
  }
  object TabsGroupsContentGroup {
    
    inline def apply(): TabsGroupsContentGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsGroupsContentGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsGroupsContentGroup] (val x: Self) extends AnyVal {
      
      inline def setButtonSettings(value: Any): Self = StObject.set(x, "buttonSettings", value.asInstanceOf[js.Any])
      
      inline def setButtonSettingsUndefined: Self = StObject.set(x, "buttonSettings", js.undefined)
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setContentID(value: String): Self = StObject.set(x, "contentID", value.asInstanceOf[js.Any])
      
      inline def setContentIDUndefined: Self = StObject.set(x, "contentID", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCustomGalleryItems(value: js.Array[TabsGroupsContentGroupsCustomGalleryItem]): Self = StObject.set(x, "customGalleryItems", value.asInstanceOf[js.Any])
      
      inline def setCustomGalleryItemsUndefined: Self = StObject.set(x, "customGalleryItems", js.undefined)
      
      inline def setCustomGalleryItemsVarargs(value: TabsGroupsContentGroupsCustomGalleryItem*): Self = StObject.set(x, "customGalleryItems", js.Array(value*))
      
      inline def setCustomToolTip(value: TabsGroupsContentGroupsCustomToolTip): Self = StObject.set(x, "customToolTip", value.asInstanceOf[js.Any])
      
      inline def setCustomToolTipUndefined: Self = StObject.set(x, "customToolTip", js.undefined)
      
      inline def setDropdownSettings(value: Any): Self = StObject.set(x, "dropdownSettings", value.asInstanceOf[js.Any])
      
      inline def setDropdownSettingsUndefined: Self = StObject.set(x, "dropdownSettings", js.undefined)
      
      inline def setEnableSeparator(value: Boolean): Self = StObject.set(x, "enableSeparator", value.asInstanceOf[js.Any])
      
      inline def setEnableSeparatorUndefined: Self = StObject.set(x, "enableSeparator", js.undefined)
      
      inline def setExpandedColumns(value: Double): Self = StObject.set(x, "expandedColumns", value.asInstanceOf[js.Any])
      
      inline def setExpandedColumnsUndefined: Self = StObject.set(x, "expandedColumns", js.undefined)
      
      inline def setGalleryItems(value: js.Array[TabsGroupsContentGroupsGalleryItem]): Self = StObject.set(x, "galleryItems", value.asInstanceOf[js.Any])
      
      inline def setGalleryItemsUndefined: Self = StObject.set(x, "galleryItems", js.undefined)
      
      inline def setGalleryItemsVarargs(value: TabsGroupsContentGroupsGalleryItem*): Self = StObject.set(x, "galleryItems", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsBig(value: Boolean): Self = StObject.set(x, "isBig", value.asInstanceOf[js.Any])
      
      inline def setIsBigUndefined: Self = StObject.set(x, "isBig", js.undefined)
      
      inline def setIsMobileOnly(value: Boolean): Self = StObject.set(x, "isMobileOnly", value.asInstanceOf[js.Any])
      
      inline def setIsMobileOnlyUndefined: Self = StObject.set(x, "isMobileOnly", js.undefined)
      
      inline def setItemHeight(value: String | Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setItemWidth(value: String | Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      inline def setQuickAccessMode(value: QuickAccessMode | String): Self = StObject.set(x, "quickAccessMode", value.asInstanceOf[js.Any])
      
      inline def setQuickAccessModeUndefined: Self = StObject.set(x, "quickAccessMode", js.undefined)
      
      inline def setSplitButtonSettings(value: Any): Self = StObject.set(x, "splitButtonSettings", value.asInstanceOf[js.Any])
      
      inline def setSplitButtonSettingsUndefined: Self = StObject.set(x, "splitButtonSettings", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setToggleButtonSettings(value: Any): Self = StObject.set(x, "toggleButtonSettings", value.asInstanceOf[js.Any])
      
      inline def setToggleButtonSettingsUndefined: Self = StObject.set(x, "toggleButtonSettings", js.undefined)
      
      inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
      
      inline def setType(value: typings.ejWebAll.ej.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TabsGroupsContentGroupsCustomGalleryItem extends StObject {
    
    /** Specifies the Syncfusion button members, events by using buttonSettings.
      * @default {Object}
      */
    var buttonSettings: js.UndefOr[Any] = js.undefined
    
    /** Specifies the type as ej.Ribbon.CustomItemType.Menu or ej.Ribbon.CustomItemType.Button to render Syncfusion button and menu.
      * @default {ej.Ribbon.CustomItemType.Button}
      */
    var customItemType: js.UndefOr[CustomItemType | String] = js.undefined
    
    /** Specifies the custom tooltip for gallery extra item's button. Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
      * @default {Object}
      */
    var customToolTip: js.UndefOr[Any] = js.undefined
    
    /** Specifies the UL list id to render menu as gallery extra item.
      * @default {null}
      */
    var menuId: js.UndefOr[String] = js.undefined
    
    /** Specifies the Syncfusion menu members, events by using menuSettings.
      * @default {Object}
      */
    var menuSettings: js.UndefOr[Any] = js.undefined
    
    /** Specifies the text for gallery extra item's button.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the tooltip for gallery extra item's button.
      * @default {null}
      */
    var toolTip: js.UndefOr[String] = js.undefined
  }
  object TabsGroupsContentGroupsCustomGalleryItem {
    
    inline def apply(): TabsGroupsContentGroupsCustomGalleryItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsGroupsContentGroupsCustomGalleryItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsGroupsContentGroupsCustomGalleryItem] (val x: Self) extends AnyVal {
      
      inline def setButtonSettings(value: Any): Self = StObject.set(x, "buttonSettings", value.asInstanceOf[js.Any])
      
      inline def setButtonSettingsUndefined: Self = StObject.set(x, "buttonSettings", js.undefined)
      
      inline def setCustomItemType(value: CustomItemType | String): Self = StObject.set(x, "customItemType", value.asInstanceOf[js.Any])
      
      inline def setCustomItemTypeUndefined: Self = StObject.set(x, "customItemType", js.undefined)
      
      inline def setCustomToolTip(value: Any): Self = StObject.set(x, "customToolTip", value.asInstanceOf[js.Any])
      
      inline def setCustomToolTipUndefined: Self = StObject.set(x, "customToolTip", js.undefined)
      
      inline def setMenuId(value: String): Self = StObject.set(x, "menuId", value.asInstanceOf[js.Any])
      
      inline def setMenuIdUndefined: Self = StObject.set(x, "menuId", js.undefined)
      
      inline def setMenuSettings(value: Any): Self = StObject.set(x, "menuSettings", value.asInstanceOf[js.Any])
      
      inline def setMenuSettingsUndefined: Self = StObject.set(x, "menuSettings", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    }
  }
  
  trait TabsGroupsContentGroupsCustomToolTip extends StObject {
    
    /** Sets content to the custom tooltip. Text and HTML support are provided for content.
      * @default {null}
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** Sets icon to the custom tooltip content.
      * @default {null}
      */
    var prefixIcon: js.UndefOr[String] = js.undefined
    
    /** Sets title to the custom tooltip. Text and HTML support are provided for title and the title is in bold for text format.
      * @default {null}
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object TabsGroupsContentGroupsCustomToolTip {
    
    inline def apply(): TabsGroupsContentGroupsCustomToolTip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsGroupsContentGroupsCustomToolTip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsGroupsContentGroupsCustomToolTip] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setPrefixIcon(value: String): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
      
      inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TabsGroupsContentGroupsGalleryItem extends StObject {
    
    /** Specifies the Syncfusion button members, events by using buttonSettings.
      * @default {Object}
      */
    var buttonSettings: js.UndefOr[Any] = js.undefined
    
    /** Specifies the custom tooltip for gallery content. Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
      * @default {Object}
      */
    var customToolTip: js.UndefOr[Any] = js.undefined
    
    /** Sets text for the gallery content.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Sets tooltip for the gallery content.
      * @default {null}
      */
    var toolTip: js.UndefOr[String] = js.undefined
  }
  object TabsGroupsContentGroupsGalleryItem {
    
    inline def apply(): TabsGroupsContentGroupsGalleryItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsGroupsContentGroupsGalleryItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsGroupsContentGroupsGalleryItem] (val x: Self) extends AnyVal {
      
      inline def setButtonSettings(value: Any): Self = StObject.set(x, "buttonSettings", value.asInstanceOf[js.Any])
      
      inline def setButtonSettingsUndefined: Self = StObject.set(x, "buttonSettings", js.undefined)
      
      inline def setCustomToolTip(value: Any): Self = StObject.set(x, "customToolTip", value.asInstanceOf[js.Any])
      
      inline def setCustomToolTipUndefined: Self = StObject.set(x, "customToolTip", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    }
  }
  
  trait TabsGroupsGroupExpanderSettings extends StObject {
    
    /** Specifies the custom tooltip for group expander.Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
      * @default {Object}
      */
    var customToolTip: js.UndefOr[Any] = js.undefined
    
    /** Sets tooltip for the group expander of the group.
      * @default {null}
      */
    var toolTip: js.UndefOr[String] = js.undefined
  }
  object TabsGroupsGroupExpanderSettings {
    
    inline def apply(): TabsGroupsGroupExpanderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsGroupsGroupExpanderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsGroupsGroupExpanderSettings] (val x: Self) extends AnyVal {
      
      inline def setCustomToolTip(value: Any): Self = StObject.set(x, "customToolTip", value.asInstanceOf[js.Any])
      
      inline def setCustomToolTipUndefined: Self = StObject.set(x, "customToolTip", js.undefined)
      
      inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    }
  }
  
  trait ToggleButtonClickEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ribbon model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the expand/collapse button.
      */
    var target: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToggleButtonClickEventArgs {
    
    inline def apply(): ToggleButtonClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleButtonClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleButtonClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
