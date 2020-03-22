package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonComponentT
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementEventJQueryEvent
import typings.devextreme.AnonIcon
import typings.devextreme.AnonItemElementItemIndex
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelSelectedItem
import typings.devextreme.AnonName
import typings.devextreme.AnonPreviousValue
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.dropDown
import typings.devextreme.devextremeStrings.email
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.onFocus
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.password
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.search
import typings.devextreme.devextremeStrings.startswith
import typings.devextreme.devextremeStrings.tel
import typings.devextreme.devextremeStrings.text
import typings.devextreme.devextremeStrings.underlined
import typings.devextreme.devextremeStrings.url
import typings.devextreme.devextremeStrings.useButtons
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.devextreme.mod.DevExpress.ui.DataExpressionMixinOptions because var conflicts: value. Inlined dataSource, displayExpr, itemTemplate, items, valueExpr */ trait dxDropDownListOptions[T] extends dxDropDownEditorOptions[T] {
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions] = js.undefined
  /** Specifies the data field whose values should be displayed. */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.undefined
  /** Returns the value currently displayed by the widget. */
  var displayValue: js.UndefOr[String] = js.undefined
  /** Specifies a custom template for group captions. */
  var groupTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies whether data items should be grouped. */
  var grouped: js.UndefOr[Boolean] = js.undefined
  /** Specifies a custom template for items. */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** An array of items displayed by the widget. */
  var items: js.UndefOr[js.Array[CollectionWidgetItem | _]] = js.undefined
  /** The minimum number of characters that must be entered into the text box to begin a search. Applies only if searchEnabled is true. */
  var minSearchLength: js.UndefOr[Double] = js.undefined
  /** The text or HTML markup displayed by the widget if the item collection is empty. */
  var noDataText: js.UndefOr[String] = js.undefined
  /** A function that is executed when a list item is clicked or tapped. */
  var onItemClick: js.UndefOr[js.Function1[/* e */ AnonItemElementItemIndex[T], _]] = js.undefined
  /** A function that is executed when a list item is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonModelSelectedItem[T], _]] = js.undefined
  /** A function that is executed after the widget's value is changed. */
  @JSName("onValueChanged")
  var onValueChanged_dxDropDownListOptions: js.UndefOr[js.Function1[/* e */ AnonPreviousValue[T], _]] = js.undefined
  /** Specifies whether to allow searching. */
  var searchEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the name of a data source item field or an expression whose value is compared to the search criterion. */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  /** Specifies a comparison operation used to search widget items. */
  var searchMode: js.UndefOr[contains | startswith] = js.undefined
  /** Specifies the time delay, in milliseconds, after the last character has been typed in, before a search is executed. */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  /** Gets the currently selected item. */
  var selectedItem: js.UndefOr[js.Any] = js.undefined
  /** Specifies whether or not the widget displays unfiltered values until a user types a number of characters exceeding the minSearchLength option value. */
  var showDataBeforeSearch: js.UndefOr[Boolean] = js.undefined
  /** Specifies which data field provides unique values to the widget's value. */
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String | Double | Boolean])] = js.undefined
  /** Specifies whether text that exceeds the drop-down list width should be wrapped. */
  var wrapItemText: js.UndefOr[Boolean] = js.undefined
}

object dxDropDownListOptions {
  @scala.inline
  def apply[T](
    acceptCustomValue: js.UndefOr[Boolean] = js.undefined,
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    applyValueMode: instantly | useButtons = null,
    bindingOptions: js.Any = null,
    buttons: js.Array[clear | dropDown | dxTextEditorButton] = null,
    dataSource: String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    displayValue: String = null,
    dropDownButtonTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    groupTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    grouped: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    inputAttr: js.Any = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[CollectionWidgetItem | _] = null,
    mask: String = null,
    maskChar: String = null,
    maskInvalidMessage: String = null,
    maskRules: js.Any = null,
    maxLength: String | Double = null,
    minSearchLength: Int | Double = null,
    mode: email | password | search | tel | text | url = null,
    name: String = null,
    noDataText: String = null,
    onChange: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onClosed: /* e */ AnonComponentT[T] => _ = null,
    onContentReady: /* e */ AnonComponentElement[T] => _ = null,
    onCopy: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onCut: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onDisposing: /* e */ AnonModel[T] => _ = null,
    onEnterKey: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onFocusIn: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onFocusOut: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onInput: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onItemClick: /* e */ AnonItemElementItemIndex[T] => _ = null,
    onKeyDown: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onKeyPress: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onKeyUp: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onOpened: /* e */ AnonComponentT[T] => _ = null,
    onOptionChanged: /* e */ AnonName[T] => _ = null,
    onPaste: /* e */ AnonElementEventJQueryEvent[T] => _ = null,
    onSelectionChanged: /* e */ AnonModelSelectedItem[T] => _ = null,
    onValueChanged: /* e */ AnonPreviousValue[T] => _ = null,
    openOnFieldClick: js.UndefOr[Boolean] = js.undefined,
    opened: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    searchEnabled: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchMode: contains | startswith = null,
    searchTimeout: Int | Double = null,
    selectedItem: js.Any = null,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showDataBeforeSearch: js.UndefOr[Boolean] = js.undefined,
    showDropDownButton: js.UndefOr[Boolean] = js.undefined,
    showMaskMode: always | onFocus = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    stylingMode: outlined | underlined | filled = null,
    tabIndex: Int | Double = null,
    text: String = null,
    useMaskedValue: js.UndefOr[Boolean] = js.undefined,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: String = null,
    valueChangeEvent: String = null,
    valueExpr: String | (js.Function1[/* item */ js.Any, String | Double | Boolean]) = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wrapItemText: js.UndefOr[Boolean] = js.undefined
  ): dxDropDownListOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptCustomValue)) __obj.updateDynamic("acceptCustomValue")(acceptCustomValue.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (applyValueMode != null) __obj.updateDynamic("applyValueMode")(applyValueMode.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (displayValue != null) __obj.updateDynamic("displayValue")(displayValue.asInstanceOf[js.Any])
    if (dropDownButtonTemplate != null) __obj.updateDynamic("dropDownButtonTemplate")(dropDownButtonTemplate.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskInvalidMessage != null) __obj.updateDynamic("maskInvalidMessage")(maskInvalidMessage.asInstanceOf[js.Any])
    if (maskRules != null) __obj.updateDynamic("maskRules")(maskRules.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minSearchLength != null) __obj.updateDynamic("minSearchLength")(minSearchLength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onEnterKey != null) __obj.updateDynamic("onEnterKey")(js.Any.fromFunction1(onEnterKey))
    if (onFocusIn != null) __obj.updateDynamic("onFocusIn")(js.Any.fromFunction1(onFocusIn))
    if (onFocusOut != null) __obj.updateDynamic("onFocusOut")(js.Any.fromFunction1(onFocusOut))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1(onItemClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(openOnFieldClick)) __obj.updateDynamic("openOnFieldClick")(openOnFieldClick.asInstanceOf[js.Any])
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnabled)) __obj.updateDynamic("searchEnabled")(searchEnabled.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showDataBeforeSearch)) __obj.updateDynamic("showDataBeforeSearch")(showDataBeforeSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropDownButton)) __obj.updateDynamic("showDropDownButton")(showDropDownButton.asInstanceOf[js.Any])
    if (showMaskMode != null) __obj.updateDynamic("showMaskMode")(showMaskMode.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChangeEvent != null) __obj.updateDynamic("valueChangeEvent")(valueChangeEvent.asInstanceOf[js.Any])
    if (valueExpr != null) __obj.updateDynamic("valueExpr")(valueExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapItemText)) __obj.updateDynamic("wrapItemText")(wrapItemText.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDropDownListOptions[T]]
  }
}

