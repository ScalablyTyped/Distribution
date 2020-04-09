package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentDate
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonComponentT
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementEventJQueryEvent
import typings.devextreme.AnonIcon
import typings.devextreme.AnonJQueryEvent
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.calendar
import typings.devextreme.devextremeStrings.century
import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.date
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.decade
import typings.devextreme.devextremeStrings.dropDown
import typings.devextreme.devextremeStrings.email
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.list
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.native
import typings.devextreme.devextremeStrings.onFocus
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.password
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.rollers
import typings.devextreme.devextremeStrings.search
import typings.devextreme.devextremeStrings.tel
import typings.devextreme.devextremeStrings.text
import typings.devextreme.devextremeStrings.time
import typings.devextreme.devextremeStrings.underlined
import typings.devextreme.devextremeStrings.url
import typings.devextreme.devextremeStrings.useButtons
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.devextremeStrings.year
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDateBoxOptions extends dxDropDownEditorOptions[dxDateBox] {
  /** @name dxDateBox.Options.adaptivityEnabled */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxDateBox.Options.applyButtonText */
  var applyButtonText: js.UndefOr[String] = js.undefined
  /** @name dxDateBox.Options.calendarOptions */
  var calendarOptions: js.UndefOr[dxCalendarOptions] = js.undefined
  /** @name dxDateBox.Options.cancelButtonText */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  /** @name dxDateBox.Options.dateOutOfRangeMessage */
  var dateOutOfRangeMessage: js.UndefOr[String] = js.undefined
  /** @name dxDateBox.Options.dateSerializationFormat */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  /** @name dxDateBox.Options.disabledDates */
  var disabledDates: js.UndefOr[js.Array[Date] | (js.Function1[/* data */ AnonComponentDate, Boolean])] = js.undefined
  /** @name dxDateBox.Options.displayFormat */
  var displayFormat: js.UndefOr[format] = js.undefined
  /** @name dxDateBox.Options.interval */
  var interval: js.UndefOr[Double] = js.undefined
  /** @name dxDateBox.Options.invalidDateMessage */
  var invalidDateMessage: js.UndefOr[String] = js.undefined
  /** @name dxDateBox.Options.max */
  var max: js.UndefOr[Date | Double | String] = js.undefined
  /** @deprecated */
  /** @name dxDateBox.Options.maxZoomLevel */
  var maxZoomLevel: js.UndefOr[century | decade | month | year] = js.undefined
  /** @name dxDateBox.Options.min */
  var min: js.UndefOr[Date | Double | String] = js.undefined
  /** @deprecated */
  /** @name dxDateBox.Options.minZoomLevel */
  var minZoomLevel: js.UndefOr[century | decade | month | year] = js.undefined
  /** @name dxDateBox.Options.pickerType */
  var pickerType: js.UndefOr[calendar | list | native | rollers] = js.undefined
  /** @name dxDateBox.Options.showAnalogClock */
  var showAnalogClock: js.UndefOr[Boolean] = js.undefined
  /** @name dxDateBox.Options.type */
  var `type`: js.UndefOr[date | datetime | time] = js.undefined
  /** @name dxDateBox.Options.useMaskBehavior */
  var useMaskBehavior: js.UndefOr[Boolean] = js.undefined
  /** @name dxDateBox.Options.value */
  @JSName("value")
  var value_dxDateBoxOptions: js.UndefOr[Date | Double | String] = js.undefined
}

object dxDateBoxOptions {
  @scala.inline
  def apply(
    acceptCustomValue: js.UndefOr[Boolean] = js.undefined,
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    adaptivityEnabled: js.UndefOr[Boolean] = js.undefined,
    applyButtonText: String = null,
    applyValueMode: instantly | useButtons = null,
    bindingOptions: js.Any = null,
    buttons: js.Array[clear | dropDown | dxTextEditorButton] = null,
    calendarOptions: dxCalendarOptions = null,
    cancelButtonText: String = null,
    dateOutOfRangeMessage: String = null,
    dateSerializationFormat: String = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[Date] | (js.Function1[/* data */ AnonComponentDate, Boolean]) = null,
    displayFormat: format = null,
    dropDownButtonTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    inputAttr: js.Any = null,
    interval: Int | Double = null,
    invalidDateMessage: String = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    mask: String = null,
    maskChar: String = null,
    maskInvalidMessage: String = null,
    maskRules: js.Any = null,
    max: Date | Double | String = null,
    maxLength: String | Double = null,
    maxZoomLevel: century | decade | month | year = null,
    min: Date | Double | String = null,
    minZoomLevel: century | decade | month | year = null,
    mode: email | password | search | tel | text | url = null,
    name: String = null,
    onChange: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onClosed: /* e */ AnonComponentT[dxDateBox] => _ = null,
    onContentReady: /* e */ AnonComponentElement[dxDateBox] => _ = null,
    onCopy: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onCut: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onDisposing: /* e */ AnonModel[dxDateBox] => _ = null,
    onEnterKey: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onFocusIn: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onFocusOut: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onInitialized: /* e */ AnonElement[dxDateBox] => _ = null,
    onInput: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onKeyDown: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onKeyPress: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onKeyUp: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onOpened: /* e */ AnonComponentT[dxDateBox] => _ = null,
    onOptionChanged: /* e */ AnonName[dxDateBox] => _ = null,
    onPaste: /* e */ AnonElementEventJQueryEvent[dxDateBox] => _ = null,
    onValueChanged: /* e */ AnonJQueryEvent[dxDateBox] => _ = null,
    openOnFieldClick: js.UndefOr[Boolean] = js.undefined,
    opened: js.UndefOr[Boolean] = js.undefined,
    pickerType: calendar | list | native | rollers = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showAnalogClock: js.UndefOr[Boolean] = js.undefined,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showDropDownButton: js.UndefOr[Boolean] = js.undefined,
    showMaskMode: always | onFocus = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    stylingMode: outlined | underlined | filled = null,
    tabIndex: Int | Double = null,
    text: String = null,
    `type`: date | datetime | time = null,
    useMaskBehavior: js.UndefOr[Boolean] = js.undefined,
    useMaskedValue: js.UndefOr[Boolean] = js.undefined,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: Date | Double | String = null,
    valueChangeEvent: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDateBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptCustomValue)) __obj.updateDynamic("acceptCustomValue")(acceptCustomValue.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(adaptivityEnabled)) __obj.updateDynamic("adaptivityEnabled")(adaptivityEnabled.asInstanceOf[js.Any])
    if (applyButtonText != null) __obj.updateDynamic("applyButtonText")(applyButtonText.asInstanceOf[js.Any])
    if (applyValueMode != null) __obj.updateDynamic("applyValueMode")(applyValueMode.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (calendarOptions != null) __obj.updateDynamic("calendarOptions")(calendarOptions.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (dateOutOfRangeMessage != null) __obj.updateDynamic("dateOutOfRangeMessage")(dateOutOfRangeMessage.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (displayFormat != null) __obj.updateDynamic("displayFormat")(displayFormat.asInstanceOf[js.Any])
    if (dropDownButtonTemplate != null) __obj.updateDynamic("dropDownButtonTemplate")(dropDownButtonTemplate.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (invalidDateMessage != null) __obj.updateDynamic("invalidDateMessage")(invalidDateMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskInvalidMessage != null) __obj.updateDynamic("maskInvalidMessage")(maskInvalidMessage.asInstanceOf[js.Any])
    if (maskRules != null) __obj.updateDynamic("maskRules")(maskRules.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
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
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(openOnFieldClick)) __obj.updateDynamic("openOnFieldClick")(openOnFieldClick.asInstanceOf[js.Any])
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (pickerType != null) __obj.updateDynamic("pickerType")(pickerType.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showAnalogClock)) __obj.updateDynamic("showAnalogClock")(showAnalogClock.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropDownButton)) __obj.updateDynamic("showDropDownButton")(showDropDownButton.asInstanceOf[js.Any])
    if (showMaskMode != null) __obj.updateDynamic("showMaskMode")(showMaskMode.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskBehavior)) __obj.updateDynamic("useMaskBehavior")(useMaskBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChangeEvent != null) __obj.updateDynamic("valueChangeEvent")(valueChangeEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDateBoxOptions]
  }
}

