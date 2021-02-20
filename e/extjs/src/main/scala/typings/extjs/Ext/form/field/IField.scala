package typings.extjs.Ext.form.field

import org.scalablytyped.runtime.StObject
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
  implicit class IFieldMutableBuilder[Self <: IField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchChanges(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "batchChanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBatchChangesUndefined: Self = StObject.set(x, "batchChanges", js.undefined)
    
    @scala.inline
    def setBeforeReset(value: () => Unit): Self = StObject.set(x, "beforeReset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeResetUndefined: Self = StObject.set(x, "beforeReset", js.undefined)
    
    @scala.inline
    def setCheckChange(value: () => Unit): Self = StObject.set(x, "checkChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
    
    @scala.inline
    def setCheckDirty(value: () => Unit): Self = StObject.set(x, "checkDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckDirtyUndefined: Self = StObject.set(x, "checkDirty", js.undefined)
    
    @scala.inline
    def setClearInvalid(value: () => Unit): Self = StObject.set(x, "clearInvalid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExtractFileInput(value: () => _): Self = StObject.set(x, "extractFileInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtractFileInputUndefined: Self = StObject.set(x, "extractFileInput", js.undefined)
    
    @scala.inline
    def setGetErrors(value: /* value */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetErrorsUndefined: Self = StObject.set(x, "getErrors", js.undefined)
    
    @scala.inline
    def setGetModelData(value: () => _): Self = StObject.set(x, "getModelData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModelDataUndefined: Self = StObject.set(x, "getModelData", js.undefined)
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    @scala.inline
    def setGetSubmitData(value: () => _): Self = StObject.set(x, "getSubmitData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubmitDataUndefined: Self = StObject.set(x, "getSubmitData", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => _): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setInitField(value: () => Unit): Self = StObject.set(x, "initField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitFieldUndefined: Self = StObject.set(x, "initField", js.undefined)
    
    @scala.inline
    def setInitValue(value: () => Unit): Self = StObject.set(x, "initValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
    
    @scala.inline
    def setIsDirty(value: () => _): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    @scala.inline
    def setIsEqual(value: (/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsEqualUndefined: Self = StObject.set(x, "isEqual", js.undefined)
    
    @scala.inline
    def setIsFileUpload(value: () => _): Self = StObject.set(x, "isFileUpload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFileUploadUndefined: Self = StObject.set(x, "isFileUpload", js.undefined)
    
    @scala.inline
    def setIsFormField(value: Boolean): Self = StObject.set(x, "isFormField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFormFieldUndefined: Self = StObject.set(x, "isFormField", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => _): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setMarkInvalid(value: /* errors */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "markInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarkInvalidUndefined: Self = StObject.set(x, "markInvalid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetOriginalValue(value: () => Unit): Self = StObject.set(x, "resetOriginalValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetOriginalValueUndefined: Self = StObject.set(x, "resetOriginalValue", js.undefined)
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setSubmitValue(value: Boolean): Self = StObject.set(x, "submitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitValueUndefined: Self = StObject.set(x, "submitValue", js.undefined)
    
    @scala.inline
    def setTransformOriginalValue(value: /* value */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "transformOriginalValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformOriginalValueUndefined: Self = StObject.set(x, "transformOriginalValue", js.undefined)
    
    @scala.inline
    def setValidate(value: () => _): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
