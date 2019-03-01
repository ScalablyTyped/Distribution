package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker extends IComponent {
  /** [Config Option] (String) */
  var ariaTitle: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var ariaTitleDateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String[]) */
  var dayNames: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var disableAnim: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var disabledCellCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String[]) */
  var disabledDates: js.UndefOr[Array] = js.undefined
  /** [Config Option] (RegExp) */
  var disabledDatesRE: js.UndefOr[stdLib.RegExp] = js.undefined
  /** [Config Option] (String) */
  var disabledDatesText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number[]) */
  var disabledDays: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var disabledDaysText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var focusOnShow: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Gets a single character to represent the day of the week
  		* @param value Object
  		* @returns String The character
  		*/
  var getDayInitial: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Gets the current selected value of the date field
  		* @returns Date The selected date
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Method] Hides the month picker if it s visible
  		* @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
  		* @returns Ext.picker.Date this
  		*/
  var hideMonthPicker: js.UndefOr[
    js.Function1[/* animate */ js.UndefOr[scala.Boolean], extjsLib.ExtNs.pickerNs.IDate]
  ] = js.undefined
  /** [Config Option] (Object) */
  var keyNavConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var longDayFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date) */
  var maxDate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date) */
  var minDate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String[]) */
  var monthNames: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var monthYearFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var monthYearText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var nextText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var prevText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the current value to today
  		* @returns Ext.picker.Date this
  		*/
  var selectToday: js.UndefOr[js.Function0[extjsLib.ExtNs.pickerNs.IDate]] = js.undefined
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Replaces any existing disabled dates with new values and refreshes the DatePicker
  		* @param disabledDates String[]/RegExp An array of date strings (see the disabledDates config for details on supported values), or a JavaScript regular expression used to disable a pattern of dates.
  		* @returns Ext.picker.Date this
  		*/
  var setDisabledDates: js.UndefOr[
    js.Function1[/* disabledDates */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate]
  ] = js.undefined
  /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the DatePicker
  		* @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
  		* @returns Ext.picker.Date this
  		*/
  var setDisabledDays: js.UndefOr[
    js.Function1[/* disabledDays */ js.UndefOr[Array], extjsLib.ExtNs.pickerNs.IDate]
  ] = js.undefined
  /** [Method] Replaces any existing maxDate with the new value and refreshes the DatePicker
  		* @param value Date The maximum date that can be selected
  		* @returns Ext.picker.Date this
  		*/
  var setMaxDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate]] = js.undefined
  /** [Method] Replaces any existing minDate with the new value and refreshes the DatePicker
  		* @param value Date The minimum date that can be selected
  		* @returns Ext.picker.Date this
  		*/
  var setMinDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate]] = js.undefined
  /** [Method] Sets the value of the date field
  		* @param value Date The date to set
  		* @returns Ext.picker.Date this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate]] = js.undefined
  /** [Method] Show the month picker
  		* @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
  		* @returns Ext.picker.Date this
  		*/
  var showMonthPicker: js.UndefOr[
    js.Function1[/* animate */ js.UndefOr[scala.Boolean], extjsLib.ExtNs.pickerNs.IDate]
  ] = js.undefined
  /** [Method] Show the next month
  		* @param e Object
  		* @returns Ext.picker.Date this
  		*/
  var showNextMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate]] = js.undefined
  /** [Method] Show the next year
  		* @returns Ext.picker.Date this
  		*/
  var showNextYear: js.UndefOr[js.Function0[extjsLib.ExtNs.pickerNs.IDate]] = js.undefined
  /** [Method] Show the previous month
  		* @param e Object
  		* @returns Ext.picker.Date this
  		*/
  var showPrevMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate]] = js.undefined
  /** [Method] Show the previous year
  		* @returns Ext.picker.Date this
  		*/
  var showPrevYear: js.UndefOr[js.Function0[extjsLib.ExtNs.pickerNs.IDate]] = js.undefined
  /** [Config Option] (Boolean) */
  var showToday: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var startDay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var todayText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var todayTip: js.UndefOr[java.lang.String] = js.undefined
}

object IDatePicker {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    ariaTitle: java.lang.String = null,
    ariaTitleDateFormat: java.lang.String = null,
    baseCls: java.lang.String = null,
    border: js.Any = null,
    dayNames: Array = null,
    disableAnim: js.UndefOr[scala.Boolean] = js.undefined,
    disabledCellCls: java.lang.String = null,
    disabledDates: Array = null,
    disabledDatesRE: stdLib.RegExp = null,
    disabledDatesText: java.lang.String = null,
    disabledDays: Array = null,
    disabledDaysText: java.lang.String = null,
    focusOnShow: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    getDayInitial: js.Function1[/* value */ js.UndefOr[js.Any], java.lang.String] = null,
    getValue: js.Function0[_] = null,
    handler: js.Any = null,
    hideMonthPicker: js.Function1[/* animate */ js.UndefOr[scala.Boolean], extjsLib.ExtNs.pickerNs.IDate] = null,
    initComponent: js.Function0[scala.Unit] = null,
    keyNavConfig: js.Any = null,
    longDayFormat: java.lang.String = null,
    maxDate: js.Any = null,
    maxText: java.lang.String = null,
    minDate: js.Any = null,
    minText: java.lang.String = null,
    monthNames: Array = null,
    monthYearFormat: java.lang.String = null,
    monthYearText: java.lang.String = null,
    nextText: java.lang.String = null,
    prevText: java.lang.String = null,
    renderTpl: js.Any = null,
    scope: js.Any = null,
    selectToday: js.Function0[extjsLib.ExtNs.pickerNs.IDate] = null,
    selectedCls: java.lang.String = null,
    setDisabledDates: js.Function1[/* disabledDates */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate] = null,
    setDisabledDays: js.Function1[/* disabledDays */ js.UndefOr[Array], extjsLib.ExtNs.pickerNs.IDate] = null,
    setMaxDate: js.Function1[/* value */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate] = null,
    setMinDate: js.Function1[/* value */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate] = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate] = null,
    showMonthPicker: js.Function1[/* animate */ js.UndefOr[scala.Boolean], extjsLib.ExtNs.pickerNs.IDate] = null,
    showNextMonth: js.Function1[/* e */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate] = null,
    showNextYear: js.Function0[extjsLib.ExtNs.pickerNs.IDate] = null,
    showPrevMonth: js.Function1[/* e */ js.UndefOr[js.Any], extjsLib.ExtNs.pickerNs.IDate] = null,
    showPrevYear: js.Function0[extjsLib.ExtNs.pickerNs.IDate] = null,
    showToday: js.UndefOr[scala.Boolean] = js.undefined,
    startDay: scala.Int | scala.Double = null,
    todayText: java.lang.String = null,
    todayTip: java.lang.String = null
  ): IDatePicker = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (ariaTitle != null) __obj.updateDynamic("ariaTitle")(ariaTitle)
    if (ariaTitleDateFormat != null) __obj.updateDynamic("ariaTitleDateFormat")(ariaTitleDateFormat)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (border != null) __obj.updateDynamic("border")(border)
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames)
    if (!js.isUndefined(disableAnim)) __obj.updateDynamic("disableAnim")(disableAnim)
    if (disabledCellCls != null) __obj.updateDynamic("disabledCellCls")(disabledCellCls)
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates)
    if (disabledDatesRE != null) __obj.updateDynamic("disabledDatesRE")(disabledDatesRE)
    if (disabledDatesText != null) __obj.updateDynamic("disabledDatesText")(disabledDatesText)
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays)
    if (disabledDaysText != null) __obj.updateDynamic("disabledDaysText")(disabledDaysText)
    if (!js.isUndefined(focusOnShow)) __obj.updateDynamic("focusOnShow")(focusOnShow)
    if (format != null) __obj.updateDynamic("format")(format)
    if (getDayInitial != null) __obj.updateDynamic("getDayInitial")(getDayInitial)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (hideMonthPicker != null) __obj.updateDynamic("hideMonthPicker")(hideMonthPicker)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (keyNavConfig != null) __obj.updateDynamic("keyNavConfig")(keyNavConfig)
    if (longDayFormat != null) __obj.updateDynamic("longDayFormat")(longDayFormat)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (maxText != null) __obj.updateDynamic("maxText")(maxText)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minText != null) __obj.updateDynamic("minText")(minText)
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames)
    if (monthYearFormat != null) __obj.updateDynamic("monthYearFormat")(monthYearFormat)
    if (monthYearText != null) __obj.updateDynamic("monthYearText")(monthYearText)
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (prevText != null) __obj.updateDynamic("prevText")(prevText)
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (selectToday != null) __obj.updateDynamic("selectToday")(selectToday)
    if (selectedCls != null) __obj.updateDynamic("selectedCls")(selectedCls)
    if (setDisabledDates != null) __obj.updateDynamic("setDisabledDates")(setDisabledDates)
    if (setDisabledDays != null) __obj.updateDynamic("setDisabledDays")(setDisabledDays)
    if (setMaxDate != null) __obj.updateDynamic("setMaxDate")(setMaxDate)
    if (setMinDate != null) __obj.updateDynamic("setMinDate")(setMinDate)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (showMonthPicker != null) __obj.updateDynamic("showMonthPicker")(showMonthPicker)
    if (showNextMonth != null) __obj.updateDynamic("showNextMonth")(showNextMonth)
    if (showNextYear != null) __obj.updateDynamic("showNextYear")(showNextYear)
    if (showPrevMonth != null) __obj.updateDynamic("showPrevMonth")(showPrevMonth)
    if (showPrevYear != null) __obj.updateDynamic("showPrevYear")(showPrevYear)
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday)
    if (startDay != null) __obj.updateDynamic("startDay")(startDay.asInstanceOf[js.Any])
    if (todayText != null) __obj.updateDynamic("todayText")(todayText)
    if (todayTip != null) __obj.updateDynamic("todayTip")(todayTip)
    __obj.asInstanceOf[IDatePicker]
  }
}

