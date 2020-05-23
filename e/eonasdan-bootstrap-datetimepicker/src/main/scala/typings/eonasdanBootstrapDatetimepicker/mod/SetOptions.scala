package typings.eonasdanBootstrapDatetimepicker.mod

import typings.eonasdanBootstrapDatetimepicker.mod.global.JQuery
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends OptionsBase {
  /**
    * Disables selection of dates in the array, e.g. holidays
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
    * Default: false
    */
  var disabledDates: js.UndefOr[js.Array[DateComparable] | Boolean] = js.undefined
  /**
    * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
    * Default: false
    */
  var disabledHours: js.UndefOr[js.Array[Double] | Boolean] = js.undefined
  /**
    * Enables selection of dates NOT in the array, e.g. holidays
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
    * Default: false
    */
  var enabledDates: js.UndefOr[js.Array[DateComparable] | Boolean] = js.undefined
  /**
    * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
    * Default: false
    */
  var enabledHours: js.UndefOr[js.Array[Double] | Boolean] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(
    allowInputToggle: js.UndefOr[Boolean] = js.undefined,
    calendarWeeks: js.UndefOr[Boolean] = js.undefined,
    collapse: js.UndefOr[Boolean] = js.undefined,
    datepickerInput: String = null,
    dayViewHeaderFormat: String = null,
    daysOfWeekDisabled: js.Array[DayOfWeek] | Boolean = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultDate: DateComparable | Boolean = null,
    disabledDates: js.Array[DateComparable] | Boolean = null,
    disabledHours: js.Array[Double] | Boolean = null,
    disabledTimeIntervals: Boolean | js.Array[FromTo] = null,
    enabledDates: js.Array[DateComparable] | Boolean = null,
    enabledHours: js.Array[Double] | Boolean = null,
    extraFormats: js.Array[String] | Boolean = null,
    focusOnShow: js.UndefOr[Boolean] = js.undefined,
    format: String | Boolean = null,
    icons: Icons = null,
    ignoreReadonly: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    keepInvalid: js.UndefOr[Boolean] = js.undefined,
    keepOpen: js.UndefOr[Boolean] = js.undefined,
    keyBinds: KeyBinds = null,
    locale: String = null,
    maxDate: DateComparable | Boolean = null,
    minDate: DateComparable | Boolean = null,
    parseInputDate: /* inputDate */ String => Moment = null,
    showClear: js.UndefOr[Boolean] = js.undefined,
    showClose: js.UndefOr[Boolean] = js.undefined,
    showTodayButton: js.UndefOr[Boolean] = js.undefined,
    sideBySide: js.UndefOr[Boolean] = js.undefined,
    stepping: js.UndefOr[Double] = js.undefined,
    timeZone: String = null,
    toolbarPlacement: ToolbarPlacement = null,
    tooltips: Tooltips = null,
    useCurrent: Boolean | UseCurrent = null,
    useStrict: js.UndefOr[Boolean] = js.undefined,
    viewDate: DateComparable | Boolean = null,
    viewMode: ViewMode = null,
    widgetParent: String | JQuery = null,
    widgetPositioning: WidgetPositioning = null
  ): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInputToggle)) __obj.updateDynamic("allowInputToggle")(allowInputToggle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(calendarWeeks)) __obj.updateDynamic("calendarWeeks")(calendarWeeks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse.get.asInstanceOf[js.Any])
    if (datepickerInput != null) __obj.updateDynamic("datepickerInput")(datepickerInput.asInstanceOf[js.Any])
    if (dayViewHeaderFormat != null) __obj.updateDynamic("dayViewHeaderFormat")(dayViewHeaderFormat.asInstanceOf[js.Any])
    if (daysOfWeekDisabled != null) __obj.updateDynamic("daysOfWeekDisabled")(daysOfWeekDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(disabledHours.asInstanceOf[js.Any])
    if (disabledTimeIntervals != null) __obj.updateDynamic("disabledTimeIntervals")(disabledTimeIntervals.asInstanceOf[js.Any])
    if (enabledDates != null) __obj.updateDynamic("enabledDates")(enabledDates.asInstanceOf[js.Any])
    if (enabledHours != null) __obj.updateDynamic("enabledHours")(enabledHours.asInstanceOf[js.Any])
    if (extraFormats != null) __obj.updateDynamic("extraFormats")(extraFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnShow)) __obj.updateDynamic("focusOnShow")(focusOnShow.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreReadonly)) __obj.updateDynamic("ignoreReadonly")(ignoreReadonly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepInvalid)) __obj.updateDynamic("keepInvalid")(keepInvalid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOpen)) __obj.updateDynamic("keepOpen")(keepOpen.get.asInstanceOf[js.Any])
    if (keyBinds != null) __obj.updateDynamic("keyBinds")(keyBinds.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (parseInputDate != null) __obj.updateDynamic("parseInputDate")(js.Any.fromFunction1(parseInputDate))
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTodayButton)) __obj.updateDynamic("showTodayButton")(showTodayButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sideBySide)) __obj.updateDynamic("sideBySide")(sideBySide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepping)) __obj.updateDynamic("stepping")(stepping.get.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (toolbarPlacement != null) __obj.updateDynamic("toolbarPlacement")(toolbarPlacement.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    if (useCurrent != null) __obj.updateDynamic("useCurrent")(useCurrent.asInstanceOf[js.Any])
    if (!js.isUndefined(useStrict)) __obj.updateDynamic("useStrict")(useStrict.get.asInstanceOf[js.Any])
    if (viewDate != null) __obj.updateDynamic("viewDate")(viewDate.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    if (widgetParent != null) __obj.updateDynamic("widgetParent")(widgetParent.asInstanceOf[js.Any])
    if (widgetPositioning != null) __obj.updateDynamic("widgetPositioning")(widgetPositioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions]
  }
}

