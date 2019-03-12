package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateField
  extends extjsLib.ExtNs.formNs.fieldNs.IPicker {
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] private */
  @JSName("beforeBlur")
  var beforeBlur_IDateField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String[]) */
  var disabledDates: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (String) */
  var disabledDatesText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number[]) */
  var disabledDays: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (String) */
  var disabledDaysText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Attempts to parse a given string value using a given date format. ... */
  var safeParse: js.UndefOr[js.Any] = js.undefined
  /** [Method] Replaces any existing disabled dates with new values and refreshes the Date picker
  		* @param disabledDates String[] An array of date strings (see the disabledDates config for details on supported values) used to disable a pattern of dates.
  		*/
  var setDisabledDates: js.UndefOr[js.Function1[/* disabledDates */ js.UndefOr[extjsLib.ExtNs.Array], scala.Unit]] = js.undefined
  /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the Date picker
  		* @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
  		*/
  var setDisabledDays: js.UndefOr[js.Function1[/* disabledDays */ js.UndefOr[extjsLib.ExtNs.Array], scala.Unit]] = js.undefined
  /** [Method] Replaces any existing maxValue with the new value and refreshes the Date picker
  		* @param value Date The maximum date that can be selected
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Replaces any existing minValue with the new value and refreshes the Date picker
  		* @param value Date The minimum date that can be selected
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of the date field
  		* @param date String/Date The date or valid date string
  		* @returns Ext.form.field.Date this
  		*/
  @JSName("setValue")
  var setValue_IDateField: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Any], extjsLib.ExtNs.formNs.fieldNs.IDate]] = js.undefined
  /** [Config Option] (Boolean) */
  var showToday: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var startDay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var useStrict: js.UndefOr[scala.Boolean] = js.undefined
}

object IDateField {
  @scala.inline
  def apply(
    IPicker: extjsLib.ExtNs.formNs.fieldNs.IPicker = null,
    altFormats: java.lang.String = null,
    beforeBlur: () => scala.Unit = null,
    createPicker: () => scala.Unit = null,
    disabledDates: extjsLib.ExtNs.Array = null,
    disabledDatesText: java.lang.String = null,
    disabledDays: extjsLib.ExtNs.Array = null,
    disabledDaysText: java.lang.String = null,
    format: java.lang.String = null,
    getErrors: /* value */ js.UndefOr[js.Any] => extjsLib.ExtNs.Array = null,
    initComponent: () => scala.Unit = null,
    initValue: () => scala.Unit = null,
    invalidText: java.lang.String = null,
    matchFieldWidth: js.UndefOr[scala.Boolean] = js.undefined,
    maxText: java.lang.String = null,
    maxValue: js.Any = null,
    minText: java.lang.String = null,
    minValue: js.Any = null,
    rawToValue: /* rawValue */ js.UndefOr[js.Any] => _ = null,
    safeParse: js.Any = null,
    setDisabledDates: /* disabledDates */ js.UndefOr[extjsLib.ExtNs.Array] => scala.Unit = null,
    setDisabledDays: /* disabledDays */ js.UndefOr[extjsLib.ExtNs.Array] => scala.Unit = null,
    setMaxValue: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    setMinValue: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    setValue: /* date */ js.UndefOr[js.Any] => extjsLib.ExtNs.formNs.fieldNs.IDate = null,
    showToday: js.UndefOr[scala.Boolean] = js.undefined,
    startDay: scala.Int | scala.Double = null,
    submitFormat: java.lang.String = null,
    triggerCls: java.lang.String = null,
    useStrict: js.UndefOr[scala.Boolean] = js.undefined,
    valueToRaw: /* value */ js.UndefOr[js.Any] => _ = null
  ): IDateField = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPicker)
    if (altFormats != null) __obj.updateDynamic("altFormats")(altFormats)
    if (beforeBlur != null) __obj.updateDynamic("beforeBlur")(js.Any.fromFunction0(beforeBlur))
    if (createPicker != null) __obj.updateDynamic("createPicker")(js.Any.fromFunction0(createPicker))
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates)
    if (disabledDatesText != null) __obj.updateDynamic("disabledDatesText")(disabledDatesText)
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays)
    if (disabledDaysText != null) __obj.updateDynamic("disabledDaysText")(disabledDaysText)
    if (format != null) __obj.updateDynamic("format")(format)
    if (getErrors != null) __obj.updateDynamic("getErrors")(js.Any.fromFunction1(getErrors))
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (initValue != null) __obj.updateDynamic("initValue")(js.Any.fromFunction0(initValue))
    if (invalidText != null) __obj.updateDynamic("invalidText")(invalidText)
    if (!js.isUndefined(matchFieldWidth)) __obj.updateDynamic("matchFieldWidth")(matchFieldWidth)
    if (maxText != null) __obj.updateDynamic("maxText")(maxText)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minText != null) __obj.updateDynamic("minText")(minText)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (rawToValue != null) __obj.updateDynamic("rawToValue")(js.Any.fromFunction1(rawToValue))
    if (safeParse != null) __obj.updateDynamic("safeParse")(safeParse)
    if (setDisabledDates != null) __obj.updateDynamic("setDisabledDates")(js.Any.fromFunction1(setDisabledDates))
    if (setDisabledDays != null) __obj.updateDynamic("setDisabledDays")(js.Any.fromFunction1(setDisabledDays))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday)
    if (startDay != null) __obj.updateDynamic("startDay")(startDay.asInstanceOf[js.Any])
    if (submitFormat != null) __obj.updateDynamic("submitFormat")(submitFormat)
    if (triggerCls != null) __obj.updateDynamic("triggerCls")(triggerCls)
    if (!js.isUndefined(useStrict)) __obj.updateDynamic("useStrict")(useStrict)
    if (valueToRaw != null) __obj.updateDynamic("valueToRaw")(js.Any.fromFunction1(valueToRaw))
    __obj.asInstanceOf[IDateField]
  }
}

