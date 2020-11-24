package typings.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IField
  extends typings.extjs.Ext.IBase {
  
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
    * @param fn Object A function containing the transaction code
    */
  var batchChanges: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns any
    */
  var extractFileInput: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
    * @param value Object The value to get errors for (defaults to the current field value)
    * @returns any All error messages for this field; an empty Array if none.
    */
  var getErrors: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
    * @returns any A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getModelData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the name attribute of the field
    * @returns string name The field name
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the parameter s that would be included in a standard form submit for this field
    * @returns any A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the current data value of the field
    * @returns any value The field value
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
    * @returns any True if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  var isDirty: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns whether two field values are logically equal
    * @param value1 Object The first value to compare
    * @param value2 Object The second value to compare
    * @returns any True if the values are equal, false if inequal.
    */
  var isEqual: js.UndefOr[
    js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], _]
  ] = js.native
  
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns any
    */
  var isFileUpload: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
    * @returns any True if the value is valid, else false
    */
  var isValid: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Associate one or more error messages with this field
    * @param errors String/String[] The error message(s) for the field.
    */
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.native
  
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets a data value into the field and runs the change detection and validation
    * @param value Object The value to set
    * @returns any this
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.native
  
  /** [Method] Allows for any necessary modifications before the original value is set
    * @param value Object The initial value
    * @returns any The modified initial value
    */
  var transformOriginalValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
    * @returns any True if the value is valid, else false
    */
  var validate: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.native
}
object IField {
  
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
    
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
    def setBatchChanges(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = this.set("batchChanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBatchChanges: Self = this.set("batchChanges", js.undefined)
    
    @scala.inline
    def setBeforeReset(value: () => Unit): Self = this.set("beforeReset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeReset: Self = this.set("beforeReset", js.undefined)
    
    @scala.inline
    def setCheckChange(value: () => Unit): Self = this.set("checkChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCheckChange: Self = this.set("checkChange", js.undefined)
    
    @scala.inline
    def setCheckDirty(value: () => Unit): Self = this.set("checkDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCheckDirty: Self = this.set("checkDirty", js.undefined)
    
    @scala.inline
    def setClearInvalid(value: () => Unit): Self = this.set("clearInvalid", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClearInvalid: Self = this.set("clearInvalid", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExtractFileInput(value: () => _): Self = this.set("extractFileInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteExtractFileInput: Self = this.set("extractFileInput", js.undefined)
    
    @scala.inline
    def setGetErrors(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("getErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetErrors: Self = this.set("getErrors", js.undefined)
    
    @scala.inline
    def setGetModelData(value: () => _): Self = this.set("getModelData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetModelData: Self = this.set("getModelData", js.undefined)
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    
    @scala.inline
    def setGetSubmitData(value: () => _): Self = this.set("getSubmitData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSubmitData: Self = this.set("getSubmitData", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setInitField(value: () => Unit): Self = this.set("initField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitField: Self = this.set("initField", js.undefined)
    
    @scala.inline
    def setInitValue(value: () => Unit): Self = this.set("initValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitValue: Self = this.set("initValue", js.undefined)
    
    @scala.inline
    def setIsDirty(value: () => _): Self = this.set("isDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    
    @scala.inline
    def setIsEqual(value: (/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any]) => _): Self = this.set("isEqual", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsEqual: Self = this.set("isEqual", js.undefined)
    
    @scala.inline
    def setIsFileUpload(value: () => _): Self = this.set("isFileUpload", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsFileUpload: Self = this.set("isFileUpload", js.undefined)
    
    @scala.inline
    def setIsFormField(value: Boolean): Self = this.set("isFormField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFormField: Self = this.set("isFormField", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => _): Self = this.set("isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    
    @scala.inline
    def setMarkInvalid(value: /* errors */ js.UndefOr[js.Any] => Unit): Self = this.set("markInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMarkInvalid: Self = this.set("markInvalid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOriginalValue(value: js.Any): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalValue: Self = this.set("originalValue", js.undefined)
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setResetOriginalValue(value: () => Unit): Self = this.set("resetOriginalValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResetOriginalValue: Self = this.set("resetOriginalValue", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setSubmitValue(value: Boolean): Self = this.set("submitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitValue: Self = this.set("submitValue", js.undefined)
    
    @scala.inline
    def setTransformOriginalValue(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("transformOriginalValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformOriginalValue: Self = this.set("transformOriginalValue", js.undefined)
    
    @scala.inline
    def setValidate(value: () => _): Self = this.set("validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValidateOnChange(value: Boolean): Self = this.set("validateOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnChange: Self = this.set("validateOnChange", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
