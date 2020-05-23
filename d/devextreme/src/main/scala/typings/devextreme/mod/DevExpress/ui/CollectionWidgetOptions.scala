package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AddedItems
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Event
import typings.devextreme.anon.ItemData
import typings.devextreme.anon.ItemElement
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionWidgetOptions[T] extends WidgetOptions[T] {
  /** @name CollectionWidget.Options.dataSource */
  var dataSource: js.UndefOr[
    String | (js.Array[String | CollectionWidgetItem]) | DataSource | DataSourceOptions
  ] = js.undefined
  /** @name CollectionWidget.Options.itemHoldTimeout */
  var itemHoldTimeout: js.UndefOr[Double] = js.undefined
  /** @name CollectionWidget.Options.itemTemplate */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name CollectionWidget.Options.items */
  var items: js.UndefOr[js.Array[String | CollectionWidgetItem | _]] = js.undefined
  /** @name CollectionWidget.Options.keyExpr */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name CollectionWidget.Options.noDataText */
  var noDataText: js.UndefOr[String] = js.undefined
  /** @name CollectionWidget.Options.onItemClick */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ Event[T], _]) | String] = js.undefined
  /** @name CollectionWidget.Options.onItemContextMenu */
  var onItemContextMenu: js.UndefOr[js.Function1[/* e */ Event[T], _]] = js.undefined
  /** @name CollectionWidget.Options.onItemHold */
  var onItemHold: js.UndefOr[js.Function1[/* e */ ItemData[T], _]] = js.undefined
  /** @name CollectionWidget.Options.onItemRendered */
  var onItemRendered: js.UndefOr[js.Function1[/* e */ ItemElement[T], _]] = js.undefined
  /** @name CollectionWidget.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AddedItems[T], _]] = js.undefined
  /** @name CollectionWidget.Options.selectedIndex */
  var selectedIndex: js.UndefOr[Double] = js.undefined
  /** @name CollectionWidget.Options.selectedItem */
  var selectedItem: js.UndefOr[js.Any] = js.undefined
  /** @name CollectionWidget.Options.selectedItemKeys */
  var selectedItemKeys: js.UndefOr[js.Array[_]] = js.undefined
  /** @name CollectionWidget.Options.selectedItems */
  var selectedItems: js.UndefOr[js.Array[_]] = js.undefined
}

object CollectionWidgetOptions {
  @scala.inline
  def apply[T](
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    dataSource: String | (js.Array[String | CollectionWidgetItem]) | DataSource | DataSourceOptions = null,
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
    items: js.Array[String | CollectionWidgetItem | _] = null,
    keyExpr: String | js.Function = null,
    noDataText: String = null,
    onContentReady: /* e */ ComponentElement[T] => _ = null,
    onDisposing: /* e */ Model[T] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[T] => _ = null,
    onItemClick: (js.Function1[/* e */ Event[T], _]) | String = null,
    onItemContextMenu: /* e */ Event[T] => _ = null,
    onItemHold: /* e */ ItemData[T] => _ = null,
    onItemRendered: /* e */ ItemElement[T] => _ = null,
    onOptionChanged: /* e */ Name[T] => _ = null,
    onSelectionChanged: /* e */ AddedItems[T] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): CollectionWidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[CollectionWidgetOptions[T]]
  }
}

