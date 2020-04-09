package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAddedItems
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementModel
import typings.devextreme.AnonEvent
import typings.devextreme.AnonItemData
import typings.devextreme.AnonItemElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxActionSheetOptions extends CollectionWidgetOptions[dxActionSheet] {
  /** @name dxActionSheet.Options.cancelText */
  var cancelText: js.UndefOr[String] = js.undefined
  /** @name dxActionSheet.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxActionSheetOptions: js.UndefOr[
    String | (js.Array[String | dxActionSheetItem | _]) | DataSource | DataSourceOptions
  ] = js.undefined
  /** @name dxActionSheet.Options.items */
  @JSName("items")
  var items_dxActionSheetOptions: js.UndefOr[js.Array[String | dxActionSheetItem | _]] = js.undefined
  /** @name dxActionSheet.Options.onCancelClick */
  var onCancelClick: js.UndefOr[(js.Function1[/* e */ AnonElementModel, _]) | String] = js.undefined
  /** @name dxActionSheet.Options.showCancelButton */
  var showCancelButton: js.UndefOr[Boolean] = js.undefined
  /** @name dxActionSheet.Options.showTitle */
  var showTitle: js.UndefOr[Boolean] = js.undefined
  /** @name dxActionSheet.Options.target */
  var target: js.UndefOr[String | Element | JQuery] = js.undefined
  /** @name dxActionSheet.Options.title */
  var title: js.UndefOr[String] = js.undefined
  /** @name dxActionSheet.Options.usePopover */
  var usePopover: js.UndefOr[Boolean] = js.undefined
}

object dxActionSheetOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    cancelText: String = null,
    dataSource: String | (js.Array[String | dxActionSheetItem | _]) | DataSource | DataSourceOptions = null,
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
    items: js.Array[String | dxActionSheetItem | _] = null,
    keyExpr: String | js.Function = null,
    noDataText: String = null,
    onCancelClick: (js.Function1[/* e */ AnonElementModel, _]) | String = null,
    onContentReady: /* e */ AnonComponentElement[dxActionSheet] => _ = null,
    onDisposing: /* e */ AnonModel[dxActionSheet] => _ = null,
    onInitialized: /* e */ AnonElement[dxActionSheet] => _ = null,
    onItemClick: (js.Function1[/* e */ AnonEvent[dxActionSheet], _]) | String = null,
    onItemContextMenu: /* e */ AnonEvent[dxActionSheet] => _ = null,
    onItemHold: /* e */ AnonItemData[dxActionSheet] => _ = null,
    onItemRendered: /* e */ AnonItemElement[dxActionSheet] => _ = null,
    onOptionChanged: /* e */ AnonName[dxActionSheet] => _ = null,
    onSelectionChanged: /* e */ AnonAddedItems[dxActionSheet] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: Int | Double = null,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    showCancelButton: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    target: String | Element | JQuery = null,
    title: String = null,
    usePopover: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
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
    if (onCancelClick != null) __obj.updateDynamic("onCancelClick")(onCancelClick.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1(onItemContextMenu))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1(onItemHold))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1(onItemRendered))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(usePopover)) __obj.updateDynamic("usePopover")(usePopover.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxActionSheetOptions]
  }
}

