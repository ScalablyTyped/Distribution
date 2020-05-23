package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AddedItems
import typings.devextreme.anon.ComponentDxSlideOut
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Event
import typings.devextreme.anon.ItemData
import typings.devextreme.anon.ItemElement
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.devextremeStrings.inverted
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSlideOutOptions extends CollectionWidgetOptions[dxSlideOut] {
  /** @name dxSlideOut.Options.contentTemplate */
  var contentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* container */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name dxSlideOut.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxSlideOutOptions: js.UndefOr[
    String | (js.Array[String | dxSlideOutItem | _]) | DataSource | DataSourceOptions
  ] = js.undefined
  /** @name dxSlideOut.Options.items */
  @JSName("items")
  var items_dxSlideOutOptions: js.UndefOr[js.Array[String | dxSlideOutItem | _]] = js.undefined
  /** @name dxSlideOut.Options.menuGroupTemplate */
  var menuGroupTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ js.Any, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxSlideOut.Options.menuGrouped */
  var menuGrouped: js.UndefOr[Boolean] = js.undefined
  /** @name dxSlideOut.Options.menuItemTemplate */
  var menuItemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxSlideOut.Options.menuPosition */
  var menuPosition: js.UndefOr[inverted | normal] = js.undefined
  /** @name dxSlideOut.Options.menuVisible */
  var menuVisible: js.UndefOr[Boolean] = js.undefined
  /** @name dxSlideOut.Options.onMenuGroupRendered */
  var onMenuGroupRendered: js.UndefOr[js.Function1[/* e */ ComponentDxSlideOut, _]] = js.undefined
  /** @name dxSlideOut.Options.onMenuItemRendered */
  var onMenuItemRendered: js.UndefOr[js.Function1[/* e */ ComponentDxSlideOut, _]] = js.undefined
  /** @name dxSlideOut.Options.swipeEnabled */
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
}

object dxSlideOutOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    contentTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* container */ dxElement, String | Element | JQuery]) = null,
    dataSource: String | (js.Array[String | dxSlideOutItem | _]) | DataSource | DataSourceOptions = null,
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
    items: js.Array[String | dxSlideOutItem | _] = null,
    keyExpr: String | js.Function = null,
    menuGroupTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ js.Any, 
      String | Element | JQuery
    ]) = null,
    menuGrouped: js.UndefOr[Boolean] = js.undefined,
    menuItemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    menuPosition: inverted | normal = null,
    menuVisible: js.UndefOr[Boolean] = js.undefined,
    noDataText: String = null,
    onContentReady: /* e */ ComponentElement[dxSlideOut] => _ = null,
    onDisposing: /* e */ Model[dxSlideOut] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxSlideOut] => _ = null,
    onItemClick: (js.Function1[/* e */ Event[dxSlideOut], _]) | String = null,
    onItemContextMenu: /* e */ Event[dxSlideOut] => _ = null,
    onItemHold: /* e */ ItemData[dxSlideOut] => _ = null,
    onItemRendered: /* e */ ItemElement[dxSlideOut] => _ = null,
    onMenuGroupRendered: /* e */ ComponentDxSlideOut => _ = null,
    onMenuItemRendered: /* e */ ComponentDxSlideOut => _ = null,
    onOptionChanged: /* e */ Name[dxSlideOut] => _ = null,
    onSelectionChanged: /* e */ AddedItems[dxSlideOut] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSlideOutOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
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
    if (menuGroupTemplate != null) __obj.updateDynamic("menuGroupTemplate")(menuGroupTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(menuGrouped)) __obj.updateDynamic("menuGrouped")(menuGrouped.get.asInstanceOf[js.Any])
    if (menuItemTemplate != null) __obj.updateDynamic("menuItemTemplate")(menuItemTemplate.asInstanceOf[js.Any])
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(menuVisible)) __obj.updateDynamic("menuVisible")(menuVisible.get.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1(onItemContextMenu))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1(onItemHold))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1(onItemRendered))
    if (onMenuGroupRendered != null) __obj.updateDynamic("onMenuGroupRendered")(js.Any.fromFunction1(onMenuGroupRendered))
    if (onMenuItemRendered != null) __obj.updateDynamic("onMenuItemRendered")(js.Any.fromFunction1(onMenuItemRendered))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSlideOutOptions]
  }
}

