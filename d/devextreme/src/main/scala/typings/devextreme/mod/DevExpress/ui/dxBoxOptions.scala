package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AddedItems
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Event
import typings.devextreme.anon.ItemData
import typings.devextreme.anon.ItemElement
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.devextremeStrings.`space-around`
import typings.devextreme.devextremeStrings.`space-between`
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.col
import typings.devextreme.devextremeStrings.end
import typings.devextreme.devextremeStrings.row
import typings.devextreme.devextremeStrings.start
import typings.devextreme.devextremeStrings.stretch
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxBoxOptions extends CollectionWidgetOptions[dxBox] {
  /** @name dxBox.Options.align */
  var align: js.UndefOr[center | end | `space-around` | `space-between` | start] = js.undefined
  /** @name dxBox.Options.crossAlign */
  var crossAlign: js.UndefOr[center | end | start | stretch] = js.undefined
  /** @name dxBox.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxBoxOptions: js.UndefOr[String | (js.Array[String | dxBoxItem | _]) | DataSource | DataSourceOptions] = js.undefined
  /** @name dxBox.Options.direction */
  var direction: js.UndefOr[col | row] = js.undefined
  /** @name dxBox.Options.items */
  @JSName("items")
  var items_dxBoxOptions: js.UndefOr[js.Array[String | dxBoxItem | _]] = js.undefined
}

object dxBoxOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    align: center | end | `space-around` | `space-between` | start = null,
    bindingOptions: js.Any = null,
    crossAlign: center | end | start | stretch = null,
    dataSource: String | (js.Array[String | dxBoxItem | _]) | DataSource | DataSourceOptions = null,
    direction: col | row = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
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
    items: js.Array[String | dxBoxItem | _] = null,
    keyExpr: String | js.Function = null,
    noDataText: String = null,
    onContentReady: /* e */ ComponentElement[dxBox] => _ = null,
    onDisposing: /* e */ Model[dxBox] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxBox] => _ = null,
    onItemClick: (js.Function1[/* e */ Event[dxBox], _]) | String = null,
    onItemContextMenu: /* e */ Event[dxBox] => _ = null,
    onItemHold: /* e */ ItemData[dxBox] => _ = null,
    onItemRendered: /* e */ ItemElement[dxBox] => _ = null,
    onOptionChanged: /* e */ Name[dxBox] => _ = null,
    onSelectionChanged: /* e */ AddedItems[dxBox] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (crossAlign != null) __obj.updateDynamic("crossAlign")(crossAlign.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemHoldTimeout)) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxBoxOptions]
  }
}

