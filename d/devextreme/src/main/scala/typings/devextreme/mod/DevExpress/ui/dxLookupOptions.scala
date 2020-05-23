package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentDxLookup
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.ComponentT
import typings.devextreme.anon.ElementEventJQueryEvent
import typings.devextreme.anon.Hide
import typings.devextreme.anon.Icon
import typings.devextreme.anon.ItemElementItemIndex
import typings.devextreme.anon.Model
import typings.devextreme.anon.ModelSelectedItem
import typings.devextreme.anon.Name
import typings.devextreme.anon.PreviousValueValue
import typings.devextreme.anon.ReachedLeft
import typings.devextreme.anon.TitleElement
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
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxLookupOptions extends dxDropDownListOptions[dxLookup] {
  /** @name dxLookup.Options.animation */
  var animation: js.UndefOr[Hide] = js.undefined
  /** @name dxLookup.Options.applyButtonText */
  var applyButtonText: js.UndefOr[String] = js.undefined
  /** @name dxLookup.Options.cancelButtonText */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  /** @name dxLookup.Options.cleanSearchOnOpening */
  var cleanSearchOnOpening: js.UndefOr[Boolean] = js.undefined
  /** @name dxLookup.Options.clearButtonText */
  var clearButtonText: js.UndefOr[String] = js.undefined
  /** @name dxLookup.Options.closeOnOutsideClick */
  var closeOnOutsideClick: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  /** @name dxLookup.Options.fieldTemplate */
  var fieldTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name dxLookup.Options.fullScreen */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  /** @name dxLookup.Options.itemCenteringEnabled */
  var itemCenteringEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxLookup.Options.nextButtonText */
  var nextButtonText: js.UndefOr[String] = js.undefined
  /** @name dxLookup.Options.onPageLoading */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ ComponentDxLookup, _]] = js.undefined
  /** @name dxLookup.Options.onPullRefresh */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ ComponentDxLookup, _]] = js.undefined
  /** @name dxLookup.Options.onScroll */
  var onScroll: js.UndefOr[js.Function1[/* e */ ReachedLeft, _]] = js.undefined
  /** @name dxLookup.Options.onTitleRendered */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ TitleElement, _]] = js.undefined
  /** @name dxLookup.Options.onValueChanged */
  @JSName("onValueChanged")
  var onValueChanged_dxLookupOptions: js.UndefOr[js.Function1[/* e */ PreviousValueValue, _]] = js.undefined
  /** @name dxLookup.Options.pageLoadMode */
  var pageLoadMode: js.UndefOr[nextButton | scrollBottom] = js.undefined
  /** @name dxLookup.Options.pageLoadingText */
  var pageLoadingText: js.UndefOr[String] = js.undefined
  /** @name dxLookup.Options.popupHeight */
  var popupHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** @name dxLookup.Options.popupWidth */
  var popupWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** @name dxLookup.Options.position */
  var position: js.UndefOr[positionConfig] = js.undefined
  /** @name dxLookup.Options.pullRefreshEnabled */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxLookup.Options.pulledDownText */
  var pulledDownText: js.UndefOr[String] = js.undefined
  /** @name dxLookup.Options.pullingDownText */
  var pullingDownText: js.UndefOr[String] = js.undefined
  /** @name dxLookup.Options.refreshingText */
  var refreshingText: js.UndefOr[String] = js.undefined
  /** @name dxLookup.Options.searchPlaceholder */
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  /** @name dxLookup.Options.shading */
  var shading: js.UndefOr[Boolean] = js.undefined
  /** @name dxLookup.Options.showCancelButton */
  var showCancelButton: js.UndefOr[Boolean] = js.undefined
  /** @name dxLookup.Options.showPopupTitle */
  var showPopupTitle: js.UndefOr[Boolean] = js.undefined
  /** @name dxLookup.Options.title */
  var title: js.UndefOr[String] = js.undefined
  /** @name dxLookup.Options.titleTemplate */
  var titleTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name dxLookup.Options.useNativeScrolling */
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
  /** @name dxLookup.Options.usePopover */
  var usePopover: js.UndefOr[Boolean] = js.undefined
}

object dxLookupOptions {
  @scala.inline
  def apply(
    acceptCustomValue: js.UndefOr[Boolean] = js.undefined,
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: Hide = null,
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
    dropDownButtonTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ Icon, /* contentElement */ dxElement, String | Element | JQuery]) = null,
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
    itemCenteringEnabled: js.UndefOr[Boolean] = js.undefined,
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
    minSearchLength: js.UndefOr[Double] = js.undefined,
    mode: email | password | search | tel | text | url = null,
    name: String = null,
    nextButtonText: String = null,
    noDataText: String = null,
    onChange: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onClosed: /* e */ ComponentT[dxLookup] => _ = null,
    onContentReady: /* e */ ComponentElement[dxLookup] => _ = null,
    onCopy: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onCut: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onDisposing: /* e */ Model[dxLookup] => _ = null,
    onEnterKey: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onFocusIn: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onFocusOut: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxLookup] => _ = null,
    onInput: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onItemClick: /* e */ ItemElementItemIndex[dxLookup] => _ = null,
    onKeyDown: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onKeyPress: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onKeyUp: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onOpened: /* e */ ComponentT[dxLookup] => _ = null,
    onOptionChanged: /* e */ Name[dxLookup] => _ = null,
    onPageLoading: /* e */ ComponentDxLookup => _ = null,
    onPaste: /* e */ ElementEventJQueryEvent[dxLookup] => _ = null,
    onPullRefresh: /* e */ ComponentDxLookup => _ = null,
    onScroll: /* e */ ReachedLeft => _ = null,
    onSelectionChanged: /* e */ ModelSelectedItem[dxLookup] => _ = null,
    onTitleRendered: /* e */ TitleElement => _ = null,
    onValueChanged: /* e */ PreviousValueValue => _ = null,
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
    searchTimeout: js.UndefOr[Double] = js.undefined,
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
    tabIndex: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(acceptCustomValue)) __obj.updateDynamic("acceptCustomValue")(acceptCustomValue.get.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (applyButtonText != null) __obj.updateDynamic("applyButtonText")(applyButtonText.asInstanceOf[js.Any])
    if (applyValueMode != null) __obj.updateDynamic("applyValueMode")(applyValueMode.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanSearchOnOpening)) __obj.updateDynamic("cleanSearchOnOpening")(cleanSearchOnOpening.get.asInstanceOf[js.Any])
    if (clearButtonText != null) __obj.updateDynamic("clearButtonText")(clearButtonText.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (displayValue != null) __obj.updateDynamic("displayValue")(displayValue.asInstanceOf[js.Any])
    if (dropDownButtonTemplate != null) __obj.updateDynamic("dropDownButtonTemplate")(dropDownButtonTemplate.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (fieldTemplate != null) __obj.updateDynamic("fieldTemplate")(fieldTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.get.asInstanceOf[js.Any])
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemCenteringEnabled)) __obj.updateDynamic("itemCenteringEnabled")(itemCenteringEnabled.get.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskInvalidMessage != null) __obj.updateDynamic("maskInvalidMessage")(maskInvalidMessage.asInstanceOf[js.Any])
    if (maskRules != null) __obj.updateDynamic("maskRules")(maskRules.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(minSearchLength)) __obj.updateDynamic("minSearchLength")(minSearchLength.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(openOnFieldClick)) __obj.updateDynamic("openOnFieldClick")(openOnFieldClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.get.asInstanceOf[js.Any])
    if (pageLoadMode != null) __obj.updateDynamic("pageLoadMode")(pageLoadMode.asInstanceOf[js.Any])
    if (pageLoadingText != null) __obj.updateDynamic("pageLoadingText")(pageLoadingText.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupHeight != null) __obj.updateDynamic("popupHeight")(popupHeight.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRefreshEnabled)) __obj.updateDynamic("pullRefreshEnabled")(pullRefreshEnabled.get.asInstanceOf[js.Any])
    if (pulledDownText != null) __obj.updateDynamic("pulledDownText")(pulledDownText.asInstanceOf[js.Any])
    if (pullingDownText != null) __obj.updateDynamic("pullingDownText")(pullingDownText.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (refreshingText != null) __obj.updateDynamic("refreshingText")(refreshingText.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnabled)) __obj.updateDynamic("searchEnabled")(searchEnabled.get.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(searchTimeout)) __obj.updateDynamic("searchTimeout")(searchTimeout.get.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDataBeforeSearch)) __obj.updateDynamic("showDataBeforeSearch")(showDataBeforeSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropDownButton)) __obj.updateDynamic("showDropDownButton")(showDropDownButton.get.asInstanceOf[js.Any])
    if (showMaskMode != null) __obj.updateDynamic("showMaskMode")(showMaskMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopupTitle)) __obj.updateDynamic("showPopupTitle")(showPopupTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.get.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeScrolling)) __obj.updateDynamic("useNativeScrolling")(useNativeScrolling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePopover)) __obj.updateDynamic("usePopover")(usePopover.get.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChangeEvent != null) __obj.updateDynamic("valueChangeEvent")(valueChangeEvent.asInstanceOf[js.Any])
    if (valueExpr != null) __obj.updateDynamic("valueExpr")(valueExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapItemText)) __obj.updateDynamic("wrapItemText")(wrapItemText.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxLookupOptions]
  }
}

