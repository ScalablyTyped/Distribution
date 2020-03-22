package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonDate
import typings.devextreme.AnonElement
import typings.devextreme.AnonJQueryEvent
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonView
import typings.devextreme.devextremeNumbers.`0`
import typings.devextreme.devextremeNumbers.`1`
import typings.devextreme.devextremeNumbers.`2`
import typings.devextreme.devextremeNumbers.`3`
import typings.devextreme.devextremeNumbers.`4`
import typings.devextreme.devextremeNumbers.`5`
import typings.devextreme.devextremeNumbers.`6`
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.century
import typings.devextreme.devextremeStrings.decade
import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.devextremeStrings.year
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxCalendarOptions extends EditorOptions[dxCalendar] {
  /** Specifies a custom template for calendar cells. */
  var cellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ AnonDate, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies the date-time value serialization format. Use it only if you do not specify the value at design time. */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  /** Specifies dates to be disabled. */
  var disabledDates: js.UndefOr[js.Array[Date] | (js.Function1[/* data */ AnonView, Boolean])] = js.undefined
  /** Specifies the first day of a week. */
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  /** The latest date the widget allows to select. */
  var max: js.UndefOr[Date | Double | String] = js.undefined
  /** Specifies the maximum zoom level of the calendar. */
  var maxZoomLevel: js.UndefOr[century | decade | month | year] = js.undefined
  /** The earliest date the widget allows to select. */
  var min: js.UndefOr[Date | Double | String] = js.undefined
  /** Specifies the minimum zoom level of the calendar. */
  var minZoomLevel: js.UndefOr[century | decade | month | year] = js.undefined
  /** The value to be assigned to the `name` attribute of the underlying HTML element. */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies whether or not the widget displays a button that selects the current date. */
  var showTodayButton: js.UndefOr[Boolean] = js.undefined
  /** An object or a value specifying the date and time currently selected in the calendar. */
  @JSName("value")
  var value_dxCalendarOptions: js.UndefOr[Date | Double | String] = js.undefined
  /** Specifies the current calendar zoom level. */
  var zoomLevel: js.UndefOr[century | decade | month | year] = js.undefined
}

object dxCalendarOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    cellTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ AnonDate, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dateSerializationFormat: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[Date] | (js.Function1[/* data */ AnonView, Boolean]) = null,
    elementAttr: js.Any = null,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[Boolean] = js.undefined,
    max: Date | Double | String = null,
    maxZoomLevel: century | decade | month | year = null,
    min: Date | Double | String = null,
    minZoomLevel: century | decade | month | year = null,
    name: String = null,
    onContentReady: /* e */ AnonComponentElement[dxCalendar] => _ = null,
    onDisposing: /* e */ AnonModel[dxCalendar] => _ = null,
    onInitialized: /* e */ AnonElement[dxCalendar] => _ = null,
    onOptionChanged: /* e */ AnonName[dxCalendar] => _ = null,
    onValueChanged: /* e */ AnonJQueryEvent[dxCalendar] => _ = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showTodayButton: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: Date | Double | String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    zoomLevel: century | decade | month | year = null
  ): dxCalendarOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (cellTemplate != null) __obj.updateDynamic("cellTemplate")(cellTemplate.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showTodayButton)) __obj.updateDynamic("showTodayButton")(showTodayButton.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxCalendarOptions]
  }
}

