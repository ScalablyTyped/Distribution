package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentDxTreeView
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.ComponentElementModelValue
import typings.devextreme.anon.ElementItemElement
import typings.devextreme.anon.EventItemDataItemElement
import typings.devextreme.anon.ItemDataItemElementItemIndex
import typings.devextreme.anon.ItemElementItemIndexModel
import typings.devextreme.anon.Model
import typings.devextreme.anon.ModelNode
import typings.devextreme.anon.Name
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.click
import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.dblclick_
import typings.devextreme.devextremeStrings.equals
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.plain
import typings.devextreme.devextremeStrings.selectAll
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.devextremeStrings.startswith
import typings.devextreme.devextremeStrings.tree
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeViewOptions
  extends HierarchicalCollectionWidgetOptions[dxTreeView]
     with SearchBoxMixinOptions[dxTreeView] {
  /** @name dxTreeView.Options.animationEnabled */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeView.Options.createChildren */
  var createChildren: js.UndefOr[
    js.Function1[/* parentNode */ dxTreeViewNode, Promise[_] | JQueryPromise[_] | js.Array[_]]
  ] = js.undefined
  /** @name dxTreeView.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxTreeViewOptions: js.UndefOr[String | js.Array[dxTreeViewItem] | DataSource | DataSourceOptions] = js.undefined
  /** @name dxTreeView.Options.dataStructure */
  var dataStructure: js.UndefOr[plain | tree] = js.undefined
  /** @name dxTreeView.Options.expandAllEnabled */
  var expandAllEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeView.Options.expandEvent */
  var expandEvent: js.UndefOr[dblclick_ | click] = js.undefined
  /** @name dxTreeView.Options.expandNodesRecursive */
  var expandNodesRecursive: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeView.Options.expandedExpr */
  var expandedExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name dxTreeView.Options.hasItemsExpr */
  var hasItemsExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name dxTreeView.Options.items */
  @JSName("items")
  var items_dxTreeViewOptions: js.UndefOr[js.Array[dxTreeViewItem]] = js.undefined
  /** @name dxTreeView.Options.onItemClick */
  @JSName("onItemClick")
  var onItemClick_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ ModelNode, _]] = js.undefined
  /** @name dxTreeView.Options.onItemCollapsed */
  var onItemCollapsed: js.UndefOr[js.Function1[/* e */ EventItemDataItemElement, _]] = js.undefined
  /** @name dxTreeView.Options.onItemContextMenu */
  @JSName("onItemContextMenu")
  var onItemContextMenu_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ ModelNode, _]] = js.undefined
  /** @name dxTreeView.Options.onItemExpanded */
  var onItemExpanded: js.UndefOr[js.Function1[/* e */ EventItemDataItemElement, _]] = js.undefined
  /** @name dxTreeView.Options.onItemHold */
  @JSName("onItemHold")
  var onItemHold_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ ItemDataItemElementItemIndex, _]] = js.undefined
  /** @name dxTreeView.Options.onItemRendered */
  @JSName("onItemRendered")
  var onItemRendered_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ ItemElementItemIndexModel, _]] = js.undefined
  /** @name dxTreeView.Options.onItemSelectionChanged */
  var onItemSelectionChanged: js.UndefOr[js.Function1[/* e */ ElementItemElement, _]] = js.undefined
  /** @name dxTreeView.Options.onSelectAllValueChanged */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ ComponentElementModelValue, _]] = js.undefined
  /** @name dxTreeView.Options.onSelectionChanged */
  @JSName("onSelectionChanged")
  var onSelectionChanged_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ ComponentDxTreeView, _]] = js.undefined
  /** @name dxTreeView.Options.parentIdExpr */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name dxTreeView.Options.rootValue */
  var rootValue: js.UndefOr[js.Any] = js.undefined
  /** @name dxTreeView.Options.scrollDirection */
  var scrollDirection: js.UndefOr[both | horizontal | vertical] = js.undefined
  /** @name dxTreeView.Options.selectAllText */
  var selectAllText: js.UndefOr[String] = js.undefined
  /** @name dxTreeView.Options.selectByClick */
  var selectByClick: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeView.Options.selectNodesRecursive */
  var selectNodesRecursive: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeView.Options.selectionMode */
  var selectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** @name dxTreeView.Options.showCheckBoxesMode */
  var showCheckBoxesMode: js.UndefOr[none | normal | selectAll] = js.undefined
  /** @name dxTreeView.Options.virtualModeEnabled */
  var virtualModeEnabled: js.UndefOr[Boolean] = js.undefined
}

object dxTreeViewOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    createChildren: /* parentNode */ dxTreeViewNode => Promise[_] | JQueryPromise[_] | js.Array[_] = null,
    dataSource: String | js.Array[dxTreeViewItem] | DataSource | DataSourceOptions = null,
    dataStructure: plain | tree = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledExpr: String | js.Function = null,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    elementAttr: js.Any = null,
    expandAllEnabled: js.UndefOr[Boolean] = js.undefined,
    expandEvent: dblclick_ | click = null,
    expandNodesRecursive: js.UndefOr[Boolean] = js.undefined,
    expandedExpr: String | js.Function = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    hasItemsExpr: String | js.Function = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemHoldTimeout: js.UndefOr[Double] = js.undefined,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[dxTreeViewItem] = null,
    itemsExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    noDataText: String = null,
    onContentReady: /* e */ ComponentElement[dxTreeView] => _ = null,
    onDisposing: /* e */ Model[dxTreeView] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxTreeView] => _ = null,
    onItemClick: /* e */ ModelNode => _ = null,
    onItemCollapsed: /* e */ EventItemDataItemElement => _ = null,
    onItemContextMenu: /* e */ ModelNode => _ = null,
    onItemExpanded: /* e */ EventItemDataItemElement => _ = null,
    onItemHold: /* e */ ItemDataItemElementItemIndex => _ = null,
    onItemRendered: /* e */ ItemElementItemIndexModel => _ = null,
    onItemSelectionChanged: /* e */ ElementItemElement => _ = null,
    onOptionChanged: /* e */ Name[dxTreeView] => _ = null,
    onSelectAllValueChanged: /* e */ ComponentElementModelValue => _ = null,
    onSelectionChanged: /* e */ ComponentDxTreeView => _ = null,
    parentIdExpr: String | js.Function = null,
    rootValue: js.Any = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollDirection: both | horizontal | vertical = null,
    searchEditorOptions: dxTextBoxOptions[dxTextBox] = null,
    searchEnabled: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchMode: contains | startswith | equals = null,
    searchTimeout: js.UndefOr[Double] = js.undefined,
    searchValue: String = null,
    selectAllText: String = null,
    selectByClick: js.UndefOr[Boolean] = js.undefined,
    selectNodesRecursive: js.UndefOr[Boolean] = js.undefined,
    selectedExpr: String | js.Function = null,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    selectionMode: multiple | single_ = null,
    showCheckBoxesMode: none | normal | selectAll = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    virtualModeEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxTreeViewOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (createChildren != null) __obj.updateDynamic("createChildren")(js.Any.fromFunction1(createChildren))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataStructure != null) __obj.updateDynamic("dataStructure")(dataStructure.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (disabledExpr != null) __obj.updateDynamic("disabledExpr")(disabledExpr.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(expandAllEnabled)) __obj.updateDynamic("expandAllEnabled")(expandAllEnabled.get.asInstanceOf[js.Any])
    if (expandEvent != null) __obj.updateDynamic("expandEvent")(expandEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(expandNodesRecursive)) __obj.updateDynamic("expandNodesRecursive")(expandNodesRecursive.get.asInstanceOf[js.Any])
    if (expandedExpr != null) __obj.updateDynamic("expandedExpr")(expandedExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (hasItemsExpr != null) __obj.updateDynamic("hasItemsExpr")(hasItemsExpr.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemHoldTimeout)) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.get.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsExpr != null) __obj.updateDynamic("itemsExpr")(itemsExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1(onItemClick))
    if (onItemCollapsed != null) __obj.updateDynamic("onItemCollapsed")(js.Any.fromFunction1(onItemCollapsed))
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1(onItemContextMenu))
    if (onItemExpanded != null) __obj.updateDynamic("onItemExpanded")(js.Any.fromFunction1(onItemExpanded))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1(onItemHold))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1(onItemRendered))
    if (onItemSelectionChanged != null) __obj.updateDynamic("onItemSelectionChanged")(js.Any.fromFunction1(onItemSelectionChanged))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectAllValueChanged != null) __obj.updateDynamic("onSelectAllValueChanged")(js.Any.fromFunction1(onSelectAllValueChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (parentIdExpr != null) __obj.updateDynamic("parentIdExpr")(parentIdExpr.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (scrollDirection != null) __obj.updateDynamic("scrollDirection")(scrollDirection.asInstanceOf[js.Any])
    if (searchEditorOptions != null) __obj.updateDynamic("searchEditorOptions")(searchEditorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnabled)) __obj.updateDynamic("searchEnabled")(searchEnabled.get.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (!js.isUndefined(searchTimeout)) __obj.updateDynamic("searchTimeout")(searchTimeout.get.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (selectAllText != null) __obj.updateDynamic("selectAllText")(selectAllText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectByClick)) __obj.updateDynamic("selectByClick")(selectByClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectNodesRecursive)) __obj.updateDynamic("selectNodesRecursive")(selectNodesRecursive.get.asInstanceOf[js.Any])
    if (selectedExpr != null) __obj.updateDynamic("selectedExpr")(selectedExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showCheckBoxesMode != null) __obj.updateDynamic("showCheckBoxesMode")(showCheckBoxesMode.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualModeEnabled)) __obj.updateDynamic("virtualModeEnabled")(virtualModeEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeViewOptions]
  }
}

