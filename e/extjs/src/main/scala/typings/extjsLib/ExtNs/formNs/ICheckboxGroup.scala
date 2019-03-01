package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.formNs.fieldNs.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate */ trait ICheckboxGroup extends IFieldContainer {
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var blankText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Number/Number[]) */
  var columns: js.UndefOr[js.Any] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  var extractFileInput: js.UndefOr[js.Function0[_ | stdLib.HTMLElement]] = js.undefined
  /** [Method] Returns an Array of all checkboxes in the container which are currently checked
  		* @returns Ext.form.field.Checkbox[] Array of Ext.form.field.Checkbox components
  		*/
  var getChecked: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Runs CheckboxGroup s validations and returns an array of any errors
  		* @returns String[] Array of all validation errors
  		*/
  var getErrors: js.UndefOr[
    js.Function0[extjsLib.ExtNs.Array] | (js.Function1[/* value */ js.UndefOr[js.Any], _])
  ] = js.undefined
  /** [Method] Don t return any data for the model the form will get the info from the individual checkboxes themselves
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the name attribute of the field
  		* @returns String name The field name
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Don t return any data for submit the form will get the info from the individual checkboxes themselves
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an object containing the values of all checked checkboxes within the group  */
  var getValue: js.UndefOr[js.Function0[_ | scala.Unit]] = js.undefined
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] private override
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Method] private override  the group value is a complex object compare using object serialization
  		* @param value1 Object
  		* @param value2 Object
  		* @returns Boolean True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[
    js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], _ | scala.Boolean]
  ] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  var isFileUpload: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
  		* @returns Boolean True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Method] Associate one or more error messages with this field
  		* @param errors String/String[] The error message(s) for the field.
  		*/
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] When a checkbox is added to the group monitor it for changes
  		* @param field Object
  		*/
  @JSName("onAdd")
  var onAdd_ICheckboxGroup: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called when a Ext form Labelable instance is removed from the container s subtree
  		* @param item Object
  		*/
  @JSName("onRemove")
  var onRemove_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Resets the checked state of all checkboxes in the group to their originally loaded values and clears any validation m  */
  var reset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value s of all checkboxes in the group
  		* @param value Object The mapping of checkbox names to values.
  		* @returns Ext.form.CheckboxGroup this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type | _]] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns Object The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns Boolean True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object ICheckboxGroup {
  @scala.inline
  def apply(
    IField: extjsLib.ExtNs.formNs.fieldNs.IField = null,
    IFieldContainer: IFieldContainer = null,
    allowBlank: js.UndefOr[scala.Boolean] = js.undefined,
    batchChanges: js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeReset: js.Function0[scala.Unit] = null,
    blankText: java.lang.String = null,
    checkChange: js.Function0[scala.Unit] = null,
    checkDirty: js.Function0[scala.Unit] = null,
    clearInvalid: js.Function0[scala.Unit] = null,
    columns: js.Any = null,
    componentCls: java.lang.String = null,
    defaultType: java.lang.String = null,
    extractFileInput: js.Function0[stdLib.HTMLElement] = null,
    getChecked: js.Function0[extjsLib.ExtNs.Array] = null,
    getErrors: js.Function0[extjsLib.ExtNs.Array] = null,
    getModelData: js.Function0[_] = null,
    getName: js.Function0[java.lang.String] = null,
    getSubmitData: js.Function0[_] = null,
    getValue: js.Function0[scala.Unit] = null,
    initField: js.Function0[scala.Unit] = null,
    initValue: js.Function0[scala.Unit] = null,
    isDirty: js.Function0[scala.Boolean] = null,
    isEqual: js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], scala.Boolean] = null,
    isFileUpload: js.Function0[scala.Boolean] = null,
    isValid: js.Function0[scala.Boolean] = null,
    items: js.Any = null,
    layout: js.Any = null,
    markInvalid: js.Function1[/* errors */ js.UndefOr[js.Any], scala.Unit] = null,
    onAdd: js.Function1[/* field */ js.UndefOr[js.Any], scala.Unit] = null,
    onRemove: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    reset: js.Function0[scala.Unit] = null,
    resetOriginalValue: js.Function0[scala.Unit] = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], ICheckboxGroup] = null,
    transformOriginalValue: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    validate: js.Function0[scala.Boolean] = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): ICheckboxGroup = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IField)
    js.Dynamic.global.Object.assign(__obj, IFieldContainer)
    if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank)
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(batchChanges)
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(beforeReset)
    if (blankText != null) __obj.updateDynamic("blankText")(blankText)
    if (checkChange != null) __obj.updateDynamic("checkChange")(checkChange)
    if (checkDirty != null) __obj.updateDynamic("checkDirty")(checkDirty)
    if (clearInvalid != null) __obj.updateDynamic("clearInvalid")(clearInvalid)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (componentCls != null) __obj.updateDynamic("componentCls")(componentCls)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (extractFileInput != null) __obj.updateDynamic("extractFileInput")(extractFileInput)
    if (getChecked != null) __obj.updateDynamic("getChecked")(getChecked)
    if (getErrors != null) __obj.updateDynamic("getErrors")(getErrors)
    if (getModelData != null) __obj.updateDynamic("getModelData")(getModelData)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getSubmitData != null) __obj.updateDynamic("getSubmitData")(getSubmitData)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (initField != null) __obj.updateDynamic("initField")(initField)
    if (initValue != null) __obj.updateDynamic("initValue")(initValue)
    if (isDirty != null) __obj.updateDynamic("isDirty")(isDirty)
    if (isEqual != null) __obj.updateDynamic("isEqual")(isEqual)
    if (isFileUpload != null) __obj.updateDynamic("isFileUpload")(isFileUpload)
    if (isValid != null) __obj.updateDynamic("isValid")(isValid)
    if (items != null) __obj.updateDynamic("items")(items)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(markInvalid)
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd)
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(resetOriginalValue)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(transformOriginalValue)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ICheckboxGroup]
  }
}

