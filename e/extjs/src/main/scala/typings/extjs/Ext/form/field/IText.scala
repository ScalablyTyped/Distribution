package typings.extjs.Ext.form.field

import typings.extjs.Ext.Array
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IText extends IBase {
  
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var allowOnlyWhitespace: js.UndefOr[Boolean] = js.native
  
  /** [Method] Automatically grows the field to accomodate the width of the text up to the maximum field width allowed  */
  var autoSize: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] private */
  @JSName("beforeFocus")
  var beforeFocus_IText: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var blankText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var disableKeyFilter: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var emptyCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var enableKeyEvents: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var enforceMaxLength: js.UndefOr[Boolean] = js.native
  
  /** [Method] Validates a value according to the field s validation rules and returns an array of errors for any failing validations
    * @param value Object The value to validate. The processed raw value will be used if nothing is passed.
    * @returns String[] Array of any validation errors
    */
  @JSName("getErrors")
  var getErrors_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Array]] = js.native
  
  /** [Method] Returns the raw String value of the field without performing any normalization conversion or validation
    * @returns String The raw String value of the field
    */
  @JSName("getRawValue")
  var getRawValue_IText: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Boolean) */
  var grow: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var growAppend: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var growMax: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var growMin: js.UndefOr[Double] = js.native
  
  /** [Config Option] (RegExp) */
  var maskRe: js.UndefOr[RegExp] = js.native
  
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var maxLengthText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var minLength: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var minLengthText: js.UndefOr[String] = js.native
  
  /** [Method] private */
  @JSName("postBlur")
  var postBlur_IText: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Performs any necessary manipulation of a raw String value to prepare it for conversion and or validation
    * @param value String The unprocessed string value
    * @returns String The processed string value
    */
  @JSName("processRawValue")
  var processRawValue_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], String]] = js.native
  
  /** [Config Option] (RegExp) */
  var regex: js.UndefOr[RegExp] = js.native
  
  /** [Config Option] (String) */
  var regexText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var requiredCls: js.UndefOr[String] = js.native
  
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  @JSName("reset")
  var reset_IText: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var selectOnFocus: js.UndefOr[Boolean] = js.native
  
  /** [Method] Selects text in this field
    * @param start Number The index where the selection should start
    * @param end Number The index where the selection should end (defaults to the text length)
    */
  var selectText: js.UndefOr[js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets a data value into the field and runs the change detection and validation
    * @param value Object The value to set
    * @returns any this
    */
  @JSName("setValue")
  var setValue_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Config Option] (Number) */
  var size: js.UndefOr[Double] = js.native
  
  /** [Config Option] (RegExp) */
  var stripCharsRe: js.UndefOr[RegExp] = js.native
  
  /** [Config Option] (Boolean) */
  var validateBlank: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Function) */
  var validator: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var vtype: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var vtypeText: js.UndefOr[String] = js.native
}
object IText {
  
  @scala.inline
  def apply(): IText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IText]
  }
  
  @scala.inline
  implicit class ITextMutableBuilder[Self <: IText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowBlank(value: Boolean): Self = StObject.set(x, "allowBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowBlankUndefined: Self = StObject.set(x, "allowBlank", js.undefined)
    
    @scala.inline
    def setAllowOnlyWhitespace(value: Boolean): Self = StObject.set(x, "allowOnlyWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOnlyWhitespaceUndefined: Self = StObject.set(x, "allowOnlyWhitespace", js.undefined)
    
    @scala.inline
    def setAutoSize(value: () => Unit): Self = StObject.set(x, "autoSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    @scala.inline
    def setBeforeFocus(value: () => Unit): Self = StObject.set(x, "beforeFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeFocusUndefined: Self = StObject.set(x, "beforeFocus", js.undefined)
    
    @scala.inline
    def setBlankText(value: String): Self = StObject.set(x, "blankText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlankTextUndefined: Self = StObject.set(x, "blankText", js.undefined)
    
    @scala.inline
    def setDisableKeyFilter(value: Boolean): Self = StObject.set(x, "disableKeyFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableKeyFilterUndefined: Self = StObject.set(x, "disableKeyFilter", js.undefined)
    
    @scala.inline
    def setEmptyCls(value: String): Self = StObject.set(x, "emptyCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyClsUndefined: Self = StObject.set(x, "emptyCls", js.undefined)
    
    @scala.inline
    def setEmptyText(value: String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
    
    @scala.inline
    def setEnableKeyEvents(value: Boolean): Self = StObject.set(x, "enableKeyEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableKeyEventsUndefined: Self = StObject.set(x, "enableKeyEvents", js.undefined)
    
    @scala.inline
    def setEnforceMaxLength(value: Boolean): Self = StObject.set(x, "enforceMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceMaxLengthUndefined: Self = StObject.set(x, "enforceMaxLength", js.undefined)
    
    @scala.inline
    def setGetErrors(value: /* value */ js.UndefOr[js.Any] => Array): Self = StObject.set(x, "getErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetErrorsUndefined: Self = StObject.set(x, "getErrors", js.undefined)
    
    @scala.inline
    def setGetRawValue(value: () => String): Self = StObject.set(x, "getRawValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawValueUndefined: Self = StObject.set(x, "getRawValue", js.undefined)
    
    @scala.inline
    def setGrow(value: Boolean): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowAppend(value: String): Self = StObject.set(x, "growAppend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowAppendUndefined: Self = StObject.set(x, "growAppend", js.undefined)
    
    @scala.inline
    def setGrowMax(value: Double): Self = StObject.set(x, "growMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowMaxUndefined: Self = StObject.set(x, "growMax", js.undefined)
    
    @scala.inline
    def setGrowMin(value: Double): Self = StObject.set(x, "growMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowMinUndefined: Self = StObject.set(x, "growMin", js.undefined)
    
    @scala.inline
    def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
    
    @scala.inline
    def setMaskRe(value: RegExp): Self = StObject.set(x, "maskRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskReUndefined: Self = StObject.set(x, "maskRe", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthText(value: String): Self = StObject.set(x, "maxLengthText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthTextUndefined: Self = StObject.set(x, "maxLengthText", js.undefined)
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthText(value: String): Self = StObject.set(x, "minLengthText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthTextUndefined: Self = StObject.set(x, "minLengthText", js.undefined)
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setPostBlur(value: () => Unit): Self = StObject.set(x, "postBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostBlurUndefined: Self = StObject.set(x, "postBlur", js.undefined)
    
    @scala.inline
    def setProcessRawValue(value: /* value */ js.UndefOr[String] => String): Self = StObject.set(x, "processRawValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcessRawValueUndefined: Self = StObject.set(x, "processRawValue", js.undefined)
    
    @scala.inline
    def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexText(value: String): Self = StObject.set(x, "regexText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexTextUndefined: Self = StObject.set(x, "regexText", js.undefined)
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setRequiredCls(value: String): Self = StObject.set(x, "requiredCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredClsUndefined: Self = StObject.set(x, "requiredCls", js.undefined)
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSelectOnFocus(value: Boolean): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
    
    @scala.inline
    def setSelectText(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "selectText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectTextUndefined: Self = StObject.set(x, "selectText", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStripCharsRe(value: RegExp): Self = StObject.set(x, "stripCharsRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripCharsReUndefined: Self = StObject.set(x, "stripCharsRe", js.undefined)
    
    @scala.inline
    def setValidateBlank(value: Boolean): Self = StObject.set(x, "validateBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateBlankUndefined: Self = StObject.set(x, "validateBlank", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Any): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    @scala.inline
    def setVtype(value: String): Self = StObject.set(x, "vtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVtypeText(value: String): Self = StObject.set(x, "vtypeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVtypeTextUndefined: Self = StObject.set(x, "vtypeText", js.undefined)
    
    @scala.inline
    def setVtypeUndefined: Self = StObject.set(x, "vtype", js.undefined)
  }
}
