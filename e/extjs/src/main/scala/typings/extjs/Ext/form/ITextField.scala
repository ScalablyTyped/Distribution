package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.extjs.Ext.form.field.IBase
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextField extends IBase {
  
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var allowOnlyWhitespace: js.UndefOr[Boolean] = js.native
  
  /** [Method] Automatically grows the field to accomodate the width of the text up to the maximum field width allowed  */
  var autoSize: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] private */
  @JSName("beforeFocus")
  var beforeFocus_ITextField: js.UndefOr[js.Function0[Unit]] = js.native
  
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
  var getErrors_ITextField: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Array]] = js.native
  
  /** [Method] Returns the raw String value of the field without performing any normalization conversion or validation
    * @returns String The raw String value of the field
    */
  @JSName("getRawValue")
  var getRawValue_ITextField: js.UndefOr[js.Function0[String]] = js.native
  
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
  var postBlur_ITextField: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Performs any necessary manipulation of a raw String value to prepare it for conversion and or validation
    * @param value String The unprocessed string value
    * @returns String The processed string value
    */
  @JSName("processRawValue")
  var processRawValue_ITextField: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], String]] = js.native
  
  /** [Config Option] (RegExp) */
  var regex: js.UndefOr[RegExp] = js.native
  
  /** [Config Option] (String) */
  var regexText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var requiredCls: js.UndefOr[String] = js.native
  
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  @JSName("reset")
  var reset_ITextField: js.UndefOr[js.Function0[Unit]] = js.native
  
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
  var setValue_ITextField: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  
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
object ITextField {
  
  @scala.inline
  def apply(): ITextField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextField]
  }
  
  @scala.inline
  implicit class ITextFieldOps[Self <: ITextField] (val x: Self) extends AnyVal {
    
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
    def setAllowBlank(value: Boolean): Self = this.set("allowBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowBlank: Self = this.set("allowBlank", js.undefined)
    
    @scala.inline
    def setAllowOnlyWhitespace(value: Boolean): Self = this.set("allowOnlyWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOnlyWhitespace: Self = this.set("allowOnlyWhitespace", js.undefined)
    
    @scala.inline
    def setAutoSize(value: () => Unit): Self = this.set("autoSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAutoSize: Self = this.set("autoSize", js.undefined)
    
    @scala.inline
    def setBeforeFocus(value: () => Unit): Self = this.set("beforeFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeFocus: Self = this.set("beforeFocus", js.undefined)
    
    @scala.inline
    def setBlankText(value: String): Self = this.set("blankText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlankText: Self = this.set("blankText", js.undefined)
    
    @scala.inline
    def setDisableKeyFilter(value: Boolean): Self = this.set("disableKeyFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableKeyFilter: Self = this.set("disableKeyFilter", js.undefined)
    
    @scala.inline
    def setEmptyCls(value: String): Self = this.set("emptyCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyCls: Self = this.set("emptyCls", js.undefined)
    
    @scala.inline
    def setEmptyText(value: String): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
    
    @scala.inline
    def setEnableKeyEvents(value: Boolean): Self = this.set("enableKeyEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableKeyEvents: Self = this.set("enableKeyEvents", js.undefined)
    
    @scala.inline
    def setEnforceMaxLength(value: Boolean): Self = this.set("enforceMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceMaxLength: Self = this.set("enforceMaxLength", js.undefined)
    
    @scala.inline
    def setGetErrors(value: /* value */ js.UndefOr[js.Any] => Array): Self = this.set("getErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetErrors: Self = this.set("getErrors", js.undefined)
    
    @scala.inline
    def setGetRawValue(value: () => String): Self = this.set("getRawValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRawValue: Self = this.set("getRawValue", js.undefined)
    
    @scala.inline
    def setGrow(value: Boolean): Self = this.set("grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrow: Self = this.set("grow", js.undefined)
    
    @scala.inline
    def setGrowAppend(value: String): Self = this.set("growAppend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowAppend: Self = this.set("growAppend", js.undefined)
    
    @scala.inline
    def setGrowMax(value: Double): Self = this.set("growMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowMax: Self = this.set("growMax", js.undefined)
    
    @scala.inline
    def setGrowMin(value: Double): Self = this.set("growMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowMin: Self = this.set("growMin", js.undefined)
    
    @scala.inline
    def setMaskRe(value: RegExp): Self = this.set("maskRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskRe: Self = this.set("maskRe", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMaxLengthText(value: String): Self = this.set("maxLengthText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLengthText: Self = this.set("maxLengthText", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setMinLengthText(value: String): Self = this.set("minLengthText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLengthText: Self = this.set("minLengthText", js.undefined)
    
    @scala.inline
    def setPostBlur(value: () => Unit): Self = this.set("postBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePostBlur: Self = this.set("postBlur", js.undefined)
    
    @scala.inline
    def setProcessRawValue(value: /* value */ js.UndefOr[String] => String): Self = this.set("processRawValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProcessRawValue: Self = this.set("processRawValue", js.undefined)
    
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setRegexText(value: String): Self = this.set("regexText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexText: Self = this.set("regexText", js.undefined)
    
    @scala.inline
    def setRequiredCls(value: String): Self = this.set("requiredCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredCls: Self = this.set("requiredCls", js.undefined)
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setSelectOnFocus(value: Boolean): Self = this.set("selectOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOnFocus: Self = this.set("selectOnFocus", js.undefined)
    
    @scala.inline
    def setSelectText(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Unit): Self = this.set("selectText", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelectText: Self = this.set("selectText", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStripCharsRe(value: RegExp): Self = this.set("stripCharsRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripCharsRe: Self = this.set("stripCharsRe", js.undefined)
    
    @scala.inline
    def setValidateBlank(value: Boolean): Self = this.set("validateBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateBlank: Self = this.set("validateBlank", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Any): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
    
    @scala.inline
    def setVtype(value: String): Self = this.set("vtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVtype: Self = this.set("vtype", js.undefined)
    
    @scala.inline
    def setVtypeText(value: String): Self = this.set("vtypeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVtypeText: Self = this.set("vtypeText", js.undefined)
  }
}
