package typings
package extjsLib.ExtNs.formNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.formNs.fieldNs.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate- extjsLib.ExtNs.formNs.ILabelable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined activeError, activeErrorsTpl, afterBodyEl, afterLabelTextTpl, afterLabelTpl, afterSubTpl, autoFitErrors, baseBodyCls, beforeBodyEl, beforeLabelTextTpl, beforeLabelTpl, beforeSubTpl, clearCls, errorMsgCls, fieldBodyCls, fieldLabel, formItemCls, hideEmptyLabel, hideLabel, invalidCls, labelAlign, labelAttrTpl, labelCls, labelClsExtra, labelPad, labelSeparator, labelStyle, labelWidth, msgTarget, preventMark, bodyEl, errorEl, isFieldLabelable, labelCell, labelEl, getActiveError, getActiveErrors, getFieldLabel, getInputId, getLabelWidth, getLabelableRenderData, getSubTplMarkup, hasActiveError, hasVisibleLabel, initLabelable, setActiveError, setActiveErrors, setFieldDefaults, setFieldLabel, trimLabelSeparator, unsetActiveError */ trait IBase
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
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
  var getErrors: js.UndefOr[js.Function1[js.UndefOr[js.Any], _ | extjsLib.ExtNs.Array]] = js.undefined
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
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
  		* @returns Object Object with keys and values that are going to be applied to the renderTpl
  		*/
  @JSName("initRenderData")
  var initRenderData_IBase: js.UndefOr[js.Function0[_]] = js.undefined
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
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _ | scala.Boolean]] = js.undefined
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
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var msgTarget: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] private */
  @JSName("onRender")
  var onRender_IBase: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
  var setActiveError: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Set the active error message to an Array of error messages
  		* @param errors String[] The error messages
  		*/
  var setActiveErrors: js.UndefOr[js.Function1[js.UndefOr[extjsLib.ExtNs.Array], scala.Unit]] = js.undefined
  /** [Method] Applies a set of default configuration values to this Labelable instance
  		* @param defaults Object The defaults to apply to the object.
  		*/
  var setFieldDefaults: js.UndefOr[js.Function1[js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Set the label of this field
  		* @param label String The new label. The labelSeparator will be automatically appended to the label string.
  		*/
  var setFieldLabel: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
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
  var setValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns Object The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
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

object IBase {
  @scala.inline
  def apply(
    IComponent: extjsLib.ExtNs.IComponent = null,
    IField: IField = null,
    ILabelable: extjsLib.ExtNs.formNs.ILabelable = null,
    baseCls: java.lang.String = null,
    batchChanges: /* fn */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeReset: () => scala.Unit = null,
    checkChange: () => scala.Unit = null,
    checkChangeBuffer: scala.Int | scala.Double = null,
    checkChangeEvents: extjsLib.ExtNs.Array = null,
    checkDirty: () => scala.Unit = null,
    clearInvalid: () => scala.Unit = null,
    componentLayout: js.Any = null,
    dirtyCls: java.lang.String = null,
    doComponentLayout: () => extjsLib.ExtNs.containerNs.IContainer = null,
    extractFileInput: () => stdLib.HTMLElement = null,
    fieldCls: java.lang.String = null,
    fieldStyle: java.lang.String = null,
    focusCls: java.lang.String = null,
    getActiveError: () => java.lang.String = null,
    getActiveErrors: () => extjsLib.ExtNs.Array = null,
    getErrors: /* value */ js.UndefOr[js.Any] => extjsLib.ExtNs.Array = null,
    getFieldLabel: () => java.lang.String = null,
    getLabelWidth: () => scala.Double = null,
    getLabelableRenderData: () => _ = null,
    getModelData: () => _ = null,
    getName: () => java.lang.String = null,
    getRawValue: () => _ = null,
    getSubTplData: () => _ = null,
    getSubmitData: () => _ = null,
    getSubmitValue: () => _ = null,
    getValue: () => _ = null,
    hasActiveError: () => scala.Boolean = null,
    hasVisibleLabel: () => scala.Boolean = null,
    initComponent: () => scala.Unit = null,
    initEvents: () => scala.Unit = null,
    initField: () => scala.Unit = null,
    initLabelable: () => scala.Unit = null,
    initRenderData: () => _ = null,
    initValue: () => scala.Unit = null,
    inputAttrTpl: js.Any = null,
    inputEl: extjsLib.ExtNs.IElement = null,
    inputId: java.lang.String = null,
    inputType: java.lang.String = null,
    invalidText: java.lang.String = null,
    isDirty: () => scala.Boolean = null,
    isEqual: (/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any]) => scala.Boolean = null,
    isFileUpload: () => scala.Boolean = null,
    isValid: () => scala.Boolean = null,
    markInvalid: /* errors */ js.UndefOr[js.Any] => scala.Unit = null,
    maskOnDisable: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onDisable: () => scala.Unit = null,
    onEnable: () => scala.Unit = null,
    onRender: () => scala.Unit = null,
    processRawValue: /* value */ js.UndefOr[js.Any] => _ = null,
    rawToValue: /* rawValue */ js.UndefOr[js.Any] => _ = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    readOnlyCls: java.lang.String = null,
    reset: () => scala.Unit = null,
    resetOriginalValue: () => scala.Unit = null,
    setActiveError: /* msg */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setActiveErrors: /* errors */ js.UndefOr[extjsLib.ExtNs.Array] => scala.Unit = null,
    setFieldDefaults: /* defaults */ js.UndefOr[js.Any] => scala.Unit = null,
    setFieldLabel: /* label */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setFieldStyle: /* style */ js.UndefOr[js.Any] => scala.Unit = null,
    setRawValue: /* value */ js.UndefOr[js.Any] => _ = null,
    setReadOnly: /* readOnly */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => _ = null,
    tabIndex: scala.Int | scala.Double = null,
    transformOriginalValue: /* value */ js.UndefOr[js.Any] => _ = null,
    transformRawValue: /* value */ js.UndefOr[js.Any] => _ = null,
    trimLabelSeparator: () => java.lang.String = null,
    unsetActiveError: () => scala.Unit = null,
    validate: () => scala.Boolean = null,
    validateOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    validateValue: /* value */ js.UndefOr[js.Any] => scala.Boolean = null,
    valueToRaw: /* value */ js.UndefOr[js.Any] => _ = null
  ): IBase = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    js.Dynamic.global.Object.assign(__obj, IField)
    js.Dynamic.global.Object.assign(__obj, ILabelable)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(js.Any.fromFunction1(batchChanges))
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(js.Any.fromFunction0(beforeReset))
    if (checkChange != null) __obj.updateDynamic("checkChange")(js.Any.fromFunction0(checkChange))
    if (checkChangeBuffer != null) __obj.updateDynamic("checkChangeBuffer")(checkChangeBuffer.asInstanceOf[js.Any])
    if (checkChangeEvents != null) __obj.updateDynamic("checkChangeEvents")(checkChangeEvents)
    if (checkDirty != null) __obj.updateDynamic("checkDirty")(js.Any.fromFunction0(checkDirty))
    if (clearInvalid != null) __obj.updateDynamic("clearInvalid")(js.Any.fromFunction0(clearInvalid))
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (dirtyCls != null) __obj.updateDynamic("dirtyCls")(dirtyCls)
    if (doComponentLayout != null) __obj.updateDynamic("doComponentLayout")(js.Any.fromFunction0(doComponentLayout))
    if (extractFileInput != null) __obj.updateDynamic("extractFileInput")(js.Any.fromFunction0(extractFileInput))
    if (fieldCls != null) __obj.updateDynamic("fieldCls")(fieldCls)
    if (fieldStyle != null) __obj.updateDynamic("fieldStyle")(fieldStyle)
    if (focusCls != null) __obj.updateDynamic("focusCls")(focusCls)
    if (getActiveError != null) __obj.updateDynamic("getActiveError")(js.Any.fromFunction0(getActiveError))
    if (getActiveErrors != null) __obj.updateDynamic("getActiveErrors")(js.Any.fromFunction0(getActiveErrors))
    if (getErrors != null) __obj.updateDynamic("getErrors")(js.Any.fromFunction1(getErrors))
    if (getFieldLabel != null) __obj.updateDynamic("getFieldLabel")(js.Any.fromFunction0(getFieldLabel))
    if (getLabelWidth != null) __obj.updateDynamic("getLabelWidth")(js.Any.fromFunction0(getLabelWidth))
    if (getLabelableRenderData != null) __obj.updateDynamic("getLabelableRenderData")(js.Any.fromFunction0(getLabelableRenderData))
    if (getModelData != null) __obj.updateDynamic("getModelData")(js.Any.fromFunction0(getModelData))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getRawValue != null) __obj.updateDynamic("getRawValue")(js.Any.fromFunction0(getRawValue))
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(js.Any.fromFunction0(getSubTplData))
    if (getSubmitData != null) __obj.updateDynamic("getSubmitData")(js.Any.fromFunction0(getSubmitData))
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(js.Any.fromFunction0(getSubmitValue))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (hasActiveError != null) __obj.updateDynamic("hasActiveError")(js.Any.fromFunction0(hasActiveError))
    if (hasVisibleLabel != null) __obj.updateDynamic("hasVisibleLabel")(js.Any.fromFunction0(hasVisibleLabel))
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (initEvents != null) __obj.updateDynamic("initEvents")(js.Any.fromFunction0(initEvents))
    if (initField != null) __obj.updateDynamic("initField")(js.Any.fromFunction0(initField))
    if (initLabelable != null) __obj.updateDynamic("initLabelable")(js.Any.fromFunction0(initLabelable))
    if (initRenderData != null) __obj.updateDynamic("initRenderData")(js.Any.fromFunction0(initRenderData))
    if (initValue != null) __obj.updateDynamic("initValue")(js.Any.fromFunction0(initValue))
    if (inputAttrTpl != null) __obj.updateDynamic("inputAttrTpl")(inputAttrTpl)
    if (inputEl != null) __obj.updateDynamic("inputEl")(inputEl)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (invalidText != null) __obj.updateDynamic("invalidText")(invalidText)
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (isEqual != null) __obj.updateDynamic("isEqual")(js.Any.fromFunction2(isEqual))
    if (isFileUpload != null) __obj.updateDynamic("isFileUpload")(js.Any.fromFunction0(isFileUpload))
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(js.Any.fromFunction1(markInvalid))
    if (!js.isUndefined(maskOnDisable)) __obj.updateDynamic("maskOnDisable")(maskOnDisable)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onDisable != null) __obj.updateDynamic("onDisable")(js.Any.fromFunction0(onDisable))
    if (onEnable != null) __obj.updateDynamic("onEnable")(js.Any.fromFunction0(onEnable))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (processRawValue != null) __obj.updateDynamic("processRawValue")(js.Any.fromFunction1(processRawValue))
    if (rawToValue != null) __obj.updateDynamic("rawToValue")(js.Any.fromFunction1(rawToValue))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (readOnlyCls != null) __obj.updateDynamic("readOnlyCls")(readOnlyCls)
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(js.Any.fromFunction0(resetOriginalValue))
    if (setActiveError != null) __obj.updateDynamic("setActiveError")(js.Any.fromFunction1(setActiveError))
    if (setActiveErrors != null) __obj.updateDynamic("setActiveErrors")(js.Any.fromFunction1(setActiveErrors))
    if (setFieldDefaults != null) __obj.updateDynamic("setFieldDefaults")(js.Any.fromFunction1(setFieldDefaults))
    if (setFieldLabel != null) __obj.updateDynamic("setFieldLabel")(js.Any.fromFunction1(setFieldLabel))
    if (setFieldStyle != null) __obj.updateDynamic("setFieldStyle")(js.Any.fromFunction1(setFieldStyle))
    if (setRawValue != null) __obj.updateDynamic("setRawValue")(js.Any.fromFunction1(setRawValue))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1(setReadOnly))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(js.Any.fromFunction1(transformOriginalValue))
    if (transformRawValue != null) __obj.updateDynamic("transformRawValue")(js.Any.fromFunction1(transformRawValue))
    if (trimLabelSeparator != null) __obj.updateDynamic("trimLabelSeparator")(js.Any.fromFunction0(trimLabelSeparator))
    if (unsetActiveError != null) __obj.updateDynamic("unsetActiveError")(js.Any.fromFunction0(unsetActiveError))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur)
    if (validateValue != null) __obj.updateDynamic("validateValue")(js.Any.fromFunction1(validateValue))
    if (valueToRaw != null) __obj.updateDynamic("valueToRaw")(js.Any.fromFunction1(valueToRaw))
    __obj.asInstanceOf[IBase]
  }
}

