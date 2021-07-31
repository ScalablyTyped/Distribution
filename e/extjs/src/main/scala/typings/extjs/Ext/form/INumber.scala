package typings.extjs.Ext.form

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INumber
  extends StObject
     with typings.extjs.Ext.form.field.ISpinner {
  
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
  def apply(): INumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumber]
  }
  
  @scala.inline
  implicit class INumberMutableBuilder[Self <: INumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    @scala.inline
    def setAllowExponential(value: Boolean): Self = StObject.set(x, "allowExponential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowExponentialUndefined: Self = StObject.set(x, "allowExponential", js.undefined)
    
    @scala.inline
    def setAutoStripChars(value: Boolean): Self = StObject.set(x, "autoStripChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStripCharsUndefined: Self = StObject.set(x, "autoStripChars", js.undefined)
    
    @scala.inline
    def setBaseChars(value: String): Self = StObject.set(x, "baseChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseCharsUndefined: Self = StObject.set(x, "baseChars", js.undefined)
    
    @scala.inline
    def setBeforeBlur(value: () => Unit): Self = StObject.set(x, "beforeBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeBlurUndefined: Self = StObject.set(x, "beforeBlur", js.undefined)
    
    @scala.inline
    def setDecimalPrecision(value: Double): Self = StObject.set(x, "decimalPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalPrecisionUndefined: Self = StObject.set(x, "decimalPrecision", js.undefined)
    
    @scala.inline
    def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    @scala.inline
    def setGetSubmitValue(value: () => String): Self = StObject.set(x, "getSubmitValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubmitValueUndefined: Self = StObject.set(x, "getSubmitValue", js.undefined)
    
    @scala.inline
    def setMaxText(value: String): Self = StObject.set(x, "maxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTextUndefined: Self = StObject.set(x, "maxText", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinText(value: String): Self = StObject.set(x, "minText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTextUndefined: Self = StObject.set(x, "minText", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setNanText(value: String): Self = StObject.set(x, "nanText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanTextUndefined: Self = StObject.set(x, "nanText", js.undefined)
    
    @scala.inline
    def setNegativeText(value: String): Self = StObject.set(x, "negativeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeTextUndefined: Self = StObject.set(x, "negativeText", js.undefined)
    
    @scala.inline
    def setSetMaxValue(value: /* value */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
    
    @scala.inline
    def setSetMinValue(value: /* value */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
    
    @scala.inline
    def setSetSpinDownEnabled(value: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setSpinDownEnabled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSpinDownEnabledUndefined: Self = StObject.set(x, "setSpinDownEnabled", js.undefined)
    
    @scala.inline
    def setSetSpinUpEnabled(value: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setSpinUpEnabled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSpinUpEnabledUndefined: Self = StObject.set(x, "setSpinUpEnabled", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setSubmitLocaleSeparator(value: Boolean): Self = StObject.set(x, "submitLocaleSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitLocaleSeparatorUndefined: Self = StObject.set(x, "submitLocaleSeparator", js.undefined)
  }
}
