package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate */ trait ICheckboxGroup
  extends StObject
     with IFieldContainer {
  
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
    * @param fn Object A function containing the transaction code
    */
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var blankText: js.UndefOr[String] = js.undefined
  
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String/Number/Number[]) */
  var columns: js.UndefOr[Any] = js.undefined
  
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns HTMLElement
    */
  var extractFileInput: js.UndefOr[js.Function0[Any | HTMLElement]] = js.undefined
  
  /** [Method] Returns an Array of all checkboxes in the container which are currently checked
    * @returns Ext.form.field.Checkbox[] Array of Ext.form.field.Checkbox components
    */
  var getChecked: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Runs CheckboxGroup s validations and returns an array of any errors
    * @returns String[] Array of all validation errors
    */
  var getErrors: js.UndefOr[js.Function0[Array] | (js.Function1[/* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /** [Method] Don t return any data for the model the form will get the info from the individual checkboxes themselves
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getModelData: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the name attribute of the field
    * @returns String name The field name
    */
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Don t return any data for submit the form will get the info from the individual checkboxes themselves
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getSubmitData: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns an object containing the values of all checked checkboxes within the group  */
  var getValue: js.UndefOr[js.Function0[Any | Unit]] = js.undefined
  
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] private override
    * @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  var isDirty: js.UndefOr[js.Function0[Any | Boolean]] = js.undefined
  
  /** [Method] private override  the group value is a complex object compare using object serialization
    * @param value1 Object
    * @param value2 Object
    * @returns Boolean True if the values are equal, false if inequal.
    */
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[Any], js.UndefOr[Any], Any | Boolean]] = js.undefined
  
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns Boolean
    */
  var isFileUpload: js.UndefOr[js.Function0[Any | Boolean]] = js.undefined
  
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
    * @returns Boolean True if the value is valid, else false
    */
  var isValid: js.UndefOr[js.Function0[Any | Boolean]] = js.undefined
  
  /** [Method] Associate one or more error messages with this field
    * @param errors String/String[] The error message(s) for the field.
    */
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Method] When a checkbox is added to the group monitor it for changes
    * @param field Object
    */
  @JSName("onAdd")
  var onAdd_ICheckboxGroup: js.UndefOr[js.Function1[/* field */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Called when a Ext form Labelable instance is removed from the container s subtree
    * @param item Object
    */
  @JSName("onRemove")
  var onRemove_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Property] (Object) */
  var originalValue: js.UndefOr[Any] = js.undefined
  
  /** [Method] Resets the checked state of all checkboxes in the group to their originally loaded values and clears any validation m  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the value s of all checkboxes in the group
    * @param value Object The mapping of checkbox names to values.
    * @returns Ext.form.CheckboxGroup this
    */
  var setValue: js.UndefOr[js.Function1[js.UndefOr[Any], this.type | Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Allows for any necessary modifications before the original value is set
    * @param value Object The initial value
    * @returns Object The modified initial value
    */
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
    * @returns Boolean True if the value is valid, else false
    */
  var validate: js.UndefOr[js.Function0[Any | Boolean]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var value: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object ICheckboxGroup {
  
  inline def apply(): ICheckboxGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxGroup]
  }
  
  extension [Self <: ICheckboxGroup](x: Self) {
    
    inline def setAllowBlank(value: Boolean): Self = StObject.set(x, "allowBlank", value.asInstanceOf[js.Any])
    
    inline def setAllowBlankUndefined: Self = StObject.set(x, "allowBlank", js.undefined)
    
    inline def setBatchChanges(value: js.UndefOr[Any] => Unit): Self = StObject.set(x, "batchChanges", js.Any.fromFunction1(value))
    
    inline def setBatchChangesUndefined: Self = StObject.set(x, "batchChanges", js.undefined)
    
    inline def setBeforeReset(value: () => Unit): Self = StObject.set(x, "beforeReset", js.Any.fromFunction0(value))
    
    inline def setBeforeResetUndefined: Self = StObject.set(x, "beforeReset", js.undefined)
    
    inline def setBlankText(value: String): Self = StObject.set(x, "blankText", value.asInstanceOf[js.Any])
    
    inline def setBlankTextUndefined: Self = StObject.set(x, "blankText", js.undefined)
    
    inline def setCheckChange(value: () => Unit): Self = StObject.set(x, "checkChange", js.Any.fromFunction0(value))
    
    inline def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
    
    inline def setCheckDirty(value: () => Unit): Self = StObject.set(x, "checkDirty", js.Any.fromFunction0(value))
    
    inline def setCheckDirtyUndefined: Self = StObject.set(x, "checkDirty", js.undefined)
    
    inline def setClearInvalid(value: () => Unit): Self = StObject.set(x, "clearInvalid", js.Any.fromFunction0(value))
    
    inline def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
    
    inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setExtractFileInput(value: () => Any | HTMLElement): Self = StObject.set(x, "extractFileInput", js.Any.fromFunction0(value))
    
    inline def setExtractFileInputUndefined: Self = StObject.set(x, "extractFileInput", js.undefined)
    
    inline def setGetChecked(value: () => Array): Self = StObject.set(x, "getChecked", js.Any.fromFunction0(value))
    
    inline def setGetCheckedUndefined: Self = StObject.set(x, "getChecked", js.undefined)
    
    inline def setGetErrors(value: js.Function0[Array] | (js.Function1[/* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "getErrors", value.asInstanceOf[js.Any])
    
    inline def setGetErrorsFunction0(value: () => Array): Self = StObject.set(x, "getErrors", js.Any.fromFunction0(value))
    
    inline def setGetErrorsFunction1(value: /* value */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getErrors", js.Any.fromFunction1(value))
    
    inline def setGetErrorsUndefined: Self = StObject.set(x, "getErrors", js.undefined)
    
    inline def setGetModelData(value: () => Any): Self = StObject.set(x, "getModelData", js.Any.fromFunction0(value))
    
    inline def setGetModelDataUndefined: Self = StObject.set(x, "getModelData", js.undefined)
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    inline def setGetSubmitData(value: () => Any): Self = StObject.set(x, "getSubmitData", js.Any.fromFunction0(value))
    
    inline def setGetSubmitDataUndefined: Self = StObject.set(x, "getSubmitData", js.undefined)
    
    inline def setGetValue(value: () => Any | Unit): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setInitField(value: () => Unit): Self = StObject.set(x, "initField", js.Any.fromFunction0(value))
    
    inline def setInitFieldUndefined: Self = StObject.set(x, "initField", js.undefined)
    
    inline def setInitValue(value: () => Unit): Self = StObject.set(x, "initValue", js.Any.fromFunction0(value))
    
    inline def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
    
    inline def setIsDirty(value: () => Any | Boolean): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    inline def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    inline def setIsEqual(value: (js.UndefOr[Any], js.UndefOr[Any]) => Any | Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
    
    inline def setIsEqualUndefined: Self = StObject.set(x, "isEqual", js.undefined)
    
    inline def setIsFileUpload(value: () => Any | Boolean): Self = StObject.set(x, "isFileUpload", js.Any.fromFunction0(value))
    
    inline def setIsFileUploadUndefined: Self = StObject.set(x, "isFileUpload", js.undefined)
    
    inline def setIsFormField(value: Boolean): Self = StObject.set(x, "isFormField", value.asInstanceOf[js.Any])
    
    inline def setIsFormFieldUndefined: Self = StObject.set(x, "isFormField", js.undefined)
    
    inline def setIsValid(value: () => Any | Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setMarkInvalid(value: js.UndefOr[Any] => Unit): Self = StObject.set(x, "markInvalid", js.Any.fromFunction1(value))
    
    inline def setMarkInvalidUndefined: Self = StObject.set(x, "markInvalid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnAdd(value: /* field */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnRemove(value: /* item */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResetOriginalValue(value: () => Unit): Self = StObject.set(x, "resetOriginalValue", js.Any.fromFunction0(value))
    
    inline def setResetOriginalValueUndefined: Self = StObject.set(x, "resetOriginalValue", js.undefined)
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetValue(value: js.UndefOr[Any] => ICheckboxGroup | Any): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setSubmitValue(value: Boolean): Self = StObject.set(x, "submitValue", value.asInstanceOf[js.Any])
    
    inline def setSubmitValueUndefined: Self = StObject.set(x, "submitValue", js.undefined)
    
    inline def setTransformOriginalValue(value: js.UndefOr[Any] => Any): Self = StObject.set(x, "transformOriginalValue", js.Any.fromFunction1(value))
    
    inline def setTransformOriginalValueUndefined: Self = StObject.set(x, "transformOriginalValue", js.undefined)
    
    inline def setValidate(value: () => Any | Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    inline def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
    
    inline def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
