package typings.extjs.Ext

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePicker extends IComponent {
  /** [Config Option] (String) */
  var ariaTitle: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var ariaTitleDateFormat: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String[]) */
  var dayNames: js.UndefOr[Array] = js.native
  /** [Config Option] (Boolean) */
  var disableAnim: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var disabledCellCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String[]) */
  var disabledDates: js.UndefOr[Array] = js.native
  /** [Config Option] (RegExp) */
  var disabledDatesRE: js.UndefOr[RegExp] = js.native
  /** [Config Option] (String) */
  var disabledDatesText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number[]) */
  var disabledDays: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var disabledDaysText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Boolean) */
  var focusOnShow: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.native
  /** [Method] Gets a single character to represent the day of the week
    * @param value Object
    * @returns String The character
    */
  var getDayInitial: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], java.lang.String]] = js.native
  /** [Method] Gets the current selected value of the date field
    * @returns Date The selected date
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Method] Hides the month picker if it s visible
    * @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
    * @returns Ext.picker.Date this
    */
  var hideMonthPicker: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], typings.extjs.Ext.picker.IDate]] = js.native
  /** [Config Option] (Object) */
  var keyNavConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var longDayFormat: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Date) */
  var maxDate: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var maxText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Date) */
  var minDate: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var minText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String[]) */
  var monthNames: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var monthYearFormat: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var monthYearText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var nextText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var prevText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the current value to today
    * @returns Ext.picker.Date this
    */
  var selectToday: js.UndefOr[js.Function0[typings.extjs.Ext.picker.IDate]] = js.native
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Replaces any existing disabled dates with new values and refreshes the DatePicker
    * @param disabledDates String[]/RegExp An array of date strings (see the disabledDates config for details on supported values), or a JavaScript regular expression used to disable a pattern of dates.
    * @returns Ext.picker.Date this
    */
  var setDisabledDates: js.UndefOr[
    js.Function1[/* disabledDates */ js.UndefOr[js.Any], typings.extjs.Ext.picker.IDate]
  ] = js.native
  /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the DatePicker
    * @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
    * @returns Ext.picker.Date this
    */
  var setDisabledDays: js.UndefOr[
    js.Function1[/* disabledDays */ js.UndefOr[Array], typings.extjs.Ext.picker.IDate]
  ] = js.native
  /** [Method] Replaces any existing maxDate with the new value and refreshes the DatePicker
    * @param value Date The maximum date that can be selected
    * @returns Ext.picker.Date this
    */
  var setMaxDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], typings.extjs.Ext.picker.IDate]] = js.native
  /** [Method] Replaces any existing minDate with the new value and refreshes the DatePicker
    * @param value Date The minimum date that can be selected
    * @returns Ext.picker.Date this
    */
  var setMinDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], typings.extjs.Ext.picker.IDate]] = js.native
  /** [Method] Sets the value of the date field
    * @param value Date The date to set
    * @returns Ext.picker.Date this
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], typings.extjs.Ext.picker.IDate]] = js.native
  /** [Method] Show the month picker
    * @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
    * @returns Ext.picker.Date this
    */
  var showMonthPicker: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], typings.extjs.Ext.picker.IDate]] = js.native
  /** [Method] Show the next month
    * @param e Object
    * @returns Ext.picker.Date this
    */
  var showNextMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], typings.extjs.Ext.picker.IDate]] = js.native
  /** [Method] Show the next year
    * @returns Ext.picker.Date this
    */
  var showNextYear: js.UndefOr[js.Function0[typings.extjs.Ext.picker.IDate]] = js.native
  /** [Method] Show the previous month
    * @param e Object
    * @returns Ext.picker.Date this
    */
  var showPrevMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], typings.extjs.Ext.picker.IDate]] = js.native
  /** [Method] Show the previous year
    * @returns Ext.picker.Date this
    */
  var showPrevYear: js.UndefOr[js.Function0[typings.extjs.Ext.picker.IDate]] = js.native
  /** [Config Option] (Boolean) */
  var showToday: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var startDay: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var todayText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var todayTip: js.UndefOr[java.lang.String] = js.native
}

object IDatePicker {
  @scala.inline
  def apply(): IDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePicker]
  }
  @scala.inline
  implicit class IDatePickerOps[Self <: IDatePicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAriaTitle(value: java.lang.String): Self = this.set("ariaTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaTitle: Self = this.set("ariaTitle", js.undefined)
    @scala.inline
    def setAriaTitleDateFormat(value: java.lang.String): Self = this.set("ariaTitleDateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaTitleDateFormat: Self = this.set("ariaTitleDateFormat", js.undefined)
    @scala.inline
    def setDayNames(value: Array): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayNames: Self = this.set("dayNames", js.undefined)
    @scala.inline
    def setDisableAnim(value: Boolean): Self = this.set("disableAnim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAnim: Self = this.set("disableAnim", js.undefined)
    @scala.inline
    def setDisabledCellCls(value: java.lang.String): Self = this.set("disabledCellCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledCellCls: Self = this.set("disabledCellCls", js.undefined)
    @scala.inline
    def setDisabledDates(value: Array): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    @scala.inline
    def setDisabledDatesRE(value: RegExp): Self = this.set("disabledDatesRE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDatesRE: Self = this.set("disabledDatesRE", js.undefined)
    @scala.inline
    def setDisabledDatesText(value: java.lang.String): Self = this.set("disabledDatesText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDatesText: Self = this.set("disabledDatesText", js.undefined)
    @scala.inline
    def setDisabledDays(value: Array): Self = this.set("disabledDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDays: Self = this.set("disabledDays", js.undefined)
    @scala.inline
    def setDisabledDaysText(value: java.lang.String): Self = this.set("disabledDaysText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDaysText: Self = this.set("disabledDaysText", js.undefined)
    @scala.inline
    def setFocusOnShow(value: Boolean): Self = this.set("focusOnShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusOnShow: Self = this.set("focusOnShow", js.undefined)
    @scala.inline
    def setFormat(value: java.lang.String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGetDayInitial(value: /* value */ js.UndefOr[js.Any] => java.lang.String): Self = this.set("getDayInitial", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDayInitial: Self = this.set("getDayInitial", js.undefined)
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setHideMonthPicker(value: /* animate */ js.UndefOr[Boolean] => typings.extjs.Ext.picker.IDate): Self = this.set("hideMonthPicker", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHideMonthPicker: Self = this.set("hideMonthPicker", js.undefined)
    @scala.inline
    def setKeyNavConfig(value: js.Any): Self = this.set("keyNavConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyNavConfig: Self = this.set("keyNavConfig", js.undefined)
    @scala.inline
    def setLongDayFormat(value: java.lang.String): Self = this.set("longDayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongDayFormat: Self = this.set("longDayFormat", js.undefined)
    @scala.inline
    def setMaxDate(value: js.Any): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMaxText(value: java.lang.String): Self = this.set("maxText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxText: Self = this.set("maxText", js.undefined)
    @scala.inline
    def setMinDate(value: js.Any): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMinText(value: java.lang.String): Self = this.set("minText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinText: Self = this.set("minText", js.undefined)
    @scala.inline
    def setMonthNames(value: Array): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthNames: Self = this.set("monthNames", js.undefined)
    @scala.inline
    def setMonthYearFormat(value: java.lang.String): Self = this.set("monthYearFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthYearFormat: Self = this.set("monthYearFormat", js.undefined)
    @scala.inline
    def setMonthYearText(value: java.lang.String): Self = this.set("monthYearText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthYearText: Self = this.set("monthYearText", js.undefined)
    @scala.inline
    def setNextText(value: java.lang.String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    @scala.inline
    def setPrevText(value: java.lang.String): Self = this.set("prevText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevText: Self = this.set("prevText", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSelectToday(value: () => typings.extjs.Ext.picker.IDate): Self = this.set("selectToday", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSelectToday: Self = this.set("selectToday", js.undefined)
    @scala.inline
    def setSelectedCls(value: java.lang.String): Self = this.set("selectedCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedCls: Self = this.set("selectedCls", js.undefined)
    @scala.inline
    def setSetDisabledDates(value: /* disabledDates */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = this.set("setDisabledDates", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDisabledDates: Self = this.set("setDisabledDates", js.undefined)
    @scala.inline
    def setSetDisabledDays(value: /* disabledDays */ js.UndefOr[Array] => typings.extjs.Ext.picker.IDate): Self = this.set("setDisabledDays", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDisabledDays: Self = this.set("setDisabledDays", js.undefined)
    @scala.inline
    def setSetMaxDate(value: /* value */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = this.set("setMaxDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxDate: Self = this.set("setMaxDate", js.undefined)
    @scala.inline
    def setSetMinDate(value: /* value */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = this.set("setMinDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinDate: Self = this.set("setMinDate", js.undefined)
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    @scala.inline
    def setShowMonthPicker(value: /* animate */ js.UndefOr[Boolean] => typings.extjs.Ext.picker.IDate): Self = this.set("showMonthPicker", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShowMonthPicker: Self = this.set("showMonthPicker", js.undefined)
    @scala.inline
    def setShowNextMonth(value: /* e */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = this.set("showNextMonth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShowNextMonth: Self = this.set("showNextMonth", js.undefined)
    @scala.inline
    def setShowNextYear(value: () => typings.extjs.Ext.picker.IDate): Self = this.set("showNextYear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShowNextYear: Self = this.set("showNextYear", js.undefined)
    @scala.inline
    def setShowPrevMonth(value: /* e */ js.UndefOr[js.Any] => typings.extjs.Ext.picker.IDate): Self = this.set("showPrevMonth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShowPrevMonth: Self = this.set("showPrevMonth", js.undefined)
    @scala.inline
    def setShowPrevYear(value: () => typings.extjs.Ext.picker.IDate): Self = this.set("showPrevYear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShowPrevYear: Self = this.set("showPrevYear", js.undefined)
    @scala.inline
    def setShowToday(value: Boolean): Self = this.set("showToday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToday: Self = this.set("showToday", js.undefined)
    @scala.inline
    def setStartDay(value: Double): Self = this.set("startDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDay: Self = this.set("startDay", js.undefined)
    @scala.inline
    def setTodayText(value: java.lang.String): Self = this.set("todayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTodayText: Self = this.set("todayText", js.undefined)
    @scala.inline
    def setTodayTip(value: java.lang.String): Self = this.set("todayTip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTodayTip: Self = this.set("todayTip", js.undefined)
  }
  
}

