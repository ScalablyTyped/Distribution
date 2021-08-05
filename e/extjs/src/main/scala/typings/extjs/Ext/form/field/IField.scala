package typings.extjs.Ext.form.field

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IField
  extends StObject
     with typings.extjs.Ext.IBase {
  
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
    * @param fn Object A function containing the transaction code
    */
  var batchChanges: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns any
    */
  var extractFileInput: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
    * @param value Object The value to get errors for (defaults to the current field value)
    * @returns any All error messages for this field; an empty Array if none.
    */
  var getErrors: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
    * @returns any A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getModelData: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the name attribute of the field
    * @returns string name The field name
    */
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the parameter s that would be included in a standard form submit for this field
    * @returns any A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getSubmitData: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the current data value of the field
    * @returns any value The field value
    */
  var getValue: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
    * @returns any True if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  var isDirty: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns whether two field values are logically equal
    * @param value1 Object The first value to compare
    * @param value2 Object The second value to compare
    * @returns any True if the values are equal, false if inequal.
    */
  var isEqual: js.UndefOr[
    js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], js.Any]
  ] = js.undefined
  
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns any
    */
  var isFileUpload: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
    * @returns any True if the value is valid, else false
    */
  var isValid: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Associate one or more error messages with this field
    * @param errors String/String[] The error message(s) for the field.
    */
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets a data value into the field and runs the change detection and validation
    * @param value Object The value to set
    * @returns any this
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Allows for any necessary modifications before the original value is set
    * @param value Object The initial value
    * @returns any The modified initial value
    */
  var transformOriginalValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
    * @returns any True if the value is valid, else false
    */
  var validate: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
}
object IField {
  
  inline def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  extension [Self <: IField](x: Self) {
    
    inline def setBatchChanges(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "batchChanges", js.Any.fromFunction1(value))
    
    inline def setBatchChangesUndefined: Self = StObject.set(x, "batchChanges", js.undefined)
    
    inline def setBeforeReset(value: () => Unit): Self = StObject.set(x, "beforeReset", js.Any.fromFunction0(value))
    
    inline def setBeforeResetUndefined: Self = StObject.set(x, "beforeReset", js.undefined)
    
    inline def setCheckChange(value: () => Unit): Self = StObject.set(x, "checkChange", js.Any.fromFunction0(value))
    
    inline def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
    
    inline def setCheckDirty(value: () => Unit): Self = StObject.set(x, "checkDirty", js.Any.fromFunction0(value))
    
    inline def setCheckDirtyUndefined: Self = StObject.set(x, "checkDirty", js.undefined)
    
    inline def setClearInvalid(value: () => Unit): Self = StObject.set(x, "clearInvalid", js.Any.fromFunction0(value))
    
    inline def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExtractFileInput(value: () => js.Any): Self = StObject.set(x, "extractFileInput", js.Any.fromFunction0(value))
    
    inline def setExtractFileInputUndefined: Self = StObject.set(x, "extractFileInput", js.undefined)
    
    inline def setGetErrors(value: /* value */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "getErrors", js.Any.fromFunction1(value))
    
    inline def setGetErrorsUndefined: Self = StObject.set(x, "getErrors", js.undefined)
    
    inline def setGetModelData(value: () => js.Any): Self = StObject.set(x, "getModelData", js.Any.fromFunction0(value))
    
    inline def setGetModelDataUndefined: Self = StObject.set(x, "getModelData", js.undefined)
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    inline def setGetSubmitData(value: () => js.Any): Self = StObject.set(x, "getSubmitData", js.Any.fromFunction0(value))
    
    inline def setGetSubmitDataUndefined: Self = StObject.set(x, "getSubmitData", js.undefined)
    
    inline def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setInitField(value: () => Unit): Self = StObject.set(x, "initField", js.Any.fromFunction0(value))
    
    inline def setInitFieldUndefined: Self = StObject.set(x, "initField", js.undefined)
    
    inline def setInitValue(value: () => Unit): Self = StObject.set(x, "initValue", js.Any.fromFunction0(value))
    
    inline def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
    
    inline def setIsDirty(value: () => js.Any): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    inline def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    inline def setIsEqual(value: (/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
    
    inline def setIsEqualUndefined: Self = StObject.set(x, "isEqual", js.undefined)
    
    inline def setIsFileUpload(value: () => js.Any): Self = StObject.set(x, "isFileUpload", js.Any.fromFunction0(value))
    
    inline def setIsFileUploadUndefined: Self = StObject.set(x, "isFileUpload", js.undefined)
    
    inline def setIsFormField(value: Boolean): Self = StObject.set(x, "isFormField", value.asInstanceOf[js.Any])
    
    inline def setIsFormFieldUndefined: Self = StObject.set(x, "isFormField", js.undefined)
    
    inline def setIsValid(value: () => js.Any): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setMarkInvalid(value: /* errors */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "markInvalid", js.Any.fromFunction1(value))
    
    inline def setMarkInvalidUndefined: Self = StObject.set(x, "markInvalid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResetOriginalValue(value: () => Unit): Self = StObject.set(x, "resetOriginalValue", js.Any.fromFunction0(value))
    
    inline def setResetOriginalValueUndefined: Self = StObject.set(x, "resetOriginalValue", js.undefined)
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetValue(value: /* value */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setSubmitValue(value: Boolean): Self = StObject.set(x, "submitValue", value.asInstanceOf[js.Any])
    
    inline def setSubmitValueUndefined: Self = StObject.set(x, "submitValue", js.undefined)
    
    inline def setTransformOriginalValue(value: /* value */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "transformOriginalValue", js.Any.fromFunction1(value))
    
    inline def setTransformOriginalValueUndefined: Self = StObject.set(x, "transformOriginalValue", js.undefined)
    
    inline def setValidate(value: () => js.Any): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    inline def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
    
    inline def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
