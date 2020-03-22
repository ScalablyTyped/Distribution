package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAddedItems
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonEvent
import typings.devextreme.AnonItemData
import typings.devextreme.AnonItemElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxNavBarOptions extends dxTabsOptions[dxNavBar]

object dxNavBarOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    dataSource: String | (js.Array[String | dxTabsItem | _]) | DataSource | DataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemHoldTimeout: Int | Double = null,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[String | dxTabsItem | _] = null,
    keyExpr: String | js.Function = null,
    noDataText: String = null,
    onContentReady: /* e */ AnonComponentElement[dxNavBar] => _ = null,
    onDisposing: /* e */ AnonModel[dxNavBar] => _ = null,
    onInitialized: /* e */ AnonElement[dxNavBar] => _ = null,
    onItemClick: (js.Function1[/* e */ AnonEvent[dxNavBar], _]) | String = null,
    onItemContextMenu: /* e */ AnonEvent[dxNavBar] => _ = null,
    onItemHold: /* e */ AnonItemData[dxNavBar] => _ = null,
    onItemRendered: /* e */ AnonItemElement[dxNavBar] => _ = null,
    onOptionChanged: /* e */ AnonName[dxNavBar] => _ = null,
    onSelectionChanged: /* e */ AnonAddedItems[dxNavBar] => _ = null,
    repaintChangesOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollByContent: js.UndefOr[Boolean] = js.undefined,
    scrollingEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: Int | Double = null,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[String | Double | _] = null,
    selectionMode: multiple | single_ = null,
    showNavButtons: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxNavBarOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemHoldTimeout != null) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1(onItemContextMenu))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1(onItemHold))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1(onItemRendered))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (!js.isUndefined(repaintChangesOnly)) __obj.updateDynamic("repaintChangesOnly")(repaintChangesOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByContent)) __obj.updateDynamic("scrollByContent")(scrollByContent.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollingEnabled)) __obj.updateDynamic("scrollingEnabled")(scrollingEnabled.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavButtons)) __obj.updateDynamic("showNavButtons")(showNavButtons.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxNavBarOptions]
  }
}

