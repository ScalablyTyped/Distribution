package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.formNs.fieldNs.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate- extjsLib.ExtNs.formNs.ILabelable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined activeError, activeErrorsTpl, afterBodyEl, afterLabelTextTpl, afterLabelTpl, afterSubTpl, autoFitErrors, baseBodyCls, beforeBodyEl, beforeLabelTextTpl, beforeLabelTpl, beforeSubTpl, clearCls, errorMsgCls, fieldBodyCls, fieldLabel, formItemCls, hideEmptyLabel, hideLabel, invalidCls, labelAlign, labelAttrTpl, labelCls, labelClsExtra, labelPad, labelSeparator, labelStyle, labelWidth, msgTarget, preventMark, bodyEl, errorEl, isFieldLabelable, labelCell, labelEl, getActiveError, getActiveErrors, getFieldLabel, getInputId, getLabelWidth, getLabelableRenderData, getSubTplMarkup, hasActiveError, hasVisibleLabel, initLabelable, setActiveError, setActiveErrors, setFieldDefaults, setFieldLabel, trimLabelSeparator, unsetActiveError */ trait IBaseField
  extends extjsLib.ExtNs.IComponent {
  /** [Config Option] (String) */
  var activeError: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var activeErrorsTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBodyEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterSubTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var autoFitErrors: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var baseBodyCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBodyEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeSubTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Ext.Element) */
  var bodyEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var checkChangeBuffer: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String[]) */
  var checkChangeEvents: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var clearCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var dirtyCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  var extractFileInput: js.UndefOr[js.Function0[_ | stdLib.HTMLElement]] = js.undefined
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var fieldCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var fieldStyle: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var formItemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Gets the active error message for this component if any
  		* @returns String The active error message on the component; if there is no error, an empty string is returned.
  		*/
  var getActiveError: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets an Array of any active error messages currently applied to the field
  		* @returns String[] The active error messages on the component; if there are no errors, an empty Array is returned.
  		*/
  var getActiveErrors: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
  		* @param value Object The value to get errors for (defaults to the current field value)
  		* @returns String[] All error messages for this field; an empty Array if none.
  		*/
  var getErrors: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _ | extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the label for the field
  		* @returns String The configured field label, or empty string if not defined
  		*/
  var getFieldLabel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Get the input id if any for this component
  		* @returns String The input id
  		*/
  var getInputId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets the width of the label if visible
  		* @returns Number The label width
  		*/
  var getLabelWidth: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Generates the arguments for the field decorations rendering template
  		* @returns Object The template arguments
  		*/
  var getLabelableRenderData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the name attribute of the field
  		* @returns String name The field name
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the raw value of the field without performing any normalization conversion or validation
  		* @returns any value The raw String value of the field
  		*/
  var getRawValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Creates and returns the data object to be used when rendering the fieldSubTpl
  		* @returns Object The template data
  		*/
  var getSubTplData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the markup to be inserted into the outer template s bodyEl
  		* @returns String The markup to be inserted
  		*/
  var getSubTplMarkup: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] private override to use getSubmitValue  as a convenience
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value that would be included in a standard form submit for this field
  		* @returns any The value to be submitted, or null.
  		*/
  var getSubmitValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the current data value of the field
  		* @returns Object value The field value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Tells whether the field currently has an active error message
  		* @returns Boolean
  		*/
  var hasActiveError: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Checks if the field has a visible label
  		* @returns Boolean True if the field has a visible label
  		*/
  var hasVisibleLabel: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideEmptyLabel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var hideLabel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var inputAttrTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Ext.Element) */
  var inputEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (String) */
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var inputType: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var invalidText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Method] Returns whether two field values are logically equal
  		* @param value1 Object The first value to compare
  		* @param value2 Object The second value to compare
  		* @returns Boolean True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[
    js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], _ | scala.Boolean]
  ] = js.undefined
  /** [Property] (Boolean) */
  var isFieldLabelable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  var isFileUpload: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the processed raw value of the field
  		* @returns Boolean True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var labelAttrTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Ext.Element) */
  var labelCell: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var labelClsExtra: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Element) */
  var labelEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Config Option] (Number) */
  var labelPad: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var labelSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var labelStyle: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var labelWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag
  		* @param errors String/String[] The validation message(s) to display.
  		*/
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var msgTarget: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] private */
  @JSName("onRender")
  var onRender_IBaseField: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Performs any necessary manipulation of a raw field value to prepare it for conversion and or validation for instance
  		* @param value Object The unprocessed string value
  		* @returns Object The processed string value
  		*/
  var processRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Converts a raw input field value into a mixed type value that is suitable for this particular field type
  		* @param rawValue Object
  		* @returns Object The converted value.
  		*/
  var rawToValue: js.UndefOr[js.Function1[/* rawValue */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var readOnlyCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the active error message to the given string
  		* @param msg String The error message
  		*/
  var setActiveError: js.UndefOr[js.Function1[/* msg */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Set the active error message to an Array of error messages
  		* @param errors String[] The error messages
  		*/
  var setActiveErrors: js.UndefOr[js.Function1[/* errors */ js.UndefOr[extjsLib.ExtNs.Array], scala.Unit]] = js.undefined
  /** [Method] Applies a set of default configuration values to this Labelable instance
  		* @param defaults Object The defaults to apply to the object.
  		*/
  var setFieldDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Set the label of this field
  		* @param label String The new label. The labelSeparator will be automatically appended to the label string.
  		*/
  var setFieldLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Set the CSS style of the field input element
  		* @param style String/Object/Function The style(s) to apply. Should be a valid argument to Ext.Element.applyStyles.
  		*/
  var setFieldStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the field s raw value directly bypassing value conversion change detection and validation
  		* @param value Object The value to set
  		* @returns Object value The field value that is set
  		*/
  var setRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the read only state of this field
  		* @param readOnly Boolean Whether the field should be read only.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object The value to set
  		* @returns any this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns Object The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Transform the raw value before it is set
  		* @param value Object The value
  		* @returns Object The value to set
  		*/
  var transformRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the trimmed label by slicing off the label separator character
  		* @returns String The trimmed field label, or empty string if not defined
  		*/
  var trimLabelSeparator: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns Boolean True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[_ | scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var validateOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Uses getErrors to build an array of validation errors
  		* @param value Object The value to validate
  		* @returns Boolean True if all validations passed, false if one or more failed
  		*/
  var validateValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
  /** [Method] Converts a mixed type value to a raw representation suitable for displaying in the field
  		* @param value Object The mixed-type value to convert to the raw representation.
  		* @returns Object The converted raw value.
  		*/
  var valueToRaw: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
}

object IBaseField {
  @scala.inline
  def apply(
    IComponent: extjsLib.ExtNs.IComponent = null,
    IField: extjsLib.ExtNs.formNs.fieldNs.IField = null,
    ILabelable: ILabelable = null,
    baseCls: java.lang.String = null,
    batchChanges: js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeReset: js.Function0[scala.Unit] = null,
    checkChange: js.Function0[scala.Unit] = null,
    checkChangeBuffer: scala.Int | scala.Double = null,
    checkChangeEvents: extjsLib.ExtNs.Array = null,
    checkDirty: js.Function0[scala.Unit] = null,
    clearInvalid: js.Function0[scala.Unit] = null,
    componentLayout: js.Any = null,
    dirtyCls: java.lang.String = null,
    doComponentLayout: js.Function0[extjsLib.ExtNs.containerNs.IContainer] = null,
    extractFileInput: js.Function0[stdLib.HTMLElement] = null,
    fieldCls: java.lang.String = null,
    fieldStyle: java.lang.String = null,
    focusCls: java.lang.String = null,
    getActiveError: js.Function0[java.lang.String] = null,
    getActiveErrors: js.Function0[extjsLib.ExtNs.Array] = null,
    getErrors: js.Function1[/* value */ js.UndefOr[js.Any], extjsLib.ExtNs.Array] = null,
    getFieldLabel: js.Function0[java.lang.String] = null,
    getLabelWidth: js.Function0[scala.Double] = null,
    getLabelableRenderData: js.Function0[_] = null,
    getModelData: js.Function0[_] = null,
    getName: js.Function0[java.lang.String] = null,
    getRawValue: js.Function0[_] = null,
    getSubTplData: js.Function0[_] = null,
    getSubmitData: js.Function0[_] = null,
    getSubmitValue: js.Function0[_] = null,
    getValue: js.Function0[_] = null,
    hasActiveError: js.Function0[scala.Boolean] = null,
    hasVisibleLabel: js.Function0[scala.Boolean] = null,
    initComponent: js.Function0[scala.Unit] = null,
    initEvents: js.Function0[scala.Unit] = null,
    initField: js.Function0[scala.Unit] = null,
    initLabelable: js.Function0[scala.Unit] = null,
    initRenderData: js.Function0[_] = null,
    initValue: js.Function0[scala.Unit] = null,
    inputAttrTpl: js.Any = null,
    inputEl: extjsLib.ExtNs.IElement = null,
    inputId: java.lang.String = null,
    inputType: java.lang.String = null,
    invalidText: java.lang.String = null,
    isDirty: js.Function0[scala.Boolean] = null,
    isEqual: js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], scala.Boolean] = null,
    isFileUpload: js.Function0[scala.Boolean] = null,
    isValid: js.Function0[scala.Boolean] = null,
    markInvalid: js.Function1[/* errors */ js.UndefOr[js.Any], scala.Unit] = null,
    maskOnDisable: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onDisable: js.Function0[scala.Unit] = null,
    onEnable: js.Function0[scala.Unit] = null,
    onRender: js.Function0[scala.Unit] = null,
    processRawValue: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    rawToValue: js.Function1[/* rawValue */ js.UndefOr[js.Any], _] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    readOnlyCls: java.lang.String = null,
    reset: js.Function0[scala.Unit] = null,
    resetOriginalValue: js.Function0[scala.Unit] = null,
    setActiveError: js.Function1[/* msg */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setActiveErrors: js.Function1[/* errors */ js.UndefOr[extjsLib.ExtNs.Array], scala.Unit] = null,
    setFieldDefaults: js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit] = null,
    setFieldLabel: js.Function1[/* label */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setFieldStyle: js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit] = null,
    setRawValue: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    setReadOnly: js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    tabIndex: scala.Int | scala.Double = null,
    transformOriginalValue: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    transformRawValue: js.Function1[/* value */ js.UndefOr[js.Any], _] = null,
    trimLabelSeparator: js.Function0[java.lang.String] = null,
    unsetActiveError: js.Function0[scala.Unit] = null,
    validate: js.Function0[scala.Boolean] = null,
    validateOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    validateValue: js.Function1[/* value */ js.UndefOr[js.Any], scala.Boolean] = null,
    valueToRaw: js.Function1[/* value */ js.UndefOr[js.Any], _] = null
  ): IBaseField = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    js.Dynamic.global.Object.assign(__obj, IField)
    js.Dynamic.global.Object.assign(__obj, ILabelable)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(batchChanges)
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(beforeReset)
    if (checkChange != null) __obj.updateDynamic("checkChange")(checkChange)
    if (checkChangeBuffer != null) __obj.updateDynamic("checkChangeBuffer")(checkChangeBuffer.asInstanceOf[js.Any])
    if (checkChangeEvents != null) __obj.updateDynamic("checkChangeEvents")(checkChangeEvents)
    if (checkDirty != null) __obj.updateDynamic("checkDirty")(checkDirty)
    if (clearInvalid != null) __obj.updateDynamic("clearInvalid")(clearInvalid)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (dirtyCls != null) __obj.updateDynamic("dirtyCls")(dirtyCls)
    if (doComponentLayout != null) __obj.updateDynamic("doComponentLayout")(doComponentLayout)
    if (extractFileInput != null) __obj.updateDynamic("extractFileInput")(extractFileInput)
    if (fieldCls != null) __obj.updateDynamic("fieldCls")(fieldCls)
    if (fieldStyle != null) __obj.updateDynamic("fieldStyle")(fieldStyle)
    if (focusCls != null) __obj.updateDynamic("focusCls")(focusCls)
    if (getActiveError != null) __obj.updateDynamic("getActiveError")(getActiveError)
    if (getActiveErrors != null) __obj.updateDynamic("getActiveErrors")(getActiveErrors)
    if (getErrors != null) __obj.updateDynamic("getErrors")(getErrors)
    if (getFieldLabel != null) __obj.updateDynamic("getFieldLabel")(getFieldLabel)
    if (getLabelWidth != null) __obj.updateDynamic("getLabelWidth")(getLabelWidth)
    if (getLabelableRenderData != null) __obj.updateDynamic("getLabelableRenderData")(getLabelableRenderData)
    if (getModelData != null) __obj.updateDynamic("getModelData")(getModelData)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getRawValue != null) __obj.updateDynamic("getRawValue")(getRawValue)
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(getSubTplData)
    if (getSubmitData != null) __obj.updateDynamic("getSubmitData")(getSubmitData)
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(getSubmitValue)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (hasActiveError != null) __obj.updateDynamic("hasActiveError")(hasActiveError)
    if (hasVisibleLabel != null) __obj.updateDynamic("hasVisibleLabel")(hasVisibleLabel)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (initEvents != null) __obj.updateDynamic("initEvents")(initEvents)
    if (initField != null) __obj.updateDynamic("initField")(initField)
    if (initLabelable != null) __obj.updateDynamic("initLabelable")(initLabelable)
    if (initRenderData != null) __obj.updateDynamic("initRenderData")(initRenderData)
    if (initValue != null) __obj.updateDynamic("initValue")(initValue)
    if (inputAttrTpl != null) __obj.updateDynamic("inputAttrTpl")(inputAttrTpl)
    if (inputEl != null) __obj.updateDynamic("inputEl")(inputEl)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (invalidText != null) __obj.updateDynamic("invalidText")(invalidText)
    if (isDirty != null) __obj.updateDynamic("isDirty")(isDirty)
    if (isEqual != null) __obj.updateDynamic("isEqual")(isEqual)
    if (isFileUpload != null) __obj.updateDynamic("isFileUpload")(isFileUpload)
    if (isValid != null) __obj.updateDynamic("isValid")(isValid)
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(markInvalid)
    if (!js.isUndefined(maskOnDisable)) __obj.updateDynamic("maskOnDisable")(maskOnDisable)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onDisable != null) __obj.updateDynamic("onDisable")(onDisable)
    if (onEnable != null) __obj.updateDynamic("onEnable")(onEnable)
    if (onRender != null) __obj.updateDynamic("onRender")(onRender)
    if (processRawValue != null) __obj.updateDynamic("processRawValue")(processRawValue)
    if (rawToValue != null) __obj.updateDynamic("rawToValue")(rawToValue)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (readOnlyCls != null) __obj.updateDynamic("readOnlyCls")(readOnlyCls)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(resetOriginalValue)
    if (setActiveError != null) __obj.updateDynamic("setActiveError")(setActiveError)
    if (setActiveErrors != null) __obj.updateDynamic("setActiveErrors")(setActiveErrors)
    if (setFieldDefaults != null) __obj.updateDynamic("setFieldDefaults")(setFieldDefaults)
    if (setFieldLabel != null) __obj.updateDynamic("setFieldLabel")(setFieldLabel)
    if (setFieldStyle != null) __obj.updateDynamic("setFieldStyle")(setFieldStyle)
    if (setRawValue != null) __obj.updateDynamic("setRawValue")(setRawValue)
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(setReadOnly)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(transformOriginalValue)
    if (transformRawValue != null) __obj.updateDynamic("transformRawValue")(transformRawValue)
    if (trimLabelSeparator != null) __obj.updateDynamic("trimLabelSeparator")(trimLabelSeparator)
    if (unsetActiveError != null) __obj.updateDynamic("unsetActiveError")(unsetActiveError)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur)
    if (validateValue != null) __obj.updateDynamic("validateValue")(validateValue)
    if (valueToRaw != null) __obj.updateDynamic("valueToRaw")(valueToRaw)
    __obj.asInstanceOf[IBaseField]
  }
}

