package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Enables the ribbon resize feature.allowResizing is a deprecated property of isResponsive.
    * @Default {false}
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /** Specifies the application tab to contain application menu or backstage page in the ribbon control.
    * @Default {Object}
    */
  var applicationTab: js.UndefOr[ApplicationTab] = js.native
  /** Triggered when a tab or button in the backstage page is clicked successfully.
    */
  var backstageItemClick: js.UndefOr[js.Function1[/* e */ BackstageItemClickEventArgs, Unit]] = js.native
  /** Triggered before the ribbon tab item is removed.
    */
  var beforeTabRemove: js.UndefOr[js.Function1[/* e */ BeforeTabRemoveEventArgs, Unit]] = js.native
  /** Specifies the height, width, enableRTL, showRoundedCorner,enabled,cssClass property to the controls in the ribbon commonly andit will work only when those properties are not
    * defined in buttonSettings and content defaults.
    * @Default {Object}
    */
  var buttonDefaults: js.UndefOr[js.Any] = js.native
  /** Triggered when the ribbon control is collapsed.
    */
  var collapse: js.UndefOr[js.Function1[/* e */ CollapseEventArgs, Unit]] = js.native
  /** Sets custom setting to the collapsible pin in the ribbon.
    * @Default {Object}
    */
  var collapsePinSettings: js.UndefOr[CollapsePinSettings] = js.native
  /** Set collapsible property as true to render ribbon in initially collapsed state.
    * @Default {false}
    */
  var collapsible: js.UndefOr[Boolean] = js.native
  /** Specifies the contextual tabs and tab set to the ribbon control with the background color and border color. Refer to the tabs section for adding tabs into the contextual tab and
    * contextual tab set.
    * @Default {Array}
    */
  var contextualTabs: js.UndefOr[js.Array[ContextualTab]] = js.native
  /** Triggered before the ribbon control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for Ribbon which allow us to customize the appearance.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Triggered before the ribbon control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specifies the index or indexes to disable the given index tab or indexes tabs in the ribbon control.
    * @Default {0}
    */
  var disabledItemIndex: js.UndefOr[js.Array[_]] = js.native
  /** Set enableOnDemand as true to load ribbon tab and backstage contents while corresponding item clicked.
    * @Default {false}
    */
  var enableOnDemand: js.UndefOr[Boolean] = js.native
  /** Align content in the ribbon control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specifies the index or indexes to enable the given index tab or indexes tabs in the ribbon control.
    * @Default {null}
    */
  var enabledItemIndex: js.UndefOr[js.Array[_]] = js.native
  /** Triggered when the ribbon control is expanded.
    */
  var expand: js.UndefOr[js.Function1[/* e */ ExpandEventArgs, Unit]] = js.native
  /** Sets custom setting to the expandable pin in the ribbon.
    * @Default {Object}
    */
  var expandPinSettings: js.UndefOr[ExpandPinSettings] = js.native
  /** Triggered when an item in the Gallery control is clicked successfully.
    */
  var galleryItemClick: js.UndefOr[js.Function1[/* e */ GalleryItemClickEventArgs, Unit]] = js.native
  /** Triggered when the control in the group is clicked successfully.
    */
  var groupClick: js.UndefOr[js.Function1[/* e */ GroupClickEventArgs, Unit]] = js.native
  /** Triggered when the group expander in the group is clicked successfully.
    */
  var groupExpand: js.UndefOr[js.Function1[/* e */ GroupExpandEventArgs, Unit]] = js.native
  /** When set to true, adapts the Ribbon layout to fit the screen size of devices on which it renders.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggered before the ribbon control is load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region and  it will need to use the user's preference.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Triggered when the QAT menu item is clicked successfully .
    */
  var qatMenuItemClick: js.UndefOr[js.Function1[/* e */ QatMenuItemClickEventArgs, Unit]] = js.native
  /** Specifies the index of the ribbon tab to select the given index tab item in the ribbon control.
    * @Default {1}
    */
  var selectedItemIndex: js.UndefOr[Double] = js.native
  /** Property to enable the ribbon quick access toolbar.
    * @Default {false}
    */
  var showQAT: js.UndefOr[Boolean] = js.native
  /** Triggered after adding the new ribbon tab item.
    */
  var tabAdd: js.UndefOr[js.Function1[/* e */ TabAddEventArgs, Unit]] = js.native
  /** Triggered when tab is clicked successfully in the ribbon control.
    */
  var tabClick: js.UndefOr[js.Function1[/* e */ TabClickEventArgs, Unit]] = js.native
  /** Triggered before the ribbon tab is created.
    */
  var tabCreate: js.UndefOr[js.Function1[/* e */ TabCreateEventArgs, Unit]] = js.native
  /** Triggered after the tab item is removed from the ribbon control.
    */
  var tabRemove: js.UndefOr[js.Function1[/* e */ TabRemoveEventArgs, Unit]] = js.native
  /** Triggered after the ribbon tab item is selected in the ribbon control.
    */
  var tabSelect: js.UndefOr[js.Function1[/* e */ TabSelectEventArgs, Unit]] = js.native
  /** Specifies the tabs and its groups. Also specifies the control details that has to be placed in the tab area in the ribbon control.
    * @Default {Array}
    */
  var tabs: js.UndefOr[js.Array[Tab]] = js.native
  /** Triggered when the expand/collapse button is clicked successfully .
    */
  var toggleButtonClick: js.UndefOr[js.Function1[/* e */ ToggleButtonClickEventArgs, Unit]] = js.native
  /** Specifies the width to the ribbon control. You can set width in string or number format.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setAllowResizing(value: Boolean): Self = this.set("allowResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResizing: Self = this.set("allowResizing", js.undefined)
    @scala.inline
    def setApplicationTab(value: ApplicationTab): Self = this.set("applicationTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationTab: Self = this.set("applicationTab", js.undefined)
    @scala.inline
    def setBackstageItemClick(value: /* e */ BackstageItemClickEventArgs => Unit): Self = this.set("backstageItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBackstageItemClick: Self = this.set("backstageItemClick", js.undefined)
    @scala.inline
    def setBeforeTabRemove(value: /* e */ BeforeTabRemoveEventArgs => Unit): Self = this.set("beforeTabRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeTabRemove: Self = this.set("beforeTabRemove", js.undefined)
    @scala.inline
    def setButtonDefaults(value: js.Any): Self = this.set("buttonDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonDefaults: Self = this.set("buttonDefaults", js.undefined)
    @scala.inline
    def setCollapse(value: /* e */ CollapseEventArgs => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setCollapsePinSettings(value: CollapsePinSettings): Self = this.set("collapsePinSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsePinSettings: Self = this.set("collapsePinSettings", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setContextualTabsVarargs(value: ContextualTab*): Self = this.set("contextualTabs", js.Array(value :_*))
    @scala.inline
    def setContextualTabs(value: js.Array[ContextualTab]): Self = this.set("contextualTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextualTabs: Self = this.set("contextualTabs", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDisabledItemIndexVarargs(value: js.Any*): Self = this.set("disabledItemIndex", js.Array(value :_*))
    @scala.inline
    def setDisabledItemIndex(value: js.Array[_]): Self = this.set("disabledItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledItemIndex: Self = this.set("disabledItemIndex", js.undefined)
    @scala.inline
    def setEnableOnDemand(value: Boolean): Self = this.set("enableOnDemand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableOnDemand: Self = this.set("enableOnDemand", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnabledItemIndexVarargs(value: js.Any*): Self = this.set("enabledItemIndex", js.Array(value :_*))
    @scala.inline
    def setEnabledItemIndex(value: js.Array[_]): Self = this.set("enabledItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledItemIndex: Self = this.set("enabledItemIndex", js.undefined)
    @scala.inline
    def setExpand(value: /* e */ ExpandEventArgs => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setExpandPinSettings(value: ExpandPinSettings): Self = this.set("expandPinSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandPinSettings: Self = this.set("expandPinSettings", js.undefined)
    @scala.inline
    def setGalleryItemClick(value: /* e */ GalleryItemClickEventArgs => Unit): Self = this.set("galleryItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGalleryItemClick: Self = this.set("galleryItemClick", js.undefined)
    @scala.inline
    def setGroupClick(value: /* e */ GroupClickEventArgs => Unit): Self = this.set("groupClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGroupClick: Self = this.set("groupClick", js.undefined)
    @scala.inline
    def setGroupExpand(value: /* e */ GroupExpandEventArgs => Unit): Self = this.set("groupExpand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGroupExpand: Self = this.set("groupExpand", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setQatMenuItemClick(value: /* e */ QatMenuItemClickEventArgs => Unit): Self = this.set("qatMenuItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQatMenuItemClick: Self = this.set("qatMenuItemClick", js.undefined)
    @scala.inline
    def setSelectedItemIndex(value: Double): Self = this.set("selectedItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItemIndex: Self = this.set("selectedItemIndex", js.undefined)
    @scala.inline
    def setShowQAT(value: Boolean): Self = this.set("showQAT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowQAT: Self = this.set("showQAT", js.undefined)
    @scala.inline
    def setTabAdd(value: /* e */ TabAddEventArgs => Unit): Self = this.set("tabAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTabAdd: Self = this.set("tabAdd", js.undefined)
    @scala.inline
    def setTabClick(value: /* e */ TabClickEventArgs => Unit): Self = this.set("tabClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTabClick: Self = this.set("tabClick", js.undefined)
    @scala.inline
    def setTabCreate(value: /* e */ TabCreateEventArgs => Unit): Self = this.set("tabCreate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTabCreate: Self = this.set("tabCreate", js.undefined)
    @scala.inline
    def setTabRemove(value: /* e */ TabRemoveEventArgs => Unit): Self = this.set("tabRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTabRemove: Self = this.set("tabRemove", js.undefined)
    @scala.inline
    def setTabSelect(value: /* e */ TabSelectEventArgs => Unit): Self = this.set("tabSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTabSelect: Self = this.set("tabSelect", js.undefined)
    @scala.inline
    def setTabsVarargs(value: Tab*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[Tab]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    @scala.inline
    def setToggleButtonClick(value: /* e */ ToggleButtonClickEventArgs => Unit): Self = this.set("toggleButtonClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggleButtonClick: Self = this.set("toggleButtonClick", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

