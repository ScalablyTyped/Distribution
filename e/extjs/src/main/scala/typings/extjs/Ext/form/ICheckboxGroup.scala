package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate */ trait ICheckboxGroup extends IFieldContainer {
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[Boolean] = js.undefined
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
    * @param fn Object A function containing the transaction code
    */
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
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
  var columns: js.UndefOr[js.Any] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns HTMLElement
    */
  var extractFileInput: js.UndefOr[js.Function0[_ | HTMLElement]] = js.undefined
  /** [Method] Returns an Array of all checkboxes in the container which are currently checked
    * @returns Ext.form.field.Checkbox[] Array of Ext.form.field.Checkbox components
    */
  var getChecked: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Runs CheckboxGroup s validations and returns an array of any errors
    * @returns String[] Array of all validation errors
    */
  var getErrors: js.UndefOr[js.Function0[Array] | (js.Function1[/* value */ js.UndefOr[js.Any], _])] = js.undefined
  /** [Method] Don t return any data for the model the form will get the info from the individual checkboxes themselves
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getModelData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the name attribute of the field
    * @returns String name The field name
    */
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Don t return any data for submit the form will get the info from the individual checkboxes themselves
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an object containing the values of all checked checkboxes within the group  */
  var getValue: js.UndefOr[js.Function0[_ | Unit]] = js.undefined
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] private override
    * @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  var isDirty: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Method] private override  the group value is a complex object compare using object serialization
    * @param value1 Object
    * @param value2 Object
    * @returns Boolean True if the values are equal, false if inequal.
    */
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _ | Boolean]] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns Boolean
    */
  var isFileUpload: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
    * @returns Boolean True if the value is valid, else false
    */
  var isValid: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Method] Associate one or more error messages with this field
    * @param errors String/String[] The error message(s) for the field.
    */
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Method] When a checkbox is added to the group monitor it for changes
    * @param field Object
    */
  @JSName("onAdd")
  var onAdd_ICheckboxGroup: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Called when a Ext form Labelable instance is removed from the container s subtree
    * @param item Object
    */
  @JSName("onRemove")
  var onRemove_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Resets the checked state of all checkboxes in the group to their originally loaded values and clears any validation m  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value s of all checkboxes in the group
    * @param value Object The mapping of checkbox names to values.
    * @returns Ext.form.CheckboxGroup this
    */
  var setValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], this.type | _]] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
    * @param value Object The initial value
    * @returns Object The modified initial value
    */
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
    * @returns Boolean True if the value is valid, else false
    */
  var validate: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ICheckboxGroup {
  @scala.inline
  def apply(
    IFieldContainer: IFieldContainer = null,
    allowBlank: js.UndefOr[Boolean] = js.undefined,
    batchChanges: js.UndefOr[js.Any] => Unit = null,
    beforeReset: () => Unit = null,
    blankText: String = null,
    checkChange: () => Unit = null,
    checkDirty: () => Unit = null,
    clearInvalid: () => Unit = null,
    columns: js.Any = null,
    extractFileInput: () => _ | HTMLElement = null,
    getChecked: () => Array = null,
    getErrors: js.Function0[Array] | (js.Function1[/* value */ js.UndefOr[js.Any], _]) = null,
    getModelData: () => _ = null,
    getName: () => String = null,
    getSubmitData: () => _ = null,
    getValue: () => _ | Unit = null,
    initField: () => Unit = null,
    initValue: () => Unit = null,
    isDirty: () => _ | Boolean = null,
    isEqual: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => _ | Boolean = null,
    isFileUpload: () => _ | Boolean = null,
    isFormField: js.UndefOr[Boolean] = js.undefined,
    isValid: () => _ | Boolean = null,
    markInvalid: js.UndefOr[js.Any] => Unit = null,
    name: String = null,
    onAdd: /* field */ js.UndefOr[js.Any] => Unit = null,
    onRemove: /* item */ js.UndefOr[js.Any] => Unit = null,
    originalValue: js.Any = null,
    reset: () => Unit = null,
    resetOriginalValue: () => Unit = null,
    setValue: js.UndefOr[js.Any] => ICheckboxGroup | _ = null,
    submitValue: js.UndefOr[Boolean] = js.undefined,
    transformOriginalValue: js.UndefOr[js.Any] => _ = null,
    validate: () => _ | Boolean = null,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ICheckboxGroup = {
    val __obj = js.Dynamic.literal()
    if (IFieldContainer != null) js.Dynamic.global.Object.assign(__obj, IFieldContainer)
    if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank.get.asInstanceOf[js.Any])
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(js.Any.fromFunction1(batchChanges))
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(js.Any.fromFunction0(beforeReset))
    if (blankText != null) __obj.updateDynamic("blankText")(blankText.asInstanceOf[js.Any])
    if (checkChange != null) __obj.updateDynamic("checkChange")(js.Any.fromFunction0(checkChange))
    if (checkDirty != null) __obj.updateDynamic("checkDirty")(js.Any.fromFunction0(checkDirty))
    if (clearInvalid != null) __obj.updateDynamic("clearInvalid")(js.Any.fromFunction0(clearInvalid))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (extractFileInput != null) __obj.updateDynamic("extractFileInput")(js.Any.fromFunction0(extractFileInput))
    if (getChecked != null) __obj.updateDynamic("getChecked")(js.Any.fromFunction0(getChecked))
    if (getErrors != null) __obj.updateDynamic("getErrors")(getErrors.asInstanceOf[js.Any])
    if (getModelData != null) __obj.updateDynamic("getModelData")(js.Any.fromFunction0(getModelData))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getSubmitData != null) __obj.updateDynamic("getSubmitData")(js.Any.fromFunction0(getSubmitData))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (initField != null) __obj.updateDynamic("initField")(js.Any.fromFunction0(initField))
    if (initValue != null) __obj.updateDynamic("initValue")(js.Any.fromFunction0(initValue))
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (isEqual != null) __obj.updateDynamic("isEqual")(js.Any.fromFunction2(isEqual))
    if (isFileUpload != null) __obj.updateDynamic("isFileUpload")(js.Any.fromFunction0(isFileUpload))
    if (!js.isUndefined(isFormField)) __obj.updateDynamic("isFormField")(isFormField.get.asInstanceOf[js.Any])
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(js.Any.fromFunction1(markInvalid))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(js.Any.fromFunction0(resetOriginalValue))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (!js.isUndefined(submitValue)) __obj.updateDynamic("submitValue")(submitValue.get.asInstanceOf[js.Any])
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(js.Any.fromFunction1(transformOriginalValue))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxGroup]
  }
}

