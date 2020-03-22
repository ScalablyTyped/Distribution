package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonItemElementModel
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonPreviousItem
import typings.devextreme.AnonSelectedItem
import typings.devextreme.devextremeStrings.contained
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.text
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDropDownButtonOptions extends WidgetOptions[dxDropDownButton] {
  /** Provides data for the drop-down menu. */
  var dataSource: js.UndefOr[String | (js.Array[dxDropDownButtonItem | _]) | DataSource | DataSourceOptions] = js.undefined
  /** Specifies whether to wait until the drop-down menu is opened the first time to render its content. */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  /** Specifies the data field whose values should be displayed in the drop-down menu. */
  var displayExpr: js.UndefOr[String | (js.Function1[/* itemData */ js.Any, String])] = js.undefined
  /** Specifies custom content for the drop-down field. */
  var dropDownContentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ (js.Array[String | Double | _]) | DataSource, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Configures the drop-down field. */
  var dropDownOptions: js.UndefOr[dxPopupOptions[dxPopup]] = js.undefined
  /** Specifies the button's icon. */
  var icon: js.UndefOr[String] = js.undefined
  /** Specifies a custom template for drop-down menu items. */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Provides drop-down menu items. */
  var items: js.UndefOr[js.Array[dxDropDownButtonItem | _]] = js.undefined
  /** Specifies which data field provides keys used to distinguish between the selected drop-down menu items. */
  var keyExpr: js.UndefOr[String] = js.undefined
  /** Specifies text or HTML markup displayed in the drop-down menu when it does not contain any items. */
  var noDataText: js.UndefOr[String] = js.undefined
  /** A function that is executed when the button is clicked or tapped. If splitButton is true, this function is executed for the action button only. */
  var onButtonClick: js.UndefOr[(js.Function1[/* e */ AnonSelectedItem, _]) | String] = js.undefined
  /** A function that is executed when a drop-down menu item is clicked. */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ AnonItemElementModel, _]) | String] = js.undefined
  /** A function that is executed when an item is selected or selection is canceled. In effect when useSelectMode is true. */
  var onSelectionChanged: js.UndefOr[(js.Function1[/* e */ AnonPreviousItem, _]) | String] = js.undefined
  /** Specifies whether the drop-down menu is opened. */
  var opened: js.UndefOr[Boolean] = js.undefined
  /** Contains the selected item's data. Available when useSelectMode is true. */
  var selectedItem: js.UndefOr[String | Double | js.Any] = js.undefined
  /** Contains the selected item's key and allows you to specify the initially selected item. Applies when useSelectMode is true. */
  var selectedItemKey: js.UndefOr[String | Double] = js.undefined
  /** Specifies whether the arrow icon should be displayed. */
  var showArrowIcon: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to split the button in two: one executes an action, the other opens and closes the drop-down menu. */
  var splitButton: js.UndefOr[Boolean] = js.undefined
  /** Specifies how the button is styled. */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.undefined
  /** Specifies the button's text. Applies only if useSelectMode is false. */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies whether the widget stores the selected drop-down menu item. */
  var useSelectMode: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether text that exceeds the drop-down list width should be wrapped. */
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
    onButtonClick: (js.Function1[/* e */ AnonSelectedItem, _]) | String = null,
    onContentReady: /* e */ AnonComponentElement[dxDropDownButton] => _ = null,
    onDisposing: /* e */ AnonModel[dxDropDownButton] => _ = null,
    onInitialized: /* e */ AnonElement[dxDropDownButton] => _ = null,
    onItemClick: (js.Function1[/* e */ AnonItemElementModel, _]) | String = null,
    onOptionChanged: /* e */ AnonName[dxDropDownButton] => _ = null,
    onSelectionChanged: (js.Function1[/* e */ AnonPreviousItem, _]) | String = null,
    opened: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedItem: String | Double | js.Any = null,
    selectedItemKey: String | Double = null,
    showArrowIcon: js.UndefOr[Boolean] = js.undefined,
    splitButton: js.UndefOr[Boolean] = js.undefined,
    stylingMode: text | outlined | contained = null,
    tabIndex: Int | Double = null,
    text: String = null,
    useSelectMode: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wrapItemText: js.UndefOr[Boolean] = js.undefined
  ): dxDropDownButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (dropDownContentTemplate != null) __obj.updateDynamic("dropDownContentTemplate")(dropDownContentTemplate.asInstanceOf[js.Any])
    if (dropDownOptions != null) __obj.updateDynamic("dropDownOptions")(dropDownOptions.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
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
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKey != null) __obj.updateDynamic("selectedItemKey")(selectedItemKey.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrowIcon)) __obj.updateDynamic("showArrowIcon")(showArrowIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(splitButton)) __obj.updateDynamic("splitButton")(splitButton.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(useSelectMode)) __obj.updateDynamic("useSelectMode")(useSelectMode.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapItemText)) __obj.updateDynamic("wrapItemText")(wrapItemText.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDropDownButtonOptions]
  }
}

