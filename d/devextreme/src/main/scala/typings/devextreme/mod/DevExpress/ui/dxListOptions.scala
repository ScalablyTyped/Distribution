package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAction
import typings.devextreme.AnonAddedItems
import typings.devextreme.AnonComponentDxList
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonComponentElementItemData
import typings.devextreme.AnonDirection
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementItemData
import typings.devextreme.AnonGroupData
import typings.devextreme.AnonItemElement
import typings.devextreme.AnonItemIndexJQueryEvent
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelValue
import typings.devextreme.AnonName
import typings.devextreme.AnonReachedBottom
import typings.devextreme.AnonToIndex
import typings.devextreme.devextremeStrings.all
import typings.devextreme.devextremeStrings.allPages
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.context
import typings.devextreme.devextremeStrings.equals
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.never
import typings.devextreme.devextremeStrings.nextButton
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onHover
import typings.devextreme.devextremeStrings.onScroll
import typings.devextreme.devextremeStrings.page
import typings.devextreme.devextremeStrings.scrollBottom
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.devextremeStrings.slide
import typings.devextreme.devextremeStrings.slideButton
import typings.devextreme.devextremeStrings.slideItem
import typings.devextreme.devextremeStrings.startswith
import typings.devextreme.devextremeStrings.static
import typings.devextreme.devextremeStrings.swipe
import typings.devextreme.devextremeStrings.toggle
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxListOptions
  extends CollectionWidgetOptions[dxList]
     with SearchBoxMixinOptions[dxList] {
  /** @name dxList.Options.allowItemDeleting */
  var allowItemDeleting: js.UndefOr[Boolean] = js.undefined
  /** @deprecated */
  /** @name dxList.Options.allowItemReordering */
  var allowItemReordering: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.bounceEnabled */
  var bounceEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.collapsibleGroups */
  var collapsibleGroups: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxListOptions: js.UndefOr[String | (js.Array[String | dxListItem | _]) | DataSource | DataSourceOptions] = js.undefined
  /** @name dxList.Options.displayExpr */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.undefined
  /** @name dxList.Options.groupTemplate */
  var groupTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxList.Options.grouped */
  var grouped: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.indicateLoading */
  var indicateLoading: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.itemDeleteMode */
  var itemDeleteMode: js.UndefOr[context | slideButton | slideItem | static | swipe | toggle] = js.undefined
  /** @name dxList.Options.itemDragging */
  var itemDragging: js.UndefOr[dxSortableOptions] = js.undefined
  /** @name dxList.Options.items */
  @JSName("items")
  var items_dxListOptions: js.UndefOr[js.Array[String | dxListItem | _]] = js.undefined
  /** @name dxList.Options.menuItems */
  var menuItems: js.UndefOr[js.Array[AnonAction]] = js.undefined
  /** @name dxList.Options.menuMode */
  var menuMode: js.UndefOr[context | slide] = js.undefined
  /** @name dxList.Options.nextButtonText */
  var nextButtonText: js.UndefOr[String] = js.undefined
  /** @name dxList.Options.onGroupRendered */
  var onGroupRendered: js.UndefOr[js.Function1[/* e */ AnonGroupData, _]] = js.undefined
  /** @name dxList.Options.onItemClick */
  @JSName("onItemClick")
  var onItemClick_dxListOptions: js.UndefOr[(js.Function1[/* e */ AnonItemIndexJQueryEvent, _]) | String] = js.undefined
  /** @name dxList.Options.onItemContextMenu */
  @JSName("onItemContextMenu")
  var onItemContextMenu_dxListOptions: js.UndefOr[js.Function1[/* e */ AnonItemIndexJQueryEvent, _]] = js.undefined
  /** @name dxList.Options.onItemDeleted */
  var onItemDeleted: js.UndefOr[js.Function1[/* e */ AnonElementItemData, _]] = js.undefined
  /** @name dxList.Options.onItemDeleting */
  var onItemDeleting: js.UndefOr[js.Function1[/* e */ AnonComponentElementItemData, _]] = js.undefined
  /** @name dxList.Options.onItemHold */
  @JSName("onItemHold")
  var onItemHold_dxListOptions: js.UndefOr[js.Function1[/* e */ AnonItemIndexJQueryEvent, _]] = js.undefined
  /** @name dxList.Options.onItemReordered */
  var onItemReordered: js.UndefOr[js.Function1[/* e */ AnonToIndex, _]] = js.undefined
  /** @name dxList.Options.onItemSwipe */
  var onItemSwipe: js.UndefOr[js.Function1[/* e */ AnonDirection, _]] = js.undefined
  /** @name dxList.Options.onPageLoading */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ AnonComponentDxList, _]] = js.undefined
  /** @name dxList.Options.onPullRefresh */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ AnonComponentDxList, _]] = js.undefined
  /** @name dxList.Options.onScroll */
  var onScroll: js.UndefOr[js.Function1[/* e */ AnonReachedBottom, _]] = js.undefined
  /** @name dxList.Options.onSelectAllValueChanged */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ AnonModelValue, _]] = js.undefined
  /** @name dxList.Options.pageLoadMode */
  var pageLoadMode: js.UndefOr[nextButton | scrollBottom] = js.undefined
  /** @name dxList.Options.pageLoadingText */
  var pageLoadingText: js.UndefOr[String] = js.undefined
  /** @name dxList.Options.pullRefreshEnabled */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.pulledDownText */
  var pulledDownText: js.UndefOr[String] = js.undefined
  /** @name dxList.Options.pullingDownText */
  var pullingDownText: js.UndefOr[String] = js.undefined
  /** @name dxList.Options.refreshingText */
  var refreshingText: js.UndefOr[String] = js.undefined
  /** @name dxList.Options.repaintChangesOnly */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.scrollByContent */
  var scrollByContent: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.scrollByThumb */
  var scrollByThumb: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.scrollingEnabled */
  var scrollingEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.selectAllMode */
  var selectAllMode: js.UndefOr[allPages | page] = js.undefined
  /** @name dxList.Options.selectionMode */
  var selectionMode: js.UndefOr[all | multiple | none | single_] = js.undefined
  /** @name dxList.Options.showScrollbar */
  var showScrollbar: js.UndefOr[always | never | onHover | onScroll] = js.undefined
  /** @name dxList.Options.showSelectionControls */
  var showSelectionControls: js.UndefOr[Boolean] = js.undefined
  /** @name dxList.Options.useNativeScrolling */
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
}

object dxListOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowItemDeleting: js.UndefOr[Boolean] = js.undefined,
    allowItemReordering: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    bounceEnabled: js.UndefOr[Boolean] = js.undefined,
    collapsibleGroups: js.UndefOr[Boolean] = js.undefined,
    dataSource: String | (js.Array[String | dxListItem | _]) | DataSource | DataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    groupTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    grouped: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    indicateLoading: js.UndefOr[Boolean] = js.undefined,
    itemDeleteMode: context | slideButton | slideItem | static | swipe | toggle = null,
    itemDragging: dxSortableOptions = null,
    itemHoldTimeout: Int | Double = null,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[String | dxListItem | _] = null,
    keyExpr: String | js.Function = null,
    menuItems: js.Array[AnonAction] = null,
    menuMode: context | slide = null,
    nextButtonText: String = null,
    noDataText: String = null,
    onContentReady: /* e */ AnonComponentElement[dxList] => _ = null,
    onDisposing: /* e */ AnonModel[dxList] => _ = null,
    onGroupRendered: /* e */ AnonGroupData => _ = null,
    onInitialized: /* e */ AnonElement[dxList] => _ = null,
    onItemClick: (js.Function1[/* e */ AnonItemIndexJQueryEvent, _]) | String = null,
    onItemContextMenu: /* e */ AnonItemIndexJQueryEvent => _ = null,
    onItemDeleted: /* e */ AnonElementItemData => _ = null,
    onItemDeleting: /* e */ AnonComponentElementItemData => _ = null,
    onItemHold: /* e */ AnonItemIndexJQueryEvent => _ = null,
    onItemRendered: /* e */ AnonItemElement[dxList] => _ = null,
    onItemReordered: /* e */ AnonToIndex => _ = null,
    onItemSwipe: /* e */ AnonDirection => _ = null,
    onOptionChanged: /* e */ AnonName[dxList] => _ = null,
    onPageLoading: /* e */ AnonComponentDxList => _ = null,
    onPullRefresh: /* e */ AnonComponentDxList => _ = null,
    onScroll: /* e */ AnonReachedBottom => _ = null,
    onSelectAllValueChanged: /* e */ AnonModelValue => _ = null,
    onSelectionChanged: /* e */ AnonAddedItems[dxList] => _ = null,
    pageLoadMode: nextButton | scrollBottom = null,
    pageLoadingText: String = null,
    pullRefreshEnabled: js.UndefOr[Boolean] = js.undefined,
    pulledDownText: String = null,
    pullingDownText: String = null,
    refreshingText: String = null,
    repaintChangesOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollByContent: js.UndefOr[Boolean] = js.undefined,
    scrollByThumb: js.UndefOr[Boolean] = js.undefined,
    scrollingEnabled: js.UndefOr[Boolean] = js.undefined,
    searchEditorOptions: dxTextBoxOptions[dxTextBox] = null,
    searchEnabled: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchMode: contains | startswith | equals = null,
    searchTimeout: Int | Double = null,
    searchValue: String = null,
    selectAllMode: allPages | page = null,
    selectedIndex: Int | Double = null,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    selectionMode: all | multiple | none | single_ = null,
    showScrollbar: always | never | onHover | onScroll = null,
    showSelectionControls: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    useNativeScrolling: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxListOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowItemDeleting)) __obj.updateDynamic("allowItemDeleting")(allowItemDeleting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowItemReordering)) __obj.updateDynamic("allowItemReordering")(allowItemReordering.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceEnabled)) __obj.updateDynamic("bounceEnabled")(bounceEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsibleGroups)) __obj.updateDynamic("collapsibleGroups")(collapsibleGroups.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(indicateLoading)) __obj.updateDynamic("indicateLoading")(indicateLoading.asInstanceOf[js.Any])
    if (itemDeleteMode != null) __obj.updateDynamic("itemDeleteMode")(itemDeleteMode.asInstanceOf[js.Any])
    if (itemDragging != null) __obj.updateDynamic("itemDragging")(itemDragging.asInstanceOf[js.Any])
    if (itemHoldTimeout != null) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems.asInstanceOf[js.Any])
    if (menuMode != null) __obj.updateDynamic("menuMode")(menuMode.asInstanceOf[js.Any])
    if (nextButtonText != null) __obj.updateDynamic("nextButtonText")(nextButtonText.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onGroupRendered != null) __obj.updateDynamic("onGroupRendered")(js.Any.fromFunction1(onGroupRendered))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1(onItemContextMenu))
    if (onItemDeleted != null) __obj.updateDynamic("onItemDeleted")(js.Any.fromFunction1(onItemDeleted))
    if (onItemDeleting != null) __obj.updateDynamic("onItemDeleting")(js.Any.fromFunction1(onItemDeleting))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1(onItemHold))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1(onItemRendered))
    if (onItemReordered != null) __obj.updateDynamic("onItemReordered")(js.Any.fromFunction1(onItemReordered))
    if (onItemSwipe != null) __obj.updateDynamic("onItemSwipe")(js.Any.fromFunction1(onItemSwipe))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPageLoading != null) __obj.updateDynamic("onPageLoading")(js.Any.fromFunction1(onPageLoading))
    if (onPullRefresh != null) __obj.updateDynamic("onPullRefresh")(js.Any.fromFunction1(onPullRefresh))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSelectAllValueChanged != null) __obj.updateDynamic("onSelectAllValueChanged")(js.Any.fromFunction1(onSelectAllValueChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (pageLoadMode != null) __obj.updateDynamic("pageLoadMode")(pageLoadMode.asInstanceOf[js.Any])
    if (pageLoadingText != null) __obj.updateDynamic("pageLoadingText")(pageLoadingText.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRefreshEnabled)) __obj.updateDynamic("pullRefreshEnabled")(pullRefreshEnabled.asInstanceOf[js.Any])
    if (pulledDownText != null) __obj.updateDynamic("pulledDownText")(pulledDownText.asInstanceOf[js.Any])
    if (pullingDownText != null) __obj.updateDynamic("pullingDownText")(pullingDownText.asInstanceOf[js.Any])
    if (refreshingText != null) __obj.updateDynamic("refreshingText")(refreshingText.asInstanceOf[js.Any])
    if (!js.isUndefined(repaintChangesOnly)) __obj.updateDynamic("repaintChangesOnly")(repaintChangesOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByContent)) __obj.updateDynamic("scrollByContent")(scrollByContent.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByThumb)) __obj.updateDynamic("scrollByThumb")(scrollByThumb.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollingEnabled)) __obj.updateDynamic("scrollingEnabled")(scrollingEnabled.asInstanceOf[js.Any])
    if (searchEditorOptions != null) __obj.updateDynamic("searchEditorOptions")(searchEditorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnabled)) __obj.updateDynamic("searchEnabled")(searchEnabled.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (selectAllMode != null) __obj.updateDynamic("selectAllMode")(selectAllMode.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showScrollbar != null) __obj.updateDynamic("showScrollbar")(showScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectionControls)) __obj.updateDynamic("showSelectionControls")(showSelectionControls.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeScrolling)) __obj.updateDynamic("useNativeScrolling")(useNativeScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxListOptions]
  }
}

