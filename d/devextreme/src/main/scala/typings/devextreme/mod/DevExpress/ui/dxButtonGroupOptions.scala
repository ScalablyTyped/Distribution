package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonEventItemData
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonRemovedItems
import typings.devextreme.devextremeStrings.contained
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.devextremeStrings.text
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxButtonGroupOptions extends WidgetOptions[dxButtonGroup] {
  /** @name dxButtonGroup.Options.buttonTemplate */
  var buttonTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ js.Any, /* buttonContent */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @deprecated */
  /** @name dxButtonGroup.Options.itemTemplate */
  var itemTemplate: js.UndefOr[typings.devextreme.mod.DevExpress.core.template | js.Function] = js.undefined
  /** @name dxButtonGroup.Options.items */
  var items: js.UndefOr[js.Array[dxButtonGroupItem]] = js.undefined
  /** @name dxButtonGroup.Options.keyExpr */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name dxButtonGroup.Options.onItemClick */
  var onItemClick: js.UndefOr[js.Function1[/* e */ AnonEventItemData, _]] = js.undefined
  /** @name dxButtonGroup.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonRemovedItems, _]] = js.undefined
  /** @name dxButtonGroup.Options.selectedItemKeys */
  var selectedItemKeys: js.UndefOr[js.Array[_]] = js.undefined
  /** @name dxButtonGroup.Options.selectedItems */
  var selectedItems: js.UndefOr[js.Array[_]] = js.undefined
  /** @name dxButtonGroup.Options.selectionMode */
  var selectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** @name dxButtonGroup.Options.stylingMode */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.undefined
}

object dxButtonGroupOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    buttonTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ js.Any, /* buttonContent */ dxElement, String | Element | JQuery]) = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | js.Function = null,
    items: js.Array[dxButtonGroupItem] = null,
    keyExpr: String | js.Function = null,
    onContentReady: /* e */ AnonComponentElement[dxButtonGroup] => _ = null,
    onDisposing: /* e */ AnonModel[dxButtonGroup] => _ = null,
    onInitialized: /* e */ AnonElement[dxButtonGroup] => _ = null,
    onItemClick: /* e */ AnonEventItemData => _ = null,
    onOptionChanged: /* e */ AnonName[dxButtonGroup] => _ = null,
    onSelectionChanged: /* e */ AnonRemovedItems => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    selectionMode: multiple | single_ = null,
    stylingMode: text | outlined | contained = null,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttonTemplate != null) __obj.updateDynamic("buttonTemplate")(buttonTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1(onItemClick))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxButtonGroupOptions]
  }
}

