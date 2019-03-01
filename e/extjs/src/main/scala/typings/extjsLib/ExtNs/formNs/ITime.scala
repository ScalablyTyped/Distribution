package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITime
  extends extjsLib.ExtNs.formNs.fieldNs.IComboBox {
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var pickerMaxHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Replaces any existing maxValue with the new time and refreshes the picker s range
  		* @param value Date/String The maximum time that can be selected
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Replaces any existing minValue with the new time and refreshes the picker s range
  		* @param value Date/String The minimum time that can be selected
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the specified value s into the field
  		* @returns any this
  		*/
  @JSName("setValue")
  var setValue_ITime: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var snapToIncrement: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[java.lang.String] = js.undefined
}

object ITime {
  @scala.inline
  def apply(
    IComboBox: extjsLib.ExtNs.formNs.fieldNs.IComboBox = null,
    altFormats: java.lang.String = null,
    displayField: java.lang.String = null,
    format: java.lang.String = null,
    getErrors: js.Function1[/* value */ js.UndefOr[js.Any], extjsLib.ExtNs.Array] = null,
    getValue: js.Function0[_] = null,
    increment: scala.Int | scala.Double = null,
    initComponent: js.Function0[scala.Unit] = null,
    invalidText: java.lang.String = null,
    maxText: java.lang.String = null,
    maxValue: js.Any = null,
    minText: java.lang.String = null,
    minValue: js.Any = null,
    pickerMaxHeight: scala.Int | scala.Double = null,
    postBlur: js.Function0[scala.Unit] = null,
    queryMode: java.lang.String = null,
    rawToValue: js.Function1[/* rawValue */ js.UndefOr[js.Any], _] = null,
    selectOnTab: js.UndefOr[scala.Boolean] = js.undefined,
    setMaxValue: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit] = null,
    setMinValue: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit] = null,
    setValue: js.Function0[_] = null,
    snapToIncrement: js.UndefOr[scala.Boolean] = js.undefined,
    submitFormat: java.lang.String = null,
    triggerCls: java.lang.String = null,
    valueField: java.lang.String = null,
    valueToRaw: js.Function1[/* value */ js.UndefOr[js.Any], _] = null
  ): ITime = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComboBox)
    if (altFormats != null) __obj.updateDynamic("altFormats")(altFormats)
    if (displayField != null) __obj.updateDynamic("displayField")(displayField)
    if (format != null) __obj.updateDynamic("format")(format)
    if (getErrors != null) __obj.updateDynamic("getErrors")(getErrors)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (invalidText != null) __obj.updateDynamic("invalidText")(invalidText)
    if (maxText != null) __obj.updateDynamic("maxText")(maxText)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minText != null) __obj.updateDynamic("minText")(minText)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (pickerMaxHeight != null) __obj.updateDynamic("pickerMaxHeight")(pickerMaxHeight.asInstanceOf[js.Any])
    if (postBlur != null) __obj.updateDynamic("postBlur")(postBlur)
    if (queryMode != null) __obj.updateDynamic("queryMode")(queryMode)
    if (rawToValue != null) __obj.updateDynamic("rawToValue")(rawToValue)
    if (!js.isUndefined(selectOnTab)) __obj.updateDynamic("selectOnTab")(selectOnTab)
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(setMaxValue)
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(setMinValue)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (!js.isUndefined(snapToIncrement)) __obj.updateDynamic("snapToIncrement")(snapToIncrement)
    if (submitFormat != null) __obj.updateDynamic("submitFormat")(submitFormat)
    if (triggerCls != null) __obj.updateDynamic("triggerCls")(triggerCls)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    if (valueToRaw != null) __obj.updateDynamic("valueToRaw")(valueToRaw)
    __obj.asInstanceOf[ITime]
  }
}

