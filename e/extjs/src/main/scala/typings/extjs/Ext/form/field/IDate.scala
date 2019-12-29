package typings.extjs.Ext.form.field

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDate extends IPicker {
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[String] = js.undefined
  /** [Method] private */
  @JSName("beforeBlur")
  var beforeBlur_IDate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String[]) */
  var disabledDates: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var disabledDatesText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number[]) */
  var disabledDays: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var disabledDaysText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  @JSName("initValue")
  var initValue_IDate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Attempts to parse a given string value using a given date format. ... */
  var safeParse: js.UndefOr[js.Any] = js.undefined
  /** [Method] Replaces any existing disabled dates with new values and refreshes the Date picker
  		* @param disabledDates String[] An array of date strings (see the disabledDates config for details on supported values) used to disable a pattern of dates.
  		*/
  var setDisabledDates: js.UndefOr[js.Function1[/* disabledDates */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the Date picker
  		* @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
  		*/
  var setDisabledDays: js.UndefOr[js.Function1[/* disabledDays */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Replaces any existing maxValue with the new value and refreshes the Date picker
  		* @param value Date The maximum date that can be selected
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Replaces any existing minValue with the new value and refreshes the Date picker
  		* @param value Date The minimum date that can be selected
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of the date field
  		* @param date String/Date The date or valid date string
  		* @returns Ext.form.field.Date this
  		*/
  @JSName("setValue")
  var setValue_IDate: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var showToday: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var startDay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var useStrict: js.UndefOr[Boolean] = js.undefined
}

object IDate {
  @scala.inline
  def apply(
    IPicker: IPicker = null,
    altFormats: String = null,
    beforeBlur: () => Unit = null,
    disabledDates: Array = null,
    disabledDatesText: String = null,
    disabledDays: Array = null,
    disabledDaysText: String = null,
    format: String = null,
    initValue: () => Unit = null,
    maxText: String = null,
    maxValue: js.Any = null,
    minText: String = null,
    minValue: js.Any = null,
    safeParse: js.Any = null,
    setDisabledDates: /* disabledDates */ js.UndefOr[Array] => Unit = null,
    setDisabledDays: /* disabledDays */ js.UndefOr[Array] => Unit = null,
    setMaxValue: /* value */ js.UndefOr[js.Any] => Unit = null,
    setMinValue: /* value */ js.UndefOr[js.Any] => Unit = null,
    setValue: /* date */ js.UndefOr[js.Any] => IDate = null,
    showToday: js.UndefOr[Boolean] = js.undefined,
    startDay: Int | Double = null,
    submitFormat: String = null,
    useStrict: js.UndefOr[Boolean] = js.undefined
  ): IDate = {
    val __obj = js.Dynamic.literal()
    if (IPicker != null) js.Dynamic.global.Object.assign(__obj, IPicker)
    if (altFormats != null) __obj.updateDynamic("altFormats")(altFormats.asInstanceOf[js.Any])
    if (beforeBlur != null) __obj.updateDynamic("beforeBlur")(js.Any.fromFunction0(beforeBlur))
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledDatesText != null) __obj.updateDynamic("disabledDatesText")(disabledDatesText.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (disabledDaysText != null) __obj.updateDynamic("disabledDaysText")(disabledDaysText.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (initValue != null) __obj.updateDynamic("initValue")(js.Any.fromFunction0(initValue))
    if (maxText != null) __obj.updateDynamic("maxText")(maxText.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minText != null) __obj.updateDynamic("minText")(minText.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (safeParse != null) __obj.updateDynamic("safeParse")(safeParse.asInstanceOf[js.Any])
    if (setDisabledDates != null) __obj.updateDynamic("setDisabledDates")(js.Any.fromFunction1(setDisabledDates))
    if (setDisabledDays != null) __obj.updateDynamic("setDisabledDays")(js.Any.fromFunction1(setDisabledDays))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday.asInstanceOf[js.Any])
    if (startDay != null) __obj.updateDynamic("startDay")(startDay.asInstanceOf[js.Any])
    if (submitFormat != null) __obj.updateDynamic("submitFormat")(submitFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(useStrict)) __obj.updateDynamic("useStrict")(useStrict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDate]
  }
}

