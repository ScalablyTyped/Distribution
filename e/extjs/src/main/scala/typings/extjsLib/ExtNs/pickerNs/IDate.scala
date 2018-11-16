package typings
package extjsLib.ExtNs.pickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDate
  extends extjsLib.ExtNs.IComponent {
  /** [Config Option] (String) */
  var ariaTitle: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var ariaTitleDateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String[]) */
  var dayNames: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Boolean) */
  var disableAnim: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var disabledCellCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String[]) */
  var disabledDates: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (RegExp) */
  var disabledDatesRE: js.UndefOr[stdLib.RegExp] = js.undefined
  /** [Config Option] (String) */
  var disabledDatesText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number[]) */
  var disabledDays: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
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
  var hideMonthPicker: js.UndefOr[js.Function1[/* animate */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
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
  var monthNames: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
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
  var selectToday: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Replaces any existing disabled dates with new values and refreshes the DatePicker
  		* @param disabledDates String[]/RegExp An array of date strings (see the disabledDates config for details on supported values), or a JavaScript regular expression used to disable a pattern of dates.
  		* @returns Ext.picker.Date this
  		*/
  var setDisabledDates: js.UndefOr[js.Function1[/* disabledDates */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the DatePicker
  		* @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
  		* @returns Ext.picker.Date this
  		*/
  var setDisabledDays: js.UndefOr[js.Function1[/* disabledDays */ js.UndefOr[extjsLib.ExtNs.Array], this.type]] = js.undefined
  /** [Method] Replaces any existing maxDate with the new value and refreshes the DatePicker
  		* @param value Date The maximum date that can be selected
  		* @returns Ext.picker.Date this
  		*/
  var setMaxDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Replaces any existing minDate with the new value and refreshes the DatePicker
  		* @param value Date The minimum date that can be selected
  		* @returns Ext.picker.Date this
  		*/
  var setMinDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the value of the date field
  		* @param value Date The date to set
  		* @returns Ext.picker.Date this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Show the month picker
  		* @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
  		* @returns Ext.picker.Date this
  		*/
  var showMonthPicker: js.UndefOr[js.Function1[/* animate */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Method] Show the next month
  		* @param e Object
  		* @returns Ext.picker.Date this
  		*/
  var showNextMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Show the next year
  		* @returns Ext.picker.Date this
  		*/
  var showNextYear: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Show the previous month
  		* @param e Object
  		* @returns Ext.picker.Date this
  		*/
  var showPrevMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Show the previous year
  		* @returns Ext.picker.Date this
  		*/
  var showPrevYear: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var showToday: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var startDay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var todayText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var todayTip: js.UndefOr[java.lang.String] = js.undefined
}

