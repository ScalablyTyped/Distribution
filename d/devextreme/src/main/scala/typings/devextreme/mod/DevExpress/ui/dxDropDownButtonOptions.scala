package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.ItemElementModel
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.PreviousItem
import typings.devextreme.anon.SelectedItem
import typings.devextreme.devextremeStrings.contained
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.text
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDropDownButtonOptions extends WidgetOptions[dxDropDownButton] {
  /** @name dxDropDownButton.Options.dataSource */
  var dataSource: js.UndefOr[String | (js.Array[dxDropDownButtonItem | _]) | DataSource | DataSourceOptions] = js.undefined
  /** @name dxDropDownButton.Options.deferRendering */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  /** @name dxDropDownButton.Options.displayExpr */
  var displayExpr: js.UndefOr[String | (js.Function1[/* itemData */ js.Any, String])] = js.undefined
  /** @name dxDropDownButton.Options.dropDownContentTemplate */
  var dropDownContentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ (js.Array[String | Double | _]) | DataSource, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxDropDownButton.Options.dropDownOptions */
  var dropDownOptions: js.UndefOr[dxPopupOptions[dxPopup]] = js.undefined
  /** @name dxDropDownButton.Options.icon */
  var icon: js.UndefOr[String] = js.undefined
  /** @name dxDropDownButton.Options.itemTemplate */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxDropDownButton.Options.items */
  var items: js.UndefOr[js.Array[dxDropDownButtonItem | _]] = js.undefined
  /** @name dxDropDownButton.Options.keyExpr */
  var keyExpr: js.UndefOr[String] = js.undefined
  /** @name dxDropDownButton.Options.noDataText */
  var noDataText: js.UndefOr[String] = js.undefined
  /** @name dxDropDownButton.Options.onButtonClick */
  var onButtonClick: js.UndefOr[(js.Function1[/* e */ SelectedItem, _]) | String] = js.undefined
  /** @name dxDropDownButton.Options.onItemClick */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ ItemElementModel, _]) | String] = js.undefined
  /** @name dxDropDownButton.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[(js.Function1[/* e */ PreviousItem, _]) | String] = js.undefined
  /** @name dxDropDownButton.Options.opened */
  var opened: js.UndefOr[Boolean] = js.undefined
  /** @name dxDropDownButton.Options.selectedItem */
  var selectedItem: js.UndefOr[String | Double | js.Any] = js.undefined
  /** @name dxDropDownButton.Options.selectedItemKey */
  var selectedItemKey: js.UndefOr[String | Double] = js.undefined
  /** @name dxDropDownButton.Options.showArrowIcon */
  var showArrowIcon: js.UndefOr[Boolean] = js.undefined
  /** @name dxDropDownButton.Options.splitButton */
  var splitButton: js.UndefOr[Boolean] = js.undefined
  /** @name dxDropDownButton.Options.stylingMode */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.undefined
  /** @name dxDropDownButton.Options.text */
  var text: js.UndefOr[String] = js.undefined
  /** @name dxDropDownButton.Options.useSelectMode */
  var useSelectMode: js.UndefOr[Boolean] = js.undefined
  /** @name dxDropDownButton.Options.wrapItemText */
  var wrapItemText: js.UndefOr[Boolean] = js.undefined
}

object dxDropDownButtonOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    dataSource: String | (js.Array[dxDropDownButtonItem | _]) | DataSource | DataSourceOptions = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayExpr: String | (js.Function1[/* itemData */ js.Any, String]) = null,
    dropDownContentTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ (js.Array[String | Double | _]) | DataSource, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dropDownOptions: dxPopupOptions[dxPopup] = null,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[dxDropDownButtonItem | _] = null,
    keyExpr: String = null,
    noDataText: String = null,
    onButtonClick: (js.Function1[/* e */ SelectedItem, _]) | String = null,
    onContentReady: /* e */ ComponentElement[dxDropDownButton] => _ = null,
    onDisposing: /* e */ Model[dxDropDownButton] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxDropDownButton] => _ = null,
    onItemClick: (js.Function1[/* e */ ItemElementModel, _]) | String = null,
    onOptionChanged: /* e */ Name[dxDropDownButton] => _ = null,
    onSelectionChanged: (js.Function1[/* e */ PreviousItem, _]) | String = null,
    opened: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedItem: String | Double | js.Any = null,
    selectedItemKey: String | Double = null,
    showArrowIcon: js.UndefOr[Boolean] = js.undefined,
    splitButton: js.UndefOr[Boolean] = js.undefined,
    stylingMode: text | outlined | contained = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    text: String = null,
    useSelectMode: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wrapItemText: js.UndefOr[Boolean] = js.undefined
  ): dxDropDownButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (dropDownContentTemplate != null) __obj.updateDynamic("dropDownContentTemplate")(dropDownContentTemplate.asInstanceOf[js.Any])
    if (dropDownOptions != null) __obj.updateDynamic("dropDownOptions")(dropDownOptions.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(onButtonClick.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(onSelectionChanged.asInstanceOf[js.Any])
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKey != null) __obj.updateDynamic("selectedItemKey")(selectedItemKey.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrowIcon)) __obj.updateDynamic("showArrowIcon")(showArrowIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButton)) __obj.updateDynamic("splitButton")(splitButton.get.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(useSelectMode)) __obj.updateDynamic("useSelectMode")(useSelectMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapItemText)) __obj.updateDynamic("wrapItemText")(wrapItemText.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDropDownButtonOptions]
  }
}

