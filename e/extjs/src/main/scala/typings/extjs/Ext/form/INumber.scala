package typings.extjs.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumber
  extends typings.extjs.Ext.form.field.ISpinner {
  /** [Config Option] (Boolean) */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowExponential: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoStripChars: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var baseChars: js.UndefOr[String] = js.native
  /** [Method] Template method to do any pre blur processing  */
  @JSName("beforeBlur")
  var beforeBlur_INumber: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var decimalPrecision: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var decimalSeparator: js.UndefOr[String] = js.native
  /** [Method] Returns the value that would be included in a standard form submit for this field
    * @returns String The value to be submitted, or null.
    */
  @JSName("getSubmitValue")
  var getSubmitValue_INumber: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var nanText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var negativeText: js.UndefOr[String] = js.native
  /** [Method] Replaces any existing maxValue with the new value
    * @param value Number The maximum value
    */
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Replaces any existing minValue with the new value
    * @param value Number The minimum value
    */
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets whether the spinner down button is enabled
    * @param enabled Object
    * @param internal Object
    */
  @JSName("setSpinDownEnabled")
  var setSpinDownEnabled_INumber: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets whether the spinner up button is enabled
    * @param enabled Object
    * @param internal Object
    */
  @JSName("setSpinUpEnabled")
  var setSpinUpEnabled_INumber: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Number) */
  var step: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var submitLocaleSeparator: js.UndefOr[Boolean] = js.native
}

object INumber {
  @scala.inline
  def apply(): INumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumber]
  }
  @scala.inline
  implicit class INumberOps[Self <: INumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDecimals(value: Boolean): Self = this.set("allowDecimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDecimals: Self = this.set("allowDecimals", js.undefined)
    @scala.inline
    def setAllowExponential(value: Boolean): Self = this.set("allowExponential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExponential: Self = this.set("allowExponential", js.undefined)
    @scala.inline
    def setAutoStripChars(value: Boolean): Self = this.set("autoStripChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoStripChars: Self = this.set("autoStripChars", js.undefined)
    @scala.inline
    def setBaseChars(value: String): Self = this.set("baseChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseChars: Self = this.set("baseChars", js.undefined)
    @scala.inline
    def setBeforeBlur(value: () => Unit): Self = this.set("beforeBlur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeBlur: Self = this.set("beforeBlur", js.undefined)
    @scala.inline
    def setDecimalPrecision(value: Double): Self = this.set("decimalPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalPrecision: Self = this.set("decimalPrecision", js.undefined)
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    @scala.inline
    def setGetSubmitValue(value: () => String): Self = this.set("getSubmitValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSubmitValue: Self = this.set("getSubmitValue", js.undefined)
    @scala.inline
    def setMaxText(value: String): Self = this.set("maxText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxText: Self = this.set("maxText", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinText(value: String): Self = this.set("minText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinText: Self = this.set("minText", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setNanText(value: String): Self = this.set("nanText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNanText: Self = this.set("nanText", js.undefined)
    @scala.inline
    def setNegativeText(value: String): Self = this.set("negativeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeText: Self = this.set("negativeText", js.undefined)
    @scala.inline
    def setSetMaxValue(value: /* value */ js.UndefOr[Double] => Unit): Self = this.set("setMaxValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxValue: Self = this.set("setMaxValue", js.undefined)
    @scala.inline
    def setSetMinValue(value: /* value */ js.UndefOr[Double] => Unit): Self = this.set("setMinValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinValue: Self = this.set("setMinValue", js.undefined)
    @scala.inline
    def setSetSpinDownEnabled(value: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => Unit): Self = this.set("setSpinDownEnabled", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetSpinDownEnabled: Self = this.set("setSpinDownEnabled", js.undefined)
    @scala.inline
    def setSetSpinUpEnabled(value: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => Unit): Self = this.set("setSpinUpEnabled", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetSpinUpEnabled: Self = this.set("setSpinUpEnabled", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setSubmitLocaleSeparator(value: Boolean): Self = this.set("submitLocaleSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitLocaleSeparator: Self = this.set("submitLocaleSeparator", js.undefined)
  }
  
}

