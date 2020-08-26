package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate */ @js.native
trait ICheckboxGroup extends IFieldContainer {
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[Boolean] = js.native
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
    * @param fn Object A function containing the transaction code
    */
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var blankText: js.UndefOr[String] = js.native
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Number/Number[]) */
  var columns: js.UndefOr[js.Any] = js.native
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns HTMLElement
    */
  var extractFileInput: js.UndefOr[js.Function0[_ | HTMLElement]] = js.native
  /** [Method] Returns an Array of all checkboxes in the container which are currently checked
    * @returns Ext.form.field.Checkbox[] Array of Ext.form.field.Checkbox components
    */
  var getChecked: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Runs CheckboxGroup s validations and returns an array of any errors
    * @returns String[] Array of all validation errors
    */
  var getErrors: js.UndefOr[js.Function0[Array] | (js.Function1[/* value */ js.UndefOr[js.Any], _])] = js.native
  /** [Method] Don t return any data for the model the form will get the info from the individual checkboxes themselves
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getModelData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the name attribute of the field
    * @returns String name The field name
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Don t return any data for submit the form will get the info from the individual checkboxes themselves
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns an object containing the values of all checked checkboxes within the group  */
  var getValue: js.UndefOr[js.Function0[_ | Unit]] = js.native
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] private override
    * @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  var isDirty: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Method] private override  the group value is a complex object compare using object serialization
    * @param value1 Object
    * @param value2 Object
    * @returns Boolean True if the values are equal, false if inequal.
    */
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _ | Boolean]] = js.native
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns Boolean
    */
  var isFileUpload: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
    * @returns Boolean True if the value is valid, else false
    */
  var isValid: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Method] Associate one or more error messages with this field
    * @param errors String/String[] The error message(s) for the field.
    */
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Method] When a checkbox is added to the group monitor it for changes
    * @param field Object
    */
  @JSName("onAdd")
  var onAdd_ICheckboxGroup: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Called when a Ext form Labelable instance is removed from the container s subtree
    * @param item Object
    */
  @JSName("onRemove")
  var onRemove_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.native
  /** [Method] Resets the checked state of all checkboxes in the group to their originally loaded values and clears any validation m  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value s of all checkboxes in the group
    * @param value Object The mapping of checkbox names to values.
    * @returns Ext.form.CheckboxGroup this
    */
  var setValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], this.type | _]] = js.native
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.native
  /** [Method] Allows for any necessary modifications before the original value is set
    * @param value Object The initial value
    * @returns Object The modified initial value
    */
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
    * @returns Boolean True if the value is valid, else false
    */
  var validate: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.native
}

object ICheckboxGroup {
  @scala.inline
  def apply(): ICheckboxGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxGroup]
  }
  @scala.inline
  implicit class ICheckboxGroupOps[Self <: ICheckboxGroup] (val x: Self) extends AnyVal {
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
    def setBatchChanges(value: js.UndefOr[js.Any] => Unit): Self = this.set("batchChanges", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBatchChanges: Self = this.set("batchChanges", js.undefined)
    @scala.inline
    def setBeforeReset(value: () => Unit): Self = this.set("beforeReset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeReset: Self = this.set("beforeReset", js.undefined)
    @scala.inline
    def setBlankText(value: String): Self = this.set("blankText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlankText: Self = this.set("blankText", js.undefined)
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
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setExtractFileInput(value: () => _ | HTMLElement): Self = this.set("extractFileInput", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExtractFileInput: Self = this.set("extractFileInput", js.undefined)
    @scala.inline
    def setGetChecked(value: () => Array): Self = this.set("getChecked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetChecked: Self = this.set("getChecked", js.undefined)
    @scala.inline
    def setGetErrorsFunction1(value: /* value */ js.UndefOr[js.Any] => _): Self = this.set("getErrors", js.Any.fromFunction1(value))
    @scala.inline
    def setGetErrorsFunction0(value: () => Array): Self = this.set("getErrors", js.Any.fromFunction0(value))
    @scala.inline
    def setGetErrors(value: js.Function0[Array] | (js.Function1[/* value */ js.UndefOr[js.Any], _])): Self = this.set("getErrors", value.asInstanceOf[js.Any])
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
    def setGetValue(value: () => _ | Unit): Self = this.set("getValue", js.Any.fromFunction0(value))
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
    def setIsDirty(value: () => _ | Boolean): Self = this.set("isDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    @scala.inline
    def setIsEqual(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => _ | Boolean): Self = this.set("isEqual", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsEqual: Self = this.set("isEqual", js.undefined)
    @scala.inline
    def setIsFileUpload(value: () => _ | Boolean): Self = this.set("isFileUpload", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsFileUpload: Self = this.set("isFileUpload", js.undefined)
    @scala.inline
    def setIsFormField(value: Boolean): Self = this.set("isFormField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFormField: Self = this.set("isFormField", js.undefined)
    @scala.inline
    def setIsValid(value: () => _ | Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    @scala.inline
    def setMarkInvalid(value: js.UndefOr[js.Any] => Unit): Self = this.set("markInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMarkInvalid: Self = this.set("markInvalid", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnAdd(value: /* field */ js.UndefOr[js.Any] => Unit): Self = this.set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setOnRemove(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
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
    def setSetValue(value: js.UndefOr[js.Any] => ICheckboxGroup | _): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    @scala.inline
    def setSubmitValue(value: Boolean): Self = this.set("submitValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitValue: Self = this.set("submitValue", js.undefined)
    @scala.inline
    def setTransformOriginalValue(value: js.UndefOr[js.Any] => _): Self = this.set("transformOriginalValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformOriginalValue: Self = this.set("transformOriginalValue", js.undefined)
    @scala.inline
    def setValidate(value: () => _ | Boolean): Self = this.set("validate", js.Any.fromFunction0(value))
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
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

