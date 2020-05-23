package typings.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITime extends IComboBox {
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.undefined
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
  var submitFormat: js.UndefOr[String] = js.undefined
}

object ITime {
  @scala.inline
  def apply(
    IComboBox: IComboBox = null,
    altFormats: String = null,
    format: String = null,
    increment: js.UndefOr[Double] = js.undefined,
    maxText: String = null,
    maxValue: js.Any = null,
    minText: String = null,
    minValue: js.Any = null,
    pickerMaxHeight: js.UndefOr[Double] = js.undefined,
    setMaxValue: /* value */ js.UndefOr[js.Any] => Unit = null,
    setMinValue: /* value */ js.UndefOr[js.Any] => Unit = null,
    setValue: () => _ = null,
    snapToIncrement: js.UndefOr[Boolean] = js.undefined,
    submitFormat: String = null
  ): ITime = {
    val __obj = js.Dynamic.literal()
    if (IComboBox != null) js.Dynamic.global.Object.assign(__obj, IComboBox)
    if (altFormats != null) __obj.updateDynamic("altFormats")(altFormats.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(increment)) __obj.updateDynamic("increment")(increment.get.asInstanceOf[js.Any])
    if (maxText != null) __obj.updateDynamic("maxText")(maxText.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minText != null) __obj.updateDynamic("minText")(minText.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (!js.isUndefined(pickerMaxHeight)) __obj.updateDynamic("pickerMaxHeight")(pickerMaxHeight.get.asInstanceOf[js.Any])
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction0(setValue))
    if (!js.isUndefined(snapToIncrement)) __obj.updateDynamic("snapToIncrement")(snapToIncrement.get.asInstanceOf[js.Any])
    if (submitFormat != null) __obj.updateDynamic("submitFormat")(submitFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITime]
  }
}

