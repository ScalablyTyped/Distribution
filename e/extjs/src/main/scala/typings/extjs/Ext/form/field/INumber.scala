package typings.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber extends ISpinner {
  /** [Config Option] (Boolean) */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowExponential: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoStripChars: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var baseChars: js.UndefOr[String] = js.undefined
  /** [Method] Template method to do any pre blur processing  */
  @JSName("beforeBlur")
  var beforeBlur_INumber: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number) */
  var decimalPrecision: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value that would be included in a standard form submit for this field
    * @returns String The value to be submitted, or null.
    */
  @JSName("getSubmitValue")
  var getSubmitValue_INumber: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var nanText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var negativeText: js.UndefOr[String] = js.undefined
  /** [Method] Replaces any existing maxValue with the new value
    * @param value Number The maximum value
    */
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Replaces any existing minValue with the new value
    * @param value Number The minimum value
    */
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets whether the spinner down button is enabled
    * @param enabled Object
    * @param internal Object
    */
  @JSName("setSpinDownEnabled")
  var setSpinDownEnabled_INumber: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Sets whether the spinner up button is enabled
    * @param enabled Object
    * @param internal Object
    */
  @JSName("setSpinUpEnabled")
  var setSpinUpEnabled_INumber: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var step: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var submitLocaleSeparator: js.UndefOr[Boolean] = js.undefined
}

object INumber {
  @scala.inline
  def apply(
    ISpinner: ISpinner = null,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    allowExponential: js.UndefOr[Boolean] = js.undefined,
    autoStripChars: js.UndefOr[Boolean] = js.undefined,
    baseChars: String = null,
    beforeBlur: () => Unit = null,
    decimalPrecision: js.UndefOr[Double] = js.undefined,
    decimalSeparator: String = null,
    getSubmitValue: () => String = null,
    maxText: String = null,
    maxValue: js.UndefOr[Double] = js.undefined,
    minText: String = null,
    minValue: js.UndefOr[Double] = js.undefined,
    nanText: String = null,
    negativeText: String = null,
    setMaxValue: /* value */ js.UndefOr[Double] => Unit = null,
    setMinValue: /* value */ js.UndefOr[Double] => Unit = null,
    setSpinDownEnabled: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => Unit = null,
    setSpinUpEnabled: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => Unit = null,
    step: js.UndefOr[Double] = js.undefined,
    submitLocaleSeparator: js.UndefOr[Boolean] = js.undefined
  ): INumber = {
    val __obj = js.Dynamic.literal()
    if (ISpinner != null) js.Dynamic.global.Object.assign(__obj, ISpinner)
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExponential)) __obj.updateDynamic("allowExponential")(allowExponential.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStripChars)) __obj.updateDynamic("autoStripChars")(autoStripChars.get.asInstanceOf[js.Any])
    if (baseChars != null) __obj.updateDynamic("baseChars")(baseChars.asInstanceOf[js.Any])
    if (beforeBlur != null) __obj.updateDynamic("beforeBlur")(js.Any.fromFunction0(beforeBlur))
    if (!js.isUndefined(decimalPrecision)) __obj.updateDynamic("decimalPrecision")(decimalPrecision.get.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(js.Any.fromFunction0(getSubmitValue))
    if (maxText != null) __obj.updateDynamic("maxText")(maxText.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (minText != null) __obj.updateDynamic("minText")(minText.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (nanText != null) __obj.updateDynamic("nanText")(nanText.asInstanceOf[js.Any])
    if (negativeText != null) __obj.updateDynamic("negativeText")(negativeText.asInstanceOf[js.Any])
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setSpinDownEnabled != null) __obj.updateDynamic("setSpinDownEnabled")(js.Any.fromFunction2(setSpinDownEnabled))
    if (setSpinUpEnabled != null) __obj.updateDynamic("setSpinUpEnabled")(js.Any.fromFunction2(setSpinUpEnabled))
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(submitLocaleSeparator)) __obj.updateDynamic("submitLocaleSeparator")(submitLocaleSeparator.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumber]
  }
}

