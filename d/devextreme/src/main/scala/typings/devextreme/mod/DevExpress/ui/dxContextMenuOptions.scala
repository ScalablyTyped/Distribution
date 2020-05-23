package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AddedItems
import typings.devextreme.anon.CancelComponentElement
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.ComponentElementModel
import typings.devextreme.anon.Delay
import typings.devextreme.anon.DelayName
import typings.devextreme.anon.Event
import typings.devextreme.anon.Hide
import typings.devextreme.anon.ItemData
import typings.devextreme.anon.ItemElement
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.Position
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onClick
import typings.devextreme.devextremeStrings.onHover
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.positionConfig
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxContextMenuOptions extends dxMenuBaseOptions[dxContextMenu] {
  /** @name dxContextMenu.Options.closeOnOutsideClick */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.undefined
  /** @name dxContextMenu.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxContextMenuOptions: js.UndefOr[String | js.Array[dxContextMenuItem] | DataSource | DataSourceOptions] = js.undefined
  /** @name dxContextMenu.Options.items */
  @JSName("items")
  var items_dxContextMenuOptions: js.UndefOr[js.Array[dxContextMenuItem]] = js.undefined
  /** @name dxContextMenu.Options.onHidden */
  var onHidden: js.UndefOr[js.Function1[/* e */ ComponentElementModel, _]] = js.undefined
  /** @name dxContextMenu.Options.onHiding */
  var onHiding: js.UndefOr[js.Function1[/* e */ CancelComponentElement, _]] = js.undefined
  /** @name dxContextMenu.Options.onPositioning */
  var onPositioning: js.UndefOr[js.Function1[/* e */ Position, _]] = js.undefined
  /** @name dxContextMenu.Options.onShowing */
  var onShowing: js.UndefOr[js.Function1[/* e */ CancelComponentElement, _]] = js.undefined
  /** @name dxContextMenu.Options.onShown */
  var onShown: js.UndefOr[js.Function1[/* e */ ComponentElementModel, _]] = js.undefined
  /** @name dxContextMenu.Options.position */
  var position: js.UndefOr[positionConfig] = js.undefined
  /** @name dxContextMenu.Options.showEvent */
  var showEvent: js.UndefOr[Delay | String] = js.undefined
  /** @name dxContextMenu.Options.submenuDirection */
  var submenuDirection: js.UndefOr[auto | left | right] = js.undefined
  /** @name dxContextMenu.Options.target */
  var target: js.UndefOr[String | Element | JQuery] = js.undefined
}

object dxContextMenuOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: Hide = null,
    bindingOptions: js.Any = null,
    closeOnOutsideClick: Boolean | (js.Function1[/* event */ event, Boolean]) = null,
    cssClass: String = null,
    dataSource: String | js.Array[dxContextMenuItem] | DataSource | DataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledExpr: String | js.Function = null,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
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
    items: js.Array[dxContextMenuItem] = null,
    itemsExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    noDataText: String = null,
    onContentReady: /* e */ ComponentElement[dxContextMenu] => _ = null,
    onDisposing: /* e */ Model[dxContextMenu] => _ = null,
    onHidden: /* e */ ComponentElementModel => _ = null,
    onHiding: /* e */ CancelComponentElement => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxContextMenu] => _ = null,
    onItemClick: (js.Function1[/* e */ Event[dxContextMenu], _]) | String = null,
    onItemContextMenu: /* e */ Event[dxContextMenu] => _ = null,
    onItemHold: /* e */ ItemData[dxContextMenu] => _ = null,
    onItemRendered: /* e */ ItemElement[dxContextMenu] => _ = null,
    onOptionChanged: /* e */ Name[dxContextMenu] => _ = null,
    onPositioning: /* e */ Position => _ = null,
    onSelectionChanged: /* e */ AddedItems[dxContextMenu] => _ = null,
    onShowing: /* e */ CancelComponentElement => _ = null,
    onShown: /* e */ ComponentElementModel => _ = null,
    position: positionConfig = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectByClick: js.UndefOr[Boolean] = js.undefined,
    selectedExpr: String | js.Function = null,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    selectionMode: none | single_ = null,
    showEvent: Delay | String = null,
    showSubmenuMode: DelayName | onClick | onHover = null,
    submenuDirection: auto | left | right = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    target: String | Element | JQuery = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (disabledExpr != null) __obj.updateDynamic("disabledExpr")(disabledExpr.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
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
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction1(onHidden))
    if (onHiding != null) __obj.updateDynamic("onHiding")(js.Any.fromFunction1(onHiding))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1(onItemContextMenu))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1(onItemHold))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1(onItemRendered))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPositioning != null) __obj.updateDynamic("onPositioning")(js.Any.fromFunction1(onPositioning))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onShowing != null) __obj.updateDynamic("onShowing")(js.Any.fromFunction1(onShowing))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1(onShown))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectByClick)) __obj.updateDynamic("selectByClick")(selectByClick.get.asInstanceOf[js.Any])
    if (selectedExpr != null) __obj.updateDynamic("selectedExpr")(selectedExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showEvent != null) __obj.updateDynamic("showEvent")(showEvent.asInstanceOf[js.Any])
    if (showSubmenuMode != null) __obj.updateDynamic("showSubmenuMode")(showSubmenuMode.asInstanceOf[js.Any])
    if (submenuDirection != null) __obj.updateDynamic("submenuDirection")(submenuDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxContextMenuOptions]
  }
}

