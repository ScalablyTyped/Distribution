package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AddedItems
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Event
import typings.devextreme.anon.ItemData
import typings.devextreme.anon.ItemElement
import typings.devextreme.anon.ItemIndex
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

trait dxAccordionOptions extends CollectionWidgetOptions[dxAccordion] {
  /** @name dxAccordion.Options.animationDuration */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /** @name dxAccordion.Options.collapsible */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /** @name dxAccordion.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxAccordionOptions: js.UndefOr[
    String | (js.Array[String | dxAccordionItem | _]) | DataSource | DataSourceOptions
  ] = js.undefined
  /** @name dxAccordion.Options.deferRendering */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  /** @name dxAccordion.Options.itemTitleTemplate */
  var itemTitleTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxAccordion.Options.items */
  @JSName("items")
  var items_dxAccordionOptions: js.UndefOr[js.Array[String | dxAccordionItem | _]] = js.undefined
  /** @name dxAccordion.Options.multiple */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /** @name dxAccordion.Options.onItemTitleClick */
  var onItemTitleClick: js.UndefOr[(js.Function1[/* e */ ItemIndex, _]) | String] = js.undefined
  /** @name dxAccordion.Options.repaintChangesOnly */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.undefined
}

object dxAccordionOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    bindingOptions: js.Any = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    dataSource: String | (js.Array[String | dxAccordionItem | _]) | DataSource | DataSourceOptions = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
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
    itemTitleTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[String | dxAccordionItem | _] = null,
    keyExpr: String | js.Function = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    noDataText: String = null,
    onContentReady: /* e */ ComponentElement[dxAccordion] => _ = null,
    onDisposing: /* e */ Model[dxAccordion] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxAccordion] => _ = null,
    onItemClick: (js.Function1[/* e */ Event[dxAccordion], _]) | String = null,
    onItemContextMenu: /* e */ Event[dxAccordion] => _ = null,
    onItemHold: /* e */ ItemData[dxAccordion] => _ = null,
    onItemRendered: /* e */ ItemElement[dxAccordion] => _ = null,
    onItemTitleClick: (js.Function1[/* e */ ItemIndex, _]) | String = null,
    onOptionChanged: /* e */ Name[dxAccordion] => _ = null,
    onSelectionChanged: /* e */ AddedItems[dxAccordion] => _ = null,
    repaintChangesOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxAccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.get.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemHoldTimeout)) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.get.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (itemTitleTemplate != null) __obj.updateDynamic("itemTitleTemplate")(itemTitleTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1(onItemContextMenu))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1(onItemHold))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1(onItemRendered))
    if (onItemTitleClick != null) __obj.updateDynamic("onItemTitleClick")(onItemTitleClick.asInstanceOf[js.Any])
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (!js.isUndefined(repaintChangesOnly)) __obj.updateDynamic("repaintChangesOnly")(repaintChangesOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxAccordionOptions]
  }
}

