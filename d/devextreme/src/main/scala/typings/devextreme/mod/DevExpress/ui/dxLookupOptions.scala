package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentDxLookup
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonComponentT
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementEventJQueryEvent
import typings.devextreme.AnonHide
import typings.devextreme.AnonIcon
import typings.devextreme.AnonItemElementItemIndex
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelSelectedItem
import typings.devextreme.AnonName
import typings.devextreme.AnonPreviousValueValue
import typings.devextreme.AnonReachedLeft
import typings.devextreme.AnonTitleElement
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.dropDown
import typings.devextreme.devextremeStrings.email
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.nextButton
import typings.devextreme.devextremeStrings.onFocus
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.password
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.scrollBottom
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
import typings.devextreme.mod.DevExpress.positionConfig
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxLookupOptions extends dxDropDownListOptions[dxLookup] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  var animation: js.UndefOr[AnonHide] = js.undefined
  /** The text displayed on the Apply button. */
  var applyButtonText: js.UndefOr[String] = js.undefined
  /** The text displayed on the Cancel button. */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  /** Specifies whether or not the widget cleans the search box when the popup window is displayed. */
  var cleanSearchOnOpening: js.UndefOr[Boolean] = js.undefined
  /** The text displayed on the Clear button. */
  var clearButtonText: js.UndefOr[String] = js.undefined
  /** Specifies whether to close the drop-down menu if a user clicks outside it. */
  var closeOnOutsideClick: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  /** Specifies a custom template for the input field. */
  var fieldTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** A Boolean value specifying whether or not to display the lookup in full-screen mode. */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  /** The text displayed on the button used to load the next page from the data source. */
  var nextButtonText: js.UndefOr[String] = js.undefined
  /** A function that is executed before the next page is loaded. */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ AnonComponentDxLookup, _]] = js.undefined
  /** A function that is executed when the "pull to refresh" gesture is performed on the drop-down item list. Supported in mobile themes only. */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ AnonComponentDxLookup, _]] = js.undefined
  /** A function that is executed on each scroll gesture performed on the drop-down item list. */
  var onScroll: js.UndefOr[js.Function1[/* e */ AnonReachedLeft, _]] = js.undefined
  /** A function that is executed when the drop-down list's title is rendered. */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ AnonTitleElement, _]] = js.undefined
  /** A function that is executed after the widget's value is changed. */
  @JSName("onValueChanged")
  var onValueChanged_dxLookupOptions: js.UndefOr[js.Function1[/* e */ AnonPreviousValueValue, _]] = js.undefined
  /** Specifies whether the next page is loaded when a user scrolls the widget to the bottom or when the "next" button is clicked. */
  var pageLoadMode: js.UndefOr[nextButton | scrollBottom] = js.undefined
  /** Specifies the text shown in the pullDown panel, which is displayed when the widget is scrolled to the bottom. */
  var pageLoadingText: js.UndefOr[String] = js.undefined
  /** Specifies the popup element's height. Applies only if fullScreen is false. */
  var popupHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** Specifies the popup element's width. Applies only if fullScreen is false. */
  var popupWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** An object defining widget positioning options. */
  var position: js.UndefOr[positionConfig] = js.undefined
  /** A Boolean value specifying whether or not the widget supports the "pull down to refresh" gesture. */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the text displayed in the pullDown panel when the widget is pulled below the refresh threshold. */
  var pulledDownText: js.UndefOr[String] = js.undefined
  /** Specifies the text shown in the pullDown panel while the list is being pulled down to the refresh threshold. */
  var pullingDownText: js.UndefOr[String] = js.undefined
  /** Specifies the text displayed in the pullDown panel while the widget is being refreshed. */
  var refreshingText: js.UndefOr[String] = js.undefined
  /** The text that is provided as a hint in the lookup's search bar. */
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  /** Specifies whether to shade the container when the lookup is active. Applies only if usePopover is false. */
  var shading: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to display the Cancel button in the lookup window. */
  var showCancelButton: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying whether or not to display the title in the popup window. */
  var showPopupTitle: js.UndefOr[Boolean] = js.undefined
  /** The title of the lookup window. */
  var title: js.UndefOr[String] = js.undefined
  /** Specifies a custom template for the title. */
  var titleTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** Specifies whether or not the widget uses native scrolling. */
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not to show lookup contents in a Popover widget. */
  var usePopover: js.UndefOr[Boolean] = js.undefined
}

object dxLookupOptions {
  @scala.inline
  def apply(
    acceptCustomValue: js.UndefOr[Boolean] = js.undefined,
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: AnonHide = null,
    applyButtonText: String = null,
    applyValueMode: instantly | useButtons = null,
    bindingOptions: js.Any = null,
    buttons: js.Array[clear | dropDown | dxTextEditorButton] = null,
    cancelButtonText: String = null,
    cleanSearchOnOpening: js.UndefOr[Boolean] = js.undefined,
    clearButtonText: String = null,
    closeOnOutsideClick: Boolean | js.Function0[Boolean] = null,
    dataSource: String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    displayValue: String = null,
    dropDownButtonTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    elementAttr: js.Any = null,
    fieldTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery]) = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
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
    nextButtonText: String = null,
    noDataText: String = null,
    onChange: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onClosed: /* e */ AnonComponentT[dxLookup] => _ = null,
    onContentReady: /* e */ AnonComponentElement[dxLookup] => _ = null,
    onCopy: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onCut: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onDisposing: /* e */ AnonModel[dxLookup] => _ = null,
    onEnterKey: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onFocusIn: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onFocusOut: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onInitialized: /* e */ AnonElement[dxLookup] => _ = null,
    onInput: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onItemClick: /* e */ AnonItemElementItemIndex[dxLookup] => _ = null,
    onKeyDown: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onKeyPress: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onKeyUp: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onOpened: /* e */ AnonComponentT[dxLookup] => _ = null,
    onOptionChanged: /* e */ AnonName[dxLookup] => _ = null,
    onPageLoading: /* e */ AnonComponentDxLookup => _ = null,
    onPaste: /* e */ AnonElementEventJQueryEvent[dxLookup] => _ = null,
    onPullRefresh: /* e */ AnonComponentDxLookup => _ = null,
    onScroll: /* e */ AnonReachedLeft => _ = null,
    onSelectionChanged: /* e */ AnonModelSelectedItem[dxLookup] => _ = null,
    onTitleRendered: /* e */ AnonTitleElement => _ = null,
    onValueChanged: /* e */ AnonPreviousValueValue => _ = null,
    openOnFieldClick: js.UndefOr[Boolean] = js.undefined,
    opened: js.UndefOr[Boolean] = js.undefined,
    pageLoadMode: nextButton | scrollBottom = null,
    pageLoadingText: String = null,
    placeholder: String = null,
    popupHeight: Double | String | (js.Function0[Double | String]) = null,
    popupWidth: Double | String | (js.Function0[Double | String]) = null,
    position: positionConfig = null,
    pullRefreshEnabled: js.UndefOr[Boolean] = js.undefined,
    pulledDownText: String = null,
    pullingDownText: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    refreshingText: String = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    searchEnabled: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchMode: contains | startswith = null,
    searchPlaceholder: String = null,
    searchTimeout: Int | Double = null,
    selectedItem: js.Any = null,
    shading: js.UndefOr[Boolean] = js.undefined,
    showCancelButton: js.UndefOr[Boolean] = js.undefined,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showDataBeforeSearch: js.UndefOr[Boolean] = js.undefined,
    showDropDownButton: js.UndefOr[Boolean] = js.undefined,
    showMaskMode: always | onFocus = null,
    showPopupTitle: js.UndefOr[Boolean] = js.undefined,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    stylingMode: outlined | underlined | filled = null,
    tabIndex: Int | Double = null,
    text: String = null,
    title: String = null,
    titleTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery]) = null,
    useMaskedValue: js.UndefOr[Boolean] = js.undefined,
    useNativeScrolling: js.UndefOr[Boolean] = js.undefined,
    usePopover: js.UndefOr[Boolean] = js.undefined,
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
  ): dxLookupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptCustomValue)) __obj.updateDynamic("acceptCustomValue")(acceptCustomValue.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (applyButtonText != null) __obj.updateDynamic("applyButtonText")(applyButtonText.asInstanceOf[js.Any])
    if (applyValueMode != null) __obj.updateDynamic("applyValueMode")(applyValueMode.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanSearchOnOpening)) __obj.updateDynamic("cleanSearchOnOpening")(cleanSearchOnOpening.asInstanceOf[js.Any])
    if (clearButtonText != null) __obj.updateDynamic("clearButtonText")(clearButtonText.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (displayValue != null) __obj.updateDynamic("displayValue")(displayValue.asInstanceOf[js.Any])
    if (dropDownButtonTemplate != null) __obj.updateDynamic("dropDownButtonTemplate")(dropDownButtonTemplate.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (fieldTemplate != null) __obj.updateDynamic("fieldTemplate")(fieldTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
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
    if (nextButtonText != null) __obj.updateDynamic("nextButtonText")(nextButtonText.asInstanceOf[js.Any])
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
    if (onPageLoading != null) __obj.updateDynamic("onPageLoading")(js.Any.fromFunction1(onPageLoading))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPullRefresh != null) __obj.updateDynamic("onPullRefresh")(js.Any.fromFunction1(onPullRefresh))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onTitleRendered != null) __obj.updateDynamic("onTitleRendered")(js.Any.fromFunction1(onTitleRendered))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(openOnFieldClick)) __obj.updateDynamic("openOnFieldClick")(openOnFieldClick.asInstanceOf[js.Any])
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (pageLoadMode != null) __obj.updateDynamic("pageLoadMode")(pageLoadMode.asInstanceOf[js.Any])
    if (pageLoadingText != null) __obj.updateDynamic("pageLoadingText")(pageLoadingText.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupHeight != null) __obj.updateDynamic("popupHeight")(popupHeight.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRefreshEnabled)) __obj.updateDynamic("pullRefreshEnabled")(pullRefreshEnabled.asInstanceOf[js.Any])
    if (pulledDownText != null) __obj.updateDynamic("pulledDownText")(pulledDownText.asInstanceOf[js.Any])
    if (pullingDownText != null) __obj.updateDynamic("pullingDownText")(pullingDownText.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (refreshingText != null) __obj.updateDynamic("refreshingText")(refreshingText.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnabled)) __obj.updateDynamic("searchEnabled")(searchEnabled.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showDataBeforeSearch)) __obj.updateDynamic("showDataBeforeSearch")(showDataBeforeSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropDownButton)) __obj.updateDynamic("showDropDownButton")(showDropDownButton.asInstanceOf[js.Any])
    if (showMaskMode != null) __obj.updateDynamic("showMaskMode")(showMaskMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopupTitle)) __obj.updateDynamic("showPopupTitle")(showPopupTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeScrolling)) __obj.updateDynamic("useNativeScrolling")(useNativeScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(usePopover)) __obj.updateDynamic("usePopover")(usePopover.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[dxLookupOptions]
  }
}

