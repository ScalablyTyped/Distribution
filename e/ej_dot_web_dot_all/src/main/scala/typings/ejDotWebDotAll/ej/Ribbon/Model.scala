package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Enables the ribbon resize feature.allowResizing is a deprecated property of isResponsive.
    * @Default {false}
    */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  /** Specifies the application tab to contain application menu or backstage page in the ribbon control.
    * @Default {Object}
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
    * @Default {Object}
    */
  var buttonDefaults: js.UndefOr[js.Any] = js.undefined
  /** Triggered when the ribbon control is collapsed.
    */
  var collapse: js.UndefOr[js.Function1[/* e */ CollapseEventArgs, Unit]] = js.undefined
  /** Sets custom setting to the collapsible pin in the ribbon.
    * @Default {Object}
    */
  var collapsePinSettings: js.UndefOr[CollapsePinSettings] = js.undefined
  /** Set collapsible property as true to render ribbon in initially collapsed state.
    * @Default {false}
    */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the contextual tabs and tab set to the ribbon control with the background color and border color. Refer to the tabs section for adding tabs into the contextual tab and
    * contextual tab set.
    * @Default {Array}
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
    * @Default {0}
    */
  var disabledItemIndex: js.UndefOr[js.Array[_]] = js.undefined
  /** Set enableOnDemand as true to load ribbon tab and backstage contents while corresponding item clicked.
    * @Default {false}
    */
  var enableOnDemand: js.UndefOr[Boolean] = js.undefined
  /** Align content in the ribbon control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Specifies the index or indexes to enable the given index tab or indexes tabs in the ribbon control.
    * @Default {null}
    */
  var enabledItemIndex: js.UndefOr[js.Array[_]] = js.undefined
  /** Triggered when the ribbon control is expanded.
    */
  var expand: js.UndefOr[js.Function1[/* e */ ExpandEventArgs, Unit]] = js.undefined
  /** Sets custom setting to the expandable pin in the ribbon.
    * @Default {Object}
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
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Triggered before the ribbon control is load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region and  it will need to use the user's preference.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Triggered when the QAT menu item is clicked successfully .
    */
  var qatMenuItemClick: js.UndefOr[js.Function1[/* e */ QatMenuItemClickEventArgs, Unit]] = js.undefined
  /** Specifies the index of the ribbon tab to select the given index tab item in the ribbon control.
    * @Default {1}
    */
  var selectedItemIndex: js.UndefOr[Double] = js.undefined
  /** Property to enable the ribbon quick access toolbar.
    * @Default {false}
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
    * @Default {Array}
    */
  var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
  /** Triggered when the expand/collapse button is clicked successfully .
    */
  var toggleButtonClick: js.UndefOr[js.Function1[/* e */ ToggleButtonClickEventArgs, Unit]] = js.undefined
  /** Specifies the width to the ribbon control. You can set width in string or number format.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    applicationTab: ApplicationTab = null,
    backstageItemClick: /* e */ BackstageItemClickEventArgs => Unit = null,
    beforeTabRemove: /* e */ BeforeTabRemoveEventArgs => Unit = null,
    buttonDefaults: js.Any = null,
    collapse: /* e */ CollapseEventArgs => Unit = null,
    collapsePinSettings: CollapsePinSettings = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    contextualTabs: js.Array[ContextualTab] = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    disabledItemIndex: js.Array[_] = null,
    enableOnDemand: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabledItemIndex: js.Array[_] = null,
    expand: /* e */ ExpandEventArgs => Unit = null,
    expandPinSettings: ExpandPinSettings = null,
    galleryItemClick: /* e */ GalleryItemClickEventArgs => Unit = null,
    groupClick: /* e */ GroupClickEventArgs => Unit = null,
    groupExpand: /* e */ GroupExpandEventArgs => Unit = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    load: /* e */ LoadEventArgs => Unit = null,
    locale: String = null,
    qatMenuItemClick: /* e */ QatMenuItemClickEventArgs => Unit = null,
    selectedItemIndex: Int | Double = null,
    showQAT: js.UndefOr[Boolean] = js.undefined,
    tabAdd: /* e */ TabAddEventArgs => Unit = null,
    tabClick: /* e */ TabClickEventArgs => Unit = null,
    tabCreate: /* e */ TabCreateEventArgs => Unit = null,
    tabRemove: /* e */ TabRemoveEventArgs => Unit = null,
    tabSelect: /* e */ TabSelectEventArgs => Unit = null,
    tabs: js.Array[Tab] = null,
    toggleButtonClick: /* e */ ToggleButtonClickEventArgs => Unit = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.asInstanceOf[js.Any])
    if (applicationTab != null) __obj.updateDynamic("applicationTab")(applicationTab.asInstanceOf[js.Any])
    if (backstageItemClick != null) __obj.updateDynamic("backstageItemClick")(js.Any.fromFunction1(backstageItemClick))
    if (beforeTabRemove != null) __obj.updateDynamic("beforeTabRemove")(js.Any.fromFunction1(beforeTabRemove))
    if (buttonDefaults != null) __obj.updateDynamic("buttonDefaults")(buttonDefaults.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1(collapse))
    if (collapsePinSettings != null) __obj.updateDynamic("collapsePinSettings")(collapsePinSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (contextualTabs != null) __obj.updateDynamic("contextualTabs")(contextualTabs.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (disabledItemIndex != null) __obj.updateDynamic("disabledItemIndex")(disabledItemIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOnDemand)) __obj.updateDynamic("enableOnDemand")(enableOnDemand.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (enabledItemIndex != null) __obj.updateDynamic("enabledItemIndex")(enabledItemIndex.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1(expand))
    if (expandPinSettings != null) __obj.updateDynamic("expandPinSettings")(expandPinSettings.asInstanceOf[js.Any])
    if (galleryItemClick != null) __obj.updateDynamic("galleryItemClick")(js.Any.fromFunction1(galleryItemClick))
    if (groupClick != null) __obj.updateDynamic("groupClick")(js.Any.fromFunction1(groupClick))
    if (groupExpand != null) __obj.updateDynamic("groupExpand")(js.Any.fromFunction1(groupExpand))
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (qatMenuItemClick != null) __obj.updateDynamic("qatMenuItemClick")(js.Any.fromFunction1(qatMenuItemClick))
    if (selectedItemIndex != null) __obj.updateDynamic("selectedItemIndex")(selectedItemIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(showQAT)) __obj.updateDynamic("showQAT")(showQAT.asInstanceOf[js.Any])
    if (tabAdd != null) __obj.updateDynamic("tabAdd")(js.Any.fromFunction1(tabAdd))
    if (tabClick != null) __obj.updateDynamic("tabClick")(js.Any.fromFunction1(tabClick))
    if (tabCreate != null) __obj.updateDynamic("tabCreate")(js.Any.fromFunction1(tabCreate))
    if (tabRemove != null) __obj.updateDynamic("tabRemove")(js.Any.fromFunction1(tabRemove))
    if (tabSelect != null) __obj.updateDynamic("tabSelect")(js.Any.fromFunction1(tabSelect))
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (toggleButtonClick != null) __obj.updateDynamic("toggleButtonClick")(js.Any.fromFunction1(toggleButtonClick))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

