package typings.extjs.ExtNs.formNs

import typings.extjs.ExtNs.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITime
  extends typings.extjs.ExtNs.formNs.fieldNs.IComboBox {
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var pickerMaxHeight: js.UndefOr[Double] = js.undefined
  /** [Method] Replaces any existing maxValue with the new time and refreshes the picker s range
  		* @param value Date/String The maximum time that can be selected
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Replaces any existing minValue with the new time and refreshes the picker s range
  		* @param value Date/String The minimum time that can be selected
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the specified value s into the field
  		* @returns any this
  		*/
  @JSName("setValue")
  var setValue_ITime: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var snapToIncrement: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[java.lang.String] = js.undefined
}

object ITime {
  @scala.inline
  def apply(
    IComboBox: typings.extjs.ExtNs.formNs.fieldNs.IComboBox = null,
    altFormats: java.lang.String = null,
    displayField: java.lang.String = null,
    format: java.lang.String = null,
    getErrors: /* value */ js.UndefOr[js.Any] => Array = null,
    getValue: () => _ = null,
    increment: Int | Double = null,
    initComponent: () => Unit = null,
    invalidText: java.lang.String = null,
    maxText: java.lang.String = null,
    maxValue: js.Any = null,
    minText: java.lang.String = null,
    minValue: js.Any = null,
    pickerMaxHeight: Int | Double = null,
    postBlur: () => Unit = null,
    queryMode: java.lang.String = null,
    rawToValue: /* rawValue */ js.UndefOr[js.Any] => _ = null,
    selectOnTab: js.UndefOr[Boolean] = js.undefined,
    setMaxValue: /* value */ js.UndefOr[js.Any] => Unit = null,
    setMinValue: /* value */ js.UndefOr[js.Any] => Unit = null,
    setValue: () => _ = null,
    snapToIncrement: js.UndefOr[Boolean] = js.undefined,
    submitFormat: java.lang.String = null,
    triggerCls: java.lang.String = null,
    valueField: java.lang.String = null,
    valueToRaw: /* value */ js.UndefOr[js.Any] => _ = null
  ): ITime = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComboBox)
    if (altFormats != null) __obj.updateDynamic("altFormats")(altFormats)
    if (displayField != null) __obj.updateDynamic("displayField")(displayField)
    if (format != null) __obj.updateDynamic("format")(format)
    if (getErrors != null) __obj.updateDynamic("getErrors")(js.Any.fromFunction1(getErrors))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (invalidText != null) __obj.updateDynamic("invalidText")(invalidText)
    if (maxText != null) __obj.updateDynamic("maxText")(maxText)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minText != null) __obj.updateDynamic("minText")(minText)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (pickerMaxHeight != null) __obj.updateDynamic("pickerMaxHeight")(pickerMaxHeight.asInstanceOf[js.Any])
    if (postBlur != null) __obj.updateDynamic("postBlur")(js.Any.fromFunction0(postBlur))
    if (queryMode != null) __obj.updateDynamic("queryMode")(queryMode)
    if (rawToValue != null) __obj.updateDynamic("rawToValue")(js.Any.fromFunction1(rawToValue))
    if (!js.isUndefined(selectOnTab)) __obj.updateDynamic("selectOnTab")(selectOnTab)
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction0(setValue))
    if (!js.isUndefined(snapToIncrement)) __obj.updateDynamic("snapToIncrement")(snapToIncrement)
    if (submitFormat != null) __obj.updateDynamic("submitFormat")(submitFormat)
    if (triggerCls != null) __obj.updateDynamic("triggerCls")(triggerCls)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    if (valueToRaw != null) __obj.updateDynamic("valueToRaw")(js.Any.fromFunction1(valueToRaw))
    __obj.asInstanceOf[ITime]
  }
}

